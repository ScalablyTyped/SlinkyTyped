package typingsSlinky.oracleOraclejet.ojarraytreedataproviderMod

import typingsSlinky.oracleOraclejet.ojtreedataproviderMod.TreeDataProvider
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTreeDataProvider[K, D] extends TreeDataProvider[K, D] {
  
  def addEventListener(eventType: String, listener: EventListener): Unit = js.native
  
  def getCapability(): js.Any = js.native
  
  def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
}
