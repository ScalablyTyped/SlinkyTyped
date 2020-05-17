package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.footnote_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod.Token because Already inherited */ @js.native
trait FootnoteOpenToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteOpenToken: footnote_open = js.native
}

object FootnoteOpenToken {
  @scala.inline
  def apply(id: Double, level: Double, `type`: footnote_open): FootnoteOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteOpenToken]
  }
  @scala.inline
  implicit class FootnoteOpenTokenOps[Self <: FootnoteOpenToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: footnote_open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

