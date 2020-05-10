package typingsSlinky.reactLive.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LiveError {
  @JSImport("react-live", "LiveError")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLDivElement]): SharedBuilder_DivProps891316400[typingsSlinky.reactLive.mod.LiveError] = new SharedBuilder_DivProps891316400[typingsSlinky.reactLive.mod.LiveError](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LiveError.type): SharedBuilder_DivProps891316400[typingsSlinky.reactLive.mod.LiveError] = new SharedBuilder_DivProps891316400[typingsSlinky.reactLive.mod.LiveError](js.Array(this.component, js.Dictionary.empty))()
}

