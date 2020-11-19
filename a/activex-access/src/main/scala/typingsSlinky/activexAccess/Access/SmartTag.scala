package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTag extends js.Object {
  
  @JSName("Access.SmartTag_typekey")
  var AccessDotSmartTag_typekey: SmartTag = js.native
  
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  
  def Delete(): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val IsMissing: Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Properties(Index: String): SmartTagProperty = js.native
  def Properties(Index: Double): SmartTagProperty = js.native
  @JSName("Properties")
  val Properties_Original: SmartTagProperties = js.native
  
  def SmartTagActions(Index: String): SmartTagAction = js.native
  def SmartTagActions(Index: Double): SmartTagAction = js.native
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions = js.native
  
  val XML: String = js.native
}
