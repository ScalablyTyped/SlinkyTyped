package typingsSlinky.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The NineSlicePlane allows you to stretch a texture using 9-slice scaling. The corners will remain unscaled (useful
  * for buttons with rounded corners for example) and the other areas will be scaled horizontally and or vertically
  *
  *```js
  * let Plane9 = new PIXI.NineSlicePlane(PIXI.Texture.from('BoxWithRoundedCorners.png'), 15, 15, 15, 15);
  *  ```
  * <pre>
  *      A                          B
  *    +---+----------------------+---+
  *  C | 1 |          2           | 3 |
  *    +---+----------------------+---+
  *    |   |                      |   |
  *    | 4 |          5           | 6 |
  *    |   |                      |   |
  *    +---+----------------------+---+
  *  D | 7 |          8           | 9 |
  *    +---+----------------------+---+
  
  *  When changing this objects width and/or height:
  *     areas 1 3 7 and 9 will remain unscaled.
  *     areas 2 and 8 will be stretched horizontally
  *     areas 4 and 6 will be stretched vertically
  *     area 5 will be stretched both horizontally and vertically
  * </pre>
  *
  * @class
  * @extends PIXI.SimplePlane
  * @memberof PIXI
  *
  */
@JSImport("pixi.js", "NineSlicePlane")
@js.native
class NineSlicePlane protected ()
  extends typingsSlinky.pixiJs.PIXI.NineSlicePlane {
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture) = this()
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, leftWidth: Double) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: Double
  ) = this()
  def this(texture: typingsSlinky.pixiJs.PIXI.Texture, leftWidth: Double, topHeight: Double) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: js.UndefOr[scala.Nothing],
    rightWidth: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: Double,
    rightWidth: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: Double,
    topHeight: js.UndefOr[scala.Nothing],
    rightWidth: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: Double,
    topHeight: Double,
    rightWidth: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: js.UndefOr[scala.Nothing],
    rightWidth: js.UndefOr[scala.Nothing],
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: js.UndefOr[scala.Nothing],
    rightWidth: Double,
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: Double,
    rightWidth: js.UndefOr[scala.Nothing],
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: js.UndefOr[scala.Nothing],
    topHeight: Double,
    rightWidth: Double,
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: Double,
    topHeight: js.UndefOr[scala.Nothing],
    rightWidth: js.UndefOr[scala.Nothing],
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: Double,
    topHeight: js.UndefOr[scala.Nothing],
    rightWidth: Double,
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: Double,
    topHeight: Double,
    rightWidth: js.UndefOr[scala.Nothing],
    bottomHeight: Double
  ) = this()
  def this(
    texture: typingsSlinky.pixiJs.PIXI.Texture,
    leftWidth: Double,
    topHeight: Double,
    rightWidth: Double,
    bottomHeight: Double
  ) = this()
}
