package typingsSlinky.reactCountdownCircleTimer.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCountdownCircleTimer.mod.ColorType
import typingsSlinky.reactCountdownCircleTimer.mod.Props
import typingsSlinky.reactCountdownCircleTimer.mod.StrokeLinecapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CountdownCircleTimer {
  @JSImport("react-countdown-circle-timer", "CountdownCircleTimer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCountdownCircleTimer.mod.CountdownCircleTimer] {
    @scala.inline
    def gradientUniqueKey(value: String): this.type = set("gradientUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def isLinearGradient(value: Boolean): this.type = set("isLinearGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def isPlaying(value: Boolean): this.type = set("isPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def onComplete(value: () => js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]): this.type = set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def renderTime(
      value: (/* remainingTime */ Double, /* elapsedTime */ Double, /* isPlaying */ Boolean) => TagMod[Any]
    ): this.type = set("renderTime", js.Any.fromFunction3(value))
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeLinecap(value: StrokeLinecapType): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(colors: ColorType, durationSeconds: Double): Builder = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], durationSeconds = durationSeconds.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

