package typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The props for TabSpaceComponent.
  */
@js.native
trait IProps extends js.Object {
  /**
    * Whether to use spaces or tabs.
    */
  var isSpaces: Boolean = js.native
  /**
    * The number of spaces to insert on tab.
    */
  var tabSpace: Double = js.native
  /**
    * A click handler for the TabSpace component. By default
    * opens a menu allowing the user to select tabs vs spaces.
    */
  def handleClick(): Unit = js.native
}

object IProps {
  @scala.inline
  def apply(handleClick: () => Unit, isSpaces: Boolean, tabSpace: Double): IProps = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), isSpaces = isSpaces.asInstanceOf[js.Any], tabSpace = tabSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSpace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

