package typingsSlinky.parchment

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.parchment.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClass extends js.Object {
  var Attribute: AnonAttribute = js.native
  var Class: TypeofClassAttributor = js.native
  var Store: Instantiable1[/* domNode */ HTMLElement, default] = js.native
  var Style: TypeofStyleAttributor = js.native
}

object AnonClass {
  @scala.inline
  def apply(
    Attribute: AnonAttribute,
    Class: TypeofClassAttributor,
    Store: Instantiable1[/* domNode */ HTMLElement, default],
    Style: TypeofStyleAttributor
  ): AnonClass = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
  @scala.inline
  implicit class AnonClassOps[Self <: AnonClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: AnonAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: TypeofClassAttributor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Instantiable1[/* domNode */ HTMLElement, default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: TypeofStyleAttributor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

