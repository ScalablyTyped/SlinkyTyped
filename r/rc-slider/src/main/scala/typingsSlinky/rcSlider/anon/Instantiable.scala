package typingsSlinky.rcSlider.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rcSlider.createSliderWithTooltipMod.ComponentWrapperProps
import typingsSlinky.rcSlider.interfaceMod.GenericSliderProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable[Props /* <: GenericSliderProps */]
  extends Instantiable1[/* props */ ComponentWrapperProps with Props, ComponentDidCatch[Props]]
     with Instantiable2[
      /* props */ ComponentWrapperProps with Props, 
      /* context */ js.Any, 
      ComponentDidCatch[Props]
    ] {
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var defaultProps: GetTooltipContainer = js.native
}
