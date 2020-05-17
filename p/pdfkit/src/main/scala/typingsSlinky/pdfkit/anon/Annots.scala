package typingsSlinky.pdfkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annots extends js.Object {
  var Annots: js.Any = js.native
  var ExtGState: js.UndefOr[js.Any] = js.native
  var Font: js.UndefOr[js.Any] = js.native
  var Pattern: js.Any = js.native
  var XObject: js.UndefOr[js.Any] = js.native
}

object Annots {
  @scala.inline
  def apply(Annots: js.Any, Pattern: js.Any): Annots = {
    val __obj = js.Dynamic.literal(Annots = Annots.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annots]
  }
  @scala.inline
  implicit class AnnotsOps[Self <: Annots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnots(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtGState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtGState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtGState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtGState")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(js.undefined)
        ret
    }
    @scala.inline
    def withXObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XObject")(js.undefined)
        ret
    }
  }
  
}

