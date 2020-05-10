package typingsSlinky.reactLatexNext.components

import typingsSlinky.reactLatexNext.latexMod.LatexProps
import typingsSlinky.reactLatexNext.latexMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Latex {
  @JSImport("react-latex-next/dist/Latex", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LatexProps): SharedBuilder_LatexProps_1360194442[default] = new SharedBuilder_LatexProps_1360194442[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Latex.type): SharedBuilder_LatexProps_1360194442[default] = new SharedBuilder_LatexProps_1360194442[default](js.Array(this.component, js.Dictionary.empty))()
}

