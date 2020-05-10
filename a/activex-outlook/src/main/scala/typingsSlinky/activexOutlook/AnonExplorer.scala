package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Explorer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExplorer extends js.Object {
  val Explorer: typingsSlinky.activexOutlook.Outlook.Explorer = js.native
}

object AnonExplorer {
  @scala.inline
  def apply(Explorer: Explorer): AnonExplorer = {
    val __obj = js.Dynamic.literal(Explorer = Explorer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExplorer]
  }
  @scala.inline
  implicit class AnonExplorerOps[Self <: AnonExplorer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplorer(value: Explorer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Explorer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

