package typingsSlinky.opentok.mod

import typingsSlinky.opentok.opentokStrings.bestFit
import typingsSlinky.opentok.opentokStrings.horizontalPresentation
import typingsSlinky.opentok.opentokStrings.pip
import typingsSlinky.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredefinedArchiveLayoutOptions extends ArchiveLayoutOptions {
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation = js.native
}

object PredefinedArchiveLayoutOptions {
  @scala.inline
  def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
  @scala.inline
  implicit class PredefinedArchiveLayoutOptionsOps[Self <: PredefinedArchiveLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: bestFit | pip | verticalPresentation | horizontalPresentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

