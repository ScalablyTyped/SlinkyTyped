package typingsSlinky.phaser.Phaser.Core

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.Phaser.Display.Color
import typingsSlinky.phaser.Phaser.Game
import typingsSlinky.phaser.Phaser.Scale.CenterType
import typingsSlinky.phaser.Phaser.Scale.ScaleModeType
import typingsSlinky.phaser.Phaser.Scale.ZoomType
import typingsSlinky.phaser.Phaser.Types.Core.AudioConfig
import typingsSlinky.phaser.Phaser.Types.Core.FPSConfig
import typingsSlinky.phaser.Phaser.Types.Core.PhysicsConfig
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
  */
@js.native
trait Config extends js.Object {
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  val antialias: Boolean = js.native
  /**
    * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
    */
  val antialiasGL: Boolean = js.native
  /**
    * The Audio Configuration object.
    */
  val audio: AudioConfig = js.native
  /**
    * Automatically center the canvas within the parent?
    */
  val autoCenter: CenterType = js.native
  /**
    * If `true` the window will automatically be given focus immediately and on any future mousedown event.
    */
  val autoFocus: Boolean = js.native
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  val autoRound: integer = js.native
  /**
    * The background color of the game canvas. The default is black. This value is ignored if `transparent` is set to `true`.
    */
  val backgroundColor: Color = js.native
  /**
    * The background colors of the banner.
    */
  val bannerBackgroundColor: js.Array[String] = js.native
  /**
    * The color of the banner text.
    */
  val bannerTextColor: String = js.native
  /**
    * The default WebGL Batch size.
    */
  val batchSize: integer = js.native
  /**
    * Force Phaser to use your own Canvas element instead of creating one.
    */
  val canvas: HTMLCanvasElement = js.native
  /**
    * Optional CSS attributes to be set on the canvas object created by the renderer.
    */
  val canvasStyle: String = js.native
  /**
    * Whether the game canvas will be cleared between each rendering frame. You can disable this if you have a full-screen background image or game object.
    */
  val clearBeforeRender: Boolean = js.native
  /**
    * Force Phaser to use your own Canvas context instead of creating one.
    */
  val context: CanvasRenderingContext2D | WebGLRenderingContext = js.native
  /**
    * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
    */
  val customEnvironment: Boolean = js.native
  /**
    * A base64 encoded PNG that will be used as the default blank texture.
    */
  val defaultImage: String = js.native
  /**
    * The default physics system. It will be started for each scene. Either 'arcade', 'impact' or 'matter'.
    */
  val defaultPhysicsSystem: Boolean | String = js.native
  /**
    * The plugins installed into every Scene (in addition to CoreScene and Global).
    */
  val defaultPlugins: js.Any = js.native
  /**
    * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
    */
  val desynchronized: Boolean = js.native
  /**
    * Set to `true` to disable the right-click context menu.
    */
  val disableContextMenu: Boolean = js.native
  /**
    * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
    */
  val domBehindCanvas: Boolean = js.native
  /**
    * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
    */
  val domCreateContainer: Boolean = js.native
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent to be 100%?
    */
  val expandParent: Boolean = js.native
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  val failIfMajorPerformanceCaveat: Boolean = js.native
  /**
    * The Frame Rate Configuration object, as parsed by the Timestep class.
    */
  val fps: FPSConfig = js.native
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  val fullscreenTarget: HTMLElement | String = js.native
  /**
    * The title of the game.
    */
  val gameTitle: String = js.native
  /**
    * The URL of the game.
    */
  val gameURL: String = js.native
  /**
    * The version of the game.
    */
  val gameVersion: String = js.native
  /**
    * The height of the underlying canvas, in pixels.
    */
  val height: integer | String = js.native
  /**
    * Don't write the banner line to the console.log.
    */
  val hideBanner: Boolean = js.native
  /**
    * Omit Phaser's name and version from the banner.
    */
  val hidePhaser: Boolean = js.native
  /**
    * The number of Pointer objects created by default. In a mouse-only, or non-multi touch game, you can leave this as 1.
    */
  val inputActivePointers: integer = js.native
  /**
    * Enable the Gamepad Plugin. This can be disabled in games that don't need gamepad input.
    */
  val inputGamepad: Boolean = js.native
  /**
    * The DOM Target to listen for gamepad events on. Defaults to `window` if not specified.
    */
  val inputGamepadEventTarget: js.Any = js.native
  /**
    * Enable the Keyboard Plugin. This can be disabled in games that don't need keyboard input.
    */
  val inputKeyboard: Boolean = js.native
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default, it is empty.
    */
  val inputKeyboardCapture: js.Array[integer] = js.native
  /**
    * The DOM Target to listen for keyboard events on. Defaults to `window` if not specified.
    */
  val inputKeyboardEventTarget: js.Any = js.native
  /**
    * Enable the Mouse Plugin. This can be disabled in games that don't need mouse input.
    */
  val inputMouse: Boolean | js.Object = js.native
  /**
    * Should mouse events be captured? I.e. have prevent default called on them.
    */
  val inputMouseCapture: Boolean = js.native
  /**
    * The DOM Target to listen for mouse events on. Defaults to the game canvas if not specified.
    */
  val inputMouseEventTarget: js.Any = js.native
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  val inputSmoothFactor: integer = js.native
  /**
    * Enable the Touch Plugin. This can be disabled in games that don't need touch input.
    */
  val inputTouch: Boolean = js.native
  /**
    * Should touch events be captured? I.e. have prevent default called on them.
    */
  val inputTouchCapture: Boolean = js.native
  /**
    * The DOM Target to listen for touch events on. Defaults to the game canvas if not specified.
    */
  val inputTouchEventTarget: js.Any = js.native
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  val inputWindowEvents: Boolean = js.native
  /**
    * An array of global plugins to be installed.
    */
  val installGlobalPlugins: js.Any = js.native
  /**
    * An array of Scene level plugins to be installed.
    */
  val installScenePlugins: js.Any = js.native
  /**
    * Should the XHR request use async or not?
    */
  val loaderAsync: Boolean = js.native
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  val loaderBaseURL: String = js.native
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  val loaderCrossOrigin: js.UndefOr[String] = js.native
  /**
    * Maximum parallel downloads allowed for resources (Default to 32).
    */
  val loaderMaxParallelDownloads: integer = js.native
  /**
    * Optional password for all XHR requests.
    */
  val loaderPassword: String = js.native
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  val loaderPath: String = js.native
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  val loaderResponseType: String = js.native
  /**
    * Optional XHR timeout value, in ms.
    */
  val loaderTimeout: integer = js.native
  /**
    * Optional username for all XHR requests.
    */
  val loaderUser: String = js.native
  /**
    * The maximum height, in pixels, the canvas will scale up to. A value of zero means no maximum.
    */
  val maxHeight: integer = js.native
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  val maxLights: integer = js.native
  /**
    * The maximum width, in pixels, the canvas will scale up to. A value of zero means no maximum.
    */
  val maxWidth: integer = js.native
  /**
    * The minimum height, in pixels, the canvas will scale down to. A value of zero means no minimum.
    */
  val minHeight: integer = js.native
  /**
    * The minimum width, in pixels, the canvas will scale down to. A value of zero means no minimum.
    */
  val minWidth: integer = js.native
  /**
    * Sets the `mipmapFilter` property when the WebGL renderer is created.
    */
  val mipmapFilter: String = js.native
  /**
    * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is missing or not loaded.
    */
  val missingImage: String = js.native
  /**
    * A parent DOM element into which the canvas created by the renderer will be injected.
    */
  val parent: js.Any = js.native
  /**
    * The Physics Configuration object.
    */
  val physics: PhysicsConfig = js.native
  /**
    * Prevent pixel art from becoming blurred when scaled. It will remain crisp (tells the WebGL renderer to automatically create textures using a linear filter mode).
    */
  val pixelArt: Boolean = js.native
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  val powerPreference: String = js.native
  /**
    * In WebGL mode, sets the drawing buffer to contain colors with pre-multiplied alpha.
    */
  val premultipliedAlpha: Boolean = js.native
  /**
    * Force Phaser to use a specific renderer. Can be `CONST.CANVAS`, `CONST.WEBGL`, `CONST.HEADLESS` or `CONST.AUTO` (default)
    */
  val renderType: Double = js.native
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  val resizeInterval: integer = js.native
  /**
    * The canvas device pixel resolution. Currently un-used.
    */
  val resolution: Double = js.native
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  val roundPixels: Boolean = js.native
  /**
    * The scale mode as used by the Scale Manager. The default is zero, which is no scaling.
    */
  val scaleMode: ScaleModeType = js.native
  /**
    * The default Scene configuration object.
    */
  val sceneConfig: js.Object = js.native
  /**
    * A seed which the Random Data Generator will use. If not given, a dynamic seed based on the time is used.
    */
  val seed: js.Array[String] = js.native
  /**
    * Whether the game canvas will have a transparent background.
    */
  val transparent: Boolean = js.native
  /**
    * The width of the underlying canvas, in pixels.
    */
  val width: integer | String = js.native
  /**
    * The zoom factor, as used by the Scale Manager.
    */
  val zoom: ZoomType | integer = js.native
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  def postBoot(game: Game): Unit = js.native
  /**
    * Called before Phaser boots. Useful for initializing anything not related to Phaser that Phaser may require while booting.
    */
  def preBoot(game: Game): Unit = js.native
}

object Config {
  @scala.inline
  def apply(
    antialias: Boolean,
    antialiasGL: Boolean,
    audio: AudioConfig,
    autoCenter: CenterType,
    autoFocus: Boolean,
    autoRound: integer,
    backgroundColor: Color,
    bannerBackgroundColor: js.Array[String],
    bannerTextColor: String,
    batchSize: integer,
    canvas: HTMLCanvasElement,
    canvasStyle: String,
    clearBeforeRender: Boolean,
    context: CanvasRenderingContext2D | WebGLRenderingContext,
    customEnvironment: Boolean,
    defaultImage: String,
    defaultPhysicsSystem: Boolean | String,
    defaultPlugins: js.Any,
    desynchronized: Boolean,
    disableContextMenu: Boolean,
    domBehindCanvas: Boolean,
    domCreateContainer: Boolean,
    expandParent: Boolean,
    failIfMajorPerformanceCaveat: Boolean,
    fps: FPSConfig,
    fullscreenTarget: HTMLElement | String,
    gameTitle: String,
    gameURL: String,
    gameVersion: String,
    height: integer | String,
    hideBanner: Boolean,
    hidePhaser: Boolean,
    inputActivePointers: integer,
    inputGamepad: Boolean,
    inputGamepadEventTarget: js.Any,
    inputKeyboard: Boolean,
    inputKeyboardCapture: js.Array[integer],
    inputKeyboardEventTarget: js.Any,
    inputMouse: Boolean | js.Object,
    inputMouseCapture: Boolean,
    inputMouseEventTarget: js.Any,
    inputSmoothFactor: integer,
    inputTouch: Boolean,
    inputTouchCapture: Boolean,
    inputTouchEventTarget: js.Any,
    inputWindowEvents: Boolean,
    installGlobalPlugins: js.Any,
    installScenePlugins: js.Any,
    loaderAsync: Boolean,
    loaderBaseURL: String,
    loaderMaxParallelDownloads: integer,
    loaderPassword: String,
    loaderPath: String,
    loaderResponseType: String,
    loaderTimeout: integer,
    loaderUser: String,
    maxHeight: integer,
    maxLights: integer,
    maxWidth: integer,
    minHeight: integer,
    minWidth: integer,
    mipmapFilter: String,
    missingImage: String,
    parent: js.Any,
    physics: PhysicsConfig,
    pixelArt: Boolean,
    postBoot: Game => Unit,
    powerPreference: String,
    preBoot: Game => Unit,
    premultipliedAlpha: Boolean,
    renderType: Double,
    resizeInterval: integer,
    resolution: Double,
    roundPixels: Boolean,
    scaleMode: ScaleModeType,
    sceneConfig: js.Object,
    seed: js.Array[String],
    transparent: Boolean,
    width: integer | String,
    zoom: ZoomType | integer
  ): Config = {
    val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], antialiasGL = antialiasGL.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], autoCenter = autoCenter.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], autoRound = autoRound.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bannerBackgroundColor = bannerBackgroundColor.asInstanceOf[js.Any], bannerTextColor = bannerTextColor.asInstanceOf[js.Any], batchSize = batchSize.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], canvasStyle = canvasStyle.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], customEnvironment = customEnvironment.asInstanceOf[js.Any], defaultImage = defaultImage.asInstanceOf[js.Any], defaultPhysicsSystem = defaultPhysicsSystem.asInstanceOf[js.Any], defaultPlugins = defaultPlugins.asInstanceOf[js.Any], desynchronized = desynchronized.asInstanceOf[js.Any], disableContextMenu = disableContextMenu.asInstanceOf[js.Any], domBehindCanvas = domBehindCanvas.asInstanceOf[js.Any], domCreateContainer = domCreateContainer.asInstanceOf[js.Any], expandParent = expandParent.asInstanceOf[js.Any], failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], fullscreenTarget = fullscreenTarget.asInstanceOf[js.Any], gameTitle = gameTitle.asInstanceOf[js.Any], gameURL = gameURL.asInstanceOf[js.Any], gameVersion = gameVersion.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideBanner = hideBanner.asInstanceOf[js.Any], hidePhaser = hidePhaser.asInstanceOf[js.Any], inputActivePointers = inputActivePointers.asInstanceOf[js.Any], inputGamepad = inputGamepad.asInstanceOf[js.Any], inputGamepadEventTarget = inputGamepadEventTarget.asInstanceOf[js.Any], inputKeyboard = inputKeyboard.asInstanceOf[js.Any], inputKeyboardCapture = inputKeyboardCapture.asInstanceOf[js.Any], inputKeyboardEventTarget = inputKeyboardEventTarget.asInstanceOf[js.Any], inputMouse = inputMouse.asInstanceOf[js.Any], inputMouseCapture = inputMouseCapture.asInstanceOf[js.Any], inputMouseEventTarget = inputMouseEventTarget.asInstanceOf[js.Any], inputSmoothFactor = inputSmoothFactor.asInstanceOf[js.Any], inputTouch = inputTouch.asInstanceOf[js.Any], inputTouchCapture = inputTouchCapture.asInstanceOf[js.Any], inputTouchEventTarget = inputTouchEventTarget.asInstanceOf[js.Any], inputWindowEvents = inputWindowEvents.asInstanceOf[js.Any], installGlobalPlugins = installGlobalPlugins.asInstanceOf[js.Any], installScenePlugins = installScenePlugins.asInstanceOf[js.Any], loaderAsync = loaderAsync.asInstanceOf[js.Any], loaderBaseURL = loaderBaseURL.asInstanceOf[js.Any], loaderMaxParallelDownloads = loaderMaxParallelDownloads.asInstanceOf[js.Any], loaderPassword = loaderPassword.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], loaderResponseType = loaderResponseType.asInstanceOf[js.Any], loaderTimeout = loaderTimeout.asInstanceOf[js.Any], loaderUser = loaderUser.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxLights = maxLights.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], mipmapFilter = mipmapFilter.asInstanceOf[js.Any], missingImage = missingImage.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], pixelArt = pixelArt.asInstanceOf[js.Any], postBoot = js.Any.fromFunction1(postBoot), powerPreference = powerPreference.asInstanceOf[js.Any], preBoot = js.Any.fromFunction1(preBoot), premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], renderType = renderType.asInstanceOf[js.Any], resizeInterval = resizeInterval.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], sceneConfig = sceneConfig.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAntialiasGL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasGL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: AudioConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCenter(value: CenterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRound(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerBackgroundColor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBannerTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvasStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearBeforeRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextWebGLRenderingContext(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextCanvasRenderingContext2D(value: CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: CanvasRenderingContext2D | WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomEnvironment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPhysicsSystem(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPhysicsSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesynchronized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desynchronized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomBehindCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domBehindCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomCreateContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domCreateContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailIfMajorPerformanceCaveat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFps(value: FPSConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenTarget(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideBanner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBanner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidePhaser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePhaser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputActivePointers(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputActivePointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputGamepad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputGamepad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputGamepadEventTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputGamepadEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputKeyboardCapture(value: js.Array[integer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputKeyboardCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputKeyboardEventTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputKeyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMouse(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMouseCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMouseCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMouseEventTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMouseEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSmoothFactor(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSmoothFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTouchCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTouchCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTouchEventTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTouchEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputWindowEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWindowEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallGlobalPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installGlobalPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallScenePlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installScenePlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderBaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderBaseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderMaxParallelDownloads(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderMaxParallelDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderResponseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderTimeout(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLights(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMipmapFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmapFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysics(value: PhysicsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelArt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostBoot(value: Game => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPowerPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreBoot(value: Game => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preBoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPremultipliedAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeInterval(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleMode(value: ScaleModeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSceneConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: integer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: ZoomType | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderCrossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaderCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderCrossOrigin")(js.undefined)
        ret
    }
  }
  
}

