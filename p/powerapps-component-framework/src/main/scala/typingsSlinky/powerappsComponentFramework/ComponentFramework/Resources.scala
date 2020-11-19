package typingsSlinky.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource interface of context.resources
  */
@js.native
trait Resources extends js.Object {
  
  /**
    * Gets a resource referenced by the control manifest.
    * @param id The resource string identifier.
    * @param success The success callback. Resource data is returned in base 64 encoded format.
    * @param failure The failure callback.
    */
  def getResource(id: String, success: js.Function1[/* data */ String, Unit], failure: js.Function0[Unit]): Unit = js.native
  
  /**
    * Get the localized string for the given identifier.
    * @param id name of resource in the control manifest.
    */
  def getString(id: String): String = js.native
}
object Resources {
  
  @scala.inline
  def apply(
    getResource: (String, js.Function1[/* data */ String, Unit], js.Function0[Unit]) => Unit,
    getString: String => String
  ): Resources = {
    val __obj = js.Dynamic.literal(getResource = js.Any.fromFunction3(getResource), getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit class ResourcesOps[Self <: Resources] (val x: Self) extends AnyVal {
    
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
    def setGetResource(value: (String, js.Function1[/* data */ String, Unit], js.Function0[Unit]) => Unit): Self = this.set("getResource", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetString(value: String => String): Self = this.set("getString", js.Any.fromFunction1(value))
  }
}
