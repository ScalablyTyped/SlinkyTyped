package typingsSlinky.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object componentsMod {
  
  type DeepNonNullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? std.NonNullable<T[P]>}
    */ typingsSlinky.reactSelect.reactSelectStrings.DeepNonNullable with org.scalablytyped.runtime.TopLevel[T]
  
  type IndicatorComponentType[OptionType /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */] = slinky.core.ReactComponentClass[typingsSlinky.reactSelect.indicatorsMod.IndicatorProps[OptionType]]
  
  type PlaceholderOrValue[OptionType /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */] = slinky.core.facade.ReactElement | js.Array[slinky.core.facade.ReactElement]
}
