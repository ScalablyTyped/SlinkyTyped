package typingsSlinky.blueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/select/lib/esm/common/predicate", JSImport.Namespace)
@js.native
object predicateMod extends js.Object {
  
  type ItemListPredicate[T] = js.Function2[/* query */ String, /* items */ js.Array[T], js.Array[T]]
  
  type ItemPredicate[T] = js.Function4[
    /* query */ String, 
    /* item */ T, 
    /* index */ js.UndefOr[Double], 
    /* exactMatch */ js.UndefOr[Boolean], 
    Boolean
  ]
}
