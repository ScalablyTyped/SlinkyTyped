package typingsSlinky.reactNativeTags.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTags.mod.RenderTag
import typingsSlinky.reactNativeTags.mod.TagsProps
import typingsSlinky.reactNativeTags.mod.TextInputProps
import typingsSlinky.reactNativeTags.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeTags {
  
  @scala.inline
  def apply(renderTag: RenderTag => Unit): Builder = {
    val __props = js.Dynamic.literal(renderTag = js.Any.fromFunction1(renderTag))
    new Builder(js.Array(this.component, __props.asInstanceOf[TagsProps]))
  }
  
  @JSImport("react-native-tags", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def containerStyle(value: ViewStyle): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def createTagOnReturn(value: Boolean): this.type = set("createTagOnReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def createTagOnString(value: js.Array[String]): this.type = set("createTagOnString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def createTagOnStringVarargs(value: String*): this.type = set("createTagOnString", js.Array(value :_*))
    
    @scala.inline
    def deleteTagOnPress(value: Boolean): this.type = set("deleteTagOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialTags(value: js.Array[String]): this.type = set("initialTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialTagsVarargs(value: String*): this.type = set("initialTags", js.Array(value :_*))
    
    @scala.inline
    def initialText(value: String): this.type = set("initialText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputContainerStyle(value: TextStyle): this.type = set("inputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: TextStyle): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxNumberOfTags(value: Double): this.type = set("maxNumberOfTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChangeTags(value: /* tags */ js.Array[String] => Unit): this.type = set("onChangeTags", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTagPress(
      value: (/* index */ Double, /* tagLabel */ String, /* event */ js.Any, /* deleted */ Boolean) => Unit
    ): this.type = set("onTagPress", js.Any.fromFunction4(value))
    
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagContainerStyle(value: ViewStyle): this.type = set("tagContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagTextStyle(value: TextStyle): this.type = set("tagTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textInputProps(value: TextInputProps): this.type = set("textInputProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
