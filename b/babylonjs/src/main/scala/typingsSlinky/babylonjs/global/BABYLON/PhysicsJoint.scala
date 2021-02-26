package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.PhysicsJointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsJoint")
@js.native
class PhysicsJoint protected ()
  extends typingsSlinky.babylonjs.BABYLON.PhysicsJoint {
  /**
    * Initializes the physics joint
    * @param type The type of the physics joint
    * @param jointData The data for the physics joint
    */
  def this(
    /**
    * The type of the physics joint
    */
  `type`: Double,
    /**
    * The data for the physics joint
    */
  jointData: PhysicsJointData
  ) = this()
}
/* static members */
object PhysicsJoint {
  
  @JSGlobal("BABYLON.PhysicsJoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Ball-and-Socket joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.BallAndSocketJoint")
  @js.native
  def BallAndSocketJoint: Double = js.native
  @scala.inline
  def BallAndSocketJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BallAndSocketJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Distance-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.DistanceJoint")
  @js.native
  def DistanceJoint: Double = js.native
  @scala.inline
  def DistanceJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DistanceJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Hinge-Joint 2 type
    */
  @JSGlobal("BABYLON.PhysicsJoint.Hinge2Joint")
  @js.native
  def Hinge2Joint: Double = js.native
  @scala.inline
  def Hinge2Joint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hinge2Joint")(x.asInstanceOf[js.Any])
  
  /**
    * Hinge-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.HingeJoint")
  @js.native
  def HingeJoint: Double = js.native
  @scala.inline
  def HingeJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HingeJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Lock-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.LockJoint")
  @js.native
  def LockJoint: Double = js.native
  @scala.inline
  def LockJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LockJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
    */
  @JSGlobal("BABYLON.PhysicsJoint.PointToPointJoint")
  @js.native
  def PointToPointJoint: Double = js.native
  @scala.inline
  def PointToPointJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointToPointJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Prismatic-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.PrismaticJoint")
  @js.native
  def PrismaticJoint: Double = js.native
  @scala.inline
  def PrismaticJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrismaticJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Slider-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.SliderJoint")
  @js.native
  def SliderJoint: Double = js.native
  @scala.inline
  def SliderJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Spring-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.SpringJoint")
  @js.native
  def SpringJoint: Double = js.native
  @scala.inline
  def SpringJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpringJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Universal-Joint type
    * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
    */
  @JSGlobal("BABYLON.PhysicsJoint.UniversalJoint")
  @js.native
  def UniversalJoint: Double = js.native
  @scala.inline
  def UniversalJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniversalJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Wheel-Joint type
    */
  @JSGlobal("BABYLON.PhysicsJoint.WheelJoint")
  @js.native
  def WheelJoint: Double = js.native
  @scala.inline
  def WheelJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelJoint")(x.asInstanceOf[js.Any])
}
