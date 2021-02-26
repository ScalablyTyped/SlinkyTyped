package typingsSlinky.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An email field in a Contact.
  */
@js.native
trait EmailField extends StObject {
  
  def deleteEmailField(): Unit = js.native
  
  def getAddress(): String = js.native
  
  def getDisplayName(): String = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def isPrimary(): Boolean = js.native
  
  def setAddress(address: String): EmailField = js.native
  
  def setAsPrimary(): EmailField = js.native
  
  def setDisplayName(name: String): EmailField = js.native
  
  def setLabel(field: Field): EmailField = js.native
  def setLabel(label: String): EmailField = js.native
}
