package typingsSlinky.box2d.global.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Mat22
import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2OBB")
@js.native
class b2OBB ()
  extends typingsSlinky.box2d.Box2D.Collision.b2OBB {
  /**
    * The rotation matrix.
    **/
  /* CompleteClass */
  override var R: b2Mat22 = js.native
  /**
    * The local centroid.
    **/
  /* CompleteClass */
  override var center: b2Vec2 = js.native
  /**
    * The half-widths.
    **/
  /* CompleteClass */
  override var extents: b2Vec2 = js.native
}

