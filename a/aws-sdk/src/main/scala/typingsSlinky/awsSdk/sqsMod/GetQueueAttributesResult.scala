package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueAttributesResult extends js.Object {
  /**
    * A map of attributes to their respective values.
    */
  var Attributes: js.UndefOr[QueueAttributeMap] = js.native
}

object GetQueueAttributesResult {
  @scala.inline
  def apply(): GetQueueAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueAttributesResult]
  }
  @scala.inline
  implicit class GetQueueAttributesResultOps[Self <: GetQueueAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: QueueAttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
  }
  
}

