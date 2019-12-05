package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var modificationTime: js.Date
}

object Metadata {
  @scala.inline
  def apply(modificationTime: js.Date): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

