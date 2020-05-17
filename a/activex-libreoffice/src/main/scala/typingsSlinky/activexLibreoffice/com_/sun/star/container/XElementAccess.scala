package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the base interface of all collection interfaces. */
@js.native
trait XElementAccess extends XInterface {
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  val ElementType: `type` = js.native
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  def getElementType(): `type` = js.native
  /** @returns `TRUE` if the object contain elements, otherwise `FALSE` . */
  def hasElements(): Boolean = js.native
}

object XElementAccess {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XElementAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XElementAccess]
  }
  @scala.inline
  implicit class XElementAccessOps[Self <: XElementAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementType(value: `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetElementType(value: () => `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasElements(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasElements")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

