package typingsSlinky.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluginDefinition extends js.Object {
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.native
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.native
  var hidpi: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.native
  var lang: js.UndefOr[String | js.Array[String]] = js.native
  var onLoad: js.UndefOr[js.Function0[_]] = js.native
  var requires: js.UndefOr[String | js.Array[String]] = js.native
}

object pluginDefinition {
  @scala.inline
  def apply(): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluginDefinition]
  }
  @scala.inline
  implicit class pluginDefinitionOps[Self <: pluginDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInit(value: /* editor */ editor => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInit(value: /* editor */ editor => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withHidpi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidpi")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* editor */ editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withRequires(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(js.undefined)
        ret
    }
  }
  
}

