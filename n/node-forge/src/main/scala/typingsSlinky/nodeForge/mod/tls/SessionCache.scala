package typingsSlinky.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.Hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionCache extends StObject {
  
  var cache: StringDictionary[Session] = js.native
  
  var capacity: Double = js.native
  
  def getSession(sessionId: Bytes): Session = js.native
  
  var order: js.Array[Hex] = js.native
  
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
  implicit class SessionCacheMutableBuilder[Self <: SessionCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: StringDictionary[Session]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSession(value: Bytes => Session): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrder(value: js.Array[Hex]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderVarargs(value: Hex*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setSetSession(value: (Bytes, Session) => Unit): Self = StObject.set(x, "setSession", js.Any.fromFunction2(value))
  }
}
