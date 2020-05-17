package typingsSlinky.phaser.Phaser.Physics.Impact

import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Acceleration
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.BodyScale
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.BodyType
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Bounce
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.CheckAgainst
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Collides
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Debug
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Friction
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Gravity
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Offset
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.SetGameObject
import typingsSlinky.phaser.Phaser.Physics.Impact.Components.Velocity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@js.native
trait ImpactBody
  extends Acceleration
     with BodyScale
     with BodyType
     with Bounce
     with CheckAgainst
     with Collides
     with Debug
     with Friction
     with Gravity
     with Offset
     with SetGameObject
     with Velocity {
  /**
    * [description]
    */
  var accel: js.Object = js.native
  /**
    * [description]
    */
  var body: Body = js.native
  /**
    * [description]
    */
  var friction: js.Object = js.native
  /**
    * [description]
    */
  var maxVel: js.Object = js.native
  /**
    * [description]
    */
  var offset: js.Object = js.native
  /**
    * [description]
    */
  var size: js.Object = js.native
  /**
    * [description]
    */
  var vel: js.Object = js.native
}

