package typingsSlinky.reactSpinners.components

import typingsSlinky.reactSpinners.interfacesMod.LoaderHeightWidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loader {
  
  @JSImport("react-spinners/BarLoader", "Loader")
  @js.native
  object component extends js.Object
  
  def withProps(p: LoaderHeightWidthProps): SharedBuilder_LoaderHeightWidthProps_1665205413[typingsSlinky.reactSpinners.barLoaderMod.Loader] = new SharedBuilder_LoaderHeightWidthProps_1665205413[typingsSlinky.reactSpinners.barLoaderMod.Loader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Loader.type): SharedBuilder_LoaderHeightWidthProps_1665205413[typingsSlinky.reactSpinners.barLoaderMod.Loader] = new SharedBuilder_LoaderHeightWidthProps_1665205413[typingsSlinky.reactSpinners.barLoaderMod.Loader](js.Array(this.component, js.Dictionary.empty))()
}
