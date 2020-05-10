package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.antd.formListMod.FormListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormList {
  @JSImport("antd/lib/form/FormList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FormListProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String | Double | (js.Array[String | Double])): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[FormListProps]))
  }
}

