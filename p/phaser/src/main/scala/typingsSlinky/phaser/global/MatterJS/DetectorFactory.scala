package typingsSlinky.phaser.global.MatterJS

import typingsSlinky.phaser.MatterJS.ICollisionData
import typingsSlinky.phaser.MatterJS.ICollisionFilter
import typingsSlinky.phaser.MatterJS.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MatterJS.DetectorFactory")
@js.native
class DetectorFactory ()
  extends typingsSlinky.phaser.MatterJS.DetectorFactory {
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  /* CompleteClass */
  override def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  /* CompleteClass */
  override def collisions(broadphasePairs: js.Array[IPair], engine: typingsSlinky.phaser.MatterJS.Engine): js.Array[ICollisionData] = js.native
}

