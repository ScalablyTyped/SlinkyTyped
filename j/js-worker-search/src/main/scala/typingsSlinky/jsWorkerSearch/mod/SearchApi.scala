package typingsSlinky.jsWorkerSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchApi extends js.Object {
  def indexDocument(uid: String, text: String): Unit = js.native
  def search(query: String): js.Promise[js.Array[String]] = js.native
}

object SearchApi {
  @scala.inline
  def apply(indexDocument: (String, String) => Unit, search: String => js.Promise[js.Array[String]]): SearchApi = {
    val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction2(indexDocument), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[SearchApi]
  }
  @scala.inline
  implicit class SearchApiOps[Self <: SearchApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexDocument(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDocument")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSearch(value: String => js.Promise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

