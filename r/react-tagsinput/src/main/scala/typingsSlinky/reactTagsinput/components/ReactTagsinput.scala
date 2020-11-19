package typingsSlinky.reactTagsinput.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactTagsinput.mod.InputProps
import typingsSlinky.reactTagsinput.mod.ReactTagsInputProps
import typingsSlinky.reactTagsinput.mod.RenderInputProps
import typingsSlinky.reactTagsinput.mod.RenderTagProps
import typingsSlinky.reactTagsinput.mod.TagProps
import typingsSlinky.reactTagsinput.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagsinput {
  
  @JSImport("react-tagsinput", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Tag] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^[Tag]] {
    
    @scala.inline
    def addKeysVarargs(value: (Double | String)*): this.type = set("addKeys", js.Array(value :_*))
    
    @scala.inline
    def addKeys(value: js.Array[Double | String]): this.type = set("addKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addOnBlur(value: Boolean): this.type = set("addOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addOnPaste(value: Boolean): this.type = set("addOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentValue(value: String): this.type = set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedClassName(value: String): this.type = set("focusedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: InputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxTags(value: Double): this.type = set("maxTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChangeInput(value: /* value */ String => Unit): this.type = set("onChangeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValidationReject(value: /* tags */ js.Array[String] => Unit): this.type = set("onValidationReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onlyUnique(value: Boolean): this.type = set("onlyUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pasteSplit(value: /* data */ String => js.Array[String]): this.type = set("pasteSplit", js.Any.fromFunction1(value))
    
    @scala.inline
    def preventSubmit(value: Boolean): this.type = set("preventSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeKeysVarargs(value: Double*): this.type = set("removeKeys", js.Array(value :_*))
    
    @scala.inline
    def removeKeys(value: js.Array[Double]): this.type = set("removeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderInput(value: /* props */ RenderInputProps[Tag] => ReactElement): this.type = set("renderInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderLayout(value: (/* tagElements */ js.Array[ReactElement], /* inputElement */ ReactElement) => ReactChild): this.type = set("renderLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def renderTag(value: /* props */ RenderTagProps[Tag] => ReactElement): this.type = set("renderTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def tagDisplayProp(value: /* keyof Tag */ String): this.type = set("tagDisplayProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagDisplayPropNull: this.type = set("tagDisplayProp", null)
    
    @scala.inline
    def tagProps(value: TagProps): this.type = set("tagProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validationRegex(value: js.RegExp): this.type = set("validationRegex", value.asInstanceOf[js.Any])
  }
  
  def withProps[Tag](p: ReactTagsInputProps[Tag]): Builder[Tag] = new Builder[Tag](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[Tag](onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit, value: js.Array[Tag]): Builder[Tag] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value.asInstanceOf[js.Any])
    new Builder[Tag](js.Array(this.component, __props.asInstanceOf[ReactTagsInputProps[Tag]]))
  }
}
