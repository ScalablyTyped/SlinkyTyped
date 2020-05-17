package typingsSlinky.knex.mod.DeferredKeySelection

import typingsSlinky.knex.mod.UnknownToAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knex.mod.UnknownToAny[TSelection]
  - js.Array[
(typingsSlinky.knex.mod.DeferredKeySelection.ResolveOne[
  / * import warning: importer.ImportType#apply Failed type conversion: TSelection[0] * / js.Any
]) | typingsSlinky.knex.mod.UnknownToAny[js.Any]]
  - typingsSlinky.knex.mod.DeferredKeySelection.ResolveOne[TSelection]
*/
trait Resolve[TSelection] extends js.Object

object Resolve {
  @scala.inline
  implicit def apply[TSelection](
    value: js.Array[
      (ResolveOne[
        /* import warning: importer.ImportType#apply Failed type conversion: TSelection[0] */ js.Any
      ]) | UnknownToAny[js.Any]
    ]
  ): Resolve[TSelection] = value.asInstanceOf[Resolve[TSelection]]
  @scala.inline
  implicit def apply[TSelection](value: ResolveOne[TSelection]): Resolve[TSelection] = value.asInstanceOf[Resolve[TSelection]]
  @scala.inline
  implicit def apply[TSelection](value: UnknownToAny[TSelection]): Resolve[TSelection] = value.asInstanceOf[Resolve[TSelection]]
}

