package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropOptions[T] extends PropValidator[T] {
  // bug : 对于 type 为 Object 或 Array 的属性，如果通过该组件自身的 this.setData
  // 来改变属性值的一个子字段，则依旧会触发属性 observer ，且 observer 接收到的 newVal 是变化的那个子字段的值，
  // oldVal 为空， changedPath 包含子字段的字段名相关信息。
  var observer: js.UndefOr[js.Function3[/* value */ T, /* old */ T, /* changedPath */ String, Unit]] = js.native
  var `type`: js.UndefOr[Prop[T] | js.Array[Prop[T]]] = js.native
  var value: js.UndefOr[T | Null | js.Function0[js.Object]] = js.native
}

object PropOptions {
  @scala.inline
  def apply[T](): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions[T]]
  }
  @scala.inline
  implicit class PropOptionsOps[Self[t] <: PropOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withObserver(value: (/* value */ T, /* old */ T, /* changedPath */ String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutObserver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeFunction0(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: Prop[T] | js.Array[Prop[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFunction0(value: () => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: T | js.Function0[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

