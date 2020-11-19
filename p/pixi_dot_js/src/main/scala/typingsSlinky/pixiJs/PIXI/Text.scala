package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Object will create a line or multiple lines of text.
  *
  * The text is created using the [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API).
  *
  * The primary advantage of this class over BitmapText is that you have great control over the style of the next,
  * which you can change at runtime.
  *
  * The primary disadvantages is that each piece of text has it's own texture, which can use more memory.
  * When text changes, this texture has to be re-generated and re-uploaded to the GPU, taking up time.
  *
  * To split a line you can use '\n' in your text string, or, on the `style` object,
  * change its `wordWrap` property to true and and give the `wordWrapWidth` property a value.
  *
  * A Text can be created directly from a string and a style object,
  * which can be generated [here](https://pixijs.io/pixi-text-style).
  *
  * ```js
  * let text = new PIXI.Text('This is a PixiJS text',{fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'});
  * ```
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@js.native
trait Text extends Sprite {
  
  /**
    * The resolution / device pixel ratio of the canvas.
    * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
    * @member {number} PIXI.Text#_resolution
    * @default 1
    */
  var _resolution: Double = js.native
  
  /**
    * The canvas element that everything is drawn to
    *
    * @member {HTMLCanvasElement} PIXI.Text#canvas
    */
  var canvas: HTMLCanvasElement = js.native
  
  /**
    * The canvas 2d context that everything is drawn with
    * @member {CanvasRenderingContext2D} PIXI.Text#context
    */
  var context: CanvasRenderingContext2D = js.native
  
  /**
    * The resolution / device pixel ratio of the canvas.
    * This is set to automatically match the renderer resolution by default, but can be overridden by setting manually.
    * @member {number}
    * @default 1
    */
  var resolution: Double = js.native
  
  /**
    * Set the style of the text. Set up an event listener to listen for changes on the style
    * object and mark the text as dirty.
    *
    * @member {object|PIXI.TextStyle}
    */
  var style: js.Any | TextStyle = js.native
  
  /**
    * Set the copy for the text object. To split a line you can use '\n'.
    *
    * @member {string}
    */
  var text: String = js.native
  
  /**
    * Renders text to its canvas, and updates its texture.
    * By default this is used internally to ensure the texture is correct before rendering,
    * but it can be used called externally, for example from this class to 'pre-generate' the texture from a piece of text,
    * and then shared across multiple Sprites.
    *
    * @param {boolean} respectDirty - Whether to abort updating the text if the Text isn't dirty and the function is called.
    */
  def updateText(respectDirty: Boolean): Unit = js.native
}
