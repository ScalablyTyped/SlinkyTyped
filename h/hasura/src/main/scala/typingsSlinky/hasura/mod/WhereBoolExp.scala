package typingsSlinky.hasura.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhereBoolExp[T /* <: Record[String, _] */] extends js.Object {
  
  var _and: js.UndefOr[js.Array[WhereBoolExp[T]]] = js.native
  
  var _not: js.UndefOr[js.Array[WhereBoolExp[T]]] = js.native
  
  var _or: js.UndefOr[js.Array[WhereBoolExp[T]]] = js.native
}
