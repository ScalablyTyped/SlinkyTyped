package typingsSlinky.koaSession.mod

import typingsSlinky.koa.mod.Application
import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koaSession.koaSessionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextSession extends js.Object {
  var app: Application[DefaultState, DefaultContext]
  var ctx: Context
  var opts: typingsSlinky.koaSession.mod.opts
  var prevHash: String
  var session: Session | `false`
  var store: stores
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[Unit]
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[Unit]
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): Unit
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
}

