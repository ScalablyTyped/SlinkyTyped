package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.circleLoaderMod.default
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircleLoader {
  @JSImport("react-spinners/CircleLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderSizeProps): SharedBuilder_LoaderSizeProps1650113268[default] = new SharedBuilder_LoaderSizeProps1650113268[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CircleLoader.type): SharedBuilder_LoaderSizeProps1650113268[default] = new SharedBuilder_LoaderSizeProps1650113268[default](js.Array(this.component, js.Dictionary.empty))()
}

