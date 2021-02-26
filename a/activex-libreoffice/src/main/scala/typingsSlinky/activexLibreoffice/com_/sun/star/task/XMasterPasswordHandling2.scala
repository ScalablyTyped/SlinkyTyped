package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to change the master password, or let it be requested and checked. */
@js.native
trait XMasterPasswordHandling2 extends XMasterPasswordHandling {
  
  /** allows to detect whether the default master password is used */
  def isDefaultMasterPasswordUsed(): Boolean = js.native
  
  /**
    * allows to let the default password be used
    *
    * Please use this method with care. Using of default master password let the passwords be stored non-encrypted. If a master password is predefined in
    * the algorithm it is no more an encryption, it is just an encoding.
    */
  def useDefaultMasterPassword(xHandler: XInteractionHandler): Boolean = js.native
}
object XMasterPasswordHandling2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    allowPersistentStoring: Boolean => Boolean,
    authorizateWithMasterPassword: XInteractionHandler => Boolean,
    changeMasterPassword: XInteractionHandler => Boolean,
    hasMasterPassword: () => Boolean,
    isDefaultMasterPasswordUsed: () => Boolean,
    isPersistentStoringAllowed: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMasterPassword: () => Unit,
    useDefaultMasterPassword: XInteractionHandler => Boolean
  ): XMasterPasswordHandling2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), hasMasterPassword = js.Any.fromFunction0(hasMasterPassword), isDefaultMasterPasswordUsed = js.Any.fromFunction0(isDefaultMasterPasswordUsed), isPersistentStoringAllowed = js.Any.fromFunction0(isPersistentStoringAllowed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMasterPassword = js.Any.fromFunction0(removeMasterPassword), useDefaultMasterPassword = js.Any.fromFunction1(useDefaultMasterPassword))
    __obj.asInstanceOf[XMasterPasswordHandling2]
  }
  
  @scala.inline
  implicit class XMasterPasswordHandling2MutableBuilder[Self <: XMasterPasswordHandling2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefaultMasterPasswordUsed(value: () => Boolean): Self = StObject.set(x, "isDefaultMasterPasswordUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseDefaultMasterPassword(value: XInteractionHandler => Boolean): Self = StObject.set(x, "useDefaultMasterPassword", js.Any.fromFunction1(value))
  }
}
