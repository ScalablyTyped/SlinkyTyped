package typingsSlinky.angularCommon.angularCommonTestingMod

import typingsSlinky.angularCommon.mod.LocationStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/testing/testing", "MockLocationStrategy")
@js.native
class MockLocationStrategy () extends LocationStrategy {
  
  def getState(): js.Any = js.native
  
  var internalBaseHref: String = js.native
  
  var internalPath: String = js.native
  
  var internalTitle: String = js.native
  
  def simulatePopState(url: String): Unit = js.native
  
  var stateChanges: js.Any = js.native
  
  var urlChanges: js.Array[String] = js.native
}
