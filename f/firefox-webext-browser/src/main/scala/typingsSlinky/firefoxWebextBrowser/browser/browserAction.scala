package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
  *
  * Manifest keys: `browser_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserAction {
  
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
  
  /**
    * An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example, opaque red is `[255, 0, 0, 255]`. Can also be a string with a CSS value, with opaque red being `#FF0000` or `#F00`.
    */
  type ColorValue = String | ColorArray | Null
  
  /* browserAction types */
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait Details extends StObject {
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object Details {
    
    @scala.inline
    def apply(): Details = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
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
  
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = ImageData
  
  /** Information sent when a browser action is clicked. */
  @js.native
  trait OnClickData extends StObject {
    
    /** An integer value of button by which menu item was clicked. */
    var button: js.UndefOr[Double] = js.native
    
    /** An array of keyboard modifiers that were held while the menu item was clicked. */
    var modifiers: js.Array[OnClickDataModifiers] = js.native
  }
  object OnClickData {
    
    @scala.inline
    def apply(modifiers: js.Array[OnClickDataModifiers]): OnClickData = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    @scala.inline
    implicit class OnClickDataMutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl
  */
  trait OnClickDataModifiers extends StObject
  object OnClickDataModifiers {
    
    @scala.inline
    def Alt: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt = "Alt".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt]
    
    @scala.inline
    def Command: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command = "Command".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command]
    
    @scala.inline
    def Ctrl: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl = "Ctrl".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl]
    
    @scala.inline
    def MacCtrl: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl = "MacCtrl".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl]
    
    @scala.inline
    def Shift: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift = "Shift".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift]
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait SetBadgeBackgroundColorDetails extends StObject {
    
    var color: ColorValue = js.native
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetBadgeBackgroundColorDetails {
    
    @scala.inline
    def apply(): SetBadgeBackgroundColorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetBadgeBackgroundColorDetails]
    }
    
    @scala.inline
    implicit class SetBadgeBackgroundColorDetailsMutableBuilder[Self <: SetBadgeBackgroundColorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
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
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait SetBadgeTextColorDetails extends StObject {
    
    var color: ColorValue = js.native
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetBadgeTextColorDetails {
    
    @scala.inline
    def apply(): SetBadgeTextColorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetBadgeTextColorDetails]
    }
    
    @scala.inline
    implicit class SetBadgeTextColorDetailsMutableBuilder[Self <: SetBadgeTextColorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
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
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait SetBadgeTextDetails extends StObject {
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /** Any number of characters can be passed, but only about four can fit in the space. */
    var text: String | Null = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetBadgeTextDetails {
    
    @scala.inline
    def apply(): SetBadgeTextDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetBadgeTextDetails]
    }
    
    @scala.inline
    implicit class SetBadgeTextDetailsMutableBuilder[Self <: SetBadgeTextDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait SetIconDetails extends StObject {
    
    /**
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.native
    
    /**
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[String | NumberDictionary[String]] = js.native
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
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
      def setPath(value: String | NumberDictionary[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
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
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait SetPopupDetails extends StObject {
    
    /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
    var popup: String | Null = js.native
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.native
  }
  object SetPopupDetails {
    
    @scala.inline
    def apply(): SetPopupDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetPopupDetails]
    }
    
    @scala.inline
    implicit class SetPopupDetailsMutableBuilder[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupNull: Self = StObject.set(x, "popup", null)
      
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
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @js.native
  trait SetTitleDetails extends StObject {
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.native
    
    /** The string the browser action should display when moused over. */
    var title: String | Null = js.native
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
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
