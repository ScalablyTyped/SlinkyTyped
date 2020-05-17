package typingsSlinky.hapi.anon

import typingsSlinky.hapi.mod.AuthCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifacts extends js.Object {
  /**
    * The artifacts are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme. Defaults to no artifacts.
    */
  var artifacts: js.UndefOr[js.Object] = js.native
  /**
    * The credentials are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme.
    */
  var credentials: AuthCredentials = js.native
  /**
    * The authentication strategy name matching the provided credentials.
    */
  var strategy: String = js.native
}

object Artifacts {
  @scala.inline
  def apply(credentials: AuthCredentials, strategy: String): Artifacts = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  @scala.inline
  implicit class ArtifactsOps[Self <: Artifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: AuthCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(js.undefined)
        ret
    }
  }
  
}

