package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.barLoaderMod.default
import typingsSlinky.reactSpinners.interfacesMod.LoaderHeightWidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BarLoader {
  @JSImport("react-spinners/BarLoader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderHeightWidthProps): SharedBuilder_LoaderHeightWidthProps_1665205413[default] = new SharedBuilder_LoaderHeightWidthProps_1665205413[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BarLoader.type): SharedBuilder_LoaderHeightWidthProps_1665205413[default] = new SharedBuilder_LoaderHeightWidthProps_1665205413[default](js.Array(this.component, js.Dictionary.empty))()
}

