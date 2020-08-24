package typingsSlinky.reactI18next.mod

import slinky.core.facade.ReactElement
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
  def children(t: TFunction, options: Lng, ready: Boolean): ReactElement = js.native
}

object TranslationProps {
  @scala.inline
  def apply(children: (TFunction, Lng, Boolean) => ReactElement): TranslationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    __obj.asInstanceOf[TranslationProps]
  }
  @scala.inline
  implicit class TranslationPropsOps[Self <: TranslationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: (TFunction, Lng, Boolean) => ReactElement): Self = this.set("children", js.Any.fromFunction3(value))
    @scala.inline
    def setI18n(value: i18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    @scala.inline
    def setNsVarargs(value: String*): Self = this.set("ns", js.Array(value :_*))
    @scala.inline
    def setNs(value: Namespace): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
  }
  
}

