package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApi[T] extends EnginePrototypeOrObject {
  /**
    * drop(key) - remove an item from cache where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  def drop(key: CacheKey): js.Promise[Unit] = js.native
  /**
    * get(key, callback) - retrieve an item from the cache engine if found where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  def get(key: CacheKey): js.Promise[Null | CachedObject[T]] = js.native
  /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
  def isReady(): Boolean = js.native
  /**
    * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
    *  * key - a cache key object (see [ICacheKey]).
    *  * value - the string or object value to be stored.
    *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
    */
  def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit] = js.native
  /** start() - creates a connection to the cache server. Must be called before any other method is available. */
  def start(): js.Promise[Unit] = js.native
  /** stop() - terminates the connection to the cache server. */
  def stop(): Unit = js.native
  /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
  def validateSegmentName(segment: String): Null | js.Error = js.native
}

object ClientApi {
  @scala.inline
  def apply[T](
    drop: CacheKey => js.Promise[Unit],
    get: CacheKey => js.Promise[Null | CachedObject[T]],
    isReady: () => Boolean,
    set: (CacheKey, T, Double) => js.Promise[Unit],
    start: () => js.Promise[Unit],
    stop: () => Unit,
    validateSegmentName: String => Null | js.Error
  ): ClientApi[T] = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), get = js.Any.fromFunction1(get), isReady = js.Any.fromFunction0(isReady), set = js.Any.fromFunction3(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), validateSegmentName = js.Any.fromFunction1(validateSegmentName))
    __obj.asInstanceOf[ClientApi[T]]
  }
  @scala.inline
  implicit class ClientApiOps[Self[t] <: ClientApi[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDrop(value: CacheKey => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: CacheKey => js.Promise[Null | CachedObject[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReady(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (CacheKey, T, Double) => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStart(value: () => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidateSegmentName(value: String => Null | js.Error): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateSegmentName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

