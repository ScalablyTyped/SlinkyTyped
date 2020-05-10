package typingsSlinky.angularDeferredBootstrap.angular

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeferredBootstrapperStatic extends js.Object {
  def bootstrap(configParam: IConfigParam): IPromise[Boolean] = js.native
}

object IDeferredBootstrapperStatic {
  @scala.inline
  def apply(bootstrap: IConfigParam => IPromise[Boolean]): IDeferredBootstrapperStatic = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap))
    __obj.asInstanceOf[IDeferredBootstrapperStatic]
  }
  @scala.inline
  implicit class IDeferredBootstrapperStaticOps[Self <: IDeferredBootstrapperStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrap(value: IConfigParam => IPromise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

