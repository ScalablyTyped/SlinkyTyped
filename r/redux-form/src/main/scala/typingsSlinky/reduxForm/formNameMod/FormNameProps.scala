package typingsSlinky.reduxForm.formNameMod

import slinky.core.TagMod
import typingsSlinky.reduxForm.anon.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: Form): TagMod[Any]
}

object FormNameProps {
  @scala.inline
  def apply(children: Form => TagMod[Any]): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[FormNameProps]
  }
}

