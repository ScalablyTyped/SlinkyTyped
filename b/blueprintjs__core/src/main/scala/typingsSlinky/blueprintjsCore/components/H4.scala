package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object H4 {
  @JSImport("@blueprintjs/core", "H4")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]): `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any] with js.Object] = new `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: H4.type): `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any] with js.Object] = new `SharedBuilder_<intersection>_55601569`[LegacyRef[js.Any] with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

