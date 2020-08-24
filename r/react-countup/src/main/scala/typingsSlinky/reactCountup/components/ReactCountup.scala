package typingsSlinky.reactCountup.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactCountup.anon.PauseResume
import typingsSlinky.reactCountup.anon.PauseResumeReset
import typingsSlinky.reactCountup.anon.Reset
import typingsSlinky.reactCountup.anon.Start
import typingsSlinky.reactCountup.anon.Update
import typingsSlinky.reactCountup.mod.Props
import typingsSlinky.reactCountup.mod.RenderProps
import typingsSlinky.reactCountup.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCountup {
  @JSImport("react-countup", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def children(value: /* data */ RenderProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def decimals(value: Double): this.type = set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def easingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Unit): this.type = set("easingFn", js.Any.fromFunction4(value))
    @scala.inline
    def end(value: Double): this.type = set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def formattingFn(value: /* value */ Double => String): this.type = set("formattingFn", js.Any.fromFunction1(value))
    @scala.inline
    def onEnd(value: /* providedFn */ PauseResume => Unit): this.type = set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onPauseResume(value: () => js.Function1[/* providedFn */ Start, Unit]): this.type = set("onPauseResume", js.Any.fromFunction0(value))
    @scala.inline
    def onReset(value: () => js.Function1[/* providedFn */ Update, Unit]): this.type = set("onReset", js.Any.fromFunction0(value))
    @scala.inline
    def onStart(value: /* providedFn */ Reset => Unit): this.type = set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def onUpdate(value: /* providedFn */ PauseResumeReset => Unit): this.type = set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def preserveValue(value: Boolean): this.type = set("preserveValue", value.asInstanceOf[js.Any])
    @scala.inline
    def redraw(value: Boolean): this.type = set("redraw", value.asInstanceOf[js.Any])
    @scala.inline
    def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def startOnMount(value: Boolean): this.type = set("startOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suffix(value: String): this.type = set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def useEasing(value: Boolean): this.type = set("useEasing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactCountup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

