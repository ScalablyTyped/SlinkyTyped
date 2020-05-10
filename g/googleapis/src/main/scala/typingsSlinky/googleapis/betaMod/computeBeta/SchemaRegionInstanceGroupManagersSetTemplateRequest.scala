package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionInstanceGroupManagersSetTemplateRequest extends js.Object {
  /**
    * URL of the InstanceTemplate resource from which all new instances will be
    * created.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}

object SchemaRegionInstanceGroupManagersSetTemplateRequest {
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetTemplateRequest]
  }
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersSetTemplateRequestOps[Self <: SchemaRegionInstanceGroupManagersSetTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.undefined)
        ret
    }
  }
  
}

