package typingsSlinky.reactSketchapp.anon

import typingsSlinky.reactSketchapp.typesMod.SketchContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[Boolean] = js.native
  var context: SketchContext = js.native
}

object ClearExistingStyles {
  @scala.inline
  def apply(context: SketchContext): ClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearExistingStyles]
  }
  @scala.inline
  implicit class ClearExistingStylesOps[Self <: ClearExistingStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: SketchContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearExistingStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearExistingStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearExistingStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearExistingStyles")(js.undefined)
        ret
    }
  }
  
}

