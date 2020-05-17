package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloseable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a component. */
@js.native
trait XComponentSupplier extends XInterface {
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  val Component: XCloseable = js.native
  /**
    * allows to get access to a component.
    *
    * The component may not support {@link com.sun.star.lang.XComponent} interface.
    * @returns component representation
    */
  def getComponent(): XCloseable = js.native
}

object XComponentSupplier {
  @scala.inline
  def apply(
    Component: XCloseable,
    acquire: () => Unit,
    getComponent: () => XCloseable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentSupplier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getComponent = js.Any.fromFunction0(getComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentSupplier]
  }
  @scala.inline
  implicit class XComponentSupplierOps[Self <: XComponentSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: XCloseable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComponent(value: () => XCloseable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

