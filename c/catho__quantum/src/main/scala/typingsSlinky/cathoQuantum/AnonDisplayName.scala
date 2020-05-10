package typingsSlinky.cathoQuantum

import typingsSlinky.cathoQuantum.cathoQuantumStrings.CardDotContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayName extends js.Object {
  var displayName: CardDotContent = js.native
}

object AnonDisplayName {
  @scala.inline
  def apply(displayName: CardDotContent): AnonDisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
  @scala.inline
  implicit class AnonDisplayNameOps[Self <: AnonDisplayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: CardDotContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

