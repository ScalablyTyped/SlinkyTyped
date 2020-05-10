package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typingsSlinky.reactSpinners.riseLoaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RiseLoader {
  @JSImport("react-spinners/RiseLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderSizeMarginProps): SharedBuilder_LoaderSizeMarginProps572121143[default] = new SharedBuilder_LoaderSizeMarginProps572121143[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RiseLoader.type): SharedBuilder_LoaderSizeMarginProps572121143[default] = new SharedBuilder_LoaderSizeMarginProps572121143[default](js.Array(this.component, js.Dictionary.empty))()
}

