package typingsSlinky.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.dispidMember
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.lcid
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.pdispparams
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.pexcepinfo
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.puArgErr
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.pvarResult
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.riid
  import typingsSlinky.activexDashOffice.activexDashOfficeStrings.wFlags

  type CommandBarButton_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CommandBarComboBox_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CommandBars_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CustomTaskPane_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CustomXMLPart_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CustomXMLParts_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
