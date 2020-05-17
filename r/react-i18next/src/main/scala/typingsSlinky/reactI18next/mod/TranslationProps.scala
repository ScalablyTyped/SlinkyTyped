package typingsSlinky.reactI18next.mod

import slinky.core.TagMod
import typingsSlinky.i18next.mod.TFunction
import typingsSlinky.i18next.mod.i18n
import typingsSlinky.reactI18next.anon.Lng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationProps extends js.Object {
  var i18n: js.UndefOr[typingsSlinky.i18next.mod.i18n] = js.native
  var ns: js.UndefOr[Namespace] = js.native
  def children(t: TFunction, options: Lng): TagMod[Any] = js.native
}

object TranslationProps {
  @scala.inline
  def apply(children: (TFunction, Lng) => TagMod[Any]): TranslationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    __obj.asInstanceOf[TranslationProps]
  }
  @scala.inline
  implicit class TranslationPropsOps[Self <: TranslationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: (TFunction, Lng) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withI18n(value: i18n): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withNs(value: Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(js.undefined)
        ret
    }
  }
  
}

