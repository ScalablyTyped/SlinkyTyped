package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBehaviorAware[T] extends js.Object {
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  def addBehavior(behavior: Behavior[T]): T = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  def getBehaviorByName(name: String): Nullable[Behavior[T]] = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  def removeBehavior(behavior: Behavior[T]): T = js.native
}

object IBehaviorAware {
  @scala.inline
  def apply[T](
    addBehavior: Behavior[T] => T,
    getBehaviorByName: String => Nullable[Behavior[T]],
    removeBehavior: Behavior[T] => T
  ): IBehaviorAware[T] = {
    val __obj = js.Dynamic.literal(addBehavior = js.Any.fromFunction1(addBehavior), getBehaviorByName = js.Any.fromFunction1(getBehaviorByName), removeBehavior = js.Any.fromFunction1(removeBehavior))
    __obj.asInstanceOf[IBehaviorAware[T]]
  }
  @scala.inline
  implicit class IBehaviorAwareOps[Self[t] <: IBehaviorAware[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddBehavior(value: Behavior[T] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBehavior")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBehaviorByName(value: String => Nullable[Behavior[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBehaviorByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveBehavior(value: Behavior[T] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBehavior")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

