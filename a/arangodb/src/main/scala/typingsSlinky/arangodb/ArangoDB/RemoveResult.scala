package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveResult[T /* <: js.Object */] extends DocumentMetadata {
  
  var old: js.UndefOr[Document[T]] = js.native
}
object RemoveResult {
  
  @scala.inline
  def apply[T /* <: js.Object */](_id: String, _key: String, _rev: String): RemoveResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResult[T]]
  }
  
  @scala.inline
  implicit class RemoveResultOps[Self <: RemoveResult[_], T /* <: js.Object */] (val x: Self with RemoveResult[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOld(value: Document[T]): Self = this.set("old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOld: Self = this.set("old", js.undefined)
  }
}
