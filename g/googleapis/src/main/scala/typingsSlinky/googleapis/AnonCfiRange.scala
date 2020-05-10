package typingsSlinky.googleapis

import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaBooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCfiRange extends js.Object {
  var cfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  var contentVersion: js.UndefOr[String] = js.native
  var gbImageRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  var gbTextRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  var imageCfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
}

object AnonCfiRange {
  @scala.inline
  def apply(): AnonCfiRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCfiRange]
  }
  @scala.inline
  implicit class AnonCfiRangeOps[Self <: AnonCfiRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCfiRange(value: SchemaBooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfiRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCfiRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfiRange")(js.undefined)
        ret
    }
    @scala.inline
    def withContentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGbImageRange(value: SchemaBooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbImageRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbImageRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbImageRange")(js.undefined)
        ret
    }
    @scala.inline
    def withGbTextRange(value: SchemaBooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbTextRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbTextRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbTextRange")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCfiRange(value: SchemaBooksAnnotationsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCfiRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCfiRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCfiRange")(js.undefined)
        ret
    }
  }
  
}

