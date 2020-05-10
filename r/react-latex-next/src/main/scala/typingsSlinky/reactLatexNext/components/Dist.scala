package typingsSlinky.reactLatexNext.components

import typingsSlinky.reactLatexNext.latexMod.LatexProps
import typingsSlinky.reactLatexNext.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dist {
  @JSImport("react-latex-next/dist", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LatexProps): SharedBuilder_LatexProps_1360194442[default] = new SharedBuilder_LatexProps_1360194442[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dist.type): SharedBuilder_LatexProps_1360194442[default] = new SharedBuilder_LatexProps_1360194442[default](js.Array(this.component, js.Dictionary.empty))()
}

