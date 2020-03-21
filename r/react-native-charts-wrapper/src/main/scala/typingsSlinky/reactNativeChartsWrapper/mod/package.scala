package typingsSlinky.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChartChangeEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeChartsWrapper.AnonAction
  ]
  type ChartSelectEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeChartsWrapper.AnonY | scala.Null
  ]
  type Color = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.largeValue
    - typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.percent
    - typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.date
    - java.lang.String
    - js.Array[java.lang.String]
  */
  type ValueFormatter = typingsSlinky.reactNativeChartsWrapper.mod._ValueFormatter | js.Array[java.lang.String] | java.lang.String
}
