package typingsSlinky.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationTable extends js.Object {
  /**
    * "Load error!"
    */
  var loadError: js.UndefOr[String] = js.native
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: js.UndefOr[String] = js.native
  /**
    * "More..."
    */
  var moreData: js.UndefOr[String] = js.native
  /**
    * "No data."
    */
  var noData: js.UndefOr[String] = js.native
}

object TranslationTable {
  @scala.inline
  def apply(): TranslationTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationTable]
  }
  @scala.inline
  implicit class TranslationTableOps[Self <: TranslationTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreData")(js.undefined)
        ret
    }
    @scala.inline
    def withNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(js.undefined)
        ret
    }
  }
  
}

