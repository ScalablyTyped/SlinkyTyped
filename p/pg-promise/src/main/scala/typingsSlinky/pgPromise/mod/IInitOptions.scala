package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Library's Initialization Options
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
@js.native
trait IInitOptions[Ext, C /* <: IClient */] extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.native
  var connect: js.UndefOr[js.Function3[/* client */ C, /* dc */ js.Any, /* useCount */ Double, Unit]] = js.native
  var disconnect: js.UndefOr[js.Function2[/* client */ C, /* dc */ js.Any, Unit]] = js.native
  var error: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ IEventContext[C], Unit]] = js.native
  var extend: js.UndefOr[js.Function2[/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any, Unit]] = js.native
  var noLocking: js.UndefOr[Boolean] = js.native
  var noWarnings: js.UndefOr[Boolean] = js.native
  var pgFormatting: js.UndefOr[Boolean] = js.native
  var pgNative: js.UndefOr[Boolean] = js.native
  var promiseLib: js.UndefOr[js.Any] = js.native
  var query: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
  var receive: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C], Unit]
  ] = js.native
  var schema: js.UndefOr[ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])] = js.native
  var task: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
  var transact: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
}

object IInitOptions {
  @scala.inline
  def apply[Ext, C](): IInitOptions[Ext, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitOptions[Ext, C]]
  }
  @scala.inline
  implicit class IInitOptionsOps[Self[ext, c] <: IInitOptions[ext, c], Ext, C] (val x: Self[Ext, C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ext, C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ext, C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ext, C]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ext, C]) with Other]
    @scala.inline
    def withCapSQL(value: Boolean): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSQL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapSQL: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSQL")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect(value: (/* client */ C, /* dc */ js.Any, /* useCount */ Double) => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutConnect: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnect(value: (/* client */ C, /* dc */ js.Any) => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisconnect: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: (/* err */ js.Any, /* e */ IEventContext[C]) => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutError: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: (/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any) => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExtend: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLocking(value: Boolean): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLocking: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLocking")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWarnings(value: Boolean): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWarnings: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withPgFormatting(value: Boolean): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgFormatting: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withPgNative(value: Boolean): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgNative: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgNative")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseLib(value: js.Any): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseLib: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseLib")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: /* e */ IEventContext[C] => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuery: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withReceive(value: (/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C]) => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutReceive: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaFunction1(value: /* dc */ js.Any => ValidSchema): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSchema(value: ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaNull: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(null)
        ret
    }
    @scala.inline
    def withTask(value: /* e */ IEventContext[C] => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTask: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.undefined)
        ret
    }
    @scala.inline
    def withTransact(value: /* e */ IEventContext[C] => Unit): Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transact")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransact: Self[Ext, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transact")(js.undefined)
        ret
    }
  }
  
}

