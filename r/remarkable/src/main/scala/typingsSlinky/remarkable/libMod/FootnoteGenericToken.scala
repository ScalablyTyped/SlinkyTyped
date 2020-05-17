package typingsSlinky.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod.Token because Already inherited */ @js.native
trait FootnoteGenericToken extends TagToken {
  /**
    * Footnote id.
    */
  var id: Double = js.native
  /**
    * Footnote sub id.
    */
  var subId: js.UndefOr[Double] = js.native
}

object FootnoteGenericToken {
  @scala.inline
  def apply(id: Double, level: Double, `type`: String): FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteGenericToken]
  }
  @scala.inline
  implicit class FootnoteGenericTokenOps[Self <: FootnoteGenericToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(js.undefined)
        ret
    }
  }
  
}

