package typingsSlinky.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchIndex extends js.Object {
  def indexDocument(token: String, uid: String, document: js.Object): Unit = js.native
  def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
}

object ISearchIndex {
  @scala.inline
  def apply(
    indexDocument: (String, String, js.Object) => Unit,
    search: (js.Array[String], js.Array[js.Object]) => js.Array[js.Object]
  ): ISearchIndex = {
    val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction3(indexDocument), search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[ISearchIndex]
  }
  @scala.inline
  implicit class ISearchIndexOps[Self <: ISearchIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexDocument(value: (String, String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDocument")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSearch(value: (js.Array[String], js.Array[js.Object]) => js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

