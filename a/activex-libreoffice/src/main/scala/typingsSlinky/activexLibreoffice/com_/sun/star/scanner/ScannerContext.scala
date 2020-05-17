package typingsSlinky.activexLibreoffice.com_.sun.star.scanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a scanner context is an identifier for a specific scanner device */
@js.native
trait ScannerContext extends js.Object {
  /** InternalData contains service private data and must not be changed */
  var InternalData: Double = js.native
  /** ScannerName contains a user readable identification */
  var ScannerName: String = js.native
}

object ScannerContext {
  @scala.inline
  def apply(InternalData: Double, ScannerName: String): ScannerContext = {
    val __obj = js.Dynamic.literal(InternalData = InternalData.asInstanceOf[js.Any], ScannerName = ScannerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerContext]
  }
  @scala.inline
  implicit class ScannerContextOps[Self <: ScannerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInternalData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScannerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScannerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

