package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Code {
  
  @JSImport("@blueprintjs/core", "Code")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]): SharedBuilder_HTMLPropsIElementRefProps_1717983003[HTMLElement] = new SharedBuilder_HTMLPropsIElementRefProps_1717983003[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Code.type): SharedBuilder_HTMLPropsIElementRefProps_1717983003[HTMLElement] = new SharedBuilder_HTMLPropsIElementRefProps_1717983003[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
}
