package typingsSlinky.mobx.anon

import typingsSlinky.mobx.coreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enumerable extends js.Object {
  var configurable: Boolean = js.native
  var enumerable: Boolean = js.native
  var value: js.UndefOr[scala.Nothing] = js.native
  var writable: Boolean = js.native
  def initializer(): js.Function with IAction = js.native
}

object Enumerable {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: () => js.Function with IAction,
    writable: Boolean
  ): Enumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], initializer = js.Any.fromFunction0(initializer), writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enumerable]
  }
  @scala.inline
  implicit class EnumerableOps[Self <: Enumerable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumerable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitializer(value: () => js.Function with IAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWritable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

