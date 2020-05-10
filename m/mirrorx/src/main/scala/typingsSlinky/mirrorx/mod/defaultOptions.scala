package typingsSlinky.mirrorx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait defaultOptions extends js.Object {
  var historyMode: js.UndefOr[String] = js.native
  var initialState: js.UndefOr[js.Object] = js.native
  var middlewares: js.Array[_] = js.native
  def addEffect(name: String, handler: js.Function0[_]): js.Any = js.native
}

object defaultOptions {
  @scala.inline
  def apply(addEffect: (String, js.Function0[_]) => js.Any, middlewares: js.Array[_]): defaultOptions = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction2(addEffect), middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
  @scala.inline
  implicit class defaultOptionsOps[Self <: defaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEffect(value: (String, js.Function0[_]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEffect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMiddlewares(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistoryMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
  }
  
}

