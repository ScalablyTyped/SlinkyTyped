package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxProgressBar control.
  */
@js.native
trait ASPxClientProgressBar extends ASPxClientEditBase {
  /**
    * Returns the text displayed within the progress bar.
    */
  def GetDisplayText(): String = js.native
  /**
    * Gets the maximum range value of the progress bar.
    */
  def GetMaximum(): Double = js.native
  /**
    * Gets the minimum range value of the progress bar.
    */
  def GetMinimum(): Double = js.native
  /**
    * Sets the percentage representation of the progress position.
    */
  def GetPercent(): Double = js.native
  /**
    * Gets the position of the operation's progress.
    */
  def GetPosition(): Double = js.native
  /**
    * Sets the pattern used to format the displayed text for the progress bar.
    * @param text A  value that is the format pattern.
    */
  def SetCustomDisplayFormat(text: String): Unit = js.native
  /**
    * Sets the maximum range value of the progress bar.
    * @param max An integer value specifying the maximum value of the progress bar range.
    */
  def SetMaximum(max: Double): Unit = js.native
  /**
    * Sets the minimum and maximum range values of the progress bar.
    * @param minValue An integer value specifying the minimum value of the progress bar range.
    * @param maxValue An integer value specifying the maximum value of the progress bar range.
    */
  def SetMinMaxValues(minValue: Double, maxValue: Double): Unit = js.native
  /**
    * Sets the minimum range value of the progress bar.
    * @param min An integer value specifying the minimum value of the progress bar range.
    */
  def SetMinimum(min: Double): Unit = js.native
  /**
    * Sets the position of the operation's progress.
    * @param position An integer value specifying the progress position.
    */
  def SetPosition(position: Double): Unit = js.native
}

object ASPxClientProgressBar {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetDisplayText: () => String,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetMaximum: () => Double,
    GetMinimum: () => Double,
    GetParentControl: () => js.Any,
    GetPercent: () => Double,
    GetPosition: () => Double,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetCustomDisplayFormat: String => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetMaximum: Double => Unit,
    SetMinMaxValues: (Double, Double) => Unit,
    SetMinimum: Double => Unit,
    SetPosition: Double => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientProgressBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaximum = js.Any.fromFunction0(GetMaximum), GetMinimum = js.Any.fromFunction0(GetMinimum), GetParentControl = js.Any.fromFunction0(GetParentControl), GetPercent = js.Any.fromFunction0(GetPercent), GetPosition = js.Any.fromFunction0(GetPosition), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetCustomDisplayFormat = js.Any.fromFunction1(SetCustomDisplayFormat), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetMaximum = js.Any.fromFunction1(SetMaximum), SetMinMaxValues = js.Any.fromFunction2(SetMinMaxValues), SetMinimum = js.Any.fromFunction1(SetMinimum), SetPosition = js.Any.fromFunction1(SetPosition), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientProgressBar]
  }
  @scala.inline
  implicit class ASPxClientProgressBarOps[Self <: ASPxClientProgressBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDisplayText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDisplayText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaximum(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMaximum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinimum(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMinimum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPercent(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPercent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCustomDisplayFormat(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCustomDisplayFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaximum(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMaximum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinMaxValues(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMinMaxValues")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMinimum(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMinimum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPosition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

