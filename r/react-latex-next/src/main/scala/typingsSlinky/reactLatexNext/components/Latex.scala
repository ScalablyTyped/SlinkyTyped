package typingsSlinky.reactLatexNext.components

import typingsSlinky.reactLatexNext.latexMod.LatexProps
import typingsSlinky.reactLatexNext.latexMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Latex {
  
  @JSImport("react-latex-next/dist/Latex", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LatexProps): SharedBuilder_LatexProps_1360194442[default] = new SharedBuilder_LatexProps_1360194442[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: String): SharedBuilder_LatexProps_1360194442[default] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_LatexProps_1360194442[default](js.Array(this.component, __props.asInstanceOf[LatexProps]))
  }
}
