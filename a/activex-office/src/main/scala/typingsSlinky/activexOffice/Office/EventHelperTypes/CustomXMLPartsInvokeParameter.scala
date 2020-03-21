package typingsSlinky.activexOffice.Office.EventHelperTypes

import typingsSlinky.activexStdole.stdole.DISPPARAMS
import typingsSlinky.activexStdole.stdole.EXCEPINFO
import typingsSlinky.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomXMLPartsInvokeParameter extends js.Object {
  val dispidMember: Double
  val lcid: Double
  val pdispparams: DISPPARAMS
  var pexcepinfo: EXCEPINFO
  var puArgErr: Double
  var pvarResult: js.Any
  val riid: GUID
  val wFlags: Double
}

object CustomXMLPartsInvokeParameter {
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
  ): CustomXMLPartsInvokeParameter = {
    val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomXMLPartsInvokeParameter]
  }
}

