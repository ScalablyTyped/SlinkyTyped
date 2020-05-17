package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Code {
  @JSImport("@blueprintjs/core", "Code")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]): `SharedBuilder_<intersection>_1717983003`[LegacyRef[js.Any]] = new `SharedBuilder_<intersection>_1717983003`[LegacyRef[js.Any]](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Code.type): `SharedBuilder_<intersection>_1717983003`[LegacyRef[js.Any]] = new `SharedBuilder_<intersection>_1717983003`[LegacyRef[js.Any]](js.Array(this.component, js.Dictionary.empty))()
}

