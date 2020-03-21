package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSection extends js.Object {
  var section: ReactElement
  var title: String
}

object AnonSection {
  @scala.inline
  def apply(section: ReactElement, title: String): AnonSection = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSection]
  }
}

