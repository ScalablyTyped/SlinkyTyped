package typingsSlinky.consul.mod

import typingsSlinky.consul.mod.Lock.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consul extends js.Object {
  var acl: Acl = js.native
  var agent: Agent = js.native
  var catalog: Catalog = js.native
  var event: Event = js.native
  var health: Health = js.native
  var kv: Kv = js.native
  var session: Session = js.native
  var status: Status = js.native
  /**
    * Lock helper.
    */
  def lock(opts: Options): Lock = js.native
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
  implicit class ConsulOps[Self <: Consul] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: Acl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalog(value: Catalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealth(value: Health): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKv(value: Kv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: Options => Lock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: typingsSlinky.consul.mod.Watch.Options => Watch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

