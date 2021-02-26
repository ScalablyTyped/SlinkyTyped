package typingsSlinky.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The prepare plugin provides renderer-specific plugins for pre-rendering DisplayObjects. These plugins are useful for
  * asynchronously preparing and uploading to the GPU assets, textures, graphics waiting to be displayed.
  *
  * Do not instantiate this plugin directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @example
  * // Create a new application
  * const app = new PIXI.Application();
  * document.body.appendChild(app.view);
  *
  * // Don't start rendering right away
  * app.stop();
  *
  * // create a display object
  * const rect = new PIXI.Graphics()
  *     .beginFill(0x00ff00)
  *     .drawRect(40, 40, 200, 200);
  *
  * // Add to the stage
  * app.stage.addChild(rect);
  *
  * // Don't start rendering until the graphic is uploaded to the GPU
  * app.renderer.plugins.prepare.upload(app.stage, () => {
  *     app.start();
  * });
  *
  * @class
  * @extends PIXI.BasePrepare
  * @memberof PIXI
  */
@JSImport("pixi.js", "Prepare")
@js.native
class Prepare protected ()
  extends typingsSlinky.pixiJs.PIXI.Prepare {
  def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
}
