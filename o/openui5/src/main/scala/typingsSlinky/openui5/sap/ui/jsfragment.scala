package typingsSlinky.openui5.sap.ui

import typingsSlinky.openui5.sap.ui.core.Control
import typingsSlinky.openui5.sap.ui.core.Fragment
import typingsSlinky.openui5.sap.ui.core.mvc.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.jsfragment")
@js.native
object jsfragment extends js.Object {
  //  Defines OR instantiates an HTML-based Fragment.
  def apply(sFragmentName: String): Fragment = js.native
  def apply(sFragmentName: String, oController: js.Any): Fragment = js.native
  def apply(sId: String, sFragmentName: String): Fragment = js.native
  def apply(sId: String, sFragmentName: String, oController: js.Any): Fragment = js.native
  def apply(sId: String, sFragmentName: String, oController: Controller): Control | js.Array[Control] = js.native
  def apply(sId: String, sFragmentName: js.Any, oController: Controller): Control | js.Array[Control] = js.native
}

