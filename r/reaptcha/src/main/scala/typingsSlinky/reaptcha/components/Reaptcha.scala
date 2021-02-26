package typingsSlinky.reaptcha.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reaptcha.mod.ReaptchaProps
import typingsSlinky.reaptcha.mod.RenderProps
import typingsSlinky.reaptcha.mod.default
import typingsSlinky.reaptcha.reaptchaStrings.`inline`
import typingsSlinky.reaptcha.reaptchaStrings.bottomleft
import typingsSlinky.reaptcha.reaptchaStrings.bottomright
import typingsSlinky.reaptcha.reaptchaStrings.compact
import typingsSlinky.reaptcha.reaptchaStrings.dark
import typingsSlinky.reaptcha.reaptchaStrings.invisible
import typingsSlinky.reaptcha.reaptchaStrings.light
import typingsSlinky.reaptcha.reaptchaStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reaptcha {
  
  @scala.inline
  def apply(onVerify: String => Unit, sitekey: String): Builder = {
    val __props = js.Dynamic.literal(onVerify = js.Any.fromFunction1(onVerify), sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReaptchaProps]))
  }
  
  @JSImport("reaptcha", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def badge(value: bottomright | bottomleft | `inline`): this.type = set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: /* renderProps */ RenderProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def explicit(value: Boolean): this.type = set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hl(value: String): this.type = set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inject(value: Boolean): this.type = set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isolated(value: Boolean): this.type = set("isolated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: () => Unit): this.type = set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def onExpire(value: () => Unit): this.type = set("onExpire", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRender(value: () => Unit): this.type = set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def size(value: compact | normal | invisible): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabindex(value: Double): this.type = set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: light | dark): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
