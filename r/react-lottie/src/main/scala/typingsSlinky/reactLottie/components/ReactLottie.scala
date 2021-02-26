package typingsSlinky.reactLottie.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLottie.mod.EventListener
import typingsSlinky.reactLottie.mod.LottieProps
import typingsSlinky.reactLottie.mod.Options
import typingsSlinky.reactLottie.mod.default
import typingsSlinky.reactLottie.reactLottieStrings.animation
import typingsSlinky.reactLottie.reactLottieStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLottie {
  
  @scala.inline
  def apply(options: Options): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LottieProps]))
  }
  
  @JSImport("react-lottie", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def ariaLabel(value: String | animation): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaRole(value: String | button): this.type = set("ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: Double): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventListeners(value: js.Array[EventListener]): this.type = set("eventListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventListenersVarargs(value: EventListener*): this.type = set("eventListeners", js.Array(value :_*))
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isClickToPauseDisabled(value: Boolean): this.type = set("isClickToPauseDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isPaused(value: Boolean): this.type = set("isPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isStopped(value: Boolean): this.type = set("isStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def segments(value: js.Array[Double]): this.type = set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def segmentsVarargs(value: Double*): this.type = set("segments", js.Array(value :_*))
    
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LottieProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
