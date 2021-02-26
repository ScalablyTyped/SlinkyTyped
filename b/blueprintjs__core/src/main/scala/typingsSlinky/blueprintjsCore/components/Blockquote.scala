package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.propsMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Blockquote {
  
  @JSImport("@blueprintjs/core", "Blockquote")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Blockquote.type): SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement] = new SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]): SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement] = new SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
