package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.stepsItemNativeMod.StepsItemProps
import typingsSlinky.antdMobileRn.stepsItemNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StepsItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/steps/StepsItem.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorTail(value: Double): this.type = set("errorTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def last(value: Boolean): this.type = set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: String): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StepsItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
