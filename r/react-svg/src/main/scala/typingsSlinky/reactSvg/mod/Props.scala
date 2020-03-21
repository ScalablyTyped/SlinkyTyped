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

trait Props extends js.Object {
  var afterInjection: js.UndefOr[Errback] = js.undefined
  var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var fallback: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var loading: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  var src: String
  var wrapper: js.UndefOr[div | span] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: String,
    afterInjection: (/* error */ js.Error | Null, /* svg */ js.UndefOr[Element]) => Unit = null,
    beforeInjection: /* svg */ Element => Unit = null,
    evalScripts: EvalScripts = null,
    fallback: ReactComponentClass[_] = null,
    loading: ReactComponentClass[_] = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined,
    wrapper: div | span = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (afterInjection != null) __obj.updateDynamic("afterInjection")(js.Any.fromFunction2(afterInjection))
    if (beforeInjection != null) __obj.updateDynamic("beforeInjection")(js.Any.fromFunction1(beforeInjection))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

