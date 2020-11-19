package typingsSlinky.box2d.global.Box2D.Dynamics

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2World")
@js.native
class b2World protected ()
  extends typingsSlinky.box2d.Box2D.Dynamics.b2World {
  /**
    * Creates a new world.
    * @param gravity The world gravity vector.
    * @param doSleep Improvie performance by not simulating inactive bodies.
    **/
  def this(gravity: b2Vec2, doSleep: Boolean) = this()
}
/* static members */
@JSGlobal("Box2D.Dynamics.b2World")
@js.native
object b2World extends js.Object {
  
  /**
    * Locked
    **/
  var e_locked: Double = js.native
  
  /**
    * New Fixture
    **/
  var e_newFixture: Double = js.native
}
