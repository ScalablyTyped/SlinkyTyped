package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemElementCustomColor event.
  */
@js.native
trait ASPxClientDashboardItemElementCustomColorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Gets the color of the current dashboard item element.
    */
  def GetColor(): String = js.native
  /**
    * Gets measures corresponding to the current dashboard item element.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure] = js.native
  /**
    * Gets the axis point tuple that corresponds to the current dashboard item element.
    */
  def GetTargetElement(): ASPxClientDashboardItemDataAxisPointTuple = js.native
  /**
    * Sets the color of the current dashboard item element.
    * @param color A String that specifies the color of the current dashboard item element.
    */
  def SetColor(color: String): Unit = js.native
}

object ASPxClientDashboardItemElementCustomColorEventArgs {
  @scala.inline
  def apply(
    GetColor: () => String,
    GetMeasures: () => js.Array[ASPxClientDashboardItemDataMeasure],
    GetTargetElement: () => ASPxClientDashboardItemDataAxisPointTuple,
    ItemName: String,
    SetColor: String => Unit
  ): ASPxClientDashboardItemElementCustomColorEventArgs = {
    val __obj = js.Dynamic.literal(GetColor = js.Any.fromFunction0(GetColor), GetMeasures = js.Any.fromFunction0(GetMeasures), GetTargetElement = js.Any.fromFunction0(GetTargetElement), ItemName = ItemName.asInstanceOf[js.Any], SetColor = js.Any.fromFunction1(SetColor))
    __obj.asInstanceOf[ASPxClientDashboardItemElementCustomColorEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemElementCustomColorEventArgsOps[Self <: ASPxClientDashboardItemElementCustomColorEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMeasures(value: () => js.Array[ASPxClientDashboardItemDataMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMeasures")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetElement(value: () => ASPxClientDashboardItemDataAxisPointTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTargetElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetColor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

