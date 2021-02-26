package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.ICollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.SAT` module contains methods for detecting collisions using the Separating Axis Theorem.
  *
  * @class SAT
  */
@JSGlobal("MatterJS.SAT")
@js.native
class SAT ()
  extends typingsSlinky.phaser.MatterJS.SAT
object SAT {
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  /* static member */
  @JSGlobal("MatterJS.SAT.collides")
  @js.native
  def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = js.native
}
