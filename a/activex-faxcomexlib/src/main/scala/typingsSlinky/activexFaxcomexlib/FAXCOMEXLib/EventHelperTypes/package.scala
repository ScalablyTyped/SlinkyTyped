package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  type FaxAccountInvokeArgNames = js.Tuple8[
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.dispidMember, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.riid, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lcid, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.wFlags, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pdispparams, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pvarResult, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pexcepinfo, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.puArgErr
  ]
  type FaxServerInvokeArgNames = js.Tuple8[
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.dispidMember, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.riid, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lcid, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.wFlags, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pdispparams, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pvarResult, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pexcepinfo, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.puArgErr
  ]
  type FaxServerOnDeviceStatusChangeArgNames = js.Tuple6[
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bPoweredOff, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bSending, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bReceiving, 
    typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bRinging
  ]
}
