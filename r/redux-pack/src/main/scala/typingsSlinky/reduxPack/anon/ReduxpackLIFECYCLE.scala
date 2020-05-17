package typingsSlinky.reduxPack.anon

import typingsSlinky.reduxPack.mod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxpackLIFECYCLE extends js.Object {
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.native
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.native
}

object ReduxpackLIFECYCLE {
  @scala.inline
  def apply(): ReduxpackLIFECYCLE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxpackLIFECYCLE]
  }
  @scala.inline
  implicit class ReduxpackLIFECYCLEOps[Self <: ReduxpackLIFECYCLE] (val x: Self) extends AnyVal {
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

