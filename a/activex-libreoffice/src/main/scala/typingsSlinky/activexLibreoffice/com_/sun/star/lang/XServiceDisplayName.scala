package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a name for the service to be used in displays.
  *
  * This name can be used in displays (dialogs, menus, etc.) to provide a more memorable / meaningful name than the service name or its implementation
  * name. It should not be used to identify / select a specific service / implementation.
  */
@js.native
trait XServiceDisplayName extends XInterface {
  
  /**
    * returns the display name of the service for a given language.
    *
    * The caller may specify a {@link com.sun.star.lang.Locale} for the preferred language of the resulting string. However, if that locale is not supported
    * the resulting string may be given in a different language. Usually this should be English.
    * @param aLocale the preferred language for the resulting display name.
    * @returns the string to be used for the service in displays.
    */
  def getServiceDisplayName(aLocale: Locale): String = js.native
}
object XServiceDisplayName {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getServiceDisplayName: Locale => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceDisplayName = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XServiceDisplayName]
  }
  
  @scala.inline
  implicit class XServiceDisplayNameOps[Self <: XServiceDisplayName] (val x: Self) extends AnyVal {
    
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
    def setGetServiceDisplayName(value: Locale => String): Self = this.set("getServiceDisplayName", js.Any.fromFunction1(value))
  }
}
