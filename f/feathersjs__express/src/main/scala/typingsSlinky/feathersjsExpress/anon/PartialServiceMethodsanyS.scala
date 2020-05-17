package typingsSlinky.feathersjsExpress.anon

import typingsSlinky.feathersjsFeathers.mod.Application
import typingsSlinky.feathersjsFeathers.mod.Id
import typingsSlinky.feathersjsFeathers.mod.NullableId
import typingsSlinky.feathersjsFeathers.mod.Paginated
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
@js.native
trait PartialServiceMethodsanyS extends js.Object {
  var create: js.UndefOr[js.Function1[/* data */ Partial[_], js.Promise[_ | js.Array[_]]]] = js.native
  var find: js.UndefOr[js.Function0[js.Promise[_ | js.Array[_] | Paginated[_]]]] = js.native
  var get: js.UndefOr[js.Function1[/* id */ Id, js.Promise[_]]] = js.native
  var patch: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ Partial[_], js.Promise[_]]] = js.native
  var remove: js.UndefOr[js.Function1[/* id */ NullableId, js.Promise[_]]] = js.native
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.native
  var update: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ js.Any, js.Promise[_]]] = js.native
}

object PartialServiceMethodsanyS {
  @scala.inline
  def apply(): PartialServiceMethodsanyS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServiceMethodsanyS]
  }
  @scala.inline
  implicit class PartialServiceMethodsanySOps[Self <: PartialServiceMethodsanyS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: /* data */ Partial[_] => js.Promise[_ | js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withFind(value: () => js.Promise[_ | js.Array[_] | Paginated[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* id */ Id => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withPatch(value: (/* id */ NullableId, /* data */ Partial[_]) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* id */ NullableId => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: (/* app */ Application[_], /* path */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* id */ NullableId, /* data */ js.Any) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

