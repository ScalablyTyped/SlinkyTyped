package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridDataSourceOptions extends js.Object {
  /** Configures pivot grid fields. */
  var fields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  /** Specifies data filtering conditions. Cannot be used with an XmlaStore. */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** A function that is executed after data is successfully loaded. */
  var onChanged: js.UndefOr[js.Function] = js.native
  /** A function that is executed when all fields are loaded from the store and they are ready to be displayed in the PivotGrid. */
  var onFieldsPrepared: js.UndefOr[js.Function1[/* fields */ js.Array[PivotGridDataSourceField], _]] = js.native
  /** A function that is executed when data loading fails. */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  /** A function that is executed when the data loading status changes. */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.native
  /** Specifies whether the PivotGridDataSource should load data in portions. Can be used only with an XmlaStore. */
  var paginate: js.UndefOr[Boolean] = js.native
  /** Specifies whether the data processing operations (filtering, grouping, summary calculation) should be performed on the server. */
  var remoteOperations: js.UndefOr[Boolean] = js.native
  /** Specifies whether to auto-generate pivot grid fields from the store's data. */
  var retrieveFields: js.UndefOr[Boolean] = js.native
  /** Configures the DataSource's underlying store. */
  var store: js.UndefOr[
    Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type
  ] = js.native
}

object PivotGridDataSourceOptions {
  @scala.inline
  def apply(): PivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceOptions]
  }
  @scala.inline
  implicit class PivotGridDataSourceOptionsOps[Self <: PivotGridDataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[PivotGridDataSourceField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String | js.Array[_] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldsPrepared(value: /* fields */ js.Array[PivotGridDataSourceField] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFieldsPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadError(value: /* error */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadingChanged(value: /* isLoading */ Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadingChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadingChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadingChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteOperations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieveFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrieveFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveFields")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

