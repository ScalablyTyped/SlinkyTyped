package typingsSlinky.n8tb1tUseScrollPosition.mod

import typingsSlinky.n8tb1tUseScrollPosition.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollProps extends js.Object {
  var currPos: X
  var prevPos: X
}

object ScrollProps {
  @scala.inline
  def apply(currPos: X, prevPos: X): ScrollProps = {
    val __obj = js.Dynamic.literal(currPos = currPos.asInstanceOf[js.Any], prevPos = prevPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollProps]
  }
}

