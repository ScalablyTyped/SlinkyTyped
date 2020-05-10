package typingsSlinky.jupyterlabCoreutils.interfacesMod

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll.Frequency
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll.State
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPoll_[T, U, V /* <: String */] extends js.Object {
  /**
    * A signal emitted when the poll is disposed.
    */
  val disposed: ISignal[this.type, Unit] = js.native
  /**
    * The polling frequency data.
    */
  val frequency: Frequency = js.native
  /**
    * Whether the poll is disposed.
    */
  val isDisposed: Boolean = js.native
  /**
    * The name of the poll.
    */
  val name: String = js.native
  /**
    * The poll state, which is the content of the currently-scheduled poll tick.
    */
  val state: State[T, U, V] = js.native
  /**
    * A promise that resolves when the currently-scheduled tick completes.
    *
    * #### Notes
    * Usually this will resolve after `state.interval` milliseconds from
    * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
    * poll, etc.
    */
  val tick: js.Promise[IPoll[T, U, V]] = js.native
  /**
    * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
    */
  val ticked: ISignal[IPoll[T, U, V], State[T, U, V]] = js.native
}

object IPoll_ {
  @scala.inline
  def apply[T, U, V](
    disposed: ISignal[IPoll_[T, U, V], Unit],
    frequency: Frequency,
    isDisposed: Boolean,
    name: String,
    state: State[T, U, V],
    tick: js.Promise[IPoll[T, U, V]],
    ticked: ISignal[IPoll[T, U, V], State[T, U, V]]
  ): IPoll_[T, U, V] = {
    val __obj = js.Dynamic.literal(disposed = disposed.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], ticked = ticked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoll_[T, U, V]]
  }
  @scala.inline
  implicit class IPoll_Ops[Self[t, u, v] <: IPoll_[t, u, v], T, U, V] (val x: Self[T, U, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U, V]) with Other]
    @scala.inline
    def withDisposed(value: ISignal[IPoll_[T, U, V], Unit]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequency(value: Frequency): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisposed(value: Boolean): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State[T, U, V]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTick(value: js.Promise[IPoll[T, U, V]]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicked(value: ISignal[IPoll[T, U, V], State[T, U, V]]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

