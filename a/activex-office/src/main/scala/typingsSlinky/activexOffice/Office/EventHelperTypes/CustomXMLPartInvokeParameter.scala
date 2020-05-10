package typingsSlinky.activexOffice.Office.EventHelperTypes

import typingsSlinky.activexStdole.stdole.DISPPARAMS
import typingsSlinky.activexStdole.stdole.EXCEPINFO
import typingsSlinky.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLPartInvokeParameter extends js.Object {
  val dispidMember: Double = js.native
  val lcid: Double = js.native
  val pdispparams: DISPPARAMS = js.native
  var pexcepinfo: EXCEPINFO = js.native
  var puArgErr: Double = js.native
  var pvarResult: js.Any = js.native
  val riid: GUID = js.native
  val wFlags: Double = js.native
}

object CustomXMLPartInvokeParameter {
  @scala.inline
  def apply(
    dispidMember: Double,
    lcid: Double,
    pdispparams: DISPPARAMS,
    pexcepinfo: EXCEPINFO,
    puArgErr: Double,
    pvarResult: js.Any,
    riid: GUID,
    wFlags: Double
  ): CustomXMLPartInvokeParameter = {
    val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLPartInvokeParameter]
  }
  @scala.inline
  implicit class CustomXMLPartInvokeParameterOps[Self <: CustomXMLPartInvokeParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispidMember(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispidMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPdispparams(value: DISPPARAMS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdispparams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPexcepinfo(value: EXCEPINFO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pexcepinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPuArgErr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("puArgErr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPvarResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pvarResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRiid(value: GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wFlags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

