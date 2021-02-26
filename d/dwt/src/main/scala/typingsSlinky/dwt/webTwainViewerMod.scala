package typingsSlinky.dwt

import typingsSlinky.dwt.addonCameraMod.Resolution
import typingsSlinky.dwt.anon.AllImage
import typingsSlinky.dwt.anon.AsideBackground
import typingsSlinky.dwt.anon.AsideMenu
import typingsSlinky.dwt.anon.AutoFit
import typingsSlinky.dwt.anon.BackgroundColor
import typingsSlinky.dwt.anon.Crop
import typingsSlinky.dwt.anon.CropBar
import typingsSlinky.dwt.anon.DisplayMode
import typingsSlinky.dwt.anon.Global
import typingsSlinky.dwt.anon.GoToThumbnail
import typingsSlinky.dwt.anon.IfResize
import typingsSlinky.dwt.webTwainAcquireMod.WebTwainAcquire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainViewerMod {
  
  @js.native
  trait BasicViewerConfig extends StObject {
    
    /**
      * Specify the size of the viewer.
      */
    var Height: Double | String = js.native
    
    var Width: Double | String = js.native
    
    /**
      * Set up the content view.
      */
    var view: ContentView = js.native
  }
  object BasicViewerConfig {
    
    @scala.inline
    def apply(Height: Double | String, Width: Double | String, view: ContentView): BasicViewerConfig = {
      val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicViewerConfig]
    }
    
    @scala.inline
    implicit class BasicViewerConfigMutableBuilder[Self <: BasicViewerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: ContentView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContentView extends StObject {
    
    /**
      * Specify the width of the major content view.
      */
    var Width: Double | String = js.native
    
    /**
      * Whether to show the content view or not.
      * If set to false, then only thumbnails view is shown.
      */
    var bShow: Boolean = js.native
  }
  object ContentView {
    
    @scala.inline
    def apply(Width: Double | String, bShow: Boolean): ContentView = {
      val __obj = js.Dynamic.literal(Width = Width.asInstanceOf[js.Any], bShow = bShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentView]
    }
    
    @scala.inline
    implicit class ContentViewMutableBuilder[Self <: ContentView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBShow(value: Boolean): Self = StObject.set(x, "bShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DynamsoftViewer extends StObject {
    
    /**
      * Whether to only show the thumbnails view.
      */
    var bOnlyShowThumbnailsView: Boolean = js.native
    
    /**
      * Bind a custom element to the viewer to add extra features.
      * @param Id Specify the element by its Id.
      * @param priority Specify the importance of the element.
      * @param fullScreen Whether to show the element full-screen.
      */
    def bindCustomElement(Id: String, priority: Double, fullScreen: Boolean): Boolean = js.native
    
    /**
      * Close the camera and hide the video streaming UI.
      */
    def closeVideo(): Unit = js.native
    
    /**
      * Set the shape of the cursor over the thumbnails view.
      */
    var cursorOverThumbnailsView: String = js.native
    
    /**
      * Hide the custom element.
      * @param name Specify the element by its Id.
      */
    def hideCustomElement(Id: String): Boolean = js.native
    
    /**
      * Return or set the margin between two images or the margin between one side of an image and the border of the viewer.
      */
    var imageMargin: Double = js.native
    
    /**
      * Remove a built-in event handler.
      * @param eventName Specify the event.
      */
    def off(eventName: String): Boolean = js.native
    
    /**
      * The mode of operation. Allowed values are 0(no selection, cursor is pointer), 1 (seleciton, cursor is crosshair)
      */
    var operationMode: Double = js.native
    
    /**
      * Set the CSS class name of the specified button.
      * @param name Specify the button.
      * @param className Specify the CSS class name.
      */
    def setButtonClass(name: String, className: String): Boolean = js.native
    
    /**
      * Select a rectangular area on the specified image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param width Specify the rectangle (the width).
      * @param height Specify the rectangle (the height).
      */
    def setSelectedImageArea(left: Double, top: Double, width: Double, height: Double): Boolean = js.native
    
    /**
      * Set the view mode of the viewer.
      * @param columns Specify the number of images per row.
      * @param rows Specify the number of images per column.
      */
    def setViewMode(columns: Double, rows: Double): Boolean = js.native
    
    /**
      * Show the custom element.
      * @param name Specify the element by its Id.
      */
    def showCustomElement(Id: String): Boolean = js.native
    
    /**
      * Return or set whether to show the footer of the viewer.
      */
    var showFooter: Boolean = js.native
    
    /**
      * Return or set whether to show the header of the viewer.
      */
    var showHeader: Boolean = js.native
    
    /**
      * Start streaming video from the current camera in the viewer.
      * @param deviceId Specify a camera.
      * @param resolution Specify the initial resolution.
      */
    def showVideo(): js.Promise[Resolution] = js.native
    def showVideo(deviceId: js.UndefOr[scala.Nothing], resolution: Resolution): js.Promise[Resolution] = js.native
    def showVideo(deviceId: String): js.Promise[Resolution] = js.native
    def showVideo(deviceId: String, resolution: Resolution): js.Promise[Resolution] = js.native
    
    /**
      * Show or hide the custom element.
      * @param name Specify the element by its Id.
      */
    def toggleCustomElement(Id: String): Boolean = js.native
    
    /**
      * Unbind a custom element from the viewer.
      * @param Id Specify the element by its Id.
      */
    def unBindCustomElement(Id: String): Boolean = js.native
    
    /**
      * Update the viewer with detailed configuration.
      * @param config Specify the detailed configuration.
      */
    def updateUISettings(config: ViewerConfig): Boolean = js.native
    
    /**
      * Zoom in by 6/5.
      */
    def zoomIn(): Boolean = js.native
    
    /**
      * Zoom out by 5/6.
      */
    def zoomOut(): Boolean = js.native
  }
  
  @js.native
  trait ViewerConfig extends StObject {
    
    var buttonResize: js.UndefOr[IfResize] = js.native
    
    var buttons: js.UndefOr[AutoFit] = js.native
    
    /**
      * Specify which components are shown.
      */
    var component: js.UndefOr[AsideMenu] = js.native
    
    var content: js.UndefOr[AllImage] = js.native
    
    var cropStyle: js.UndefOr[CropBar] = js.native
    
    var group: js.UndefOr[Global] = js.native
    
    var presetMode: js.UndefOr[String] = js.native
    
    var skinColor: js.UndefOr[AsideBackground] = js.native
    
    var tag: js.UndefOr[DisplayMode] = js.native
    
    // Example: 'basic'
    var theme: js.UndefOr[String] = js.native
    
    var thumbnail: js.UndefOr[BackgroundColor] = js.native
    
    var tipsConfig: js.UndefOr[Crop] = js.native
    
    var tree: js.UndefOr[GoToThumbnail] = js.native
  }
  object ViewerConfig {
    
    @scala.inline
    def apply(): ViewerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewerConfig]
    }
    
    @scala.inline
    implicit class ViewerConfigMutableBuilder[Self <: ViewerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonResize(value: IfResize): Self = StObject.set(x, "buttonResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonResizeUndefined: Self = StObject.set(x, "buttonResize", js.undefined)
      
      @scala.inline
      def setButtons(value: AutoFit): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setComponent(value: AsideMenu): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setContent(value: AllImage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCropStyle(value: CropBar): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
      
      @scala.inline
      def setGroup(value: Global): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setPresetMode(value: String): Self = StObject.set(x, "presetMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetModeUndefined: Self = StObject.set(x, "presetMode", js.undefined)
      
      @scala.inline
      def setSkinColor(value: AsideBackground): Self = StObject.set(x, "skinColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinColorUndefined: Self = StObject.set(x, "skinColor", js.undefined)
      
      @scala.inline
      def setTag(value: DisplayMode): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setThumbnail(value: BackgroundColor): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setTipsConfig(value: Crop): Self = StObject.set(x, "tipsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsConfigUndefined: Self = StObject.set(x, "tipsConfig", js.undefined)
      
      @scala.inline
      def setTree(value: GoToThumbnail): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  @js.native
  trait WebTwainViewer extends WebTwainAcquire {
    
    /**
      * Return or set the background colour of the viewer.
      */
    var BackgroundColor: Double = js.native
    
    /**
      * Create a Dynamsoft Viewer instance and bind it to the WebTwain instance.
      * @param elementId Specify an HTML element to create the viewer.
      * @param config Configuration of the viewer.
      */
    def BindViewer(elementId: String): Boolean = js.native
    def BindViewer(elementId: String, config: BasicViewerConfig): Boolean = js.native
    
    /**
      * Return or set how the image is fit in the viewer.
      */
    var FitWindowType: Double = js.native
    
    /**
      * Return or set the height of the viewer.
      */
    var Height: Double | String = js.native
    
    /**
      * Return or set whether the thumbnails view scrolls when new images come in.
      */
    var IfAutoScroll: Boolean = js.native
    
    /**
      * Return or set the border colour for selected image(s).
      */
    var IfFitWindow: Boolean = js.native
    
    /**
      * Return or set the margin between images (in pixels).
      */
    var ImageMargin: Double = js.native
    
    /**
      * Return or set the shape of the cursor.
      */
    var MouseShape: Boolean = js.native
    
    /**
      * Return the horizontal coordinate of the mouse.
      */
    val MouseX: Double = js.native
    
    /**
      * Return the vertical coordinate of the mouse.
      */
    val MouseY: Double = js.native
    
    /**
      * Return or set the border colour for selected image(s).
      */
    var SelectionImageBorderColor: Double = js.native
    
    /**
      * Return or set whether to show the page numbers.
      */
    var ShowPageNumber: Boolean = js.native
    
    /**
      * Unbind and destroy the viewer.
      */
    def UnbindViewer(): Boolean = js.native
    
    /**
      * Update the viewer with the new configuration.
      * @param config Configuration of the viewer.
      */
    def UpdateViewer(config: BasicViewerConfig): Boolean = js.native
    
    var Viewer: DynamsoftViewer = js.native
    
    /**
      * Return or set the width of the viewer.
      */
    var Width: Double | String = js.native
    
    /**
      * Return or set the zoom factor.
      */
    var Zoom: Double = js.native
  }
}
