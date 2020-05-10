package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolInstanceHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth
    * when checking the health of an instance.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTargetPoolInstanceHealth {
  @scala.inline
  def apply(): SchemaTargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolInstanceHealth]
  }
  @scala.inline
  implicit class SchemaTargetPoolInstanceHealthOps[Self <: SchemaTargetPoolInstanceHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthStatus(value: js.Array[SchemaHealthStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

