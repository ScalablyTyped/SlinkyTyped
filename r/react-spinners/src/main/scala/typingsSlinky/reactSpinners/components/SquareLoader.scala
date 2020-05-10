package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.squareLoaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SquareLoader {
  @JSImport("react-spinners/SquareLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderSizeProps): SharedBuilder_LoaderSizeProps1650113268[default] = new SharedBuilder_LoaderSizeProps1650113268[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SquareLoader.type): SharedBuilder_LoaderSizeProps1650113268[default] = new SharedBuilder_LoaderSizeProps1650113268[default](js.Array(this.component, js.Dictionary.empty))()
}

