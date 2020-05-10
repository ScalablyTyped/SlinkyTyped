package typingsSlinky.pixiJs.PIXI

import typingsSlinky.pixiJs.PIXI.Loader.loaderMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin to be installed for handling specific Loader resources.
  *
  * @memberof PIXI
  * @typedef ILoaderPlugin
  * @property {function} [add] - Function to call immediate after registering plugin.
  * @property {PIXI.Loader.loaderMiddleware} [pre] - Middleware function to run before load, the
  *           arguments for this are `(resource, next)`
  * @property {PIXI.Loader.loaderMiddleware} [use] - Middleware function to run after load, the
  *           arguments for this are `(resource, next)`
  */
@js.native
trait ILoaderPlugin extends js.Object {
  var add: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var pre: js.UndefOr[loaderMiddleware] = js.native
  var use: js.UndefOr[loaderMiddleware] = js.native
}

object ILoaderPlugin {
  @scala.inline
  def apply(): ILoaderPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderPlugin]
  }
  @scala.inline
  implicit class ILoaderPluginOps[Self <: ILoaderPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(
      value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(
      value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

