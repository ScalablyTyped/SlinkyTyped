package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new ACL.
  * If no argument is given, the ACL has no permissions for anyone.
  * If the argument is a Parse.User, the ACL will have read and write
  *   permission for only that user.
  * If the argument is any other JSON object, that object will be interpretted
  *   as a serialized ACL created with toJSON().
  * @see Parse.Object#setACL
  *
  * <p>An ACL, or Access Control List can be added to any
  * <code>Parse.Object</code> to restrict access to only a subset of users
  * of your application.</p>
  */
@JSGlobal("Parse.ACL")
@js.native
class ACL () extends js.Object {
  def this(arg1: js.Any) = this()
  
  def getPublicReadAccess(): Boolean = js.native
  
  def getPublicWriteAccess(): Boolean = js.native
  
  def getReadAccess(userId: String): Boolean = js.native
  def getReadAccess(userId: User[Attributes]): Boolean = js.native
  
  def getRoleReadAccess(role: String): Boolean = js.native
  def getRoleReadAccess(role: Role[Attributes]): Boolean = js.native
  
  def getRoleWriteAccess(role: String): Boolean = js.native
  def getRoleWriteAccess(role: Role[Attributes]): Boolean = js.native
  
  def getWriteAccess(userId: String): Boolean = js.native
  def getWriteAccess(userId: User[Attributes]): Boolean = js.native
  
  var permissionsById: js.Any = js.native
  
  def setPublicReadAccess(allowed: Boolean): Unit = js.native
  
  def setPublicWriteAccess(allowed: Boolean): Unit = js.native
  
  def setReadAccess(userId: String, allowed: Boolean): Unit = js.native
  def setReadAccess(userId: User[Attributes], allowed: Boolean): Unit = js.native
  
  def setRoleReadAccess(role: String, allowed: Boolean): Unit = js.native
  def setRoleReadAccess(role: Role[Attributes], allowed: Boolean): Unit = js.native
  
  def setRoleWriteAccess(role: String, allowed: Boolean): Unit = js.native
  def setRoleWriteAccess(role: Role[Attributes], allowed: Boolean): Unit = js.native
  
  def setWriteAccess(userId: String, allowed: Boolean): Unit = js.native
  def setWriteAccess(userId: User[Attributes], allowed: Boolean): Unit = js.native
  
  def toJSON(): js.Any = js.native
}
