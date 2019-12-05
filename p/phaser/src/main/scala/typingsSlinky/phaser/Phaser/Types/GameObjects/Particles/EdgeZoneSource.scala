package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeZoneSource extends js.Object {
  /**
    * A function placing points on the sources edge or edges.
    */
  @JSName("getPoints")
  var getPoints_Original: EdgeZoneSourceCallback = js.native
  /**
    * A function placing points on the sources edge or edges.
    */
  def getPoints(quantity: integer): Unit = js.native
  def getPoints(quantity: integer, stepRate: Double): Unit = js.native
}

