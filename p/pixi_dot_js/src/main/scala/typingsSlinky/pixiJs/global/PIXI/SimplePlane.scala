package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SimplePlane allows you to draw a texture across several points and then manipulate these points
  *
  *```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * let SimplePlane = new PIXI.SimplePlane(PIXI.Texture.from("snake.png"), points);
  *  ```
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  *
  */
@JSGlobal("PIXI.SimplePlane")
@js.native
class SimplePlane protected ()
  extends typingsSlinky.pixiJs.PIXI.SimplePlane {
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, verticesX: Double, verticesY: Double) = this()
}
