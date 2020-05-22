package typingsSlinky.activexPowerpoint.anon

import typingsSlinky.activexPowerpoint.PowerPoint.DocumentWindow
import typingsSlinky.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresWn extends js.Object {
  val Pres: Presentation
  val Wn: DocumentWindow
}

object PresWn {
  @scala.inline
  def apply(Pres: Presentation, Wn: DocumentWindow): PresWn = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresWn]
  }
}

