package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectEntitiesV2Request extends js.Object {
  /**
    * A UTF-8 string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString = js.native
}

object DetectEntitiesV2Request {
  @scala.inline
  def apply(Text: BoundedLengthString): DetectEntitiesV2Request = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesV2Request]
  }
  @scala.inline
  implicit class DetectEntitiesV2RequestOps[Self <: DetectEntitiesV2Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: BoundedLengthString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

