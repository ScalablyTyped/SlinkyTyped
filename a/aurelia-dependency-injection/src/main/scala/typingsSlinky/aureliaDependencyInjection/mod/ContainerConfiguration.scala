package typingsSlinky.aureliaDependencyInjection.mod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerConfiguration extends js.Object {
  var handlers: js.UndefOr[Map[_, _]] = js.native
  var onHandlerCreated: js.UndefOr[
    js.Function1[/* handler */ InvocationHandler[_, _, _], InvocationHandler[_, _, _]]
  ] = js.native
}

object ContainerConfiguration {
  @scala.inline
  def apply(): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerConfiguration]
  }
  @scala.inline
  implicit class ContainerConfigurationOps[Self <: ContainerConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: Map[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHandlerCreated(value: /* handler */ InvocationHandler[_, _, _] => InvocationHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandlerCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHandlerCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandlerCreated")(js.undefined)
        ret
    }
  }
  
}

