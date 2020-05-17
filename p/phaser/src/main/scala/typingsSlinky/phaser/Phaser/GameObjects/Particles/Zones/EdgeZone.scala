package typingsSlinky.phaser.Phaser.GameObjects.Particles.Zones

import typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle
import typingsSlinky.phaser.Phaser.Geom.Point
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zone that places particles on a shape's edges.
  */
@js.native
trait EdgeZone extends js.Object {
  /**
    * The counter used for iterating the EdgeZone's points.
    */
  var counter: Double = js.native
  /**
    * The points placed on the source edge.
    */
  var points: js.Array[Point] = js.native
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: integer = js.native
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: Boolean = js.native
  /**
    * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  var source: EdgeZoneSource | RandomZoneSource = js.native
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: Double = js.native
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: Boolean = js.native
  /**
    * Change the source of the EdgeZone.
    * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  def changeSource(source: EdgeZoneSource): EdgeZone = js.native
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: Particle): Unit = js.native
  /**
    * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
    * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    * 
    * Also updates internal properties.
    */
  def updateSource(): EdgeZone = js.native
}

object EdgeZone {
  @scala.inline
  def apply(
    changeSource: EdgeZoneSource => EdgeZone,
    counter: Double,
    getPoint: Particle => Unit,
    points: js.Array[Point],
    quantity: integer,
    seamless: Boolean,
    source: EdgeZoneSource | RandomZoneSource,
    stepRate: Double,
    updateSource: () => EdgeZone,
    yoyo: Boolean
  ): EdgeZone = {
    val __obj = js.Dynamic.literal(changeSource = js.Any.fromFunction1(changeSource), counter = counter.asInstanceOf[js.Any], getPoint = js.Any.fromFunction1(getPoint), points = points.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], seamless = seamless.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stepRate = stepRate.asInstanceOf[js.Any], updateSource = js.Any.fromFunction0(updateSource), yoyo = yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeZone]
  }
  @scala.inline
  implicit class EdgeZoneOps[Self <: EdgeZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSource(value: EdgeZoneSource => EdgeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPoint(value: Particle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeamless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seamless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: EdgeZoneSource | RandomZoneSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateSource(value: () => EdgeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYoyo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

