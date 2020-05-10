package typingsSlinky.angularPermission.mod.permission

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionStore extends js.Object {
  /**
    * Removes all permissions
    * @method
    */
  def clearStore(): Unit = js.native
  /**
    * Allows to define set of permissionNames with shared validation function on application configuration
    * @method
    * @throws {TypeError}
    *
    * @param permissionNames {Array} Set of permission names
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def defineManyPermissions(permissionNames: js.Array[String], validationFunction: PermissionValidationFunction): Unit = js.native
  /**
    * Allows to define permission on application configuration
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def definePermission(permissionName: String, validationFunction: PermissionValidationFunction): Unit = js.native
  /**
    * Returns permission by it's name
    * @method
    *
    * @returns {permission.Permission} Permissions definition object
    */
  def getPermissionDefinition(permissionName: String): Permission = js.native
  /**
    * Returns all permissions
    * @method
    *
    * @returns {Object} Permissions collection
    */
  def getStore(): StringDictionary[Permission] = js.native
  /**
    * Checks if permission exists
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @returns {Boolean}
    */
  def hasPermissionDefinition(permissionName: String): Boolean = js.native
  /**
    * Deletes permission
    * @method
    *
    * @param permissionName {String} Name of defined permission
    */
  def removePermissionDefinition(permissionName: String): Unit = js.native
}

object PermissionStore {
  @scala.inline
  def apply(
    clearStore: () => Unit,
    defineManyPermissions: (js.Array[String], PermissionValidationFunction) => Unit,
    definePermission: (String, PermissionValidationFunction) => Unit,
    getPermissionDefinition: String => Permission,
    getStore: () => StringDictionary[Permission],
    hasPermissionDefinition: String => Boolean,
    removePermissionDefinition: String => Unit
  ): PermissionStore = {
    val __obj = js.Dynamic.literal(clearStore = js.Any.fromFunction0(clearStore), defineManyPermissions = js.Any.fromFunction2(defineManyPermissions), definePermission = js.Any.fromFunction2(definePermission), getPermissionDefinition = js.Any.fromFunction1(getPermissionDefinition), getStore = js.Any.fromFunction0(getStore), hasPermissionDefinition = js.Any.fromFunction1(hasPermissionDefinition), removePermissionDefinition = js.Any.fromFunction1(removePermissionDefinition))
    __obj.asInstanceOf[PermissionStore]
  }
  @scala.inline
  implicit class PermissionStoreOps[Self <: PermissionStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefineManyPermissions(value: (js.Array[String], PermissionValidationFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineManyPermissions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefinePermission(value: (String, PermissionValidationFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definePermission")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPermissionDefinition(value: String => Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPermissionDefinition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStore(value: () => StringDictionary[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasPermissionDefinition(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPermissionDefinition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePermissionDefinition(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePermissionDefinition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

