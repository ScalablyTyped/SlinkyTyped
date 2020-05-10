package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.`line-number`
import typingsSlinky.atom.atomStrings.block
import typingsSlinky.atom.atomStrings.cursor_
import typingsSlinky.atom.atomStrings.highlight
import typingsSlinky.atom.atomStrings.line
import typingsSlinky.atom.atomStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationLayerOptions extends SharedDecorationOptions {
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | block | cursor_] = js.native
}

object DecorationLayerOptions {
  @scala.inline
  def apply(): DecorationLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationLayerOptions]
  }
  @scala.inline
  implicit class DecorationLayerOptionsOps[Self <: DecorationLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: line | `line-number` | text | highlight | block | cursor_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

