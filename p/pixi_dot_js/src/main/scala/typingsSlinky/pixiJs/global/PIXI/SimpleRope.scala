package typingsSlinky.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rope allows you to draw a texture across several points and then manipulate these points
  *
  *```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * let rope = new PIXI.SimpleRope(PIXI.Texture.from("snake.png"), points);
  *  ```
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  *
  */
@JSGlobal("PIXI.SimpleRope")
@js.native
class SimpleRope protected ()
  extends typingsSlinky.pixiJs.PIXI.SimpleRope {
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, points: js.Array[typingsSlinky.pixiJs.PIXI.Point]) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    points: js.Array[typingsSlinky.pixiJs.PIXI.Point],
    textureScale: Double
  ) = this()
}
