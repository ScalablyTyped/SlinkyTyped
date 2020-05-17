package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PairFactory extends js.Object {
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  def create(collision: ICollisionData, timestamp: Double): IPair = js.native
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  def id(bodyA: BodyType, bodyB: BodyType): String = js.native
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit = js.native
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit = js.native
}

object PairFactory {
  @scala.inline
  def apply(
    create: (ICollisionData, Double) => IPair,
    id: (BodyType, BodyType) => String,
    setActive: (IPair, Boolean, Double) => Unit,
    update: (IPair, ICollisionData, Double) => Unit
  ): PairFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), id = js.Any.fromFunction2(id), setActive = js.Any.fromFunction3(setActive), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[PairFactory]
  }
  @scala.inline
  implicit class PairFactoryOps[Self <: PairFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (ICollisionData, Double) => IPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: (BodyType, BodyType) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetActive(value: (IPair, Boolean, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (IPair, ICollisionData, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

