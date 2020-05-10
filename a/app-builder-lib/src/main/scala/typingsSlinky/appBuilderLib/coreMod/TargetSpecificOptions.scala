package typingsSlinky.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSpecificOptions extends js.Object {
  /**
    The [artifact file name template](/configuration/configuration#artifact-file-name-template).
    */
  val artifactName: js.UndefOr[String | Null] = js.native
  var publish: js.UndefOr[Publish] = js.native
}

object TargetSpecificOptions {
  @scala.inline
  def apply(): TargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSpecificOptions]
  }
  @scala.inline
  implicit class TargetSpecificOptionsOps[Self <: TargetSpecificOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactName")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactName")(null)
        ret
    }
    @scala.inline
    def withPublish(value: Publish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(null)
        ret
    }
  }
  
}

