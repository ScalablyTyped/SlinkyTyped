package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITpRegisterRequest extends js.Object {
  /** TpRegisterRequest family */
  var family: js.UndefOr[String | Null] = js.native
  /** TpRegisterRequest maxOccupancy */
  var maxOccupancy: js.UndefOr[Double | Null] = js.native
  /** TpRegisterRequest namespaces */
  var namespaces: js.UndefOr[js.Array[String] | Null] = js.native
  /** TpRegisterRequest version */
  var version: js.UndefOr[String | Null] = js.native
}

object ITpRegisterRequest {
  @scala.inline
  def apply(): ITpRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpRegisterRequest]
  }
  @scala.inline
  implicit class ITpRegisterRequestOps[Self <: ITpRegisterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(null)
        ret
    }
    @scala.inline
    def withMaxOccupancy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOccupancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOccupancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOccupancy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOccupancyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOccupancy")(null)
        ret
    }
    @scala.inline
    def withNamespaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(null)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

