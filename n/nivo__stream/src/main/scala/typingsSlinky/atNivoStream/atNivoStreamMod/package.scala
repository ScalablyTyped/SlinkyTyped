package typingsSlinky.atNivoStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoStreamMod {
  import slinky.core.TagMod
  import typingsSlinky.atNivoStream.Anon_0

  type DatumToNumber = js.Function1[/* datum */ Datum, Double]
  type StackFunc[T] = js.Function1[/* data */ js.Array[T], js.Array[js.Array[Anon_0[T]]]]
  type TooltipFormatter[T] = js.Function1[/* value */ T, TagMod[Any]]
  type TooltipLabel[T] = js.Function1[/* value */ T, String]
}
