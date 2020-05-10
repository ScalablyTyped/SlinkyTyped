package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFWrite extends js.Object {
  /**
    * Configures how the PDF generating is done
    * @method Dynamsoft.WebTwain.Addon.PDF.Write#jsonWriteSetting
    * @param {any} jsonWriteSetting detailed settings for PDF writing.
    * @return {boolean}
    */
  def Setup(jsonWriteSetting: js.Any): Unit = js.native
}

object PDFWrite {
  @scala.inline
  def apply(Setup: js.Any => Unit): PDFWrite = {
    val __obj = js.Dynamic.literal(Setup = js.Any.fromFunction1(Setup))
    __obj.asInstanceOf[PDFWrite]
  }
  @scala.inline
  implicit class PDFWriteOps[Self <: PDFWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetup(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Setup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

