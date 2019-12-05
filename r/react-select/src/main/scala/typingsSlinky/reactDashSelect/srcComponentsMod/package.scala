package typingsSlinky.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMod {
  import slinky.core.ReactComponentClass
  import slinky.core.facade.ReactElement
  import typingsSlinky.reactDashSelect.srcComponentsIndicatorsMod.IndicatorProps
  import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase

  type DeepNonNullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? std.NonNullable<T[P]>}
    */ typingsSlinky.reactDashSelect.reactDashSelectStrings.DeepNonNullable with T
  type IndicatorComponentType[OptionType /* <: OptionTypeBase */] = ReactComponentClass[IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType /* <: OptionTypeBase */] = ReactElement | js.Array[ReactElement]
}
