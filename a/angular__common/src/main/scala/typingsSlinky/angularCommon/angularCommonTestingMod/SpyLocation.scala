package typingsSlinky.angularCommon.angularCommonTestingMod

import typingsSlinky.angularCommon.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/testing/testing", "SpyLocation")
@js.native
class SpyLocation () extends Location {
  
  var _history: js.Any = js.native
  
  var _historyIndex: js.Any = js.native
  
  def setBaseHref(url: String): Unit = js.native
  
  def setInitialPath(url: String): Unit = js.native
  
  def simulateHashChange(pathname: String): Unit = js.native
  
  def simulateUrlPop(pathname: String): Unit = js.native
  
  var urlChanges: js.Array[String] = js.native
}
