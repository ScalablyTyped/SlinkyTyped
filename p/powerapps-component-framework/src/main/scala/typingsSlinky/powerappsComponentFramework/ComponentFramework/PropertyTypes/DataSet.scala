package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyTypes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.powerappsComponentFramework.ComponentFramework.EntityReference
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Column
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.EntityRecord
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Filtering
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Linking
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Paging
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.SortStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The structure of a dataset property as it would be passed to a control
		 */
@js.native
trait DataSet extends js.Object {
  /**
  			 * Adds column to the columnset
  			 * @param name column name to be added to the columnset
  			 * @param entityAlias entity alias for which the column name needs to be added
  			 */
  var addColumn: js.UndefOr[js.Function2[/* name */ String, /* entityAlias */ js.UndefOr[String], Unit]] = js.native
  /**
  			 * Set of columns available in this dataset.
  			 */
  var columns: js.Array[Column] = js.native
  /**
  			 * True if encountered error while data retrieval
  			 */
  var error: Boolean = js.native
  /**
  			 * The error message associated with the last encountered error, if applicable
  			 */
  var errorMessage: String = js.native
  /**
  			 * The column filtering for the current query.
  			 */
  var filtering: Filtering = js.native
  /**
  			 * Related entity info
  			 */
  var linking: Linking = js.native
  /**
  			 * Indicate if the dataset property is in loading state or not
  			 */
  var loading: Boolean = js.native
  /**
  			 * Pagination status and actions.
  			 */
  var paging: Paging = js.native
  /**
  			 * Map of IDs to the full record object
  			 */
  var records: StringDictionary[EntityRecord] = js.native
  /**
  			 * IDs of the records in the dataset, order by the query response result
  			 */
  var sortedRecordIds: js.Array[String] = js.native
  /**
  			 * The sorting status for the current query.
  			 */
  var sorting: js.Array[SortStatus] = js.native
  /**
  			 * Clear selected record ids list
  			 */
  def clearSelectedRecordIds(): Unit = js.native
  /**
  			 * Retrieves all selected record ids
  			 */
  def getSelectedRecordIds(): js.Array[String] = js.native
  /**
  			 * Get DataSet target entity logical name
  			 */
  def getTargetEntityType(): String = js.native
  /**
  			 * Retrieves the view display name used by the dataset property
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets Id of view used by the dataset property
  			 */
  def getViewId(): String = js.native
  /**
  			 * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
  			 * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
  			 * @param entityReference entity reference
  			 */
  def openDatasetItem(entityReference: EntityReference): Unit = js.native
  /**
  			 * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
  			 */
  def refresh(): Unit = js.native
  /**
  			 * Set the ids of the selected records
  			 * @ids List of recordId's
  			 */
  def setSelectedRecordIds(ids: js.Array[String]): Unit = js.native
}

object DataSet {
  @scala.inline
  def apply(
    clearSelectedRecordIds: () => Unit,
    columns: js.Array[Column],
    error: Boolean,
    errorMessage: String,
    filtering: Filtering,
    getSelectedRecordIds: () => js.Array[String],
    getTargetEntityType: () => String,
    getTitle: () => String,
    getViewId: () => String,
    linking: Linking,
    loading: Boolean,
    openDatasetItem: EntityReference => Unit,
    paging: Paging,
    records: StringDictionary[EntityRecord],
    refresh: () => Unit,
    setSelectedRecordIds: js.Array[String] => Unit,
    sortedRecordIds: js.Array[String],
    sorting: js.Array[SortStatus]
  ): DataSet = {
    val __obj = js.Dynamic.literal(clearSelectedRecordIds = js.Any.fromFunction0(clearSelectedRecordIds), columns = columns.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filtering = filtering.asInstanceOf[js.Any], getSelectedRecordIds = js.Any.fromFunction0(getSelectedRecordIds), getTargetEntityType = js.Any.fromFunction0(getTargetEntityType), getTitle = js.Any.fromFunction0(getTitle), getViewId = js.Any.fromFunction0(getViewId), linking = linking.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], openDatasetItem = js.Any.fromFunction1(openDatasetItem), paging = paging.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), setSelectedRecordIds = js.Any.fromFunction1(setSelectedRecordIds), sortedRecordIds = sortedRecordIds.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSet]
  }
  @scala.inline
  implicit class DataSetOps[Self <: DataSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSelectedRecordIds(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelectedRecordIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiltering(value: Filtering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSelectedRecordIds(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRecordIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetEntityType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetEntityType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLinking(value: Linking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenDatasetItem(value: EntityReference => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDatasetItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPaging(value: Paging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: StringDictionary[EntityRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSelectedRecordIds(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedRecordIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortedRecordIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedRecordIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorting(value: js.Array[SortStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddColumn(value: (/* name */ String, /* entityAlias */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumn")(js.undefined)
        ret
    }
  }
  
}

