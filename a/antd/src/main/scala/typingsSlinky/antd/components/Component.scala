package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Children
import typingsSlinky.antd.anon.Errors
import typingsSlinky.antd.errorListMod.ErrorListProps
import typingsSlinky.antd.formContextMod.FormProviderProps
import typingsSlinky.antd.formFormMod.FormProps
import typingsSlinky.antd.formItemMod.FormItemProps
import typingsSlinky.antd.formListMod.FormListFieldData
import typingsSlinky.antd.formListMod.FormListOperation
import typingsSlinky.antd.formListMod.FormListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @scala.inline
  def apply[Values](): SharedBuilder_ChildrenFormProps269883558[Values] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_ChildrenFormProps269883558[Values](js.Array(this.component, __props.asInstanceOf[Children[Values] with FormProps[Values]]))
  }
  
  object Component {
    
    @scala.inline
    def apply[Values](): SharedBuilder_FormItemProps1309695920[Values] = {
      val __props = js.Dynamic.literal()
      new SharedBuilder_FormItemProps1309695920[Values](js.Array(this.component, __props.asInstanceOf[FormItemProps[Values]]))
    }
    
    @JSImport("antd/lib/form", "default.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make[Values](companion: Component.type): SharedBuilder_FormItemProps1309695920[Values] = new SharedBuilder_FormItemProps1309695920[Values](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps[Values](p: FormItemProps[Values]): SharedBuilder_FormItemProps1309695920[Values] = new SharedBuilder_FormItemProps1309695920[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ErrorList {
    
    @JSImport("antd/lib/form", "default.ErrorList")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ErrorList.type): SharedBuilder_ErrorListProps1412097232 = new SharedBuilder_ErrorListProps1412097232(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* hasErrorsHelpOnDomErrorVisibleChange */ ErrorListProps): SharedBuilder_ErrorListProps1412097232 = new SharedBuilder_ErrorListProps1412097232(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object List {
    
    @scala.inline
    def apply(
      children: (js.Array[FormListFieldData], FormListOperation, Errors) => ReactElement,
      name: String | Double | (js.Array[String | Double])
    ): SharedBuilder_FormListProps458563791 = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
      new SharedBuilder_FormListProps458563791(js.Array(this.component, __props.asInstanceOf[FormListProps]))
    }
    
    @JSImport("antd/lib/form", "default.List")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: FormListProps): SharedBuilder_FormListProps458563791 = new SharedBuilder_FormListProps458563791(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Provider {
    
    @JSImport("antd/lib/form", "default.Provider")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Provider.type): SharedBuilder_FormProviderProps461694305 = new SharedBuilder_FormProviderProps461694305(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps461694305 = new SharedBuilder_FormProviderProps461694305(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd/lib/form", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[Values](companion: Component.type): SharedBuilder_ChildrenFormProps269883558[Values] = new SharedBuilder_ChildrenFormProps269883558[Values](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Values](p: Children[Values] with FormProps[Values]): SharedBuilder_ChildrenFormProps269883558[Values] = new SharedBuilder_ChildrenFormProps269883558[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
}
