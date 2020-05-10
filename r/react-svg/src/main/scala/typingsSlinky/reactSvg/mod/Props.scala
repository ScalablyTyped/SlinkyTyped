package typingsSlinky.reactSvg.mod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.reactSvg.reactSvgStrings.div
import typingsSlinky.reactSvg.reactSvgStrings.span
import typingsSlinky.tanemSvgInjector.typesMod.BeforeEach
import typingsSlinky.tanemSvgInjector.typesMod.Errback
import typingsSlinky.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var afterInjection: js.UndefOr[Errback] = js.native
  var beforeInjection: js.UndefOr[BeforeEach] = js.native
  var evalScripts: js.UndefOr[EvalScripts] = js.native
  var fallback: js.UndefOr[ReactComponentClass[_]] = js.native
  var loading: js.UndefOr[ReactComponentClass[_]] = js.native
  var renumerateIRIElements: js.UndefOr[Boolean] = js.native
  var src: String = js.native
  var wrapper: js.UndefOr[div | span] = js.native
}

object Props {
  @scala.inline
  def apply(src: String): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterInjection(value: (/* error */ js.Error | Null, /* svg */ js.UndefOr[Element]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInjection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInjection(value: /* svg */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInjection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalScripts(value: EvalScripts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallback(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withRenumerateIRIElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumerateIRIElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenumerateIRIElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renumerateIRIElements")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: div | span): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

