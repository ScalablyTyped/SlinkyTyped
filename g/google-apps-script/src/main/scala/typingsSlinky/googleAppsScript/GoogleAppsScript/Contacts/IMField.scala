package typingsSlinky.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instant messaging field in a Contact.
  */
@js.native
trait IMField extends js.Object {
  
  def deleteIMField(): Unit = js.native
  
  def getAddress(): String = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def isPrimary(): Boolean = js.native
  
  def setAddress(address: String): IMField = js.native
  
  def setAsPrimary(): IMField = js.native
  
  def setLabel(field: Field): IMField = js.native
  def setLabel(label: String): IMField = js.native
}
