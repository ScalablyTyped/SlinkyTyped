package typingsSlinky.avoscloudSdk.leanengineMod

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
@JSImport("leanengine", "ACL")
@js.native
class ACL ()
  extends typingsSlinky.avoscloudSdk.mod.ACL {
  def this(arg1: js.Any) = this()
}
