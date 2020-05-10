package typingsSlinky.cathoQuantum

import typingsSlinky.cathoQuantum.cathoQuantumStrings.CardDotHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon2 extends js.Object {
  var displayName: CardDotHeader = js.native
}

object Anon2 {
  @scala.inline
  def apply(displayName: CardDotHeader): Anon2 = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
  @scala.inline
  implicit class Anon2Ops[Self <: Anon2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: CardDotHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

