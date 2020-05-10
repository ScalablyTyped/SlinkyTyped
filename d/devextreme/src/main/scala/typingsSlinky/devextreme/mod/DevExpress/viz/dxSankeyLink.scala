package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankeyLink extends js.Object {
  /** An object that describes the connection. */
  var connection: dxSankeyConnectionInfoObject = js.native
  /** Hides the sankey link's tooltip. */
  def hideTooltip(): Unit = js.native
  /** Changes the sankey link's hover state. */
  def hover(state: Boolean): Unit = js.native
  /** Indicates whether the sankey link is in the hover state. */
  def isHovered(): Boolean = js.native
  /** Shows the sankey link's tooltip. */
  def showTooltip(): Unit = js.native
}

object dxSankeyLink {
  @scala.inline
  def apply(
    connection: dxSankeyConnectionInfoObject,
    hideTooltip: () => Unit,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    showTooltip: () => Unit
  ): dxSankeyLink = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxSankeyLink]
  }
  @scala.inline
  implicit class dxSankeyLinkOps[Self <: dxSankeyLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: dxSankeyConnectionInfoObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHover(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsHovered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

