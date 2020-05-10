package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import typingsSlinky.reactSpinners.scaleLoaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleLoader {
  @JSImport("react-spinners/ScaleLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderHeightWidthRadiusProps): SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default] = new SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScaleLoader.type): SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default] = new SharedBuilder_LoaderHeightWidthRadiusProps_1957923247[default](js.Array(this.component, js.Dictionary.empty))()
}

