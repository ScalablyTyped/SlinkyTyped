package typingsSlinky.ionic.definitionsMod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceClientPaginate[T /* <: js.Object */] extends js.Object {
  
  def paginate(): IPaginator[Response[js.Array[T]], PaginatorState] = js.native
  def paginate(args: Partial[PaginateArgs[Response[js.Array[T]]]]): IPaginator[Response[js.Array[T]], PaginatorState] = js.native
}
