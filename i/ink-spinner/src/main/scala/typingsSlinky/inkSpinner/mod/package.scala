package typingsSlinky.inkSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BooleansPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? boolean}
    */ typingsSlinky.inkSpinner.inkSpinnerStrings.BooleansPartial with org.scalablytyped.runtime.TopLevel[js.Any]
  
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Spinner = slinky.core.ReactComponentClass[
    typingsSlinky.inkSpinner.mod.SpinnerProps with typingsSlinky.inkSpinner.mod.ChalkProps
  ]
  
  type StringifyPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typingsSlinky.inkSpinner.inkSpinnerStrings.StringifyPartial with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type TupleOfNumbersPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? [number, number, number]}
    */ typingsSlinky.inkSpinner.inkSpinnerStrings.TupleOfNumbersPartial with org.scalablytyped.runtime.TopLevel[js.Any]
}
