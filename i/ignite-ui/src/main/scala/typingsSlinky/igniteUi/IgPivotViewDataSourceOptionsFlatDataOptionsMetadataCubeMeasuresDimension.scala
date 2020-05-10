package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the measures dimension.
  	 * The default value is "Measures".
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * An array of measure metadata objects.
  	 */
  var measures: js.UndefOr[
    js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]
  ] = js.native
  /**
  	 * A unique name for the measures dimension.
  	 * The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
  	 * [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
  	 */
  var name: js.UndefOr[String] = js.native
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension {
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension]
  }
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionOps[Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMeasures(value: js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.undefined)
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

