package typingsSlinky.reactDashResolver

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[P] extends js.Object {
  var Resolved: ReactComponentClass[P]
  var data: js.Any
}

object Anon_Data {
  @scala.inline
  def apply[P](Resolved: ReactComponentClass[P], data: js.Any): Anon_Data[P] = {
    val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data[P]]
  }
}

