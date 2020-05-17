package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2RayCastOutput extends js.Object {
  /**
  		* The fraction between p1 and p2 that the collision occurs at.
  		**/
  var fraction: Double = js.native
  /**
  		* The normal at the point of collision.
  		**/
  var normal: b2Vec2 = js.native
}

object b2RayCastOutput {
  @scala.inline
  def apply(fraction: Double, normal: b2Vec2): b2RayCastOutput = {
    val __obj = js.Dynamic.literal(fraction = fraction.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastOutput]
  }
  @scala.inline
  implicit class b2RayCastOutputOps[Self <: b2RayCastOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

