package typingsSlinky.officeUiFabricReact.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Section extends js.Object {
  var section: ReactElement
  var title: String
}

object Section {
  @scala.inline
  def apply(section: ReactElement, title: String): Section = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
}

