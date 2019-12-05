package typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bPoweredOff
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bReceiving
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bRinging
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bSending
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.dispidMember
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lDeviceId
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lcid
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pFaxServer
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pdispparams
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pexcepinfo
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.puArgErr
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pvarResult
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.riid
  import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.wFlags

  type FaxAccount_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type FaxServer_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type FaxServer_OnDeviceStatusChange_ArgNames = js.Tuple6[pFaxServer, lDeviceId, bPoweredOff, bSending, bReceiving, bRinging]
}
