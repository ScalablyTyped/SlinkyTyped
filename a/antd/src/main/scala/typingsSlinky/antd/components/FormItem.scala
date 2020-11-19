package typingsSlinky.antd.components

import typingsSlinky.antd.formItemMod.FormItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItem {
  
  @JSImport("antd/lib/form/FormItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: /* props */ FormItemProps): SharedBuilder_FormItemProps1002017227 = new SharedBuilder_FormItemProps1002017227(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormItem.type): SharedBuilder_FormItemProps1002017227 = new SharedBuilder_FormItemProps1002017227(js.Array(this.component, js.Dictionary.empty))()
}
