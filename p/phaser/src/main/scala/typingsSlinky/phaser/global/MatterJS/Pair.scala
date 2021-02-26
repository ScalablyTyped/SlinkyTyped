package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.MatterJS.ICollisionData
import typingsSlinky.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Pair` module contains methods for creating and manipulating collision pairs.
  *
  * @class Pair
  */
@JSGlobal("MatterJS.Pair")
@js.native
class Pair ()
  extends typingsSlinky.phaser.MatterJS.Pair
object Pair {
  
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  /* static member */
  @JSGlobal("MatterJS.Pair.create")
  @js.native
  def create(collision: ICollisionData, timestamp: Double): IPair = js.native
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  /* static member */
  @JSGlobal("MatterJS.Pair.id")
  @js.native
  def id(bodyA: BodyType, bodyB: BodyType): String = js.native
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  /* static member */
  @JSGlobal("MatterJS.Pair.setActive")
  @js.native
  def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit = js.native
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  /* static member */
  @JSGlobal("MatterJS.Pair.update")
  @js.native
  def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit = js.native
}
