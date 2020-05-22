package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Blockquote {
  @JSImport("@blueprintjs/core", "Blockquote")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]): SharedBuilder_HTMLPropsIElementRefProps_1717983003[LegacyRef[js.Any] with js.Object] = new SharedBuilder_HTMLPropsIElementRefProps_1717983003[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Blockquote.type): SharedBuilder_HTMLPropsIElementRefProps_1717983003[LegacyRef[js.Any] with js.Object] = new SharedBuilder_HTMLPropsIElementRefProps_1717983003[LegacyRef[js.Any] with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

