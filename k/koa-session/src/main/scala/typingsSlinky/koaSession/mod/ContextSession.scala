package typingsSlinky.koaSession.mod

import typingsSlinky.koa.mod.Application
import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koaSession.koaSessionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextSession extends js.Object {
  var app: Application[DefaultState, DefaultContext] = js.native
  var ctx: Context = js.native
  var opts: typingsSlinky.koaSession.mod.opts = js.native
  var prevHash: String = js.native
  var session: Session | `false` = js.native
  var store: stores = js.native
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[Unit] = js.native
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session = js.native
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[Unit] = js.native
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): Unit = js.native
}

object ContextSession {
  @scala.inline
  def apply(
    app: Application[DefaultState, DefaultContext],
    commit: () => js.Promise[Unit],
    ctx: Context,
    get: () => Session,
    initFromExternal: () => js.Promise[Unit],
    opts: opts,
    prevHash: String,
    session: Session | `false`,
    set: js.Any => Unit,
    store: stores
  ): ContextSession = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), ctx = ctx.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), initFromExternal = js.Any.fromFunction0(initFromExternal), opts = opts.asInstanceOf[js.Any], prevHash = prevHash.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSession]
  }
  @scala.inline
  implicit class ContextSessionOps[Self <: ContextSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: Application[DefaultState, DefaultContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCtx(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: () => Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitFromExternal(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFromExternal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpts(value: opts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: Session | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStore(value: stores): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

