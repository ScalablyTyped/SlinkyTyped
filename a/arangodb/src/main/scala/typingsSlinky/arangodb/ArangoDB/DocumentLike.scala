package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.ArangoDB.ObjectWithId
  - typingsSlinky.arangodb.ArangoDB.ObjectWithKey
*/
trait DocumentLike extends js.Object
object DocumentLike {
  
  @scala.inline
  def ObjectWithId(_id: String): DocumentLike = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLike]
  }
  
  @scala.inline
  def ObjectWithKey(_key: String): DocumentLike = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLike]
  }
}
