package typingsSlinky.firebaseFirestore.queryMod

import typingsSlinky.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "KeyFieldFilter")
@js.native
class KeyFieldFilter protected () extends FieldFilter {
  def this(
    field: FieldPath,
    op: Operator,
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ) = this()
  val key: js.Any = js.native
}

