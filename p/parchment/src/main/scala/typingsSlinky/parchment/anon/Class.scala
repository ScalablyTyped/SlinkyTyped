package typingsSlinky.parchment.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.parchment.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var Attribute: typingsSlinky.parchment.anon.Attribute
  var Class: TypeofClassAttributor
  var Store: Instantiable1[/* domNode */ HTMLElement, default]
  var Style: TypeofStyleAttributor
}

object Class {
  @scala.inline
  def apply(
    Attribute: Attribute,
    Class: TypeofClassAttributor,
    Store: Instantiable1[/* domNode */ HTMLElement, default],
    Style: TypeofStyleAttributor
  ): Class = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

