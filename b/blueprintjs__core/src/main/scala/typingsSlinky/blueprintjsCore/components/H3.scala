package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.blueprintjsCore.propsMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object H3 {
  
  @JSImport("@blueprintjs/core", "H3")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]): SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement] = new SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: H3.type): SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement] = new SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
}
