package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.ringLoaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RingLoader {
  @JSImport("react-spinners/RingLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderSizeProps): SharedBuilder_LoaderSizeProps1650113268[default] = new SharedBuilder_LoaderSizeProps1650113268[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RingLoader.type): SharedBuilder_LoaderSizeProps1650113268[default] = new SharedBuilder_LoaderSizeProps1650113268[default](js.Array(this.component, js.Dictionary.empty))()
}

