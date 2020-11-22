package typingsSlinky.antd.components

import typingsSlinky.antd.formItemMod.FormItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItem {
  
  @JSImport("antd/lib/form/FormItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[Values](p: FormItemProps[Values]): SharedBuilder_FormItemProps1309695920[Values] = new SharedBuilder_FormItemProps1309695920[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[Values](): SharedBuilder_FormItemProps1309695920[Values] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_FormItemProps1309695920[Values](js.Array(this.component, __props.asInstanceOf[FormItemProps[Values]]))
  }
  
  implicit def make[Values](companion: FormItem.type): SharedBuilder_FormItemProps1309695920[Values] = new SharedBuilder_FormItemProps1309695920[Values](js.Array(this.component, js.Dictionary.empty))()
}
