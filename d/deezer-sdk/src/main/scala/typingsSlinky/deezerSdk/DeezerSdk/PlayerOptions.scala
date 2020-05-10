package typingsSlinky.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}\
  * {@link https://developers.deezer.com/musicplugins/player | Widget player}
  */
@js.native
trait PlayerOptions extends js.Object {
  /**
    * The general color of the widget. Has to be a hexadecimal value without the #.
    *
    * Default: 1990DB
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val color: js.UndefOr[String] = js.native
  /**
    * The ID of the div that will contain the widget player
    *
    * To implement a Deezer-like player, set this to the ID attribute of HTML div you want to load
    * the widget player in.
    *
    * An invisible player allows you to create your own UI and JavaScript events.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val container: js.UndefOr[String] = js.native
  /**
    * The layout format of the widget
    *
    * Default: classic
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val format: js.UndefOr[WidgetFormat] = js.native
  /**
    * The height of the player in pixels
    *
    * Default: 100%
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val height: js.UndefOr[Double] = js.native
  /**
    * The general layout of the widget
    *
    * Default: dark
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val layout: js.UndefOr[WidgetLayout] = js.native
  /**
    * The callback function executed after the player has loaded.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  var onload: js.UndefOr[js.Function1[/* state */ PlayerState, Unit]] = js.native
  /**
    * Whether to display the playlist from the player
    *
    * Default: true
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val playlist: js.UndefOr[Boolean] = js.native
  /**
    * The layout size of the widget
    *
    * Default: medium
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val size: js.UndefOr[WidgetSize] = js.native
  /**
    * The width of the player in pixels
    *
    * Default: 100%
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val width: js.UndefOr[Double] = js.native
}

object PlayerOptions {
  @scala.inline
  def apply(): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerOptions]
  }
  @scala.inline
  implicit class PlayerOptionsOps[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: WidgetFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: WidgetLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: /* state */ PlayerState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlist")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: WidgetSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

