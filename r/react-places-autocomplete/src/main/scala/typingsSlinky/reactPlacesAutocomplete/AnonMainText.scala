package typingsSlinky.reactPlacesAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMainText extends js.Object {
  var mainText: String = js.native
  var secondaryText: String = js.native
}

object AnonMainText {
  @scala.inline
  def apply(mainText: String, secondaryText: String): AnonMainText = {
    val __obj = js.Dynamic.literal(mainText = mainText.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMainText]
  }
  @scala.inline
  implicit class AnonMainTextOps[Self <: AnonMainText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMainText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

