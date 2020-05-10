package typingsSlinky.nextServer.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadableGeneratedOptions extends js.Object {
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
  var webpack: js.UndefOr[js.Function0[_]] = js.native
}

object LoadableGeneratedOptions {
  @scala.inline
  def apply(): LoadableGeneratedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadableGeneratedOptions]
  }
  @scala.inline
  implicit class LoadableGeneratedOptionsOps[Self <: LoadableGeneratedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModules(value: () => LoaderMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpack(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWebpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.undefined)
        ret
    }
  }
  
}

