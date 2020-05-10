package typingsSlinky.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
  */
@js.native
trait IAriaProvider extends js.Object {
  def config(config: IAriaProviderOptions): Unit = js.native
}

object IAriaProvider {
  @scala.inline
  def apply(config: IAriaProviderOptions => Unit): IAriaProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
    __obj.asInstanceOf[IAriaProvider]
  }
  @scala.inline
  implicit class IAriaProviderOps[Self <: IAriaProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: IAriaProviderOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

