package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type A11yTitleType = java.lang.String
  type AnimateType = scala.Boolean
  type DeepFreeze_ = js.Function1[/* obj */ js.Object, typingsSlinky.grommet.utilsMod.DeepReadonly[js.Object]]
  type DeepReadonly[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias grommet.grommet/utils.DeepReadonly<T[K]> * / object : T[K]}
    */ typingsSlinky.grommet.grommetStrings.DeepReadonly with org.scalablytyped.runtime.TopLevel[js.Any]
  type GridAreaType = java.lang.String
  type KeyboardType = js.Function1[
    /* event */ slinky.web.SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type MarginType = typingsSlinky.grommet.utilsMod.EdgeType
  type NonUndefined[T] = T
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ typingsSlinky.grommet.grommetStrings.NonUndefinedProps with org.scalablytyped.runtime.TopLevel[T]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type PadType = typingsSlinky.grommet.utilsMod.EdgeType
}
