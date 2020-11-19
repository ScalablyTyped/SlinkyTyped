package typingsSlinky.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ChartChangeEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeChartsWrapper.anon.Action
  ]
  
  type ChartSelectEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeChartsWrapper.anon.Y | scala.Null
  ]
  
  type Color = typingsSlinky.std.ReturnType[typingsSlinky.reactNativeChartsWrapper.anon.FnCall]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.largeValue
    - typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.percent
    - typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.date
    - java.lang.String
    - js.Array[java.lang.String]
  */
  type ValueFormatter = typingsSlinky.reactNativeChartsWrapper.mod._ValueFormatter | js.Array[java.lang.String] | java.lang.String
}
