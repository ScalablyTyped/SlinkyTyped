package typingsSlinky.googleDashGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashGaxMod {
  type Callback[ResponseObject, NextRequestObject, RawResponseObject] = js.Function4[
    /* err */ js.UndefOr[js.Error | Null], 
    /* value */ js.UndefOr[ResponseObject | Null], 
    /* nextRequest */ js.UndefOr[NextRequestObject], 
    /* rawResponse */ js.UndefOr[RawResponseObject], 
    Unit
  ]
  type PaginationCallback[RequestObject, ResponseObject, ResponseType] = js.Function4[
    /* err */ js.Error | Null, 
    /* values */ js.UndefOr[js.Array[ResponseType]], 
    /* nextPageRequest */ js.UndefOr[RequestObject], 
    /* rawResponse */ js.UndefOr[ResponseObject], 
    Unit
  ]
}
