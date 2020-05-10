package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOptions extends js.Object {
  var autoBindInjectable: js.UndefOr[Boolean] = js.native
  var defaultScope: js.UndefOr[BindingScope] = js.native
  var skipBaseClassChecks: js.UndefOr[Boolean] = js.native
}

object ContainerOptions {
  @scala.inline
  def apply(): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOptions]
  }
  @scala.inline
  implicit class ContainerOptionsOps[Self <: ContainerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBindInjectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBindInjectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBindInjectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBindInjectable")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultScope(value: BindingScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipBaseClassChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBaseClassChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBaseClassChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBaseClassChecks")(js.undefined)
        ret
    }
  }
  
}

