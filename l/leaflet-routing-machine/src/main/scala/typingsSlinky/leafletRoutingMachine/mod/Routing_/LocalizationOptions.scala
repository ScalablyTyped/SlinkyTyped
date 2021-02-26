package typingsSlinky.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.leafletRoutingMachine.anon.E
import typingsSlinky.leafletRoutingMachine.anon.EndPlaceholder
import typingsSlinky.leafletRoutingMachine.anon.Hours
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizationOptions extends StObject {
  
  var directions: E = js.native
  
  def formatOrder(n: String): String = js.native
  def formatOrder(n: Double): String = js.native
  
  var instructions: StringDictionary[js.Array[String] | String] = js.native
  
  var ui: EndPlaceholder = js.native
  
  var units: Hours = js.native
}
