package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.clipboard.ArrayBuffer
import typingsSlinky.firefoxWebextBrowser.browser.clipboard._SetImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofclipboard extends js.Object {
  /* clipboard functions */
  /**
    * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is
    * invalid, the clipboard is not modified.
    * @param imageData The image data to be copied.
    * @param imageType The type of imageData.
    */
  def setImageData(imageData: ArrayBuffer, imageType: _SetImageData): js.Promise[Unit] = js.native
}

object Typeofclipboard {
  @scala.inline
  def apply(setImageData: (ArrayBuffer, _SetImageData) => js.Promise[Unit]): Typeofclipboard = {
    val __obj = js.Dynamic.literal(setImageData = js.Any.fromFunction2(setImageData))
    __obj.asInstanceOf[Typeofclipboard]
  }
  @scala.inline
  implicit class TypeofclipboardOps[Self <: Typeofclipboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetImageData(value: (ArrayBuffer, _SetImageData) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageData")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

