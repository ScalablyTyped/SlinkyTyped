package typingsSlinky.jqueryPrettyphoto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaronPrettyPhoto {
  
  /**
    * Pretty photo settings
    */
  @js.native
  trait PrettyPhotoSettings extends StObject {
    
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
    implicit class PrettyPhotoSettingsMutableBuilder[Self <: PrettyPhotoSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxcallback(value: () => Unit): Self = StObject.set(x, "ajaxcallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAjaxcallbackUndefined: Self = StObject.set(x, "ajaxcallback", js.undefined)
      
      @scala.inline
      def setAllow_expand(value: Boolean): Self = StObject.set(x, "allow_expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_expandUndefined: Self = StObject.set(x, "allow_expand", js.undefined)
      
      @scala.inline
      def setAllow_resize(value: Boolean): Self = StObject.set(x, "allow_resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_resizeUndefined: Self = StObject.set(x, "allow_resize", js.undefined)
      
      @scala.inline
      def setAnimation_speed(value: String): Self = StObject.set(x, "animation_speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimation_speedUndefined: Self = StObject.set(x, "animation_speed", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setAutoplay_slideshow(value: Boolean): Self = StObject.set(x, "autoplay_slideshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplay_slideshowUndefined: Self = StObject.set(x, "autoplay_slideshow", js.undefined)
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setChangepicturecallback(value: () => Unit): Self = StObject.set(x, "changepicturecallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChangepicturecallbackUndefined: Self = StObject.set(x, "changepicturecallback", js.undefined)
      
      @scala.inline
      def setCounter_separator_label(value: String): Self = StObject.set(x, "counter_separator_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounter_separator_labelUndefined: Self = StObject.set(x, "counter_separator_label", js.undefined)
      
      @scala.inline
      def setCustom_markup(value: String): Self = StObject.set(x, "custom_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_markupUndefined: Self = StObject.set(x, "custom_markup", js.undefined)
      
      @scala.inline
      def setDeeplinking(value: Boolean): Self = StObject.set(x, "deeplinking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeeplinkingUndefined: Self = StObject.set(x, "deeplinking", js.undefined)
      
      @scala.inline
      def setDefault_height(value: Double): Self = StObject.set(x, "default_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_heightUndefined: Self = StObject.set(x, "default_height", js.undefined)
      
      @scala.inline
      def setDefault_width(value: Double): Self = StObject.set(x, "default_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_widthUndefined: Self = StObject.set(x, "default_width", js.undefined)
      
      @scala.inline
      def setFlash_markup(value: String): Self = StObject.set(x, "flash_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlash_markupUndefined: Self = StObject.set(x, "flash_markup", js.undefined)
      
      @scala.inline
      def setGallery_markup(value: String): Self = StObject.set(x, "gallery_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGallery_markupUndefined: Self = StObject.set(x, "gallery_markup", js.undefined)
      
      @scala.inline
      def setHideflash(value: Boolean): Self = StObject.set(x, "hideflash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideflashUndefined: Self = StObject.set(x, "hideflash", js.undefined)
      
      @scala.inline
      def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      @scala.inline
      def setHorizontal_padding(value: Double): Self = StObject.set(x, "horizontal_padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal_paddingUndefined: Self = StObject.set(x, "horizontal_padding", js.undefined)
      
      @scala.inline
      def setIe6_fallback(value: Boolean): Self = StObject.set(x, "ie6_fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe6_fallbackUndefined: Self = StObject.set(x, "ie6_fallback", js.undefined)
      
      @scala.inline
      def setIframe_markup(value: String): Self = StObject.set(x, "iframe_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframe_markupUndefined: Self = StObject.set(x, "iframe_markup", js.undefined)
      
      @scala.inline
      def setImage_markup(value: String): Self = StObject.set(x, "image_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_markupUndefined: Self = StObject.set(x, "image_markup", js.undefined)
      
      @scala.inline
      def setInline_markup(value: String): Self = StObject.set(x, "inline_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_markupUndefined: Self = StObject.set(x, "inline_markup", js.undefined)
      
      @scala.inline
      def setKeyboard_shortcuts(value: Boolean): Self = StObject.set(x, "keyboard_shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboard_shortcutsUndefined: Self = StObject.set(x, "keyboard_shortcuts", js.undefined)
      
      @scala.inline
      def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOverlay_gallery(value: Boolean): Self = StObject.set(x, "overlay_gallery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlay_galleryUndefined: Self = StObject.set(x, "overlay_gallery", js.undefined)
      
      @scala.inline
      def setOverlay_gallery_max(value: Double): Self = StObject.set(x, "overlay_gallery_max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlay_gallery_maxUndefined: Self = StObject.set(x, "overlay_gallery_max", js.undefined)
      
      @scala.inline
      def setQuicktime_markup(value: String): Self = StObject.set(x, "quicktime_markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuicktime_markupUndefined: Self = StObject.set(x, "quicktime_markup", js.undefined)
      
      @scala.inline
      def setShow_title(value: Boolean): Self = StObject.set(x, "show_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_titleUndefined: Self = StObject.set(x, "show_title", js.undefined)
      
      @scala.inline
      def setSlideshow(value: js.Any): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideshowUndefined: Self = StObject.set(x, "slideshow", js.undefined)
      
      @scala.inline
      def setSocial_tools(value: js.Any): Self = StObject.set(x, "social_tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_toolsUndefined: Self = StObject.set(x, "social_tools", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    }
  }
  
  @js.native
  trait moduleJQuery extends StObject {
    
    /**
      * Initialises prettyPhoto
      */
    def apply(): JQuery = js.native
    /**
      * Initialises prettyPhoto specificying overrides for the defaults
      * @param pp_settings custom prettyPhoto settings
      */
    def apply(pp_settings: PrettyPhotoSettings): JQuery = js.native
  }
  
  @js.native
  trait moduleJQueryStatic extends StObject {
    
    /**
      * Change gallery page in the prettyPhoto modal box
      * @param direction {String} Direction of the paging, previous or next.
      */
    def changeGalleryPage(direction: String): Unit = js.native
    
    /**
      * Change page in the prettyPhoto modal box
      * @param direction {String} Direction of the paging, previous or next.
      */
    def changePage(direction: String): Unit = js.native
    
    /**
      * Closes prettyPhoto.
      */
    def close(): Unit = js.native
    
    /**
      * Opens the prettyPhoto modal box.
      * Note: Always returns false.
      */
    def open(): Boolean = js.native
    /**
      * Opens the prettyPhoto modal box.
      * Note: Always returns false.
      * @param image {String} Full path to the image to be open, can also be an array containing full images paths.
      * @param title {String} The title to be displayed with the picture, can also be an array containing all the titles.
      * @param description {String} The description to be displayed with the picture, can also be an array containing all the descriptions.
      */
    def open(image: String, title: String, description: String): Boolean = js.native
    /**
      * Opens the prettyPhoto modal box.
      * Note: Always returns false.
      * @param image {Array} Full path to the image to be open, can also be an array containing full images paths.
      * @param title {Array} The title to be displayed with the picture, can also be an array containing all the titles.
      * @param description {Array} The description to be displayed with the picture, can also be an array containing all the descriptions.
      */
    def open(images: js.Array[String], titles: js.Array[String], descriptions: js.Array[String]): Boolean = js.native
    
    /**
      * Start the slideshow...
      */
    def startSlideshow(): Unit = js.native
    
    /**
      * Stop the slideshow...
      */
    def stopSlideshow(): Unit = js.native
    
    /**
      * prettyPhoto version number
      */
    var version: String = js.native
  }
}
