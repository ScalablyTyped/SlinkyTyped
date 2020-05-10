package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionConvertToPDF extends js.Object {
  var FailOnUnsupportedSourceFiles: Boolean = js.native
  var OverwriteExistingFile: Boolean = js.native
  var PDFA1b: Boolean = js.native
  var StoreAsSeparateFile: Boolean = js.native
  def Clone(): IActionConvertToPDF = js.native
}

object IActionConvertToPDF {
  @scala.inline
  def apply(
    Clone: () => IActionConvertToPDF,
    FailOnUnsupportedSourceFiles: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    StoreAsSeparateFile: Boolean
  ): IActionConvertToPDF = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FailOnUnsupportedSourceFiles = FailOnUnsupportedSourceFiles.asInstanceOf[js.Any], OverwriteExistingFile = OverwriteExistingFile.asInstanceOf[js.Any], PDFA1b = PDFA1b.asInstanceOf[js.Any], StoreAsSeparateFile = StoreAsSeparateFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionConvertToPDF]
  }
  @scala.inline
  implicit class IActionConvertToPDFOps[Self <: IActionConvertToPDF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IActionConvertToPDF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFailOnUnsupportedSourceFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailOnUnsupportedSourceFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverwriteExistingFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverwriteExistingFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDFA1b(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDFA1b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreAsSeparateFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoreAsSeparateFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

