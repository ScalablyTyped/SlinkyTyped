package typingsSlinky.phaser.mod

import typingsSlinky.phaser.MatterJS.ICollisionData
import typingsSlinky.phaser.MatterJS.ICollisionFilter
import typingsSlinky.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Detector` module contains methods for detecting collisions given a set of pairs.
  *
  * @class Detector
  */
@JSImport("matter", "Detector")
@js.native
class Detector ()
  extends typingsSlinky.phaser.MatterJS.Detector
object Detector {
  
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  /* static member */
  @JSImport("matter", "Detector.canCollide")
  @js.native
  def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  /* static member */
  @JSImport("matter", "Detector.collisions")
  @js.native
  def collisions(broadphasePairs: js.Array[IPair], engine: typingsSlinky.phaser.MatterJS.Engine): js.Array[ICollisionData] = js.native
}
