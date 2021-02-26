package typingsSlinky.consul.mod

import typingsSlinky.consul.mod.Lock.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consul extends StObject {
  
  var acl: Acl = js.native
  
  var agent: Agent = js.native
  
  var catalog: Catalog = js.native
  
  var event: Event = js.native
  
  var health: Health = js.native
  
  var kv: Kv = js.native
  
  /**
    * Lock helper.
    */
  def lock(opts: Options): Lock = js.native
  
  var session: Session = js.native
  
  var status: Status = js.native
  
  /**
    * Watch helper.
    */
  def watch(opts: typingsSlinky.consul.mod.Watch.Options): Watch = js.native
}
object Consul {
  
  @scala.inline
  def apply(
    acl: Acl,
    agent: Agent,
    catalog: Catalog,
    event: Event,
    health: Health,
    kv: Kv,
    lock: Options => Lock,
    session: Session,
    status: Status,
    watch: typingsSlinky.consul.mod.Watch.Options => Watch
  ): Consul = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], catalog = catalog.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], health = health.asInstanceOf[js.Any], kv = kv.asInstanceOf[js.Any], lock = js.Any.fromFunction1(lock), session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[Consul]
  }
  
  @scala.inline
  implicit class ConsulMutableBuilder[Self <: Consul] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: Acl): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealth(value: Health): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKv(value: Kv): Self = StObject.set(x, "kv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: Options => Lock): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatch(value: typingsSlinky.consul.mod.Watch.Options => Watch): Self = StObject.set(x, "watch", js.Any.fromFunction1(value))
  }
}
