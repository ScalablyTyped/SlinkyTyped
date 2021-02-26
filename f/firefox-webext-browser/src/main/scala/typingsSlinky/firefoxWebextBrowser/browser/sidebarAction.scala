package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use sidebar actions to add a sidebar to Firefox.
  *
  * Manifest keys: `sidebar_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object sidebarAction {
  
  @js.native
  trait GetPanelDetails extends StObject {
    
    /**
      * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object GetPanelDetails {
    
    @scala.inline
    def apply(): GetPanelDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPanelDetails]
    }
    
    @scala.inline
    implicit class GetPanelDetailsMutableBuilder[Self <: GetPanelDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  @js.native
  trait GetTitleDetails extends StObject {
    
    /**
      * Specify the tab to get the title from. If no tab nor window is specified, the global title is returned.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * Specify the window to get the title from. If no tab nor window is specified, the global title is returned.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object GetTitleDetails {
    
    @scala.inline
    def apply(): GetTitleDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTitleDetails]
    }
    
    @scala.inline
    implicit class GetTitleDetailsMutableBuilder[Self <: GetTitleDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /* sidebarAction types */
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = ImageData
  
  @js.native
  trait IsOpenDetails extends StObject {
    
    /** Specify the window to get the openness from. */
    var windowId: js.UndefOr[Double] = js.native
  }
  object IsOpenDetails {
    
    @scala.inline
    def apply(): IsOpenDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsOpenDetails]
    }
    
    @scala.inline
    implicit class IsOpenDetailsMutableBuilder[Self <: IsOpenDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  @js.native
  trait SetIconDetails extends StObject {
    
    /**
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.native
    
    /**
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[String | StringDictionary[String]] = js.native
    
    /** Sets the sidebar icon for the tab specified by tabId. Automatically resets when the tab is closed. */
    var tabId: js.UndefOr[Double] = js.native
    
    /** Sets the sidebar icon for the window specified by windowId. */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetIconDetails {
    
    @scala.inline
    def apply(): SetIconDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetIconDetails]
    }
    
    @scala.inline
    implicit class SetIconDetailsMutableBuilder[Self <: SetIconDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageData(value: ImageData | NumberDictionary[ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDataImageData(value: ImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      @scala.inline
      def setPath(value: String | StringDictionary[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  @js.native
  trait SetPanelDetails extends StObject {
    
    /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
    var panel: String | Null = js.native
    
    /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
    var tabId: js.UndefOr[Double] = js.native
    
    /** Sets the sidebar url for the window specified by windowId. */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetPanelDetails {
    
    @scala.inline
    def apply(): SetPanelDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetPanelDetails]
    }
    
    @scala.inline
    implicit class SetPanelDetailsMutableBuilder[Self <: SetPanelDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelNull: Self = StObject.set(x, "panel", null)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  @js.native
  trait SetTitleDetails extends StObject {
    
    /** Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed. */
    var tabId: js.UndefOr[Double] = js.native
    
    /** The string the sidebar action should display when moused over. */
    var title: String | Null = js.native
    
    /** Sets the sidebar title for the window specified by windowId. */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetTitleDetails {
    
    @scala.inline
    def apply(): SetTitleDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetTitleDetails]
    }
    
    @scala.inline
    implicit class SetTitleDetailsMutableBuilder[Self <: SetTitleDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
