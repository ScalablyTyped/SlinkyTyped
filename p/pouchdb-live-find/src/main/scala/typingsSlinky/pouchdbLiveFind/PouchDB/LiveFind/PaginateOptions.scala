package typingsSlinky.pouchdbLiveFind.PouchDB.LiveFind

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, 'sort' | 'skip' | 'limit'> */
@js.native
trait PaginateOptions[Content /* <: js.Object */] extends js.Object {
  var limit: js.UndefOr[Double] = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
}

object PaginateOptions {
  @scala.inline
  def apply[Content](): PaginateOptions[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginateOptions[Content]]
  }
  @scala.inline
  implicit class PaginateOptionsOps[Self[content] <: PaginateOptions[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withLimit(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

