package typingsSlinky.reactMdForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type SliderDefaultValue = scala.Double | js.Function0[scala.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdForm.reactMdFormStrings.mouse
    - typingsSlinky.reactMdForm.reactMdFormStrings.touch
    - scala.Null
  */
  type SliderDraggingType = typingsSlinky.reactMdForm.typesMod._SliderDraggingType | scala.Null
  
  type UseSliderReturnValue = js.Tuple2[
    typingsSlinky.reactMdForm.typesMod.SliderBehaviorProps, 
    typingsSlinky.reactMdForm.typesMod.SliderActionCreators
  ]
}
