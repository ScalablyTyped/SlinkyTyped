package typingsSlinky.reactAriaLive

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  def children(contextProps: AnonAnnounceAssertive): TagMod[Any]
}

object AnonChildren {
  @scala.inline
  def apply(children: AnonAnnounceAssertive => TagMod[Any]): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[AnonChildren]
  }
}

