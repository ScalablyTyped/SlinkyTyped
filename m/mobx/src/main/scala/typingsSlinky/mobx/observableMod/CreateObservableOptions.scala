package typingsSlinky.mobx.observableMod

import typingsSlinky.mobx.comparerMod.IEqualsComparer
import typingsSlinky.mobx.observabledecoratorMod.IObservableDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateObservableOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var defaultDecorator: js.UndefOr[IObservableDecorator] = js.native
  @JSName("equals")
  var equals_FCreateObservableOptions: js.UndefOr[IEqualsComparer[_]] = js.native
  var name: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[Boolean] = js.native
}

object CreateObservableOptions {
  @scala.inline
  def apply(): CreateObservableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateObservableOptions]
  }
  @scala.inline
  implicit class CreateObservableOptionsOps[Self <: CreateObservableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDecorator(value: IObservableDecorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: (_, _) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

