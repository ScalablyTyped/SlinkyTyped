package typingsSlinky.reactFinalFormListeners.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternallyChangedProps extends js.Object {
  var name: String = js.native
  def children(externallyChanged: Boolean): TagMod[Any] = js.native
}

object ExternallyChangedProps {
  @scala.inline
  def apply(children: Boolean => TagMod[Any], name: String): ExternallyChangedProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternallyChangedProps]
  }
  @scala.inline
  implicit class ExternallyChangedPropsOps[Self <: ExternallyChangedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Boolean => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

