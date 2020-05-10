package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceInitializedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * See if an error has occured during initialization.
  	 */
  var error: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the root of the data source metatadata root item.
  	 */
  var metadataTreeRoot: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the data selector.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object DataSourceInitializedEventUIParam {
  @scala.inline
  def apply(): DataSourceInitializedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceInitializedEventUIParam]
  }
  @scala.inline
  implicit class DataSourceInitializedEventUIParamOps[Self <: DataSourceInitializedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataTreeRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataTreeRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataTreeRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataTreeRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

