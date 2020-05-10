package typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of poll state at any given time.
  *
  * @typeparam T - The resolved type of the factory's promises.
  *
  * @typeparam U - The rejected type of the factory's promises.
  *
  * @typeparam V - The type to extend the phases supported by a poll.
  */
@js.native
trait State[T, U, V /* <: String */] extends js.Object {
  /**
    * The number of milliseconds until the current tick resolves.
    */
  val interval: Double = js.native
  /**
    * The payload of the last poll resolution or rejection.
    *
    * #### Notes
    * The payload is `null` unless the `phase` is `'reconnected`, `'resolved'`,
    * or `'rejected'`. Its type is `T` for resolutions and `U` for rejections.
    */
  val payload: T | U | Null = js.native
  /**
    * The current poll phase.
    */
  val phase: Phase[V] = js.native
  /**
    * The timestamp for when this tick was scheduled.
    */
  val timestamp: Double = js.native
}

object State {
  @scala.inline
  def apply[T, U, V](interval: Double, phase: Phase[V], timestamp: Double): State[T, U, V] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T, U, V]]
  }
  @scala.inline
  implicit class StateOps[Self[t, u, v] <: State[t, u, v], T, U, V] (val x: Self[T, U, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U, V]) with Other]
    @scala.inline
    def withInterval(value: Double): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: Phase[V]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: T | U): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayloadNull: Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(null)
        ret
    }
  }
  
}

