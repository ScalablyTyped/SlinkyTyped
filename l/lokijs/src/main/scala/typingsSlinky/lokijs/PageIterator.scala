package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageIterator extends js.Object {
  var collection: Double = js.native
  var docIndex: Double = js.native
  var pageIndex: Double = js.native
}

object PageIterator {
  @scala.inline
  def apply(collection: Double, docIndex: Double, pageIndex: Double): PageIterator = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], docIndex = docIndex.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageIterator]
  }
  @scala.inline
  implicit class PageIteratorOps[Self <: PageIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

