package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" An aggregator function called when each cell is evaluated.
  	 * Returns a value for the cell. If the returned value is null, no cell will be created in for the data source result.
  	 */
  var aggregator: js.UndefOr[js.Function] = js.native
  /**
  	 * A caption for the measure.
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * The path used when displaying the measure in the user interface. Nested folders are indicated by a backslash (\).
  	 */
  var displayFolder: js.UndefOr[String] = js.native
  /**
  	 * Optional="false" A unique name for the measure.
  	 */
  var name: js.UndefOr[String] = js.native
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure {
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]
  }
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasureOps[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregator(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregator")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

