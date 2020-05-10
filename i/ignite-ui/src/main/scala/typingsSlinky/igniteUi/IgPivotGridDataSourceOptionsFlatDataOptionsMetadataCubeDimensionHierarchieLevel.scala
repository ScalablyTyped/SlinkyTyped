package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the level.
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * A function called for each item of the data source array when level members are created.
  	 * Based on the item parameter the function should return a value that will form the $.ig.Member's name and caption.
  	 */
  var memberProvider: js.UndefOr[js.Function] = js.native
  /**
  	 * Optional="false" A name for the level.
  	 * The unique name of the level is formed using the following pattern:
  	 * {<hierarchy.uniqueName>}.[<levelMetadata.name>]
  	 */
  var name: js.UndefOr[String] = js.native
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel {
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel]
  }
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevelOps[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchieLevel] (val x: Self) extends AnyVal {
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
    def withMemberProvider(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberProvider")(js.undefined)
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

