package typingsSlinky.jqueryPrettyphoto.scaronPrettyPhoto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pretty photo settings
  */
@js.native
trait PrettyPhotoSettings extends js.Object {
  var ajaxcallback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Allow the user to expand a resized image. true/false
    * @default true
    */
  var allow_expand: js.UndefOr[Boolean] = js.native
  /**
    * Resize the photos bigger than viewport. true/false
    * @default true
    */
  var allow_resize: js.UndefOr[Boolean] = js.native
  /**
    * fast/slow/normal
    * @default 'fast'
    */
  var animation_speed: js.UndefOr[String] = js.native
  /**
    * Automatically start videos: True/False
    * @default true
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * true/false
    * @default false
    */
  var autoplay_slideshow: js.UndefOr[Boolean] = js.native
  /**
    * Called when prettyPhoto is closed
    * @default function () { }
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called everytime an item is shown/changed
    * @default function () { }
    */
  var changepicturecallback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The separator for the gallery counter 1 "of" 2
    * @default '/'
    */
  var counter_separator_label: js.UndefOr[String] = js.native
  /**
    * @default ''
    */
  var custom_markup: js.UndefOr[String] = js.native
  /**
    * Allow prettyPhoto to update the url to enable deeplinking.
    * @default true
    */
  var deeplinking: js.UndefOr[Boolean] = js.native
  /**
    * Pixels
    * @default 344
    */
  var default_height: js.UndefOr[Double] = js.native
  /**
    * Pixels
    * @default 500
    */
  var default_width: js.UndefOr[Double] = js.native
  /**
    * Markup for flash
    * @default '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="{width}" height="{height}"><param name="wmode" value="{wmode}" /><param name="allowfullscreen" value="true" /><param name="allowscriptaccess" value="always" /><param name="movie" value="{path}" /><embed src="{path}" type="application/x-shockwave-flash" allowfullscreen="true" allowscriptaccess="always" width="{width}" height="{height}" wmode="{wmode}"></embed></object>'
    */
  var flash_markup: js.UndefOr[String] = js.native
  /**
    * Markup for pretty photo gallery
    * @default omitted for brevity
    */
  var gallery_markup: js.UndefOr[String] = js.native
  /**
    * Hides all the flash object on a page, set to TRUE if flash appears over prettyPhoto
    * @default false
    */
  var hideflash: js.UndefOr[Boolean] = js.native
  /**
    * the attribute tag to use for prettyPhoto hooks.  For HTML5, use "data-rel" or similar.
    * @default 'rel'
    */
  var hook: js.UndefOr[String] = js.native
  /**
    * The padding on each side of the picture
    * @default 20
    */
  var horizontal_padding: js.UndefOr[Double] = js.native
  /**
    * @default true
    */
  var ie6_fallback: js.UndefOr[Boolean] = js.native
  /**
    * Markup for iframe
    * @default '<iframe src ="{path}" width="{width}" height="{height}" frameborder="no"></iframe>'
    */
  var iframe_markup: js.UndefOr[String] = js.native
  /**
    * Markup for image
    * @default '<img id="fullResImage" src="{path}" />'
    */
  var image_markup: js.UndefOr[String] = js.native
  /**
    * @default '<div class="pp_inline">{content}</div>'
    */
  var inline_markup: js.UndefOr[String] = js.native
  /**
    * Set to false if you open forms inside prettyPhoto
    * @default true
    */
  var keyboard_shortcuts: js.UndefOr[Boolean] = js.native
  /**
    * Markup for pretty photo
    * @default omitted for brevity
    */
  var markup: js.UndefOr[String] = js.native
  /**
    * If set to true, only the close button will close the window
    * @default false
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * Value between 0 and 1
    * @default 0.80
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * If set to true, a gallery will overlay the fullscreen image on mouse over
    * @default true
    */
  var overlay_gallery: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of pictures in the overlay gallery
    * @default 30
    */
  var overlay_gallery_max: js.UndefOr[Double] = js.native
  /**
    * Markup for quicktime
    * @default '<object classid="clsid:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B" codebase="http://www.apple.com/qtactivex/qtplugin.cab" height="{height}" width="{width}"><param name="src" value="{path}"><param name="autoplay" value="{autoplay}"><param name="type" value="video/quicktime"><embed src="{path}" height="{height}" width="{width}" autoplay="{autoplay}" type="video/quicktime" pluginspage="http://www.apple.com/quicktime/download/"></embed></object>'
    */
  var quicktime_markup: js.UndefOr[String] = js.native
  /**
    * true/false
    * @default true
    */
  var show_title: js.UndefOr[Boolean] = js.native
  /**
    * false OR interval time in ms
    * @default 5000
    */
  var slideshow: js.UndefOr[js.Any] = js.native
  /**
    * Markup for social tools, set to html or false to disable
    * @default '<div class="twitter"><a href="http://twitter.com/share" class="twitter-share-button" data-count="none">Tweet</a><script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script></div><div class="facebook"><iframe src="//www.facebook.com/plugins/like.php?locale=en_US&href={location_href}&amp;layout=button_count&amp;show_faces=true&amp;width=500&amp;action=like&amp;font&amp;colorscheme=light&amp;height=23" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:500px; height:23px;" allowTransparency="true"></iframe></div>'
    */
  var social_tools: js.UndefOr[js.Any] = js.native
  /**
    * light_rounded / dark_rounded / light_square / dark_square / facebook
    * @default 'pp_default'
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Set the flash wmode attribute
    * @default 'opaque'
    */
  var wmode: js.UndefOr[String] = js.native
}

object PrettyPhotoSettings {
  @scala.inline
  def apply(): PrettyPhotoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyPhotoSettings]
  }
  @scala.inline
  implicit class PrettyPhotoSettingsOps[Self <: PrettyPhotoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxcallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxcallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAjaxcallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxcallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_expand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_expand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_expand")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_resize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_resize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_resize")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation_speed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay_slideshow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay_slideshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay_slideshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay_slideshow")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withChangepicturecallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changepicturecallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutChangepicturecallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changepicturecallback")(js.undefined)
        ret
    }
    @scala.inline
    def withCounter_separator_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter_separator_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter_separator_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter_separator_label")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withDeeplinking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeeplinking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinking")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_height")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_width")(js.undefined)
        ret
    }
    @scala.inline
    def withFlash_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withGallery_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gallery_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGallery_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gallery_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withHideflash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideflash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideflash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideflash")(js.undefined)
        ret
    }
    @scala.inline
    def withHook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal_padding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal_padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal_padding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal_padding")(js.undefined)
        ret
    }
    @scala.inline
    def withIe6_fallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie6_fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe6_fallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie6_fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withIframe_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframe_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard_shortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard_shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard_shortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard_shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay_gallery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_gallery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay_gallery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_gallery")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay_gallery_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_gallery_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay_gallery_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay_gallery_max")(js.undefined)
        ret
    }
    @scala.inline
    def withQuicktime_markup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicktime_markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuicktime_markup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicktime_markup")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_title(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_title")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshow")(js.undefined)
        ret
    }
    @scala.inline
    def withSocial_tools(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocial_tools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_tools")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wmode")(js.undefined)
        ret
    }
  }
  
}

