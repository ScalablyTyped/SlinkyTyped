package typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementObject extends js.Object {
  var element: ReactElement | ReactComponentClass[_]
}

object ElementObject {
  @scala.inline
  def apply(element: ReactElement | ReactComponentClass[_]): ElementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementObject]
  }
}

