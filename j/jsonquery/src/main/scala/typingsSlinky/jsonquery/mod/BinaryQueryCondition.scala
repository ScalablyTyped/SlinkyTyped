package typingsSlinky.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonquery.mod.OrQueryCondition[T]
  - typingsSlinky.jsonquery.mod.AndQueryCondition[T]
*/
trait BinaryQueryCondition[T] extends js.Object
object BinaryQueryCondition {
  
  @scala.inline
  def OrQueryCondition[T]($or: js.Array[Query[T]]): BinaryQueryCondition[T] = {
    val __obj = js.Dynamic.literal($or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryQueryCondition[T]]
  }
  
  @scala.inline
  def AndQueryCondition[T]($and: js.Array[Query[T]]): BinaryQueryCondition[T] = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryQueryCondition[T]]
  }
}
