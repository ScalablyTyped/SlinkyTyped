package typingsSlinky.linguiReact.i18nMod

import slinky.core.facade.ReactElement
import typingsSlinky.linguiReact.anon.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nComponentProps extends js.Object {
  var update: js.UndefOr[Boolean] = js.native
  var withHash: js.UndefOr[Boolean] = js.native
  def children(hasI18nI18nHash: I18n): ReactElement = js.native
}

object I18nComponentProps {
  @scala.inline
  def apply(children: I18n => ReactElement): I18nComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[I18nComponentProps]
  }
  @scala.inline
  implicit class I18nComponentPropsOps[Self <: I18nComponentProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: I18n => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setWithHash(value: Boolean): Self = this.set("withHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithHash: Self = this.set("withHash", js.undefined)
  }
  
}

