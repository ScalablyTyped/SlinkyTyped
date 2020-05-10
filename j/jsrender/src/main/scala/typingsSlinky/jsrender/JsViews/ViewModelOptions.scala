package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ViewModels
@js.native
trait ViewModelOptions extends js.Object {
  var extend: js.UndefOr[Hash[_]] = js.native
  /* ViewModel options hash */
  // getters?: string[] | ;
  var getters: js.UndefOr[js.Array[_]] = js.native
  var id: js.UndefOr[String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])] = js.native
}

object ViewModelOptions {
  @scala.inline
  def apply(): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewModelOptions]
  }
  @scala.inline
  implicit class ViewModelOptionsOps[Self <: ViewModelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtend(value: Hash[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withGetters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(js.undefined)
        ret
    }
    @scala.inline
    def withIdFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

