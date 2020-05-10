package typingsSlinky.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionCache extends js.Object {
  var cache: StringDictionary[Session] = js.native
  var capacity: Double = js.native
  var order: js.Array[Hex] = js.native
  def getSession(sessionId: Bytes): Session = js.native
  def setSession(sessionId: Bytes, session: Session): Unit = js.native
}

object SessionCache {
  @scala.inline
  def apply(
    cache: StringDictionary[Session],
    capacity: Double,
    getSession: Bytes => Session,
    order: js.Array[Hex],
    setSession: (Bytes, Session) => Unit
  ): SessionCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], getSession = js.Any.fromFunction1(getSession), order = order.asInstanceOf[js.Any], setSession = js.Any.fromFunction2(setSession))
    __obj.asInstanceOf[SessionCache]
  }
  @scala.inline
  implicit class SessionCacheOps[Self <: SessionCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: StringDictionary[Session]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSession(value: Bytes => Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[Hex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSession(value: (Bytes, Session) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSession")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

