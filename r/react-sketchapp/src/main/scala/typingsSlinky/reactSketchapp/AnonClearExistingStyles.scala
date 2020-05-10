package typingsSlinky.reactSketchapp

import typingsSlinky.reactSketchapp.typesMod.SketchContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[Boolean] = js.native
  var context: SketchContext = js.native
}

object AnonClearExistingStyles {
  @scala.inline
  def apply(context: SketchContext): AnonClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearExistingStyles]
  }
  @scala.inline
  implicit class AnonClearExistingStylesOps[Self <: AnonClearExistingStyles] (val x: Self) extends AnyVal {
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

