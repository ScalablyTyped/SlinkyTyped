package typingsSlinky.box2d.global.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2JointEdge")
@js.native
class b2JointEdge ()
  extends typingsSlinky.box2d.Box2D.Dynamics.Joints.b2JointEdge {
  /**
    * The joint.
    **/
  /* CompleteClass */
  override var joint: typingsSlinky.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
  /**
    * The next joint edge in the body's joint list.
    **/
  /* CompleteClass */
  override var next: typingsSlinky.box2d.Box2D.Dynamics.Joints.b2JointEdge = js.native
  /**
    * Provides quick access to the other body attached.
    **/
  /* CompleteClass */
  override var other: b2Body = js.native
  /**
    * The previous joint edge in the body's joint list.
    **/
  /* CompleteClass */
  override var prev: typingsSlinky.box2d.Box2D.Dynamics.Joints.b2JointEdge = js.native
}

