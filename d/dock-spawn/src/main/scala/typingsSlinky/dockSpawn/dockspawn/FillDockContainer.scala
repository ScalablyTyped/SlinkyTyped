package typingsSlinky.dockSpawn.dockspawn

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillDockContainer extends js.Object {
  var containerType: String = js.native
  var dockManager: DockManager = js.native
  var element: HTMLDivElement = js.native
  var minimumAllowedChildNodes: Double = js.native
  var name: String = js.native
  var tabHost: TabHost = js.native
  var tabOrientation: TabStripDirection = js.native
}

object FillDockContainer {
  @scala.inline
  def apply(
    containerType: String,
    dockManager: DockManager,
    element: HTMLDivElement,
    minimumAllowedChildNodes: Double,
    name: String,
    tabHost: TabHost,
    tabOrientation: TabStripDirection
  ): FillDockContainer = {
    val __obj = js.Dynamic.literal(containerType = containerType.asInstanceOf[js.Any], dockManager = dockManager.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], minimumAllowedChildNodes = minimumAllowedChildNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabHost = tabHost.asInstanceOf[js.Any], tabOrientation = tabOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillDockContainer]
  }
  @scala.inline
  implicit class FillDockContainerOps[Self <: FillDockContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockManager(value: DockManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumAllowedChildNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAllowedChildNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabHost(value: TabHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabOrientation(value: TabStripDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabOrientation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

