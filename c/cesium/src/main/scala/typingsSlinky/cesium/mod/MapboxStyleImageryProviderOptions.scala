package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapboxStyleImageryProviderOptions extends MapboxProviderCommonOptions {
  /**
    * The public access token for the imagery.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * Determines if tiles are rendered at a @2x scale factor
    */
  var scaleFactor: js.UndefOr[Boolean] = js.native
  /**
    * The Mapbox Style ID.
    */
  var styleId: String = js.native
  /**
    * The size of the image tiles
    * @default 512
    */
  var tilesize: js.UndefOr[Double] = js.native
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/styles/v1/'
    */
  var url: js.UndefOr[Resource | String] = js.native
  /**
    * The username of the map account.
    * @default 'mapbox'
    */
  var username: js.UndefOr[String] = js.native
}

object MapboxStyleImageryProviderOptions {
  @scala.inline
  def apply(styleId: String): MapboxStyleImageryProviderOptions = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxStyleImageryProviderOptions]
  }
  @scala.inline
  implicit class MapboxStyleImageryProviderOptionsOps[Self <: MapboxStyleImageryProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withTilesize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilesize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilesize")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: Resource | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

