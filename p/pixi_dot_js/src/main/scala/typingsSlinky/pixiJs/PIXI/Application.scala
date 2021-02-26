package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convenience class to create a new PIXI application.
  *
  * This class automatically creates the renderer, ticker and root container.
  *
  * @example
  * // Create the application
  * const app = new PIXI.Application();
  *
  * // Add the view to the DOM
  * document.body.appendChild(app.view);
  *
  * // ex, add display objects
  * app.stage.addChild(PIXI.Sprite.from('something.png'));
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Application extends StObject {
  
  /**
    * Destroy and don't use after this.
    * @param {Boolean} [removeView=false] - Automatically remove canvas from DOM.
    * @param {object|boolean} [stageOptions] - Options parameter. A boolean will act as if all options
    *  have been set to that value
    * @param {boolean} [stageOptions.children=false] - if set to true, all the children will have their destroy
    *  method called as well. 'stageOptions' will be passed on to those calls.
    * @param {boolean} [stageOptions.texture=false] - Only used for child Sprites if stageOptions.children is set
    *  to true. Should it destroy the texture of the child sprite
    * @param {boolean} [stageOptions.baseTexture=false] - Only used for child Sprites if stageOptions.children is set
    *  to true. Should it destroy the base texture of the child sprite
    */
  def destroy(): Unit = js.native
  def destroy(removeView: js.UndefOr[scala.Nothing], stageOptions: typingsSlinky.pixiJs.anon.BaseTexture): Unit = js.native
  def destroy(removeView: Boolean): Unit = js.native
  def destroy(removeView: Boolean, stageOptions: typingsSlinky.pixiJs.anon.BaseTexture): Unit = js.native
  
  /**
    * Loader instance to help with asset loading.
    * @name PIXI.Application#loader
    * @type {PIXI.Loader}
    * @readonly
    */
  val loader: Loader = js.native
  
  /**
    * Resize is throttled, so it's
    * safe to call this multiple times per frame and it'll
    * only be called once.
    * @method PIXI.Application#queueResize
    */
  def queueResize(): Unit = js.native
  
  /**
    * Render the current stage.
    */
  def render(): Unit = js.native
  
  /**
    * WebGL renderer if available, otherwise CanvasRenderer.
    * @member {PIXI.Renderer|PIXI.CanvasRenderer} PIXI.Application#renderer
    */
  var renderer: Renderer = js.native
  
  /**
    * Execute an immediate resize on the renderer, this is not
    * throttled and can be expensive to call many times in a row.
    * Will resize only if `resizeTo` property is set.
    * @method PIXI.Application#resize
    */
  def resize(): Unit = js.native
  
  /**
    * The HTML element or window to automatically resize the
    * renderer's view element to match width and height.
    * @type {Window|HTMLElement}
    * @name resizeTo
    * @memberof PIXI.Application#
    */
  var resizeTo: Window | HTMLElement = js.native
  
  /**
    * Reference to the renderer's screen rectangle. Its safe to use as `filterArea` or `hitArea` for the whole screen.
    * @member {PIXI.Rectangle}
    * @readonly
    */
  val screen: Rectangle = js.native
  
  /**
    * The root display container that's rendered.
    * @member {PIXI.Container} PIXI.Application#stage
    */
  var stage: Container = js.native
  
  /**
    * Convenience method for starting the render.
    *
    * @method PIXI.Application#start
    */
  def start(): Unit = js.native
  
  /**
    * Convenience method for stopping the render.
    *
    * @method PIXI.Application#stop
    */
  def stop(): Unit = js.native
  
  /**
    * Ticker for doing render updates.
    *
    * @type {PIXI.Ticker}
    * @name ticker
    * @memberof PIXI.Application#
    * @default PIXI.Ticker.shared
    */
  var ticker: Ticker = js.native
  
  /**
    * Reference to the renderer's canvas element.
    * @member {HTMLCanvasElement}
    * @readonly
    */
  val view: HTMLCanvasElement = js.native
}
object Application {
  
  /**
    * @memberof PIXI.Application
    * @typedef {object} Plugin
    * @property {function} init - Called when Application is constructed, scoped to Application instance.
    *  Passes in `options` as the only argument, which are Application constructor options.
    * @property {function} destroy - Called when destroying Application, scoped to Application instance
    */
  @js.native
  trait Plugin extends StObject {
    
    def destroy(params: js.Any*): js.Any = js.native
    
    def init(params: js.Any*): js.Any = js.native
  }
  object Plugin {
    
    @scala.inline
    def apply(destroy: /* repeated */ js.Any => js.Any, init: /* repeated */ js.Any => js.Any): Plugin = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInit(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}
