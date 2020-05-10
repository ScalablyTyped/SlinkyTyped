package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.`line-number`
import typingsSlinky.atom.atomStrings.block
import typingsSlinky.atom.atomStrings.cursor_
import typingsSlinky.atom.atomStrings.gutter
import typingsSlinky.atom.atomStrings.highlight
import typingsSlinky.atom.atomStrings.line
import typingsSlinky.atom.atomStrings.overlay
import typingsSlinky.atom.atomStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationOptions extends SharedDecorationOptions {
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[String] = js.native
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | overlay | gutter | block | cursor_] = js.native
}

object DecorationOptions {
  @scala.inline
  def apply(): DecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationOptions]
  }
  @scala.inline
  implicit class DecorationOptionsOps[Self <: DecorationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGutterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterName")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: line | `line-number` | text | highlight | overlay | gutter | block | cursor_): Self = {
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

