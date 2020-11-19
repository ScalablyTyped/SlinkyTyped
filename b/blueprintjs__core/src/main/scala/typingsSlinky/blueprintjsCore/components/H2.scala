package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object H2 {
  
  @JSImport("@blueprintjs/core", "H2")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]): SharedBuilder_HTMLPropsIElementRefProps_55601569[HTMLHeadingElement] = new SharedBuilder_HTMLPropsIElementRefProps_55601569[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: H2.type): SharedBuilder_HTMLPropsIElementRefProps_55601569[HTMLHeadingElement] = new SharedBuilder_HTMLPropsIElementRefProps_55601569[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
}
