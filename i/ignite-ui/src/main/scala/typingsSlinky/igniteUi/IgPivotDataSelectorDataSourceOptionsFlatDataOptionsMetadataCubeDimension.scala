package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the dimension.
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * An array of hierarchy metadata objects.
  	 */
  var hierarchies: js.UndefOr[
    js.Array[
      IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
    ]
  ] = js.native
  /**
  	 * Optional="false" A unique name for the dimension.
  	 */
  var name: js.UndefOr[String] = js.native
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionOps[Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension] (val x: Self) extends AnyVal {
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
    def withHierarchies(
      value: js.Array[
          IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchies")(js.undefined)
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

