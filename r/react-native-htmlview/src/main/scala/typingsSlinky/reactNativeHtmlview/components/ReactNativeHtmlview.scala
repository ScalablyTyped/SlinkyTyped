package typingsSlinky.reactNativeHtmlview.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.ViewProperties
import typingsSlinky.reactNativeHtmlview.mod.HTMLViewNode
import typingsSlinky.reactNativeHtmlview.mod.HTMLViewProps
import typingsSlinky.reactNativeHtmlview.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeHtmlview {
  
  @scala.inline
  def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLViewProps]))
  }
  
  @JSImport("react-native-htmlview", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def NodeComponent(value: ReactComponentClass[js.Object]): this.type = set("NodeComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def NodeComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("NodeComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def NodeComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("NodeComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def RootComponent(value: ReactComponentClass[js.Object]): this.type = set("RootComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def RootComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("RootComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def RootComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("RootComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TextComponent(value: ReactComponentClass[js.Object]): this.type = set("TextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TextComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("TextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def TextComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("TextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addLineBreaks(value: Boolean): this.type = set("addLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bullet(value: String): this.type = set("bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineBreak(value: String): this.type = set("lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeComponentProps(value: TextProperties): this.type = set("nodeComponentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLinkLongPress(value: /* url */ String => Unit): this.type = set("onLinkLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLinkPress(value: /* url */ String => Unit): this.type = set("onLinkPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def paragraphBreak(value: String): this.type = set("paragraphBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderNode(
      value: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactElement]) => ReactElement
    ): this.type = set("renderNode", js.Any.fromFunction5(value))
    
    @scala.inline
    def rootComponentProps(value: ViewProperties): this.type = set("rootComponentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textComponentProps(value: TextProperties): this.type = set("textComponentProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
