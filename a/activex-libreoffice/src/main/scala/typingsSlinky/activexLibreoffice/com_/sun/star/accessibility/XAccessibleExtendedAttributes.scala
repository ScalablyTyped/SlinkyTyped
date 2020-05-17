package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAccessibleExtendedAttributes extends XInterface {
  val ExtendedAttributes: js.Any = js.native
  def getExtendedAttributes(): js.Any = js.native
}

object XAccessibleExtendedAttributes {
  @scala.inline
  def apply(
    ExtendedAttributes: js.Any,
    acquire: () => Unit,
    getExtendedAttributes: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleExtendedAttributes = {
    val __obj = js.Dynamic.literal(ExtendedAttributes = ExtendedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getExtendedAttributes = js.Any.fromFunction0(getExtendedAttributes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleExtendedAttributes]
  }
  @scala.inline
  implicit class XAccessibleExtendedAttributesOps[Self <: XAccessibleExtendedAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtendedAttributes(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtendedAttributes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

