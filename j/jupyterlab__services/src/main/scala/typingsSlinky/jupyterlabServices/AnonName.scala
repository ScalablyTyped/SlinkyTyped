package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stderr
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: stdout | stderr
  var text: String
}

object AnonName {
  @scala.inline
  def apply(name: stdout | stderr, text: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

