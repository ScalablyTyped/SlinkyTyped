package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.formListMod.FieldData
import typingsSlinky.antd.formListMod.FormListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormList {
  @JSImport("antd/lib/form/FormList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FormListProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    children: (js.Array[FieldData], typingsSlinky.antd.formListMod.Operation) => ReactElement,
    name: String | Double | (js.Array[String | Double])
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[FormListProps]))
  }
}

