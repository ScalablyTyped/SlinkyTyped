package typingsSlinky.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod.Token because Already inherited */ @js.native
trait ParagraphToken extends TagToken {
  /**
    * Absence of empty line before current tag: `true` if absent, `false`
    * if present. List is tight if any list item is tight.
    */
  var tight: Boolean = js.native
}

object ParagraphToken {
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: String): ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphToken]
  }
  @scala.inline
  implicit class ParagraphTokenOps[Self <: ParagraphToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

