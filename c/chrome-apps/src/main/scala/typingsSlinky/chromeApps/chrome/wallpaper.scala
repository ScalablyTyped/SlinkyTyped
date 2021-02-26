package typingsSlinky.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.wallpaper
///////////////
// Wallpaper //
///////////////
/**
  * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
  * @requires Permissions: 'wallpaper'
  * @requires Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
object wallpaper {
  
  @js.native
  sealed trait WallpaperLayout extends StObject
  @JSGlobal("chrome.wallpaper.WallpaperLayout")
  @js.native
  object WallpaperLayout extends StObject {
    
    @js.native
    sealed trait CENTER extends WallpaperLayout
    
    @js.native
    sealed trait CENTER_CROPPED extends WallpaperLayout
    
    @js.native
    sealed trait STRETCH extends WallpaperLayout
  }
  
  @js.native
  trait WallpaperDetails extends StObject {
    
    /** The jpeg or png encoded wallpaper image. */
    var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    /** The file name of the saved wallpaper. */
    var filename: String = js.native
    
    /**
      * The supported wallpaper layouts.
      * @see WallpaperLayout
      */
    var layout: WallpaperLayout | WallpaperLayoutType = js.native
    
    /** True if a 128x60 thumbnail should be generated. */
    var thumbnail: js.UndefOr[Boolean] = js.native
    
    /** The URL of the wallpaper to be set. */
    var url: js.UndefOr[String] = js.native
  }
  object WallpaperDetails {
    
    @scala.inline
    def apply(filename: String, layout: WallpaperLayout | WallpaperLayoutType): WallpaperDetails = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WallpaperDetails]
    }
    
    @scala.inline
    implicit class WallpaperDetailsMutableBuilder[Self <: WallpaperDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: WallpaperLayout | WallpaperLayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.STRETCH
    - typingsSlinky.chromeApps.chromeAppsStrings.CENTER
    - typingsSlinky.chromeApps.chromeAppsStrings.CENTER_CROPPED
  */
  trait WallpaperLayoutType extends StObject
  object WallpaperLayoutType {
    
    @scala.inline
    def CENTER: typingsSlinky.chromeApps.chromeAppsStrings.CENTER = "CENTER".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.CENTER]
    
    @scala.inline
    def CENTER_CROPPED: typingsSlinky.chromeApps.chromeAppsStrings.CENTER_CROPPED = "CENTER_CROPPED".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.CENTER_CROPPED]
    
    @scala.inline
    def STRETCH: typingsSlinky.chromeApps.chromeAppsStrings.STRETCH = "STRETCH".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.STRETCH]
  }
}
