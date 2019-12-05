package typingsSlinky.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.dispidMember
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.lcid
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.pdispparams
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.pexcepinfo
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.puArgErr
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.pvarResult
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.riid
  import typingsSlinky.activexDashExcel.activexDashExcelStrings.wFlags

  type Application_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type Chart_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type OLEObject_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type QueryTable_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type Workbook_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type Worksheet_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
