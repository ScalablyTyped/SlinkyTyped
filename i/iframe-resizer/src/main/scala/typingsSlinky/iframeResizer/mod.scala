package typingsSlinky.iframeResizer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.iframeResizer.iframeResizerBooleans.`false`
import typingsSlinky.iframeResizer.iframeResizerStrings.auto
import typingsSlinky.iframeResizer.iframeResizerStrings.child
import typingsSlinky.iframeResizer.iframeResizerStrings.parent
import typingsSlinky.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // leave this declaration outside the namespace so the 'require'd import is still callable
  @JSImport("iframe-resizer", JSImport.Namespace)
  @js.native
  def apply(options: IFrameOptions, target: String): js.Array[IFrameComponent] = js.native
  @JSImport("iframe-resizer", JSImport.Namespace)
  @js.native
  def apply(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = js.native
  
  @JSImport("iframe-resizer", "iframeResizer")
  @js.native
  def iframeResizer(options: IFrameOptions, target: String): js.Array[IFrameComponent] = js.native
  @JSImport("iframe-resizer", "iframeResizer")
  @js.native
  def iframeResizer(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iframeResizer.iframeResizerStrings.bodyOffset
    - typingsSlinky.iframeResizer.iframeResizerStrings.bodyScroll
    - typingsSlinky.iframeResizer.iframeResizerStrings.documentElementOffset
    - typingsSlinky.iframeResizer.iframeResizerStrings.documentElementScroll
    - typingsSlinky.iframeResizer.iframeResizerStrings.max
    - typingsSlinky.iframeResizer.iframeResizerStrings.min
    - typingsSlinky.iframeResizer.iframeResizerStrings.grow
    - typingsSlinky.iframeResizer.iframeResizerStrings.lowestElement
    - typingsSlinky.iframeResizer.iframeResizerStrings.taggedElement
  */
  trait HeightCalculationMethod extends StObject
  object HeightCalculationMethod {
    
    @scala.inline
    def bodyOffset: typingsSlinky.iframeResizer.iframeResizerStrings.bodyOffset = "bodyOffset".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.bodyOffset]
    
    @scala.inline
    def bodyScroll: typingsSlinky.iframeResizer.iframeResizerStrings.bodyScroll = "bodyScroll".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.bodyScroll]
    
    @scala.inline
    def documentElementOffset: typingsSlinky.iframeResizer.iframeResizerStrings.documentElementOffset = "documentElementOffset".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.documentElementOffset]
    
    @scala.inline
    def documentElementScroll: typingsSlinky.iframeResizer.iframeResizerStrings.documentElementScroll = "documentElementScroll".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.documentElementScroll]
    
    @scala.inline
    def grow: typingsSlinky.iframeResizer.iframeResizerStrings.grow = "grow".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.grow]
    
    @scala.inline
    def lowestElement: typingsSlinky.iframeResizer.iframeResizerStrings.lowestElement = "lowestElement".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.lowestElement]
    
    @scala.inline
    def max: typingsSlinky.iframeResizer.iframeResizerStrings.max = "max".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.max]
    
    @scala.inline
    def min: typingsSlinky.iframeResizer.iframeResizerStrings.min = "min".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.min]
    
    @scala.inline
    def taggedElement: typingsSlinky.iframeResizer.iframeResizerStrings.taggedElement = "taggedElement".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.taggedElement]
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameComponent extends HTMLIFrameElement {
    
    var iFrameResizer: IFrameObject = js.native
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameMessageData extends StObject {
    
    var iframe: IFrameComponent = js.native
    
    var message: js.Any = js.native
  }
  object IFrameMessageData {
    
    @scala.inline
    def apply(iframe: IFrameComponent, message: js.Any): IFrameMessageData = {
      val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameMessageData]
    }
    
    @scala.inline
    implicit class IFrameMessageDataMutableBuilder[Self <: IFrameMessageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIframe(value: IFrameComponent): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameObject extends StObject {
    
    def close(): Unit = js.native
    
    def moveToAnchor(anchor: String): Unit = js.native
    
    def resize(): Unit = js.native
    
    def sendMessage(message: js.Any): Unit = js.native
    def sendMessage(message: js.Any, targetOrigin: String): Unit = js.native
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameOptions extends StObject {
    
    /**
      * When enabled changes to the Window size or the DOM will cause the iFrame to resize to the new content size.
      * Disable if using size method with custom dimensions.
      */
    var autoResize: js.UndefOr[Boolean] = js.native
    
    /**
      * Override the body background style in the iFrame.
      */
    var bodyBackground: js.UndefOr[String] = js.native
    
    /**
      * Override the default body margin style in the iFrame. A string can be any valid value for the
      * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
      */
    var bodyMargin: js.UndefOr[Double | String] = js.native
    
    /**
      * Override the default body padding style in the iFrame. A string can be any valid value for the
      * CSS margin attribute, for example '8px 3em'. A number value is converted into px.
      */
    var bodyPadding: js.UndefOr[Double | String] = js.native
    
    /**
      * When set to true, only allow incoming messages from the domain listed in the src property of the iFrame tag.
      * If your iFrame navigates between different domains, ports or protocols; then you will need to
      * provide an array of URLs or disable this option.
      */
    var checkOrigin: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
      * Called when iFrame is closed via parentIFrame.close() or iframe.iframeResizer.close() methods.
      */
    var closedCallback: js.UndefOr[js.Function1[/* iframeId */ String, Unit]] = js.native
    
    /**
      * Height calculation method.
      */
    var heightCalculationMethod: js.UndefOr[HeightCalculationMethod] = js.native
    
    /**
      * Set iFrame Id
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * When enabled in page linking inside the iFrame and from the iFrame to the parent page will be enabled.
      */
    var inPageLinks: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial setup callback function.
      */
    var initCallback: js.UndefOr[js.Function1[/* iframe */ IFrameComponent, Unit]] = js.native
    
    /**
      * In browsers that don't support mutationObserver, such as IE10, the library falls back to using
      * setInterval, to check for changes to the page size.
      */
    var interval: js.UndefOr[Double] = js.native
    
    /**
      * Setting the log option to true will make the scripts in both the host page and the iFrame output
      * everything they do to the JavaScript console so you can see the communication between the two scripts.
      */
    var log: js.UndefOr[Boolean] = js.native
    
    /**
      * Set maximum height of iFrame.
      */
    var maxHeight: js.UndefOr[Double] = js.native
    
    /**
      * Set maximum width of iFrame.
      */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /**
      * Receive message posted from iFrame with the parentIFrame.sendMessage() method.
      */
    var messageCallback: js.UndefOr[js.Function1[/* data */ IFrameMessageData, Unit]] = js.native
    
    /**
      * Set minimum height of iFrame.
      */
    var minHeight: js.UndefOr[Double] = js.native
    
    /**
      * Set minimum width of iFrame.
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /**
      * Listen for resize events from the parent page, or the iFrame. Select the 'child' value if the iFrame
      * can be resized independently of the browser window. Selecting this value can cause issues with some
      * height calculation methods on mobile devices.
      */
    var resizeFrom: js.UndefOr[parent | child] = js.native
    
    /**
      * Function called after iFrame resized. Passes in messageData object containing the iFrame, height, width
      * and the type of event that triggered the iFrame to resize.
      */
    var resizedCallback: js.UndefOr[js.Function1[/* data */ IFrameResizedData, Unit]] = js.native
    
    /**
      * Called before the page is repositioned after a request from the iFrame, due to either an in page link,
      * or a direct request from either parentIFrame.scrollTo() or parentIFrame.scrollToOffset().
      * If this callback function returns false, it will stop the library from repositioning the page, so that
      * you can implement your own animated page scrolling instead.
      */
    var scrollCallback: js.UndefOr[js.Function1[/* data */ IFrameScrollData, Boolean]] = js.native
    
    /**
      * Enable scroll bars in iFrame.
      */
    var scrolling: js.UndefOr[Boolean | auto] = js.native
    
    /**
      * Resize iFrame to content height.
      */
    var sizeHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * Resize iFrame to content width.
      */
    var sizeWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the number of pixels the iFrame content size has to change by, before triggering a resize of the iFrame.
      */
    var tolerance: js.UndefOr[Double] = js.native
    
    /**
      * Width calculation method.
      */
    var widthCalculationMethod: js.UndefOr[WidthCalculationMethod] = js.native
  }
  object IFrameOptions {
    
    @scala.inline
    def apply(): IFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFrameOptions]
    }
    
    @scala.inline
    implicit class IFrameOptionsMutableBuilder[Self <: IFrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      @scala.inline
      def setBodyBackground(value: String): Self = StObject.set(x, "bodyBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBackgroundUndefined: Self = StObject.set(x, "bodyBackground", js.undefined)
      
      @scala.inline
      def setBodyMargin(value: Double | String): Self = StObject.set(x, "bodyMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyMarginUndefined: Self = StObject.set(x, "bodyMargin", js.undefined)
      
      @scala.inline
      def setBodyPadding(value: Double | String): Self = StObject.set(x, "bodyPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPaddingUndefined: Self = StObject.set(x, "bodyPadding", js.undefined)
      
      @scala.inline
      def setCheckOrigin(value: Boolean | js.Array[String]): Self = StObject.set(x, "checkOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOriginUndefined: Self = StObject.set(x, "checkOrigin", js.undefined)
      
      @scala.inline
      def setCheckOriginVarargs(value: String*): Self = StObject.set(x, "checkOrigin", js.Array(value :_*))
      
      @scala.inline
      def setClosedCallback(value: /* iframeId */ String => Unit): Self = StObject.set(x, "closedCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClosedCallbackUndefined: Self = StObject.set(x, "closedCallback", js.undefined)
      
      @scala.inline
      def setHeightCalculationMethod(value: HeightCalculationMethod): Self = StObject.set(x, "heightCalculationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightCalculationMethodUndefined: Self = StObject.set(x, "heightCalculationMethod", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInPageLinks(value: Boolean): Self = StObject.set(x, "inPageLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInPageLinksUndefined: Self = StObject.set(x, "inPageLinks", js.undefined)
      
      @scala.inline
      def setInitCallback(value: /* iframe */ IFrameComponent => Unit): Self = StObject.set(x, "initCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitCallbackUndefined: Self = StObject.set(x, "initCallback", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMessageCallback(value: /* data */ IFrameMessageData => Unit): Self = StObject.set(x, "messageCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessageCallbackUndefined: Self = StObject.set(x, "messageCallback", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setResizeFrom(value: parent | child): Self = StObject.set(x, "resizeFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeFromUndefined: Self = StObject.set(x, "resizeFrom", js.undefined)
      
      @scala.inline
      def setResizedCallback(value: /* data */ IFrameResizedData => Unit): Self = StObject.set(x, "resizedCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizedCallbackUndefined: Self = StObject.set(x, "resizedCallback", js.undefined)
      
      @scala.inline
      def setScrollCallback(value: /* data */ IFrameScrollData => Boolean): Self = StObject.set(x, "scrollCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollCallbackUndefined: Self = StObject.set(x, "scrollCallback", js.undefined)
      
      @scala.inline
      def setScrolling(value: Boolean | auto): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSizeHeight(value: Boolean): Self = StObject.set(x, "sizeHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeHeightUndefined: Self = StObject.set(x, "sizeHeight", js.undefined)
      
      @scala.inline
      def setSizeWidth(value: Boolean): Self = StObject.set(x, "sizeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeWidthUndefined: Self = StObject.set(x, "sizeWidth", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      
      @scala.inline
      def setWidthCalculationMethod(value: WidthCalculationMethod): Self = StObject.set(x, "widthCalculationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthCalculationMethodUndefined: Self = StObject.set(x, "widthCalculationMethod", js.undefined)
    }
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFramePage extends StObject {
    
    /**
      * Turn autoResizing of the iFrame on and off. Returns bool of current state.
      */
    def autoResize(): Boolean = js.native
    def autoResize(resize: Boolean): Boolean = js.native
    
    /**
      * Remove the iFrame from the parent page.
      */
    def close(): Unit = js.native
    
    /**
      * Returns the ID of the iFrame that the page is contained in.
      */
    def getId(): String = js.native
    
    /**
      * Ask the containing page for its positioning coordinates.
      *
      * Your callback function will be recalled when the parent page is scrolled or resized.
      *
      * Pass false to disable the callback.
      */
    def getPageInfo(callback: js.Function1[/* data */ PageInfo, Unit]): Unit = js.native
    @JSName("getPageInfo")
    def getPageInfo_false(callback: `false`): Unit = js.native
    
    /**
      * Scroll the parent page to the coordinates x and y
      */
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Scroll the parent page to the coordinates x and y relative to the position of the iFrame.
      */
    def scrollToOffset(x: Double, y: Double): Unit = js.native
    
    /**
      * Send data to the containing page, message can be any data type that can be serialized into JSON. The `targetOrigin`
      * option is used to restrict where the message is sent to; to stop an attacker mimicking your parent page.
      * See the MDN documentation on postMessage for more details.
      */
    def sendMessage(message: js.Any): Unit = js.native
    def sendMessage(message: js.Any, targetOrigin: String): Unit = js.native
    
    /**
      * Change the method use to workout the height of the iFrame.
      */
    def setHeightCalculationMethod(method: HeightCalculationMethod): Unit = js.native
    
    /**
      * Set default target origin.
      */
    def setTargetOrigin(targetOrigin: String): Unit = js.native
    
    /**
      * Change the method use to workout the width of the iFrame.
      */
    def setWidthCalculationMethod(method: WidthCalculationMethod): Unit = js.native
    
    /**
      * Manually force iFrame to resize. To use passed arguments you need first to disable the `autoResize` option to
      * prevent auto resizing and enable the `sizeWidth` option if you wish to set the width.
      */
    def size(): Unit = js.native
    def size(customHeight: js.UndefOr[scala.Nothing], customWidth: String): Unit = js.native
    def size(customHeight: String): Unit = js.native
    def size(customHeight: String, customWidth: String): Unit = js.native
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFramePageOptions extends StObject {
    
    /**
      * These option can be used to override the option set in the parent page
      */
    var heightCalculationMethod: js.UndefOr[HeightCalculationMethod | js.Function0[Double]] = js.native
    
    /**
      * Receive message posted from the parent page with the iframe.iFrameResizer.sendMessage() method.
      */
    var messageCallback: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
    
    /**
      * This function is called once iFrame-Resizer has been initialized after receiving a call from the parent page.
      */
    var readyCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * This option allows you to restrict the domain of the parent page,
      * to prevent other sites mimicking your parent page.
      */
    var targetOrigin: js.UndefOr[String] = js.native
    
    /**
      * These option can be used to override the option set in the parent page
      */
    var widthCalculationMethod: js.UndefOr[WidthCalculationMethod | js.Function0[Double]] = js.native
  }
  object IFramePageOptions {
    
    @scala.inline
    def apply(): IFramePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFramePageOptions]
    }
    
    @scala.inline
    implicit class IFramePageOptionsMutableBuilder[Self <: IFramePageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeightCalculationMethod(value: HeightCalculationMethod | js.Function0[Double]): Self = StObject.set(x, "heightCalculationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightCalculationMethodFunction0(value: () => Double): Self = StObject.set(x, "heightCalculationMethod", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeightCalculationMethodUndefined: Self = StObject.set(x, "heightCalculationMethod", js.undefined)
      
      @scala.inline
      def setMessageCallback(value: /* message */ js.Any => Unit): Self = StObject.set(x, "messageCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessageCallbackUndefined: Self = StObject.set(x, "messageCallback", js.undefined)
      
      @scala.inline
      def setReadyCallback(value: () => Unit): Self = StObject.set(x, "readyCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadyCallbackUndefined: Self = StObject.set(x, "readyCallback", js.undefined)
      
      @scala.inline
      def setTargetOrigin(value: String): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      @scala.inline
      def setWidthCalculationMethod(value: WidthCalculationMethod | js.Function0[Double]): Self = StObject.set(x, "widthCalculationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthCalculationMethodFunction0(value: () => Double): Self = StObject.set(x, "widthCalculationMethod", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWidthCalculationMethodUndefined: Self = StObject.set(x, "widthCalculationMethod", js.undefined)
    }
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameResizedData extends StObject {
    
    var height: Double = js.native
    
    var iframe: IFrameComponent = js.native
    
    var `type`: String = js.native
    
    var width: Double = js.native
  }
  object IFrameResizedData {
    
    @scala.inline
    def apply(height: Double, iframe: IFrameComponent, `type`: String, width: Double): IFrameResizedData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameResizedData]
    }
    
    @scala.inline
    implicit class IFrameResizedDataMutableBuilder[Self <: IFrameResizedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframe(value: IFrameComponent): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait IFrameScrollData extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object IFrameScrollData {
    
    @scala.inline
    def apply(x: Double, y: Double): IFrameScrollData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameScrollData]
    }
    
    @scala.inline
    implicit class IFrameScrollDataMutableBuilder[Self <: IFrameScrollData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageInfo extends StObject {
    
    /**
      * The height of the viewport in pixels
      */
    var clientHeight: Double = js.native
    
    /**
      * The width of the viewport in pixels
      */
    var clientWidth: Double = js.native
    
    /**
      * The height of the iframe in pixels
      */
    var iframeHeight: Double = js.native
    
    /**
      * The width of the iframe in pixels
      */
    var iframeWidth: Double = js.native
    
    /**
      * The number of pixels between the left edge of the containing page and the left edge of the iframe
      */
    var offsetLeft: Double = js.native
    
    /**
      * The number of pixels between the top edge of the containing page and the top edge of the iframe
      */
    var offsetTop: Double = js.native
    
    /**
      * The number of pixels between the left edge of the iframe and the left edge of the iframe viewport
      */
    var scrollLeft: Double = js.native
    
    /**
      * The number of pixels between the top edge of the iframe and the top edge of the iframe viewport
      */
    var scrollTop: Double = js.native
  }
  object PageInfo {
    
    @scala.inline
    def apply(
      clientHeight: Double,
      clientWidth: Double,
      iframeHeight: Double,
      iframeWidth: Double,
      offsetLeft: Double,
      offsetTop: Double,
      scrollLeft: Double,
      scrollTop: Double
    ): PageInfo = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], iframeHeight = iframeHeight.asInstanceOf[js.Any], iframeWidth = iframeWidth.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    @scala.inline
    implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeHeight(value: Double): Self = StObject.set(x, "iframeHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeWidth(value: Double): Self = StObject.set(x, "iframeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iframeResizer.iframeResizerStrings.bodyOffset
    - typingsSlinky.iframeResizer.iframeResizerStrings.bodyScroll
    - typingsSlinky.iframeResizer.iframeResizerStrings.documentElementOffset
    - typingsSlinky.iframeResizer.iframeResizerStrings.documentElementScroll
    - typingsSlinky.iframeResizer.iframeResizerStrings.max
    - typingsSlinky.iframeResizer.iframeResizerStrings.min
    - typingsSlinky.iframeResizer.iframeResizerStrings.scroll
    - typingsSlinky.iframeResizer.iframeResizerStrings.rightMostElement
    - typingsSlinky.iframeResizer.iframeResizerStrings.taggedElement
  */
  trait WidthCalculationMethod extends StObject
  object WidthCalculationMethod {
    
    @scala.inline
    def bodyOffset: typingsSlinky.iframeResizer.iframeResizerStrings.bodyOffset = "bodyOffset".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.bodyOffset]
    
    @scala.inline
    def bodyScroll: typingsSlinky.iframeResizer.iframeResizerStrings.bodyScroll = "bodyScroll".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.bodyScroll]
    
    @scala.inline
    def documentElementOffset: typingsSlinky.iframeResizer.iframeResizerStrings.documentElementOffset = "documentElementOffset".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.documentElementOffset]
    
    @scala.inline
    def documentElementScroll: typingsSlinky.iframeResizer.iframeResizerStrings.documentElementScroll = "documentElementScroll".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.documentElementScroll]
    
    @scala.inline
    def max: typingsSlinky.iframeResizer.iframeResizerStrings.max = "max".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.max]
    
    @scala.inline
    def min: typingsSlinky.iframeResizer.iframeResizerStrings.min = "min".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.min]
    
    @scala.inline
    def rightMostElement: typingsSlinky.iframeResizer.iframeResizerStrings.rightMostElement = "rightMostElement".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.rightMostElement]
    
    @scala.inline
    def scroll: typingsSlinky.iframeResizer.iframeResizerStrings.scroll = "scroll".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.scroll]
    
    @scala.inline
    def taggedElement: typingsSlinky.iframeResizer.iframeResizerStrings.taggedElement = "taggedElement".asInstanceOf[typingsSlinky.iframeResizer.iframeResizerStrings.taggedElement]
  }
}
