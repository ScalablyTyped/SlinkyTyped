package typingsSlinky.linguiReact.i18nMod

import slinky.core.TagMod
import typingsSlinky.linguiReact.AnonI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nComponentProps extends js.Object {
  var update: js.UndefOr[Boolean] = js.native
  var withHash: js.UndefOr[Boolean] = js.native
  def children(hasI18nI18nHash: AnonI18n): TagMod[Any] = js.native
}

object I18nComponentProps {
  @scala.inline
  def apply(children: AnonI18n => TagMod[Any]): I18nComponentProps = {
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
    def withChildren(value: AnonI18n => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withWithHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHash")(js.undefined)
        ret
    }
  }
  
}

