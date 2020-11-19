package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for accessing and setting the permissions of a user for a database object.
  * @see com.sun.star.sdbcx.PrivilegeObject
  * @see com.sun.star.sdbcx.Privilege
  */
@js.native
trait XAuthorizable extends XInterface {
  
  /**
    * retrieves the permissions for a specific object, which could be granted to other users and groups.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the grant privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getGrantablePrivileges(objName: String, objType: Double): Double = js.native
  
  /**
    * retrieves the permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getPrivileges(objName: String, objType: Double): Double = js.native
  
  /**
    * adds additional permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def grantPrivileges(objName: String, objType: Double, objPrivileges: Double): Unit = js.native
  
  /**
    * removes permissions for a specific object from a group or user.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def revokePrivileges(objName: String, objType: Double, objPrivileges: Double): Unit = js.native
}
object XAuthorizable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getGrantablePrivileges: (String, Double) => Double,
    getPrivileges: (String, Double) => Double,
    grantPrivileges: (String, Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    revokePrivileges: (String, Double, Double) => Unit
  ): XAuthorizable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3(grantPrivileges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokePrivileges = js.Any.fromFunction3(revokePrivileges))
    __obj.asInstanceOf[XAuthorizable]
  }
  
  @scala.inline
  implicit class XAuthorizableOps[Self <: XAuthorizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetGrantablePrivileges(value: (String, Double) => Double): Self = this.set("getGrantablePrivileges", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPrivileges(value: (String, Double) => Double): Self = this.set("getPrivileges", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrantPrivileges(value: (String, Double, Double) => Unit): Self = this.set("grantPrivileges", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRevokePrivileges(value: (String, Double, Double) => Unit): Self = this.set("revokePrivileges", js.Any.fromFunction3(value))
  }
}
