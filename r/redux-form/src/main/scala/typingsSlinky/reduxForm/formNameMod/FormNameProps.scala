package typingsSlinky.reduxForm.formNameMod

import slinky.core.TagMod
import typingsSlinky.reduxForm.anon.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormNameProps extends js.Object {
  def children(props: Form): TagMod[Any] = js.native
}

object FormNameProps {
  @scala.inline
  def apply(children: Form => TagMod[Any]): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[FormNameProps]
  }
  @scala.inline
  implicit class FormNamePropsOps[Self <: FormNameProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Form => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

