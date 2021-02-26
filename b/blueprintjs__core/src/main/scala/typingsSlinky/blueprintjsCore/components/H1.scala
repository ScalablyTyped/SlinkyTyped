package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.blueprintjsCore.propsMod.IElementRefProps
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object H1 {
  
  @JSImport("@blueprintjs/core", "H1")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: H1.type): SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement] = new SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]): SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement] = new SharedBuilder_HTMLPropsIElementRefProps597744580[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
