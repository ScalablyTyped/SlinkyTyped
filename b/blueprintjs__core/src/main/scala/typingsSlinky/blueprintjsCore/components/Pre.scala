package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.propsMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pre {
  
  @JSImport("@blueprintjs/core", "Pre")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]): SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement] = new SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Pre.type): SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement] = new SharedBuilder_HTMLPropsIElementRefProps_1330997956[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
}
