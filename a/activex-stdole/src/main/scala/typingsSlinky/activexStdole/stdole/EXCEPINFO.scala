package typingsSlinky.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXCEPINFO extends js.Object {
  val bstrDescription: String = js.native
  val bstrHelpFile: String = js.native
  val bstrSource: String = js.native
  val dwHelpContext: Double = js.native
  val pfnDeferredFillIn: js.UndefOr[scala.Nothing] = js.native
  val pvReserved: js.UndefOr[scala.Nothing] = js.native
  val scode: js.Any = js.native
  val wCode: Double = js.native
  val wReserved: Double = js.native
}

object EXCEPINFO {
  @scala.inline
  def apply(
    bstrDescription: String,
    bstrHelpFile: String,
    bstrSource: String,
    dwHelpContext: Double,
    scode: js.Any,
    wCode: Double,
    wReserved: Double
  ): EXCEPINFO = {
    val __obj = js.Dynamic.literal(bstrDescription = bstrDescription.asInstanceOf[js.Any], bstrHelpFile = bstrHelpFile.asInstanceOf[js.Any], bstrSource = bstrSource.asInstanceOf[js.Any], dwHelpContext = dwHelpContext.asInstanceOf[js.Any], scode = scode.asInstanceOf[js.Any], wCode = wCode.asInstanceOf[js.Any], wReserved = wReserved.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXCEPINFO]
  }
  @scala.inline
  implicit class EXCEPINFOOps[Self <: EXCEPINFO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBstrHelpFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrHelpFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBstrSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwHelpContext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwHelpContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWReserved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPfnDeferredFillIn(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfnDeferredFillIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfnDeferredFillIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfnDeferredFillIn")(js.undefined)
        ret
    }
    @scala.inline
    def withPvReserved(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pvReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPvReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pvReserved")(js.undefined)
        ret
    }
  }
  
}

