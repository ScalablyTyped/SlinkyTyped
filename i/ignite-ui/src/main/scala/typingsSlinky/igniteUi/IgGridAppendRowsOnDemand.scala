package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridAppendRowsOnDemand
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested chunk index
  	 *
  	 */
  var chunkIndexUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Default number of records per chunk
  	 *
  	 */
  var chunkSize: js.UndefOr[Double] = js.native
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested chunk size
  	 *
  	 */
  var chunkSizeUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Current chunk index position
  	 *
  	 */
  var currentChunkIndex: js.UndefOr[Double] = js.native
  /**
  	 * Initial chunk index position
  	 *
  	 */
  var defaultChunkIndex: js.UndefOr[Double] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *             Specifies caption text for the "load more data" button. Use option [locale.loadMoreDataButtonText](ui.iggridappendrowsondemand#options:locale.loadMoreDataButtonText).
  	 */
  var loadMoreDataButtonText: js.UndefOr[String] = js.native
  /**
  	 * denotes the append rows on demand request method
  	 *
  	 *
  	 * Valid values:
  	 * "auto" new record will be appended to the grid while the user scrolls the scrollbar
  	 * "button" a button will be rendered at the bottom of the grid. The user should press it to load more rows
  	 */
  var loadTrigger: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridAppendRowsOnDemandLocale] = js.native
  /**
  	 * The property in the response that will hold the total number of records in the data source
  	 *
  	 */
  var recordCountKey: js.UndefOr[String] = js.native
  /**
  	 * Event fired after the requested rows are returned from the remote endpoint, but before grid data rebinds
  	 */
  var rowsRequested: js.UndefOr[RowsRequestedEvent] = js.native
  /**
  	 * Event fired before the rows are requested from the remote endpoint.
  	 * Return false in order to cancel requesting of rows.
  	 */
  var rowsRequesting: js.UndefOr[RowsRequestingEvent] = js.native
  /**
  	 * Defines local or remote type of appending rows on demand in igGrid
  	 *
  	 *
  	 * Valid values:
  	 * "remote" request data from the remote endpoint
  	 * "local" loading data on the client-side
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object IgGridAppendRowsOnDemand {
  @scala.inline
  def apply(): IgGridAppendRowsOnDemand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridAppendRowsOnDemand]
  }
  @scala.inline
  implicit class IgGridAppendRowsOnDemandOps[Self <: IgGridAppendRowsOnDemand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkIndexUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIndexUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkIndexUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIndexUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSizeUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSizeUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentChunkIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentChunkIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentChunkIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentChunkIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChunkIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChunkIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChunkIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChunkIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMoreDataButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMoreDataButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMoreDataButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMoreDataButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgGridAppendRowsOnDemandLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsRequested(value: (/* event */ Event_, /* ui */ RowsRequestedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRequested")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowsRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsRequesting(value: (/* event */ Event_, /* ui */ RowsRequestingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRequesting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowsRequesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRequesting")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

