package typingsSlinky.box2d.Box2D.Collision.Shapes

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2EdgeChainDef extends js.Object {
  /**
  		* Whether to create an extra edge between the first and last vertices.
  		**/
  var isALoop: Boolean = js.native
  /**
  		* The number of vertices in the chain.
  		**/
  var vertexCount: Double = js.native
  /**
  		* The vertices in local coordinates.
  		**/
  var vertices: b2Vec2 = js.native
}

object b2EdgeChainDef {
  @scala.inline
  def apply(isALoop: Boolean, vertexCount: Double, vertices: b2Vec2): b2EdgeChainDef = {
    val __obj = js.Dynamic.literal(isALoop = isALoop.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2EdgeChainDef]
  }
  @scala.inline
  implicit class b2EdgeChainDefOps[Self <: b2EdgeChainDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsALoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isALoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

