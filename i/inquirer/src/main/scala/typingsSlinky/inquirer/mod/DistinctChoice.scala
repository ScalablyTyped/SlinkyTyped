package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides valid choices for the question of the `TChoiceMap`.
  *
  * @template TChoiceMap
  * The choice-types to provide.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - / * import warning: importer.ImportType#apply Failed type conversion: TChoiceMap[keyof TChoiceMap] * / js.Any
*/
trait DistinctChoice[TChoiceMap] extends js.Object

object DistinctChoice {
  @scala.inline
  implicit def apply[TChoiceMap](
    value: /* import warning: importer.ImportType#apply Failed type conversion: TChoiceMap[keyof TChoiceMap] */ js.Any
  ): DistinctChoice[TChoiceMap] = value.asInstanceOf[DistinctChoice[TChoiceMap]]
  @scala.inline
  implicit def apply[TChoiceMap](value: String): DistinctChoice[TChoiceMap] = value.asInstanceOf[DistinctChoice[TChoiceMap]]
}

