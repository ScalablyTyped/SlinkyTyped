package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to retrieve the user interface configuration manager related to an object.
  * @since OOo 2.0
  */
@js.native
trait XUIConfigurationManagerSupplier extends XInterface {
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  val UIConfigurationManager: XUIConfigurationManager = js.native
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  def getUIConfigurationManager(): XUIConfigurationManager = js.native
}

object XUIConfigurationManagerSupplier {
  @scala.inline
  def apply(
    UIConfigurationManager: XUIConfigurationManager,
    acquire: () => Unit,
    getUIConfigurationManager: () => XUIConfigurationManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal(UIConfigurationManager = UIConfigurationManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUIConfigurationManager = js.Any.fromFunction0(getUIConfigurationManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIConfigurationManagerSupplier]
  }
  @scala.inline
  implicit class XUIConfigurationManagerSupplierOps[Self <: XUIConfigurationManagerSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUIConfigurationManager(value: XUIConfigurationManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIConfigurationManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUIConfigurationManager(value: () => XUIConfigurationManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUIConfigurationManager")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

