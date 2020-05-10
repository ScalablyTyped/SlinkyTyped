package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.fadeLoaderMod.default
import typingsSlinky.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FadeLoader {
  @JSImport("react-spinners/FadeLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderHeightWidthRadiusProps): SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default] = new SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FadeLoader.type): SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default] = new SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default](js.Array(this.component, js.Dictionary.empty))()
}

