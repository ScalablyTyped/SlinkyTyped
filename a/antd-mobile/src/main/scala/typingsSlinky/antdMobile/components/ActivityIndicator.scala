package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.activityIndicatorMod.ActivityIndicatorProps
import typingsSlinky.antdMobile.antdMobileStrings.large
import typingsSlinky.antdMobile.antdMobileStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActivityIndicator {
  
  @JSImport("antd-mobile", "ActivityIndicator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.ActivityIndicator] {
    
    @scala.inline
    def animating(value: Boolean): this.type = set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toast(value: Boolean): this.type = set("toast", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActivityIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ActivityIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
