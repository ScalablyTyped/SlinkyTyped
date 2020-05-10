package typingsSlinky.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentStore extends js.Object {
  def collection(name: String): Collection = js.native
}

object DocumentStore {
  @scala.inline
  def apply(collection: String => Collection): DocumentStore = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
    __obj.asInstanceOf[DocumentStore]
  }
  @scala.inline
  implicit class DocumentStoreOps[Self <: DocumentStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: String => Collection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

