package typingsSlinky.nivoStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DatumToNumber = js.Function1[/* datum */ typingsSlinky.nivoStream.mod.Datum, scala.Double]
  
  type StackFunc[T] = js.Function1[/* data */ js.Array[T], js.Array[js.Array[typingsSlinky.nivoStream.anon.`0`[T]]]]
  
  type TooltipFormatter[T] = js.Function1[/* value */ T, slinky.core.facade.ReactElement]
  
  type TooltipLabel[T] = js.Function1[/* value */ T, java.lang.String]
}
