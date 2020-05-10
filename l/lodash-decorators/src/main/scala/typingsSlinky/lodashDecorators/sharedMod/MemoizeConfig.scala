package typingsSlinky.lodashDecorators.sharedMod

import typingsSlinky.lodashDecorators.AnonInstantiable
import typingsSlinky.lodashDecorators.commonMod.ResolvableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoizeConfig[T, U] extends js.Object {
  var cache: js.UndefOr[MemoizeMap[T, U]] = js.native
  var resolver: js.UndefOr[ResolvableFunction] = js.native
  var `type`: js.UndefOr[AnonInstantiable[T, U]] = js.native
}

object MemoizeConfig {
  @scala.inline
  def apply[T, U](): MemoizeConfig[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoizeConfig[T, U]]
  }
  @scala.inline
  implicit class MemoizeConfigOps[Self[t, u] <: MemoizeConfig[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withCache(value: MemoizeMap[T, U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withResolver(value: ResolvableFunction): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: AnonInstantiable[T, U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

