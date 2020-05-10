package typingsSlinky.reactTagAutocomplete.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagComponentProps extends js.Object {
  var classNames: ClassNames = js.native
  var tag: Tag = js.native
  def onDelete(event: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
}

object TagComponentProps {
  @scala.inline
  def apply(classNames: ClassNames, onDelete: SyntheticMouseEvent[HTMLButtonElement] => Unit, tag: Tag): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagComponentProps]
  }
  @scala.inline
  implicit class TagComponentPropsOps[Self <: TagComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNames(value: ClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDelete(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTag(value: Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

