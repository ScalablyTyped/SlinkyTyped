package typingsSlinky.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelContainer extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  def setTitle(title: String): Unit = js.native
  def setTitleIcon(iconName: String): Unit = js.native
}

object PanelContainer {
  @scala.inline
  def apply(height: Double, setTitle: String => Unit, setTitleIcon: String => Unit, width: Double): PanelContainer = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], setTitle = js.Any.fromFunction1(setTitle), setTitleIcon = js.Any.fromFunction1(setTitleIcon), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelContainer]
  }
  @scala.inline
  implicit class PanelContainerOps[Self <: PanelContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitleIcon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

