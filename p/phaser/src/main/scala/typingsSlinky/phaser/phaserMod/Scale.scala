package typingsSlinky.phaser.phaserMod

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Scale")
@js.native
object Scale extends js.Object {
  
  /**
    * The game canvas is centered both horizontally and vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  val CENTER_BOTH: integer = js.native
  
  /**
    * The game canvas is centered horizontally within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  val CENTER_HORIZONTALLY: integer = js.native
  
  /**
    * The game canvas is centered both vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  val CENTER_VERTICALLY: integer = js.native
  
  /**
    * The width and height are automatically adjusted to make the size cover the entire target
    * area while keeping the aspect ratio. This may extend further out than the target size.
    */
  val ENVELOP: integer = js.native
  
  /**
    * The width and height are automatically adjusted to fit inside the given target area,
    * while keeping the aspect ratio. Depending on the aspect ratio there may be some space
    * inside the area which is not covered.
    */
  val FIT: integer = js.native
  
  /**
    * The width is automatically adjusted based on the height.
    */
  val HEIGHT_CONTROLS_WIDTH: integer = js.native
  
  /**
    * A landscape orientation.
    */
  val LANDSCAPE: String = js.native
  
  /**
    * Calculate the zoom value based on the maximum multiplied game size that will
    * fit into the parent, or browser window if no parent is set.
    */
  val MAX_ZOOM: integer = js.native
  
  /**
    * No scaling happens at all. The canvas is set to the size given in the game config and Phaser doesn't change it
    * again from that point on. If you change the canvas size, either via CSS, or directly via code, then you need
    * to call the Scale Managers `resize` method to give the new dimensions, or input events will stop working.
    */
  val NONE: integer = js.native
  
  /**
    * The game canvas is not centered within the parent by Phaser.
    * You can still center it yourself via CSS.
    */
  val NO_CENTER: integer = js.native
  
  /**
    * The game canvas will not be zoomed by Phaser.
    */
  val NO_ZOOM: integer = js.native
  
  /**
    * A portrait orientation.
    */
  val PORTRAIT: String = js.native
  
  /**
    * The Canvas is resized to fit all available _parent_ space, regardless of aspect ratio.
    */
  val RESIZE: integer = js.native
  
  /**
    * The height is automatically adjusted based on the width.
    */
  val WIDTH_CONTROLS_HEIGHT: integer = js.native
  
  /**
    * The game canvas will be 2x zoomed by Phaser.
    */
  val ZOOM_2X: integer = js.native
  
  /**
    * The game canvas will be 4x zoomed by Phaser.
    */
  val ZOOM_4X: integer = js.native
  
  /**
    * Phaser Scale Manager constants for centering the game canvas.
    */
  @js.native
  object Center extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.phaser.Phaser.Scale.Center with Double] = js.native
    
    /* 1 */ val CENTER_BOTH: typingsSlinky.phaser.Phaser.Scale.Center.CENTER_BOTH with Double = js.native
    
    /* 2 */ val CENTER_HORIZONTALLY: typingsSlinky.phaser.Phaser.Scale.Center.CENTER_HORIZONTALLY with Double = js.native
    
    /* 3 */ val CENTER_VERTICALLY: typingsSlinky.phaser.Phaser.Scale.Center.CENTER_VERTICALLY with Double = js.native
    
    /* 0 */ val NO_CENTER: typingsSlinky.phaser.Phaser.Scale.Center.NO_CENTER with Double = js.native
  }
  
  @js.native
  object Events extends js.Object {
    
    /**
      * The Scale Manager has successfully entered fullscreen mode.
      */
    val ENTER_FULLSCREEN: js.Any = js.native
    
    /**
      * The Scale Manager tried to enter fullscreen mode but failed.
      */
    val FULLSCREEN_FAILED: js.Any = js.native
    
    /**
      * The Scale Manager tried to enter fullscreen mode, but it is unsupported by the browser.
      */
    val FULLSCREEN_UNSUPPORTED: js.Any = js.native
    
    /**
      * The Scale Manager was in fullscreen mode, but has since left, either directly via game code,
      * or via a user gestured, such as pressing the ESC key.
      */
    val LEAVE_FULLSCREEN: js.Any = js.native
    
    /**
      * The Scale Manager Orientation Change Event.
      */
    val ORIENTATION_CHANGE: js.Any = js.native
    
    /**
      * The Scale Manager Resize Event.
      * 
      * This event is dispatched whenever the Scale Manager detects a resize event from the browser.
      * It sends three parameters to the callback, each of them being Size components. You can read
      * the `width`, `height`, `aspectRatio` and other properties of these components to help with
      * scaling your own game content.
      */
    val RESIZE: js.Any = js.native
  }
  
  /**
    * Phaser Scale Manager constants for orientation.
    */
  @js.native
  object Orientation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.phaser.Phaser.Scale.Orientation with Double] = js.native
    
    /* 0 */ val LANDSCAPE: typingsSlinky.phaser.Phaser.Scale.Orientation.LANDSCAPE with Double = js.native
    
    /* 1 */ val PORTRAIT: typingsSlinky.phaser.Phaser.Scale.Orientation.PORTRAIT with Double = js.native
  }
  
  /**
    * The Scale Manager handles the scaling, resizing and alignment of the game canvas.
    * 
    * The way scaling is handled is by setting the game canvas to a fixed size, which is defined in the
    * game configuration. You also define the parent container in the game config. If no parent is given,
    * it will default to using the document body. The Scale Manager will then look at the available space
    * within the _parent_ and scale the canvas accordingly. Scaling is handled by setting the canvas CSS
    * width and height properties, leaving the width and height of the canvas element itself untouched.
    * Scaling is therefore achieved by keeping the core canvas the same size and 'stretching'
    * it via its CSS properties. This gives the same result and speed as using the `transform-scale` CSS
    * property, without the need for browser prefix handling.
    * 
    * The calculations for the scale are heavily influenced by the bounding parent size, which is the computed
    * dimensions of the canvas's parent. The CSS rules of the parent element play an important role in the
    * operation of the Scale Manager. For example, if the parent has no defined width or height, then actions
    * like auto-centering will fail to achieve the required result. The Scale Manager works in tandem with the
    * CSS you set-up on the page hosting your game, rather than taking control of it.
    * 
    * #### Parent and Display canvas containment guidelines:
    * 
    * - Style the Parent element (of the game canvas) to control the Parent size and thus the games size and layout.
    * 
    * - The Parent element's CSS styles should _effectively_ apply maximum (and minimum) bounding behavior.
    * 
    * - The Parent element should _not_ apply a padding as this is not accounted for.
    *   If a padding is required apply it to the Parent's parent or apply a margin to the Parent.
    *   If you need to add a border, margin or any other CSS around your game container, then use a parent element and
    *   apply the CSS to this instead, otherwise you'll be constantly resizing the shape of the game container.
    * 
    * - The Display canvas layout CSS styles (i.e. margins, size) should not be altered / specified as
    *   they may be updated by the Scale Manager.
    * 
    * #### Scale Modes
    * 
    * The way the scaling is handled is determined by the `scaleMode` property. The default is `NONE`,
    * which prevents Phaser from scaling or touching the canvas, or its parent, at all. In this mode, you are
    * responsible for all scaling. The other scaling modes afford you automatic scaling.
    * 
    * If you wish to scale your game so that it always fits into the available space within the parent, you
    * should use the scale mode `FIT`. Look at the documentation for other scale modes to see what options are
    * available. Here is a basic config showing how to set this scale mode:
    * 
    * ```javascript
    * scale: {
    *     parent: 'yourgamediv',
    *     mode: Phaser.Scale.FIT,
    *     width: 800,
    *     height: 600
    * }
    * ```
    * 
    * Place the `scale` config object within your game config.
    * 
    * If you wish for the canvas to be resized directly, so that the canvas itself fills the available space
    * (i.e. it isn't scaled, it's resized) then use the `RESIZE` scale mode. This will give you a 1:1 mapping
    * of canvas pixels to game size. In this mode CSS isn't used to scale the canvas, it's literally adjusted
    * to fill all available space within the parent. You should be extremely careful about the size of the
    * canvas you're creating when doing this, as the larger the area, the more work the GPU has to do and it's
    * very easy to hit fill-rate limits quickly.
    * 
    * For complex, custom-scaling requirements, you should probably consider using the `RESIZE` scale mode,
    * with your own limitations in place re: canvas dimensions and managing the scaling with the game scenes
    * yourself. For the vast majority of games, however, the `FIT` mode is likely to be the most used.
    * 
    * Please appreciate that the Scale Manager cannot perform miracles. All it does is scale your game canvas
    * as best it can, based on what it can infer from its surrounding area. There are all kinds of environments
    * where it's up to you to guide and help the canvas position itself, especially when built into rendering
    * frameworks like React and Vue. If your page requires meta tags to prevent user scaling gestures, or such
    * like, then it's up to you to ensure they are present in the html.
    * 
    * #### Centering
    * 
    * You can also have the game canvas automatically centered. Again, this relies heavily on the parent being
    * properly configured and styled, as the centering offsets are based entirely on the available space
    * within the parent element. Centering is disabled by default, or can be applied horizontally, vertically,
    * or both. Here's an example:
    * 
    * ```javascript
    * scale: {
    *     parent: 'yourgamediv',
    *     autoCenter: Phaser.Scale.CENTER_BOTH,
    *     width: 800,
    *     height: 600
    * }
    * ```
    * 
    * #### Fullscreen API
    * 
    * If the browser supports it, you can send your game into fullscreen mode. In this mode, the game will fill
    * the entire display, removing all browser UI and anything else present on the screen. It will remain in this
    * mode until your game either disables it, or until the user tabs out or presses ESCape if on desktop. It's a
    * great way to achieve a desktop-game like experience from the browser, but it does require a modern browser
    * to handle it. Some mobile browsers also support this.
    */
  @js.native
  class ScaleManager protected ()
    extends typingsSlinky.phaser.Phaser.Scale.ScaleManager {
    /**
      * 
      * @param game A reference to the Phaser.Game instance.
      */
    def this(game: typingsSlinky.phaser.Phaser.Game) = this()
  }
  
  /**
    * Phaser Scale Manager constants for the different scale modes available.
    */
  @js.native
  object ScaleModes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.phaser.Phaser.Scale.ScaleModes with Double] = js.native
    
    /* 4 */ val ENVELOP: typingsSlinky.phaser.Phaser.Scale.ScaleModes.ENVELOP with Double = js.native
    
    /* 3 */ val FIT: typingsSlinky.phaser.Phaser.Scale.ScaleModes.FIT with Double = js.native
    
    /* 2 */ val HEIGHT_CONTROLS_WIDTH: typingsSlinky.phaser.Phaser.Scale.ScaleModes.HEIGHT_CONTROLS_WIDTH with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.phaser.Phaser.Scale.ScaleModes.NONE with Double = js.native
    
    /* 5 */ val RESIZE: typingsSlinky.phaser.Phaser.Scale.ScaleModes.RESIZE with Double = js.native
    
    /* 1 */ val WIDTH_CONTROLS_HEIGHT: typingsSlinky.phaser.Phaser.Scale.ScaleModes.WIDTH_CONTROLS_HEIGHT with Double = js.native
  }
  
  /**
    * Phaser Scale Manager constants for zoom modes.
    */
  @js.native
  object Zoom extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.phaser.Phaser.Scale.Zoom with Double] = js.native
    
    /* 3 */ val MAX_ZOOM: typingsSlinky.phaser.Phaser.Scale.Zoom.MAX_ZOOM with Double = js.native
    
    /* 0 */ val NO_ZOOM: typingsSlinky.phaser.Phaser.Scale.Zoom.NO_ZOOM with Double = js.native
    
    /* 1 */ val ZOOM_2X: typingsSlinky.phaser.Phaser.Scale.Zoom.ZOOM_2X with Double = js.native
    
    /* 2 */ val ZOOM_4X: typingsSlinky.phaser.Phaser.Scale.Zoom.ZOOM_4X with Double = js.native
  }
}
