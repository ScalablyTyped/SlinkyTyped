package typingsSlinky.oracleOraclejet.ojarraydataproviderMod

import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayDataProvider[K, D] extends DataProvider[K, D] {
  
  def addEventListener(eventType: String, listener: EventListener): Unit = js.native
  
  def getCapability(): js.Any = js.native
  
  def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
}
