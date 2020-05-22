package typingsSlinky.reactNativeScrollableTabView.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTabProperties extends js.Object {
  // previousPage
  var from: Double
  // currentPage
  var i: Double
  // currentPage object
  var ref: ReactElement
}

object ChangeTabProperties {
  @scala.inline
  def apply(from: Double, i: Double, ref: ReactElement): ChangeTabProperties = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTabProperties]
  }
}

