package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the style families within the container document. */
@js.native
trait XStyleFamiliesSupplier extends XInterface {
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  val StyleFamilies: XNameAccess = js.native
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  def getStyleFamilies(): XNameAccess = js.native
}

object XStyleFamiliesSupplier {
  @scala.inline
  def apply(
    StyleFamilies: XNameAccess,
    acquire: () => Unit,
    getStyleFamilies: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleFamiliesSupplier = {
    val __obj = js.Dynamic.literal(StyleFamilies = StyleFamilies.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleFamiliesSupplier]
  }
  @scala.inline
  implicit class XStyleFamiliesSupplierOps[Self <: XStyleFamiliesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleFamilies(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStyleFamilies(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleFamilies")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

