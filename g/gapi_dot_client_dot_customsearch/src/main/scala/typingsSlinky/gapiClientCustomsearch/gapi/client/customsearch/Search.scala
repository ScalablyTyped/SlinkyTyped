package typingsSlinky.gapiClientCustomsearch.gapi.client.customsearch

import typingsSlinky.gapiClientCustomsearch.AnonCorrectedQuery
import typingsSlinky.gapiClientCustomsearch.AnonFormattedSearchTime
import typingsSlinky.gapiClientCustomsearch.AnonTemplate
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  var context: js.UndefOr[Context] = js.native
  var items: js.UndefOr[js.Array[Result]] = js.native
  var kind: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  var queries: js.UndefOr[Record[String, js.Array[Query]]] = js.native
  var searchInformation: js.UndefOr[AnonFormattedSearchTime] = js.native
  var spelling: js.UndefOr[AnonCorrectedQuery] = js.native
  var url: js.UndefOr[AnonTemplate] = js.native
}

object Search {
  @scala.inline
  def apply(): Search = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Search]
  }
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotions(value: js.Array[Promotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: Record[String, js.Array[Query]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchInformation(value: AnonFormattedSearchTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withSpelling(value: AnonCorrectedQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spelling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpelling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spelling")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: AnonTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

