package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
@js.native
trait ASPxClientRibbonItem extends js.Object {
  /**
    * Gets the client group object to which the current item belongs.
    */
  var group: ASPxClientRibbonGroup = js.native
  /**
    * Gets or sets the item's index within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name of the current ribbon item.
    */
  var name: String = js.native
  /**
    * Gets the client ribbon object to which the current item belongs.
    */
  var ribbon: ASPxClientRibbon = js.native
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the item value.
    */
  def GetValue(): js.Any = js.native
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  def SetValue(value: js.Any): Unit = js.native
}

object ASPxClientRibbonItem {
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetValue: js.Any => Unit,
    group: ASPxClientRibbonGroup,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetValue = js.Any.fromFunction1(SetValue), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonItem]
  }
  @scala.inline
  implicit class ASPxClientRibbonItemOps[Self <: ASPxClientRibbonItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroup(value: ASPxClientRibbonGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRibbon(value: ASPxClientRibbon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

