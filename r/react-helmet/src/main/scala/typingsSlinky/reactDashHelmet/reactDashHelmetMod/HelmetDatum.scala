package typingsSlinky.reactDashHelmet.reactDashHelmetMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetDatum extends js.Object {
  def toComponent(): ReactComponentClass[_]
}

object HelmetDatum {
  @scala.inline
  def apply(toComponent: () => ReactComponentClass[_]): HelmetDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
  
    __obj.asInstanceOf[HelmetDatum]
  }
}

