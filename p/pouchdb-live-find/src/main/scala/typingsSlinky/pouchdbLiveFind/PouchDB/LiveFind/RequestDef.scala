package typingsSlinky.pouchdbLiveFind.PouchDB.LiveFind

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pouchdbFind.PouchDB.Find.Selector
import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, std.Exclude<keyof pouchdb-find.PouchDB.Find.FindRequest<Content>, 'use_index'>> */
@js.native
trait RequestDef[Content /* <: js.Object */] extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var selector: Selector = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
}

object RequestDef {
  @scala.inline
  def apply[Content](selector: Selector): RequestDef[Content] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDef[Content]]
  }
  @scala.inline
  implicit class RequestDefOps[Self[content] <: RequestDef[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withSelector(value: Selector): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregate(value: Boolean): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregate: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
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

