package typingsSlinky.ono.stackMod

import typingsSlinky.ono.onoBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Property Descriptor of a lazily-computed `stack` property.
  */
@js.native
trait LazyStack extends js.Object {
  var configurable: `true` = js.native
  /**
    * Lazily computes the error's stack trace.
    */
  def get(): js.UndefOr[String] = js.native
}

object LazyStack {
  @scala.inline
  def apply(configurable: `true`, get: () => js.UndefOr[String]): LazyStack = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[LazyStack]
  }
  @scala.inline
  implicit class LazyStackOps[Self <: LazyStack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurable(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: () => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

