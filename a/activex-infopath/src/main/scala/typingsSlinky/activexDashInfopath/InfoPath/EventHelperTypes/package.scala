package typingsSlinky.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.dispidMember
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.lcid
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pdispparams
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pexcepinfo
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.puArgErr
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pvarResult
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.riid
  import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.wFlags

  type Button_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type DataDOM_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type XDocument_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
