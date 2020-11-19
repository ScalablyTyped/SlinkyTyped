package typingsSlinky.openui5.global.sap.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.Device")
@js.native
object Device extends js.Object {
  
  @js.native
  object browser extends js.Object {
    
    /**
      * If this flag is set to <code>true</code>, the Google Chrome browser is used.
      */
    var chrome: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Microsoft Edge browser is used.
      * @since 1.30.0
      */
    var edge: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Mozilla Firefox browser is used.
      */
    var firefox: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Safari browser runs in standalone fullscreen mode on
      * iOS.<b>Note:</b> This flag is only available if the Safari browser was detected. Furthermore, if
      * this mode is detected,technically not a standard Safari is used. There might be slight differences
      * in behavior and detection, e.g.the availability of {@link sap.ui.Device.browser#version}.
      * @since 1.31.0
      */
    var fullscreen: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Microsoft Internet Explorer browser is used.
      */
    @JSName("internet_explorer")
    var internetExplorer: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the mobile variant of the browser is used.<b>Note:</b>
      * This information might not be available for all browsers.
      */
    var mobile: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, a browser featuring a Mozilla engine is used.
      * @since 1.20.0
      */
    var mozilla: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Microsoft Internet Explorer browser is used.
      * @since 1.20.0
      */
    var msie: Boolean = js.native
    
    /**
      * The name of the browser.
      */
    var name: String = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Apple Safari browser is used.<b>Note:</b>This flag is
      * also <code>true</code> when the standalone (fullscreen) mode or webview is used on iOS
      * devices.Please also note the flags {@link sap.ui.Device.browser#fullscreen} and {@link
      * sap.ui.Device.browser#webview}.
      */
    var safari: Boolean = js.native
    
    /**
      * The version of the browser as <code>float</code>.Might be <code>-1</code> if no version can be
      * determined.
      */
    var version: Double = js.native
    
    /**
      * The version of the browser as <code>string</code>.Might be empty if no version can be determined.
      */
    var versionStr: String = js.native
    
    /**
      * If this flag is set to <code>true</code>, a browser featuring a Webkit engine is used.
      * @since 1.20.0
      */
    var webkit: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the Safari browser runs in webview mode on
      * iOS.<b>Note:</b> This flag is only available if the Safari browser was detected. Furthermore, if
      * this mode is detected,technically not a standard Safari is used. There might be slight differences
      * in behavior and detection, e.g.the availability of {@link sap.ui.Device.browser#version}.
      * @since 1.31.0
      */
    var webview: Boolean = js.native
    
    @js.native
    object BROWSER extends js.Object {
      
      /**
        * Android stock browser name.
        */
      var ANDROID: js.Any = js.native
      
      /**
        * Chrome browser name.
        */
      var CHROME: js.Any = js.native
      
      /**
        * Edge browser name.
        * @since 1.28.0
        */
      var EDGE: js.Any = js.native
      
      /**
        * Firefox browser name.
        */
      var FIREFOX: js.Any = js.native
      
      /**
        * Internet Explorer browser name.
        */
      var INTERNET_EXPLORER: js.Any = js.native
      
      /**
        * Safari browser name.
        */
      var SAFARI: js.Any = js.native
    }
  }
  
  @js.native
  object media extends js.Object {
    
    /**
      * Registers the given event handler to change events of the screen width based on the range set with
      * the specified name.The event is fired whenever the screen width changes and the current screen width
      * is ina different interval of the given range set than before the width change.The event handler is
      * called with a single argument: a map <code>mParams</code> which provides the following
      * informationabout the entered interval:<ul><li><code>mParams.from</code>: The start value (inclusive)
      * of the entered interval as a number</li><li><code>mParams.to</code>: The end value (exclusive) range
      * of the entered interval as a number or undefined for the last interval
      * (infinity)</li><li><code>mParams.unit</code>: The unit used for the values above, e.g.
      * <code>"px"</code></li><li><code>mParams.name</code>: The name of the entered interval, if
      * available</li></ul>
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * <code>window</code> instance. A map with information                      about the entered range
      * set is provided as a single argument to the handler (see details above).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the <code>window</code>.
      * @param sName The name of the range set to listen to. The range set must be initialized beforehand   
      *              ({@link sap.ui.Device.media.html#initRangeSet}). If no name is provided, the           
      *      {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
      */
    def attachHandler(fnFunction: js.Any, oListener: js.Any, sName: String): Unit = js.native
    
    /**
      * Removes a previously attached event handler from the change events of the screen width.The passed
      * parameters must match those used for registration with {@link #attachHandler} beforehand.
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      * @param sName The name of the range set to listen to. If no name is provided, the                 
      * {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
      */
    def detachHandler(fnFunction: js.Any, oListener: js.Any, sName: String): Unit = js.native
    
    /**
      * Returns information about the current active range of the range set with the given name.
      * @param sName The name of the range set. The range set must be initialized beforehand ({@link
      * sap.ui.Device.media.html#initRangeSet})
      * @returns Information about the current active interval of the range set. The returned map has the
      * same structure as the argument of the event handlers ({link sap.ui.Device.media#attachHandler})
      */
    def getCurrentRange(sName: String): js.Any = js.native
    
    /**
      * Returns <code>true</code> if a range set with the given name is already initialized.
      * @param sName The name of the range set.
      * @returns Returns <code>true</code> if a range set with the given name is already initialized
      */
    def hasRangeSet(sName: String): Boolean = js.native
    
    /**
      * Initializes a screen width media query range set.This initialization step makes the range set ready
      * to be used for one of the other functions in namespace <code>sap.ui.Device.media</code>.The most
      * important {@link sap.ui.Device.media.RANGESETS predefined range sets} are initialized
      * automatically.To make a not yet initialized {@link sap.ui.Device.media.RANGESETS predefined range
      * set} ready to be used, call this function with thename of the range set to be
      * :<pre>sap.ui.Device.media.initRangeSet(sap.ui.Device.media.RANGESETS.SAP_3STEPS);</pre>Alternatively
      * it is possible to define custom range sets as shown in the following
      * example:<pre>sap.ui.Device.media.initRangeSet("MyRangeSet", [200, 400], "px", ["Small", "Medium",
      * "Large"]);</pre>This example defines the following named ranges:<ul><li><code>"Small"</code>: For
      * screens smaller than 200 pixels.</li><li><code>"Medium"</code>: For screens greater than or equal to
      * 200 pixels and smaller than 400 pixels.</li><li><code>"Large"</code>: For screens greater than or
      * equal to 400 pixels.</li></ul>The range names are optional. If they are specified a CSS class (e.g.
      * <code>sapUiMedia-MyRangeSet-Small</code>) is alsoadded to the document root depending on the current
      * active range. This can be suppressed via parameter <code>bSuppressClasses</code>.
      * @param sName The name of the range set to be initialized - either a {@link
      * sap.ui.Device.media.RANGESETS predefined} or custom one.                  The name must be a valid
      * id and consist only of letters and numeric digits.
      * @param aRangeBorders The range borders
      * @param sUnit The unit which should be used for the values given in <code>aRangeBorders</code>.      
      *              The allowed values are <code>"px"</code> (default), <code>"em"</code> or
      * <code>"rem"</code>
      * @param aRangeNames The names of the ranges. The names must be a valid id and consist only of letters
      * and digits. If names            are specified, CSS classes are also added to the document root as
      * described above. This behavior can be            switched off explicitly by using
      * <code>bSuppressClasses</code>. <b>Note:</b> <code>aRangeBorders</code> with <code>n</code> entries  
      *          define <code>n+1</code> ranges. Therefore <code>n+1</code> names must be provided.
      * @param bSuppressClasses Whether or not writing of CSS classes to the document root should be
      * suppressed when            <code>aRangeNames</code> are provided
      */
    def initRangeSet(sName: String): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String]
    ): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(sName: String, aRangeBorders: js.UndefOr[scala.Nothing], sUnit: String): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: String,
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: String,
      aRangeNames: js.Array[String]
    ): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: String,
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(sName: String, aRangeBorders: Double): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String]
    ): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(sName: String, aRangeBorders: Double, sUnit: String): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: String,
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    def initRangeSet(sName: String, aRangeBorders: Double, sUnit: String, aRangeNames: js.Array[String]): Unit = js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: String,
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    
    /**
      * Removes a previously initialized range set and detaches all registered handlers.Only custom range
      * sets can be removed via this function. Initialized predefined range sets({@link
      * sap.ui.Device.media#RANGESETS}) cannot be removed.
      * @param sName The name of the range set which should be removed.
      */
    def removeRangeSet(sName: String): Unit = js.native
    
    @js.native
    object RANGESETS extends js.Object {
      
      /**
        * A 3-step range set (S-L).The ranges of this set are:<ul><li><code>"S"</code>: For screens smaller
        * than 520 pixels.</li><li><code>"M"</code>: For screens greater than or equal to 520 pixels and
        * smaller than 960 pixels.</li><li><code>"L"</code>: For screens greater than or equal to 960
        * pixels.</li></ul>To use this range set, you must initialize it explicitly ({@link
        * sap.ui.Device.media.html#initRangeSet}).If this range set is initialized, a CSS class is added to
        * the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-3Step-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      var SAP_3STEPS: js.Any = js.native
      
      /**
        * A 4-step range set (S-XL).The ranges of this set are:<ul><li><code>"S"</code>: For screens smaller
        * than 520 pixels.</li><li><code>"M"</code>: For screens greater than or equal to 520 pixels and
        * smaller than 760 pixels.</li><li><code>"L"</code>: For screens greater than or equal to 760 pixels
        * and smaller than 960 pixels.</li><li><code>"XL"</code>: For screens greater than or equal to 960
        * pixels.</li></ul>To use this range set, you must initialize it explicitly ({@link
        * sap.ui.Device.media.html#initRangeSet}).If this range set is initialized, a CSS class is added to
        * the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-4Step-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      var SAP_4STEPS: js.Any = js.native
      
      /**
        * A 6-step range set (XS-XXL).The ranges of this set are:<ul><li><code>"XS"</code>: For screens
        * smaller than 241 pixels.</li><li><code>"S"</code>: For screens greater than or equal to 241 pixels
        * and smaller than 400 pixels.</li><li><code>"M"</code>: For screens greater than or equal to 400
        * pixels and smaller than 541 pixels.</li><li><code>"L"</code>: For screens greater than or equal to
        * 541 pixels and smaller than 768 pixels.</li><li><code>"XL"</code>: For screens greater than or equal
        * to 768 pixels and smaller than 960 pixels.</li><li><code>"XXL"</code>: For screens greater than or
        * equal to 960 pixels.</li></ul>To use this range set, you must initialize it explicitly ({@link
        * sap.ui.Device.media.html#initRangeSet}).If this range set is initialized, a CSS class is added to
        * the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-6Step-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      var SAP_6STEPS: js.Any = js.native
      
      /**
        * A 3-step range set (Phone, Tablet, Desktop).The ranges of this set are:<ul><li><code>"Phone"</code>:
        * For screens smaller than 600 pixels.</li><li><code>"Tablet"</code>: For screens greater than or
        * equal to 600 pixels and smaller than 1024 pixels.</li><li><code>"Desktop"</code>: For screens
        * greater than or equal to 1024 pixels.</li></ul>This range set is initialized by default. An
        * initialization via {@link sap.ui.Device.media.html#initRangeSet} is not needed.A CSS class is added
        * to the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-Std-<i>NAME_OF_THE_INTERVAL</i></code>.Furthermore there are 5 additional CSS
        * classes to hide elements based on the width of the screen:<ul><li><code>sapUiHideOnPhone</code>:
        * Will be hidden if the screen has 600px or more</li><li><code>sapUiHideOnTablet</code>: Will be
        * hidden if the screen has less than 600px or more than
        * 1023px</li><li><code>sapUiHideOnDesktop</code>: Will be hidden if the screen is smaller than
        * 1024px</li><li><code>sapUiVisibleOnlyOnPhone</code>: Will be visible if the screen has less than
        * 600px</li><li><code>sapUiVisibleOnlyOnTablet</code>: Will be visible if the screen has 600px or more
        * but less than 1024px</li><li><code>sapUiVisibleOnlyOnDesktop</code>: Will be visible if the screen
        * has 1024px or more</li></ul>
        */
      var SAP_STANDARD: js.Any = js.native
      
      /**
        * A 4-step range set (Phone, Tablet, Desktop, LargeDesktop).The ranges of this set
        * are:<ul><li><code>"Phone"</code>: For screens smaller than 600
        * pixels.</li><li><code>"Tablet"</code>: For screens greater than or equal to 600 pixels and smaller
        * than 1024 pixels.</li><li><code>"Desktop"</code>: For screens greater than or equal to 1024 pixels
        * and smaller than 1440 pixels.</li><li><code>"LargeDesktop"</code>: For screens greater than or equal
        * to 1440 pixels.</li></ul>This range set is initialized by default. An initialization via {@link
        * sap.ui.Device.media.html#initRangeSet} is not needed.A CSS class is added to the page root
        * (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-StdExt-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      var SAP_STANDARD_EXTENDED: js.Any = js.native
    }
  }
  
  @js.native
  object orientation extends js.Object {
    
    /**
      * Registers the given event handler to orientation change events of the document's window.The event is
      * fired whenever the screen orientation changes and the width of the document's windowbecomes greater
      * than its height or the other way round.The event handler is called with a single argument: a map
      * <code>mParams</code> which provides the following
      * information:<ul><li><code>mParams.landscape</code>: If this flag is set to <code>true</code>, the
      * screen is currently in landscape mode, otherwise in portrait mode.</li></ul>
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * <code>window</code> instance. A map with information                      about the orientation is
      * provided as a single argument to the handler (see details above).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the <code>window</code>.
      */
    def attachHandler(fnFunction: js.Any): Unit = js.native
    def attachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * Removes a previously attached event handler from the orientation change events.The passed parameters
      * must match those used for registration with {@link #attachHandler} beforehand.
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      */
    def detachHandler(fnFunction: js.Any): Unit = js.native
    def detachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * If this flag is set to <code>true</code>, the screen is currently in landscape mode (the width is
      * greater than the height).
      */
    var landscape: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the screen is currently in portrait mode (the height is
      * greater than the width).
      */
    var portrait: Boolean = js.native
  }
  
  @js.native
  object os extends js.Object {
    
    /**
      * If this flag is set to <code>true</code>, an Android operating system is used.
      */
    var android: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, a Blackberry operating system is used.
      */
    var blackberry: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, an iOS operating system is used.
      */
    var ios: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, a Linux operating system is used.
      */
    var linux: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, a Mac operating system is used.
      */
    var macintosh: Boolean = js.native
    
    /**
      * The name of the operating system.
      */
    var name: String = js.native
    
    /**
      * The version of the operating system as <code>float</code>.Might be <code>-1</code> if no version can
      * be determined.
      */
    var version: Double = js.native
    
    /**
      * The version of the operating system as <code>string</code>.Might be empty if no version can be
      * determined.
      */
    var versionStr: String = js.native
    
    /**
      * If this flag is set to <code>true</code>, a Windows operating system is used.
      */
    var windows: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, a Windows Phone operating system is used.
      */
    @JSName("windows_phone")
    var windowsPhone: Boolean = js.native
    
    @js.native
    object OS extends js.Object {
      
      /**
        * Android operating system name.
        */
      var ANDROID: js.Any = js.native
      
      /**
        * Blackberry operating system name.
        */
      var BLACKBERRY: js.Any = js.native
      
      /**
        * iOS operating system name.
        */
      var IOS: js.Any = js.native
      
      /**
        * Linux operating system name.
        */
      var LINUX: js.Any = js.native
      
      /**
        * MAC operating system name.
        */
      var MACINTOSH: js.Any = js.native
      
      /**
        * Windows operating system name.
        */
      var WINDOWS: js.Any = js.native
      
      /**
        * Windows Phone operating system name.
        */
      var WINDOWS_PHONE: js.Any = js.native
    }
  }
  
  @js.native
  object resize extends js.Object {
    
    /**
      * Registers the given event handler to resize change events of the document's window.The event is
      * fired whenever the document's window size changes.The event handler is called with a single
      * argument: a map <code>mParams</code> which provides the following
      * information:<ul><li><code>mParams.height</code>: The height of the document's window in
      * pixels.</li><li><code>mParams.width</code>: The width of the document's window in pixels.</li></ul>
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * <code>window</code> instance. A map with information                      about the size is provided
      * as a single argument to the handler (see details above).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the <code>window</code>.
      */
    def attachHandler(fnFunction: js.Any): Unit = js.native
    def attachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * Removes a previously attached event handler from the resize events.The passed parameters must match
      * those used for registration with {@link #attachHandler} beforehand.
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      */
    def detachHandler(fnFunction: js.Any): Unit = js.native
    def detachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * The current height of the document's window in pixels.
      */
    var height: Double = js.native
    
    /**
      * The current width of the document's window in pixels.
      */
    var width: Double = js.native
  }
  
  @js.native
  object support extends js.Object {
    
    /**
      * If this flag is set to <code>true</code>, the used browser natively supports media queries via
      * JavaScript.<b>Note:</b> The {@link sap.ui.Device.media media queries API} of the device API can also
      * be used when there is no native support.
      */
    var matchmedia: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the used browser natively supports events of media queries
      * via JavaScript.<b>Note:</b> The {@link sap.ui.Device.media media queries API} of the device API can
      * also be used when there is no native support.
      */
    var matchmedialistener: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the used browser natively supports the
      * <code>orientationchange</code> event.<b>Note:</b> The {@link sap.ui.Device.orientation orientation
      * event} of the device API can also be used when there is no native support.
      */
    var orientation: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the used browser supports pointer events.
      */
    var pointer: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the device has a display with a high resolution.
      */
    var retina: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the used browser supports touch events.<b>Note:</b> This
      * flag indicates whether the used browser supports touch events or not.This does not necessarily mean
      * that the used device has a touchable screen.
      */
    var touch: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the used browser supports web sockets.
      */
    var websocket: Boolean = js.native
  }
  
  @js.native
  object system extends js.Object {
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a combination of a desktop
      * system and tablet.Furthermore, a CSS class <code>sap-combi</code> is added to the document root
      * element.<b>Note:</b> This property is mainly for Microsoft Windows 8 (and following) devices where
      * the mouse and touch event may be supportednatively by the browser being used. This property is set
      * to <code>true</code> only when both mouse and touch event are natively supported.
      */
    var combi: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a desktop system.Furthermore,
      * a CSS class <code>sap-desktop</code> is added to the document root element.
      */
    var desktop: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a phone.Furthermore, a CSS
      * class <code>sap-phone</code> is added to the document root element.
      */
    var phone: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a tablet.Furthermore, a CSS
      * class <code>sap-tablet</code> is added to the document root element.
      */
    var tablet: Boolean = js.native
  }
}
