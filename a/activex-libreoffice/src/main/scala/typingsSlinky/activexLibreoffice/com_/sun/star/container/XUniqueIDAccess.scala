package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access contents via a unique ID. */
@js.native
trait XUniqueIDAccess extends XInterface {
  
  /** @returns the element with the specified unique ID. */
  def getByUniqueID(ID: String): js.Any = js.native
  
  /** removes the element with the specified unique ID from this container. */
  def removeByUniqueID(ID: String): Unit = js.native
}
object XUniqueIDAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByUniqueID: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByUniqueID: String => Unit
  ): XUniqueIDAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByUniqueID = js.Any.fromFunction1(getByUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByUniqueID = js.Any.fromFunction1(removeByUniqueID))
    __obj.asInstanceOf[XUniqueIDAccess]
  }
  
  @scala.inline
  implicit class XUniqueIDAccessOps[Self <: XUniqueIDAccess] (val x: Self) extends AnyVal {
    
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
    def setGetByUniqueID(value: String => js.Any): Self = this.set("getByUniqueID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByUniqueID(value: String => Unit): Self = this.set("removeByUniqueID", js.Any.fromFunction1(value))
  }
}
