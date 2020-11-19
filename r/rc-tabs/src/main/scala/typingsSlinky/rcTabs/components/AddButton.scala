package typingsSlinky.rcTabs.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTabs.addButtonMod.AddButtonProps
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddButton {
  
  @JSImport("rc-tabs/es/TabNavList/AddButton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLButtonElement] {
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AddButtonProps with RefAttributes[HTMLButtonElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AddButtonProps with RefAttributes[HTMLButtonElement]]))
  }
}
