package typingsSlinky.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashWord.activexDashWordStrings.Doc
  import typingsSlinky.activexDashWord.activexDashWordStrings.bstrPaperFeed
  import typingsSlinky.activexDashWord.activexDashWordStrings.bstrPrinterName
  import typingsSlinky.activexDashWord.activexDashWordStrings.cpDeliveryAddrEnd
  import typingsSlinky.activexDashWord.activexDashWordStrings.cpDeliveryAddrStart
  import typingsSlinky.activexDashWord.activexDashWordStrings.cpReturnAddrEnd
  import typingsSlinky.activexDashWord.activexDashWordStrings.cpReturnAddrStart
  import typingsSlinky.activexDashWord.activexDashWordStrings.dispidMember
  import typingsSlinky.activexDashWord.activexDashWordStrings.fCancel
  import typingsSlinky.activexDashWord.activexDashWordStrings.fPrint
  import typingsSlinky.activexDashWord.activexDashWordStrings.lcid
  import typingsSlinky.activexDashWord.activexDashWordStrings.pdispparams
  import typingsSlinky.activexDashWord.activexDashWordStrings.pexcepinfo
  import typingsSlinky.activexDashWord.activexDashWordStrings.puArgErr
  import typingsSlinky.activexDashWord.activexDashWordStrings.pvarResult
  import typingsSlinky.activexDashWord.activexDashWordStrings.riid
  import typingsSlinky.activexDashWord.activexDashWordStrings.wFlags
  import typingsSlinky.activexDashWord.activexDashWordStrings.xaWidth
  import typingsSlinky.activexDashWord.activexDashWordStrings.yaHeight

  type Application_EPostageInsertEx_ArgNames = js.Tuple11[
    Doc, 
    cpDeliveryAddrStart, 
    cpDeliveryAddrEnd, 
    cpReturnAddrStart, 
    cpReturnAddrEnd, 
    xaWidth, 
    yaHeight, 
    bstrPrinterName, 
    bstrPaperFeed, 
    fPrint, 
    fCancel
  ]
  type Application_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
