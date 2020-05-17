package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a {@link LayerManager} .
  * @see LayerManager
  */
@js.native
trait XLayerSupplier extends XInterface {
  /** @returns the {@link LayerManager} . */
  val LayerManager: XNameAccess = js.native
  /** @returns the {@link LayerManager} . */
  def getLayerManager(): XNameAccess = js.native
}

object XLayerSupplier {
  @scala.inline
  def apply(
    LayerManager: XNameAccess,
    acquire: () => Unit,
    getLayerManager: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLayerSupplier = {
    val __obj = js.Dynamic.literal(LayerManager = LayerManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLayerManager = js.Any.fromFunction0(getLayerManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayerSupplier]
  }
  @scala.inline
  implicit class XLayerSupplierOps[Self <: XLayerSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerManager(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLayerManager(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayerManager")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

