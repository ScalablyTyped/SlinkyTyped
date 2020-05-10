package typingsSlinky.cathoQuantum

import typingsSlinky.cathoQuantum.cathoQuantumStrings.CardDotTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon6 extends js.Object {
  var displayName: CardDotTitle = js.native
}

object Anon6 {
  @scala.inline
  def apply(displayName: CardDotTitle): Anon6 = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon6]
  }
  @scala.inline
  implicit class Anon6Ops[Self <: Anon6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: CardDotTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

