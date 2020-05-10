package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.paragraph_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait ParagraphCloseToken extends ParagraphToken {
  @JSName("type")
  var type_ParagraphCloseToken: paragraph_close = js.native
}

object ParagraphCloseToken {
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: paragraph_close): ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphCloseToken]
  }
  @scala.inline
  implicit class ParagraphCloseTokenOps[Self <: ParagraphCloseToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: paragraph_close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

