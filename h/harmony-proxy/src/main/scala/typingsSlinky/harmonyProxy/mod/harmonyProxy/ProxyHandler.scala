package typingsSlinky.harmonyProxy.mod.harmonyProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyHandler[T] extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.native
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.native
  var defineProperty: js.UndefOr[
    js.Function3[/* target */ T, /* p */ PropertyKey, /* attributes */ js.PropertyDescriptor, Boolean]
  ] = js.native
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, Boolean]] = js.native
  var enumerate: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.native
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _]] = js.native
  var getOwnPropertyDescriptor: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, js.PropertyDescriptor]] = js.native
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, _]] = js.native
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, Boolean]] = js.native
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, Boolean]] = js.native
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.native
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, Boolean]] = js.native
  var set: js.UndefOr[
    js.Function4[/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any, Boolean]
  ] = js.native
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Any, Boolean]] = js.native
}

object ProxyHandler {
  @scala.inline
  def apply[T](): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandler[T]]
  }
  @scala.inline
  implicit class ProxyHandlerOps[Self[t] <: ProxyHandler[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withApply(value: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutApply: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
    @scala.inline
    def withConstruct(value: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutConstruct: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.undefined)
        ret
    }
    @scala.inline
    def withDefineProperty(value: (/* target */ T, /* p */ PropertyKey, /* attributes */ js.PropertyDescriptor) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineProperty")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDefineProperty: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteProperty(value: (/* target */ T, /* p */ PropertyKey) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeleteProperty: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumerate(value: /* target */ T => js.Array[PropertyKey]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnumerate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerate")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOwnPropertyDescriptor(value: (/* target */ T, /* p */ PropertyKey) => js.PropertyDescriptor): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnPropertyDescriptor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetOwnPropertyDescriptor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnPropertyDescriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPrototypeOf(value: /* target */ T => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrototypeOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPrototypeOf: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrototypeOf")(js.undefined)
        ret
    }
    @scala.inline
    def withHas(value: (/* target */ T, /* p */ PropertyKey) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHas: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExtensible(value: /* target */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtensible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsExtensible: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtensible")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnKeys(value: /* target */ T => js.Array[PropertyKey]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOwnKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventExtensions(value: /* target */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventExtensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreventExtensions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* target */ T, /* p */ PropertyKey, /* value */ js.Any, /* receiver */ js.Any) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPrototypeOf(value: (/* target */ T, /* v */ js.Any) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrototypeOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetPrototypeOf: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrototypeOf")(js.undefined)
        ret
    }
  }
  
}

