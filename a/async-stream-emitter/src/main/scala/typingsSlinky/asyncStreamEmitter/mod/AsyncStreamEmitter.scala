package typingsSlinky.asyncStreamEmitter.mod

import typingsSlinky.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncStreamEmitter[T] extends js.Object {
  def closeAllListeners(): Unit = js.native
  def closeListener(eventName: String): Unit = js.native
  def emit(eventName: String, data: T): Unit = js.native
  def getAllListenersBackpressure(): Double = js.native
  def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getListenerBackpressure(eventName: String): Double = js.native
  def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
  def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
  def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
  def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
  def killAllListeners(): Unit = js.native
  def killListener(eventName: String): Unit = js.native
  def killListenerConsumer(consumerId: Double): Unit = js.native
  def listener(eventName: String): typingsSlinky.consumableStream.mod.^[T] = js.native
}

object AsyncStreamEmitter {
  @scala.inline
  def apply[T](
    closeAllListeners: () => Unit,
    closeListener: String => Unit,
    emit: (String, T) => Unit,
    getAllListenersBackpressure: () => Double,
    getAllListenersConsumerStatsList: () => js.Array[ConsumerStats],
    getListenerBackpressure: String => Double,
    getListenerConsumerBackpressure: Double => Double,
    getListenerConsumerStats: Double => ConsumerStats,
    getListenerConsumerStatsList: String => js.Array[ConsumerStats],
    hasAnyListenerConsumer: Double => Boolean,
    hasListenerConsumer: (String, Double) => Boolean,
    killAllListeners: () => Unit,
    killListener: String => Unit,
    killListenerConsumer: Double => Unit,
    listener: String => typingsSlinky.consumableStream.mod.^[T]
  ): AsyncStreamEmitter[T] = {
    val __obj = js.Dynamic.literal(closeAllListeners = js.Any.fromFunction0(closeAllListeners), closeListener = js.Any.fromFunction1(closeListener), emit = js.Any.fromFunction2(emit), getAllListenersBackpressure = js.Any.fromFunction0(getAllListenersBackpressure), getAllListenersConsumerStatsList = js.Any.fromFunction0(getAllListenersConsumerStatsList), getListenerBackpressure = js.Any.fromFunction1(getListenerBackpressure), getListenerConsumerBackpressure = js.Any.fromFunction1(getListenerConsumerBackpressure), getListenerConsumerStats = js.Any.fromFunction1(getListenerConsumerStats), getListenerConsumerStatsList = js.Any.fromFunction1(getListenerConsumerStatsList), hasAnyListenerConsumer = js.Any.fromFunction1(hasAnyListenerConsumer), hasListenerConsumer = js.Any.fromFunction2(hasListenerConsumer), killAllListeners = js.Any.fromFunction0(killAllListeners), killListener = js.Any.fromFunction1(killListener), killListenerConsumer = js.Any.fromFunction1(killListenerConsumer), listener = js.Any.fromFunction1(listener))
    __obj.asInstanceOf[AsyncStreamEmitter[T]]
  }
  @scala.inline
  implicit class AsyncStreamEmitterOps[Self[t] <: AsyncStreamEmitter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCloseAllListeners(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAllListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloseListener(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmit(value: (String, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAllListenersBackpressure(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllListenersBackpressure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllListenersConsumerStatsList(value: () => js.Array[ConsumerStats]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllListenersConsumerStatsList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetListenerBackpressure(value: String => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListenerBackpressure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetListenerConsumerBackpressure(value: Double => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListenerConsumerBackpressure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetListenerConsumerStats(value: Double => ConsumerStats): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListenerConsumerStats")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetListenerConsumerStatsList(value: String => js.Array[ConsumerStats]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListenerConsumerStatsList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasAnyListenerConsumer(value: Double => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnyListenerConsumer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasListenerConsumer(value: (String, Double) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasListenerConsumer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKillAllListeners(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killAllListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKillListener(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKillListenerConsumer(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killListenerConsumer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListener(value: String => typingsSlinky.consumableStream.mod.^[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

