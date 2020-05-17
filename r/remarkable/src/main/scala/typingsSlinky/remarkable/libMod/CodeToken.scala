package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod.Token because Already inherited */ @js.native
trait CodeToken extends BlockContentToken {
  /**
    * Code: `true` if block, `false` if inline.
    */
  var block: Boolean = js.native
  @JSName("type")
  var type_CodeToken: code = js.native
}

object CodeToken {
  @scala.inline
  def apply(block: Boolean, level: Double, `type`: code): CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeToken]
  }
  @scala.inline
  implicit class CodeTokenOps[Self <: CodeToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

