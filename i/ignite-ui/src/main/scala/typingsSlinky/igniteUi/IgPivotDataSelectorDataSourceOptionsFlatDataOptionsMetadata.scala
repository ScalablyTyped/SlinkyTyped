package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" Metadata used for the creation of the cube.
  	 */
  var cube: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube] = js.native
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataOps[Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCube(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.undefined)
        ret
    }
  }
  
}

