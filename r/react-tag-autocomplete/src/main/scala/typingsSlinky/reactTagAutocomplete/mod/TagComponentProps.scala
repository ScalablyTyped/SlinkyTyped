package typingsSlinky.reactTagAutocomplete.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagComponentProps extends js.Object {
  var classNames: ClassNames
  var tag: Tag
  def onDelete(event: SyntheticMouseEvent[HTMLButtonElement]): Unit
}

object TagComponentProps {
  @scala.inline
  def apply(classNames: ClassNames, onDelete: SyntheticMouseEvent[HTMLButtonElement] => Unit, tag: Tag): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagComponentProps]
  }
}

