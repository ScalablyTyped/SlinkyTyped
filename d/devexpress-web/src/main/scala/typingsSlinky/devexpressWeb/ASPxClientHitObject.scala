package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object under the hit test point within a chart control, on the client side.
  */
@js.native
trait ASPxClientHitObject extends js.Object {
  /**
    * Provides access to an object, which is in some way related to the object being hit. The returned value depends on the ASPxClientHitObject.Object type and hit point location.
    */
  var AdditionalObject: ASPxClientWebChartElement = js.native
  /**
    * Gets the chart element for which the event was raised.
    */
  var Object: ASPxClientWebChartElement = js.native
}

object ASPxClientHitObject {
  @scala.inline
  def apply(AdditionalObject: ASPxClientWebChartElement, Object: ASPxClientWebChartElement): ASPxClientHitObject = {
    val __obj = js.Dynamic.literal(AdditionalObject = AdditionalObject.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHitObject]
  }
  @scala.inline
  implicit class ASPxClientHitObjectOps[Self <: ASPxClientHitObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalObject(value: ASPxClientWebChartElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ASPxClientWebChartElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

