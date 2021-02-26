package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Errors
import typingsSlinky.antd.formListMod.FormListFieldData
import typingsSlinky.antd.formListMod.FormListOperation
import typingsSlinky.antd.formListMod.FormListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormList {
  
  @scala.inline
  def apply(
    children: (js.Array[FormListFieldData], FormListOperation, Errors) => ReactElement,
    name: String | Double | (js.Array[String | Double])
  ): SharedBuilder_FormListProps458563791 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
    new SharedBuilder_FormListProps458563791(js.Array(this.component, __props.asInstanceOf[FormListProps]))
  }
  
  @JSImport("antd/lib/form/FormList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormListProps): SharedBuilder_FormListProps458563791 = new SharedBuilder_FormListProps458563791(js.Array(this.component, p.asInstanceOf[js.Any]))
}
