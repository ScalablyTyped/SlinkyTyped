package typingsSlinky.activexLibreoffice.com_.sun.star.presentation

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be supported to provide access to customized presentations of a presentation document.
  * @see XCustomPresentation
  * @see XCustomPresentationAccess
  */
@js.native
trait XCustomPresentationSupplier extends XInterface {
  /** @returns the {@link CustomPresentation} . */
  val CustomPresentations: XNameContainer = js.native
  /** @returns the {@link CustomPresentation} . */
  def getCustomPresentations(): XNameContainer = js.native
}

object XCustomPresentationSupplier {
  @scala.inline
  def apply(
    CustomPresentations: XNameContainer,
    acquire: () => Unit,
    getCustomPresentations: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCustomPresentationSupplier = {
    val __obj = js.Dynamic.literal(CustomPresentations = CustomPresentations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCustomPresentations = js.Any.fromFunction0(getCustomPresentations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCustomPresentationSupplier]
  }
  @scala.inline
  implicit class XCustomPresentationSupplierOps[Self <: XCustomPresentationSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomPresentations(value: XNameContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPresentations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCustomPresentations(value: () => XNameContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomPresentations")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

