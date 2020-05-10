package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceAssetCallback extends js.Object {
  var getRowData: js.UndefOr[
    js.Function3[/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String, _]
  ] = js.native
  var getSectionHeaderData: js.UndefOr[js.Function2[/* dataBlob */ js.Any, /* sectionID */ Double | String, _]] = js.native
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ js.Any, /* r2 */ js.Any, Boolean]] = js.native
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ js.Any, /* h2 */ js.Any, Boolean]] = js.native
}

object DataSourceAssetCallback {
  @scala.inline
  def apply(): DataSourceAssetCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceAssetCallback]
  }
  @scala.inline
  implicit class DataSourceAssetCallbackOps[Self <: DataSourceAssetCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRowData(value: (/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSectionHeaderData(value: (/* dataBlob */ js.Any, /* sectionID */ Double | String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSectionHeaderData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetSectionHeaderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSectionHeaderData")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHasChanged(value: (/* r1 */ js.Any, /* r2 */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHasChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowHasChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHasChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionHeaderHasChanged(value: (/* h1 */ js.Any, /* h2 */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionHeaderHasChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSectionHeaderHasChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionHeaderHasChanged")(js.undefined)
        ret
    }
  }
  
}

