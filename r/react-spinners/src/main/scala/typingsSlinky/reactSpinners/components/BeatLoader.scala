package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.beatLoaderMod.default
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeMarginProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BeatLoader {
  @JSImport("react-spinners/BeatLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderSizeMarginProps): SharedBuilder_LoaderSizeMarginProps572121143[default] = new SharedBuilder_LoaderSizeMarginProps572121143[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BeatLoader.type): SharedBuilder_LoaderSizeMarginProps572121143[default] = new SharedBuilder_LoaderSizeMarginProps572121143[default](js.Array(this.component, js.Dictionary.empty))()
}

