package typingsSlinky.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventCollision[T] extends IEventTimestamped[T] {
  /**
    * The collision pair
    */
  var pairs: js.Array[IPair] = js.native
}

object IEventCollision {
  @scala.inline
  def apply[T](name: String, pairs: js.Array[IPair], source: T, timestamp: Double): IEventCollision[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventCollision[T]]
  }
  @scala.inline
  implicit class IEventCollisionOps[Self[t] <: IEventCollision[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPairs(value: js.Array[IPair]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

