package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindow extends js.Object {
  val Events: IWindowEvents = js.native
  val Handle: Double = js.native
  var Height: Double = js.native
  val IsFocused: Boolean = js.native
  var Maximizable: Boolean = js.native
  var Minimizable: Boolean = js.native
  var Resizable: Boolean = js.native
  var Title: String = js.native
  var Width: Double = js.native
  def Close(): Unit = js.native
  def Focus(): Unit = js.native
  def Maximize(): Unit = js.native
  def Minimize(): Unit = js.native
  def Restore(): Unit = js.native
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit = js.native
}

object IWindow {
  @scala.inline
  def apply(
    Close: () => Unit,
    Events: IWindowEvents,
    Focus: () => Unit,
    Handle: Double,
    Height: Double,
    IsFocused: Boolean,
    Maximizable: Boolean,
    Maximize: () => Unit,
    Minimizable: Boolean,
    Minimize: () => Unit,
    Resizable: Boolean,
    Restore: () => Unit,
    SetDefaultSize: (Double, Double, Boolean) => Unit,
    Title: String,
    Width: Double
  ): IWindow = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Events = Events.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFocused = IsFocused.asInstanceOf[js.Any], Maximizable = Maximizable.asInstanceOf[js.Any], Maximize = js.Any.fromFunction0(Maximize), Minimizable = Minimizable.asInstanceOf[js.Any], Minimize = js.Any.fromFunction0(Minimize), Resizable = Resizable.asInstanceOf[js.Any], Restore = js.Any.fromFunction0(Restore), SetDefaultSize = js.Any.fromFunction3(SetDefaultSize), Title = Title.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindow]
  }
  @scala.inline
  implicit class IWindowOps[Self <: IWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvents(value: IWindowEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinimizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDefaultSize(value: (Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultSize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

