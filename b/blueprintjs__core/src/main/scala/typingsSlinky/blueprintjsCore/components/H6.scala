package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object H6 {
  @JSImport("@blueprintjs/core", "H6")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]): `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any]] = new `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any]](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: H6.type): `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any]] = new `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any]](js.Array(this.component, js.Dictionary.empty))()
}

