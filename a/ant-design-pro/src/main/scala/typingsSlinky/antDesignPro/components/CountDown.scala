package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.countDownMod.ICountDownProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountDown {
  
  @scala.inline
  def apply(target: js.Date | Double): Builder = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICountDownProps]))
  }
  
  @JSImport("ant-design-pro", "CountDown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.CountDown] {
    
    @scala.inline
    def format(value: /* time */ Double => Unit): this.type = set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnd(value: () => Unit): this.type = set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICountDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
