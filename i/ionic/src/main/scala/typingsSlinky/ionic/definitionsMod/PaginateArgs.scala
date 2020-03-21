package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonReq
import typingsSlinky.ionic.PartialPaginatorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ionic.ionic/definitions.PaginatorDeps<T, ionic.ionic/definitions.PaginatorState>, 'reqgen' | 'guard' | 'state' | 'max'> */
@js.native
trait PaginateArgs[T /* <: Response[js.Array[js.Object]] */] extends js.Object {
  @JSName("guard")
  var guard_Original: PaginatorGuard[T] = js.native
  var max: js.UndefOr[Double] = js.native
  @JSName("reqgen")
  var reqgen_Original: PaginatorRequestGenerator = js.native
  var state: js.UndefOr[PartialPaginatorState] = js.native
  def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  def reqgen(): js.Promise[AnonReq] = js.native
}

