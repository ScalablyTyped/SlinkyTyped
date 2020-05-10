package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMapBackgroundContent
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the bing maps url
  	 */
  var bingUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the type of the imagery.
  	 */
  var imagerySet: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the key.
  	 */
  var key: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the parameter.
  	 */
  var parameter: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the map tile image uri.
  	 *                 For Bing Maps this is populated by bing imagery.
  	 *                 For Open Street Map this option can accept custom URL for the tiles. Default is: 'tile.openstreetmap.org/{Z}/{X}/{Y}.png'. No protocol set means that 'http://' or 'https://' will be prepended automatically depending on the hosting site protocol. {Z} - denotes tile zoom, {X} - denotes tile horizontal position, {Y} - denotes tile vertical position.
  	 */
  var tilePath: js.UndefOr[String] = js.native
  /**
  	 * Type of the background content for the map.
  	 *
  	 * Valid values:
  	 * "openStreet" Specify the background content to display OpenStreetMap geographic data. Set as default.
  	 * "cloudMade"  Specify the background content to display CloudMade geographic data.
  	 * "bing"  Specify the background content to BingMaps geographic data.
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object IgMapBackgroundContent {
  @scala.inline
  def apply(): IgMapBackgroundContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMapBackgroundContent]
  }
  @scala.inline
  implicit class IgMapBackgroundContentOps[Self <: IgMapBackgroundContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImagerySet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagerySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagerySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagerySet")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
    @scala.inline
    def withTilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

