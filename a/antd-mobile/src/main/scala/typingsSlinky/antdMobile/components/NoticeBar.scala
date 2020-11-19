package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.closable
import typingsSlinky.antdMobile.antdMobileStrings.link
import typingsSlinky.antdMobile.marqueeMod.MarqueeProps
import typingsSlinky.antdMobile.noticeBarMod.NoticeWebProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeBar {
  
  @JSImport("antd-mobile", "NoticeBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.NoticeBar] {
    
    @scala.inline
    def action(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconNull: this.type = set("icon", null)
    
    @scala.inline
    def marqueeProps(value: MarqueeProps): this.type = set("marqueeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: closable | link): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoticeWebProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: NoticeBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
