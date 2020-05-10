package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoXmlReadOptions extends js.Object {
  /** Specifies if KML ScreenOverlays should be read or ignored. Default: true */
  var allowKmlScreenOverlays: js.UndefOr[Boolean] = js.native
  /**
    * Specifies wether the individual waypoint data of a GPX Route or Track should be captured.
    * If set to true, the shape will have a metadata.waypoints property that is an array of
    * pushpins that contains the details of each waypoint along the track. Default: false
    */
  var captureGpxPathWaypoints: js.UndefOr[Boolean] = js.native
  /** The default styles to apply to shapes that don't have a defined style in the XML. */
  var defaultStyles: js.UndefOr[IStylesOptions] = js.native
  /**
    * A callback function that is triggered when an error occurs when reading an XML document.
    */
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /** Specifies if shapes visible tags should be used to set the visible property of it's equivalent Bing Maps shape. Default: true */
  var ignoreVisibility: js.UndefOr[Boolean] = js.native
  /**
    * The maximium depth of network links in a KML file. Default: 3
    * Example: when set to 3; file1 links to file2 which links to file3 but won't open links in file3.
    */
  var maxNetworkLinkDepth: js.UndefOr[Double] = js.native
  /**
    * The maximium number of network links that a single KML file can have. Default: 10.
    */
  var maxNetworkLinks: js.UndefOr[Double] = js.native
  /** Indicates if the pushpin title should be displayed on the map if a valid title or name value exits in the shapes metadata. Default: true */
  var setPushpinTitles: js.UndefOr[Boolean] = js.native
}

object IGeoXmlReadOptions {
  @scala.inline
  def apply(): IGeoXmlReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlReadOptions]
  }
  @scala.inline
  implicit class IGeoXmlReadOptionsOps[Self <: IGeoXmlReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowKmlScreenOverlays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKmlScreenOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKmlScreenOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKmlScreenOverlays")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureGpxPathWaypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureGpxPathWaypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureGpxPathWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureGpxPathWaypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyles(value: IStylesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNetworkLinkDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNetworkLinkDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNetworkLinkDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNetworkLinkDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNetworkLinks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNetworkLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNetworkLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNetworkLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPushpinTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPushpinTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetPushpinTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPushpinTitles")(js.undefined)
        ret
    }
  }
  
}

