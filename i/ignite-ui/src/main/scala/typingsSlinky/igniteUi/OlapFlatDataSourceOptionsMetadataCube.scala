package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapFlatDataSourceOptionsMetadataCube
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the cube.
  	 */
  var caption: js.UndefOr[String] = js.native
  /**
  	 * An array of dimension metadata objects.
  	 */
  var dimensions: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimension]] = js.native
  /**
  	 * An object providing information about the measures' root node.
  	 */
  var measuresDimension: js.UndefOr[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension] = js.native
  /**
  	 * Optional="false" A unique name for the cube.
  	 */
  var name: js.UndefOr[String] = js.native
}

object OlapFlatDataSourceOptionsMetadataCube {
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCube]
  }
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeOps[Self <: OlapFlatDataSourceOptionsMetadataCube] (val x: Self) extends AnyVal {
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
    def withDimensions(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasuresDimension(value: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuresDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasuresDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuresDimension")(js.undefined)
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

