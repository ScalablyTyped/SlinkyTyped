package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridDataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 *
  	 */
  var dataLevelKey: js.UndefOr[String] = js.native
  /**
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 *
  	 */
  var expandedKey: js.UndefOr[String] = js.native
  /**
  	 * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
  	 *
  	 */
  var initialFlatDataView: js.UndefOr[Boolean] = js.native
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 *
  	 */
  var propertyDataLevel: js.UndefOr[js.Any] = js.native
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 *
  	 */
  var propertyExpanded: js.UndefOr[js.Any] = js.native
}

object IgTreeGridDataSourceSettings {
  @scala.inline
  def apply(): IgTreeGridDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridDataSourceSettings]
  }
  @scala.inline
  implicit class IgTreeGridDataSourceSettingsOps[Self <: IgTreeGridDataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLevelKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLevelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLevelKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLevelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFlatDataView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFlatDataView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFlatDataView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFlatDataView")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyDataLevel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDataLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyDataLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDataLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyExpanded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyExpanded")(js.undefined)
        ret
    }
  }
  
}

