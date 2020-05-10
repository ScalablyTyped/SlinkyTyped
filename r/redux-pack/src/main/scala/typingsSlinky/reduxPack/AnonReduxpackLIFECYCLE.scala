package typingsSlinky.reduxPack

import typingsSlinky.reduxPack.mod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReduxpackLIFECYCLE extends js.Object {
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.native
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.native
}

object AnonReduxpackLIFECYCLE {
  @scala.inline
  def apply(): AnonReduxpackLIFECYCLE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonReduxpackLIFECYCLE]
  }
  @scala.inline
  implicit class AnonReduxpackLIFECYCLEOps[Self <: AnonReduxpackLIFECYCLE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/LIFECYCLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRedux-packSlashLIFECYCLE`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/LIFECYCLE")(js.undefined)
        ret
    }
    @scala.inline
    def `withRedux-packSlashTRANSACTION`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/TRANSACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRedux-packSlashTRANSACTION`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/TRANSACTION")(js.undefined)
        ret
    }
  }
  
}

