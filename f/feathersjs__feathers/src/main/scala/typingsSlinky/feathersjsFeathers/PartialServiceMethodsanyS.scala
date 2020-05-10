package typingsSlinky.feathersjsFeathers

import typingsSlinky.feathersjsFeathers.mod.Application
import typingsSlinky.feathersjsFeathers.mod.Id
import typingsSlinky.feathersjsFeathers.mod.NullableId
import typingsSlinky.feathersjsFeathers.mod.Paginated
import typingsSlinky.feathersjsFeathers.mod.Params
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
@js.native
trait PartialServiceMethodsanyS extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* data */ Partial[_] | js.Array[Partial[_]], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_ | js.Array[_]]
    ]
  ] = js.native
  var find: js.UndefOr[
    js.Function1[/* params */ js.UndefOr[Params], js.Promise[_ | js.Array[_] | Paginated[_]]]
  ] = js.native
  var get: js.UndefOr[js.Function2[/* id */ Id, /* params */ js.UndefOr[Params], js.Promise[_]]] = js.native
  var patch: js.UndefOr[
    js.Function3[
      /* id */ NullableId, 
      /* data */ Partial[_], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_]
    ]
  ] = js.native
  var remove: js.UndefOr[
    js.Function2[/* id */ NullableId, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.native
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.native
  var update: js.UndefOr[
    js.Function3[/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.native
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
    def withCreate(
      value: (/* data */ Partial[_] | js.Array[Partial[_]], /* params */ js.UndefOr[Params]) => js.Promise[_ | js.Array[_]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withFind(value: /* params */ js.UndefOr[Params] => js.Promise[_ | js.Array[_] | Paginated[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* id */ Id, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withPatch(
      value: (/* id */ NullableId, /* data */ Partial[_], /* params */ js.UndefOr[Params]) => js.Promise[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* id */ NullableId, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
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
    def withUpdate(value: (/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
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

