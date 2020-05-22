package typingsSlinky.reactFinalFormListeners.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternallyChangedProps extends js.Object {
  var name: String
  def children(externallyChanged: Boolean): TagMod[Any]
}

object ExternallyChangedProps {
  @scala.inline
  def apply(children: Boolean => TagMod[Any], name: String): ExternallyChangedProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternallyChangedProps]
  }
}

