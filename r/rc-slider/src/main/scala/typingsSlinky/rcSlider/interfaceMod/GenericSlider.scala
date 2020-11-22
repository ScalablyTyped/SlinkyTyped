package typingsSlinky.rcSlider.interfaceMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.ComponentClass<Props, State>, 'displayName' | 'defaultProps' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes'> */
@js.native
trait GenericSlider[Props, State]
  extends Instantiable1[/* props */ Props, GenericSliderClass[Props, State]]
     with Instantiable2[/* props */ Props, /* context */ js.Any, GenericSliderClass[Props, State]] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[Partial[Props]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[Props]] = js.native
}
