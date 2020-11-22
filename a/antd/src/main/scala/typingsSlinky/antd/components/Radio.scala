package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.antd.radioInterfaceMod.RadioProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  @JSImport("antd", "Radio")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: RadioChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Button {
    
    @JSImport("antd", "Radio.Button")
    @js.native
    object component extends js.Object
    
    def withProps(p: RadioButtonProps with RefAttributes[js.Any]): SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object] = new SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Button.type): SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object] = new SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  /* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree., Couldn't find props for (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any) | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    * / typingsSlinky.std.stdStrings.Pick with (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any)))) with typingsSlinky.react.anon.`1` because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree., Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    * / typingsSlinky.std.stdStrings.Pick with (js.Object | (/ * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any)) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.)), Couldn't find props for (js.Any | (/ * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    * / typingsSlinky.std.stdStrings.Pick with js.Any)) with (typingsSlinky.react.mod.RefAttributes[
  typingsSlinky.std.InstanceType[
    typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.antd.radioInterfaceMod.RadioGroupProps with typingsSlinky.react.mod.RefAttributes[typingsSlinky.std.HTMLDivElement]
    ]
  ]]) because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree., Couldn't find props for / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    * / typingsSlinky.std.stdStrings.Pick with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
  object Group {
    
    @JSImport("antd", "Radio.Group")
    @js.native
    object component extends js.Object
    
    def apply(
      p: ComponentPropsWithRef[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]]
    ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Group.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
}
