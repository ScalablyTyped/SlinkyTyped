package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.extensionTypes` API contains type declarations for WebExtensions.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object extensionTypes {
  
  /** The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.author
  */
  trait CSSOrigin extends StObject
  object CSSOrigin {
    
    @scala.inline
    def author: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.author = "author".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.author]
    
    @scala.inline
    def user: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user = "user".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user]
  }
  
  type Date = String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Date */ js.Any)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.anon.File
    - typingsSlinky.firefoxWebextBrowser.anon.Code
  */
  trait ExtensionFileOrCode extends StObject
  object ExtensionFileOrCode {
    
    @scala.inline
    def Code(code: String): typingsSlinky.firefoxWebextBrowser.anon.Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.firefoxWebextBrowser.anon.Code]
    }
    
    @scala.inline
    def File(file: ExtensionURL): typingsSlinky.firefoxWebextBrowser.anon.File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.firefoxWebextBrowser.anon.File]
    }
  }
  
  /** Details about the format, quality, area and scale of the capture. */
  @js.native
  trait ImageDetails extends StObject {
    
    /** The format of the resulting image. Default is `"jpeg"`. */
    var format: js.UndefOr[ImageFormat] = js.native
    
    /**
      * When format is `"jpeg"`, controls the quality of the resulting image. This value is ignored for PNG images. As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store it will decrease.
      */
    var quality: js.UndefOr[Double] = js.native
    
    /**
      * The area of the document to capture, in CSS pixels, relative to the page. If omitted, capture the visible viewport.
      */
    var rect: js.UndefOr[ImageDetailsRect] = js.native
    
    /** The scale of the resulting image. Defaults to `devicePixelRatio`. */
    var scale: js.UndefOr[Double] = js.native
  }
  object ImageDetails {
    
    @scala.inline
    def apply(): ImageDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDetails]
    }
    
    @scala.inline
    implicit class ImageDetailsMutableBuilder[Self <: ImageDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRect(value: ImageDetailsRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  /**
    * The area of the document to capture, in CSS pixels, relative to the page. If omitted, capture the visible viewport.
    */
  @js.native
  trait ImageDetailsRect extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ImageDetailsRect {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): ImageDetailsRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDetailsRect]
    }
    
    @scala.inline
    implicit class ImageDetailsRectMutableBuilder[Self <: ImageDetailsRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* extensionTypes types */
  /** The format of an image. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    @scala.inline
    def jpeg: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = "jpeg".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg]
    
    @scala.inline
    def png: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = "png".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.png]
  }
  
  /**
    * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be set at the same time.
    */
  @js.native
  trait InjectDetails extends StObject {
    
    /**
      * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
      */
    var allFrames: js.UndefOr[Boolean] = js.native
    
    /**
      * JavaScript or CSS code to inject.
      *
      * **Warning:**
      * Be careful using the `code` parameter. Incorrect use of it may open your extension to [cross site scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) attacks.
      */
    var code: js.UndefOr[String] = js.native
    
    /** The css origin of the stylesheet to inject. Defaults to "author". */
    var cssOrigin: js.UndefOr[CSSOrigin] = js.native
    
    /** JavaScript or CSS file to inject. */
    var file: js.UndefOr[String] = js.native
    
    /** The ID of the frame to inject the script into. This may not be used in combination with `allFrames`. */
    var frameId: js.UndefOr[Double] = js.native
    
    /**
      * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
      */
    var matchAboutBlank: js.UndefOr[Boolean] = js.native
    
    /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
    var runAt: js.UndefOr[RunAt] = js.native
  }
  object InjectDetails {
    
    @scala.inline
    def apply(): InjectDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectDetails]
    }
    
    @scala.inline
    implicit class InjectDetailsMutableBuilder[Self <: InjectDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCssOrigin(value: CSSOrigin): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssOriginUndefined: Self = StObject.set(x, "cssOrigin", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      @scala.inline
      def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
      
      @scala.inline
      def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
    }
  }
  
  @js.native
  trait PlainJSONArray
    extends Array[PlainJSONValue]
       with _PlainJSONValue
  
  @js.native
  trait PlainJSONObject
    extends /* key */ StringDictionary[PlainJSONValue]
       with _PlainJSONValue
  object PlainJSONObject {
    
    @scala.inline
    def apply(): PlainJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlainJSONObject]
    }
  }
  
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONArray
    - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONObject
  */
  type PlainJSONValue = _PlainJSONValue | Null | String | Double | Boolean
  
  /** The soonest that the JavaScript or CSS will be injected into the tab. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle
  */
  trait RunAt extends StObject
  object RunAt {
    
    @scala.inline
    def document_end: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end = "document_end".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end]
    
    @scala.inline
    def document_idle: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle = "document_idle".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle]
    
    @scala.inline
    def document_start: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start = "document_start".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start]
  }
  
  trait _PlainJSONValue extends StObject
}
