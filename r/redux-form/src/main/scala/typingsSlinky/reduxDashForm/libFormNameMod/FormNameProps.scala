package typingsSlinky.reduxDashForm.libFormNameMod

import slinky.core.TagMod
import typingsSlinky.reduxDashForm.Anon_Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: Anon_Form): TagMod[Any]
}

object FormNameProps {
  @scala.inline
  def apply(children: Anon_Form => TagMod[Any]): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[FormNameProps]
  }
}

