package typingsSlinky.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The prepare manager provides functionality to upload content to the GPU.
  *
  * BasePrepare handles basic queuing functionality and is extended by
  * {@link PIXI.Prepare} and {@link PIXI.CanvasPrepare}
  * to provide preparation capabilities specific to their respective renderers.
  *
  * @example
  * // Create a sprite
  * const sprite = PIXI.Sprite.from('something.png');
  *
  * // Load object into GPU
  * app.renderer.plugins.prepare.upload(sprite, () => {
  *
  *     //Texture(s) has been uploaded to GPU
  *     app.stage.addChild(sprite);
  *
  * })
  *
  * @abstract
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "BasePrepare")
@js.native
class BasePrepare protected ()
  extends typingsSlinky.pixiJs.PIXI.BasePrepare {
  def this(renderer: typingsSlinky.pixiJs.PIXI.AbstractRenderer) = this()
}
