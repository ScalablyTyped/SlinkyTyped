package typingsSlinky.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new ACL.
  * If no argument is given, the ACL has no permissions for anyone.
  * If the argument is a AV.User, the ACL will have read and write
  *   permission for only that user.
  * If the argument is any other JSON object, that object will be interpretted
  *   as a serialized ACL created with toJSON().
  * @see AV.Object#setACL
  * @class
  *
  * <p>An ACL, or Access Control List can be added to any
  * <code>AV.Object</code> to restrict access to only a subset of users
  * of your application.</p>
  */
@JSImport("avoscloud-sdk", "ACL")
@js.native
class ACL () extends BaseObject {
  def this(arg1: js.Any) = this()
  
  def getPublicReadAccess(): Boolean = js.native
  
  def getPublicWriteAccess(): Boolean = js.native
  
  def getReadAccess(userId: String): Boolean = js.native
  def getReadAccess(userId: User): Boolean = js.native
  
  def getRoleReadAccess(role: String): Boolean = js.native
  def getRoleReadAccess(role: Role): Boolean = js.native
  
  def getRoleWriteAccess(role: String): Boolean = js.native
  def getRoleWriteAccess(role: Role): Boolean = js.native
  
  def getWriteAccess(userId: String): Boolean = js.native
  def getWriteAccess(userId: User): Boolean = js.native
  
  var permissionsById: js.Any = js.native
  
  def setPublicReadAccess(allowed: Boolean): Unit = js.native
  
  def setPublicWriteAccess(allowed: Boolean): Unit = js.native
  
  def setReadAccess(userId: String, allowed: Boolean): Unit = js.native
  def setReadAccess(userId: User, allowed: Boolean): Unit = js.native
  
  def setRoleReadAccess(role: String, allowed: Boolean): Unit = js.native
  def setRoleReadAccess(role: Role, allowed: Boolean): Unit = js.native
  
  def setRoleWriteAccess(role: String, allowed: Boolean): Unit = js.native
  def setRoleWriteAccess(role: Role, allowed: Boolean): Unit = js.native
  
  def setWriteAccess(userId: String, allowed: Boolean): Unit = js.native
  def setWriteAccess(userId: User, allowed: Boolean): Unit = js.native
}
