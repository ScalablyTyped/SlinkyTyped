package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardProperties[TLength]
  extends StandardLonghandProperties[TLength]
     with StandardShorthandProperties[TLength]

object StandardProperties {
  @scala.inline
  def apply[TLength](): StandardProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardProperties[TLength]]
  }
}

