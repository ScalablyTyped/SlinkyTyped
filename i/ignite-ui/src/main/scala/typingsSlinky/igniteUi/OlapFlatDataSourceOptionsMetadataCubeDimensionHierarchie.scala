package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the hierarchy.
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * The path to be used when displaying the hierarchy in the user interface.
  	 *                                 Nested folders are indicated by a backslash (\).
  	 *                                 The folder hierarchy will appear under parent dimension node.
  	 */
  var displayFolder: js.UndefOr[String] = js.native
  /**
  	 * An array of level metadata objects.
  	 */
  var levels: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]] = js.native
  /**
  	 * Optional="false" A name for the hierarchy.
  	 *                                 The unique name of the hierarchy is formed using the following pattern:
  	 *                                 [<parentDimension.name>].[<hierarchyMetadata.name>]
  	 */
  var name: js.UndefOr[String] = js.native
}

object OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie {
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]
  }
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieOps[Self <: OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie] (val x: Self) extends AnyVal {
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
    def withLevels(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchieLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
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

