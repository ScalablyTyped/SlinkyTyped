package typingsSlinky.reactDashI18next.reactDashI18nextMod

import slinky.core.TagMod
import typingsSlinky.i18next.i18nextMod.TFunction
import typingsSlinky.i18next.i18nextMod.i18n
import typingsSlinky.reactDashI18next.Anon_I18nLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationProps extends js.Object {
  var i18n: js.UndefOr[typingsSlinky.i18next.i18nextMod.i18n] = js.undefined
  var ns: js.UndefOr[Namespace] = js.undefined
  def children(t: TFunction, options: Anon_I18nLng): TagMod[Any]
}

object TranslationProps {
  @scala.inline
  def apply(children: (TFunction, Anon_I18nLng) => TagMod[Any], i18n: i18n = null, ns: Namespace = null): TranslationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationProps]
  }
}

