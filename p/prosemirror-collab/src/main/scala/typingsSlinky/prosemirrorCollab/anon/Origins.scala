package typingsSlinky.prosemirrorCollab.anon

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.Transaction
import typingsSlinky.prosemirrorTransform.mod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origins[S /* <: Schema[_, _] */] extends js.Object {
  var clientID: Double | String = js.native
  var origins: js.Array[Transaction[S]] = js.native
  var steps: js.Array[Step[S]] = js.native
  var version: Double = js.native
}

object Origins {
  @scala.inline
  def apply[S](
    clientID: Double | String,
    origins: js.Array[Transaction[S]],
    steps: js.Array[Step[S]],
    version: Double
  ): Origins[S] = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origins[S]]
  }
  @scala.inline
  implicit class OriginsOps[Self[s] <: Origins[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withClientID(value: Double | String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[Transaction[S]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[Step[S]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

