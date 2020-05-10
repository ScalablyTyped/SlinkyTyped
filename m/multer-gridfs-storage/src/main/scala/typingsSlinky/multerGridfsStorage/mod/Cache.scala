package typingsSlinky.multerGridfsStorage.mod

import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def clear(): Unit = js.native
  def connections(): Double = js.native
  def findUri(cacheName: String, url: String): String = js.native
  def get(cacheIndex: js.Object): js.Object = js.native
  def has(cacheIndex: js.Object): Boolean = js.native
  def initialize(opts: js.Object): js.Object = js.native
  def isOpening(cacheIndex: js.Object): Boolean = js.native
  def isPending(cacheIndex: js.Object): Boolean = js.native
  def reject(cacheIndex: js.Object, err: js.Error): Unit = js.native
  def remove(cacheIndex: js.Object): Unit = js.native
  def resolve(cacheIndex: js.Object, db: Db, client: MongoClient): Unit = js.native
  def set(cacheIndex: js.Object, value: js.Object): Unit = js.native
  def waitFor(cacheIndex: js.Object): js.Promise[js.Object] = js.native
}

object Cache {
  @scala.inline
  def apply(
    clear: () => Unit,
    connections: () => Double,
    findUri: (String, String) => String,
    get: js.Object => js.Object,
    has: js.Object => Boolean,
    initialize: js.Object => js.Object,
    isOpening: js.Object => Boolean,
    isPending: js.Object => Boolean,
    reject: (js.Object, js.Error) => Unit,
    remove: js.Object => Unit,
    resolve: (js.Object, Db, MongoClient) => Unit,
    set: (js.Object, js.Object) => Unit,
    waitFor: js.Object => js.Promise[js.Object]
  ): Cache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), connections = js.Any.fromFunction0(connections), findUri = js.Any.fromFunction2(findUri), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), initialize = js.Any.fromFunction1(initialize), isOpening = js.Any.fromFunction1(isOpening), isPending = js.Any.fromFunction1(isPending), reject = js.Any.fromFunction2(reject), remove = js.Any.fromFunction1(remove), resolve = js.Any.fromFunction3(resolve), set = js.Any.fromFunction2(set), waitFor = js.Any.fromFunction1(waitFor))
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnections(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindUri(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findUri")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsOpening(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpening")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPending(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReject(value: (js.Object, js.Error) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve(value: (js.Object, Db, MongoClient) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSet(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWaitFor(value: js.Object => js.Promise[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

