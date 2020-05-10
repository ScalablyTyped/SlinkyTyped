package typingsSlinky.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferOptions extends js.Object {
  var autoPrint: js.UndefOr[Boolean] = js.native
  var bufferPages: js.UndefOr[Boolean] = js.native
  var fontLayoutCache: js.UndefOr[Boolean] = js.native
  var progressCallback: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
  var tableLayouts: js.UndefOr[StringDictionary[CustomTableLayout]] = js.native
}

object BufferOptions {
  @scala.inline
  def apply(): BufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferOptions]
  }
  @scala.inline
  implicit class BufferOptionsOps[Self <: BufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferPages")(js.undefined)
        ret
    }
    @scala.inline
    def withFontLayoutCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontLayoutCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontLayoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontLayoutCache")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCallback(value: /* progress */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgressCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLayouts(value: StringDictionary[CustomTableLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayouts")(js.undefined)
        ret
    }
  }
  
}

