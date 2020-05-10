package typingsSlinky.remarkable

import typingsSlinky.remarkable.libMod.InlineParsingRule
import typingsSlinky.remarkable.rulerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRuler extends js.Object {
  var ruler: ^[InlineParsingRule] = js.native
}

object AnonRuler {
  @scala.inline
  def apply(ruler: ^[InlineParsingRule]): AnonRuler = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRuler]
  }
  @scala.inline
  implicit class AnonRulerOps[Self <: AnonRuler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuler(value: ^[InlineParsingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

