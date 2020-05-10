package typingsSlinky.braftEditor.mod

import org.scalajs.dom.raw.File
import typingsSlinky.braftEditor.AnonAudio
import typingsSlinky.braftEditor.AnonEmbed
import typingsSlinky.braftEditor.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaType extends js.Object {
  var accepts: js.UndefOr[AnonAudio] = js.native
  var externals: js.UndefOr[AnonEmbed] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var onChange: js.UndefOr[js.Function] = js.native
  var onInsert: js.UndefOr[js.Function] = js.native
  var pasteImage: js.UndefOr[Boolean] = js.native
  var uploadFn: js.UndefOr[js.Function1[/* params */ AnonError, Unit]] = js.native
  var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.native
}

object MediaType {
  @scala.inline
  def apply(): MediaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaType]
  }
  @scala.inline
  implicit class MediaTypeOps[Self <: MediaType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepts(value: AnonAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(js.undefined)
        ret
    }
    @scala.inline
    def withExternals(value: AnonEmbed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externals")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInsert(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteImage")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadFn(value: /* params */ AnonError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFn")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFn(value: /* file */ File => Boolean | js.Thenable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFn")(js.undefined)
        ret
    }
  }
  
}

