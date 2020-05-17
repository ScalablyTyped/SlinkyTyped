package typingsSlinky.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shortcut Object */
@js.native
trait WshShortcut extends js.Object {
  var Arguments: String = js.native
  var Description: String = js.native
  val FullName: String = js.native
  var Hotkey: String = js.native
  @JSName("IWshRuntimeLibrary.WshShortcut_typekey")
  var IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut = js.native
  var IconLocation: String = js.native
  val RelativePath: String = js.native
  var TargetPath: String = js.native
  /**
    * Possible values:
    *
    * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
    * when displaying the window for the first time.
    * * **3** -- Activates the window and displays it as a maximized window.
    * * **7** -- Displays the window as a minimized window. The active window remains active.
    */
  var WindowStyle: ShortcutWindowStyle = js.native
  var WorkingDirectory: String = js.native
  def Load(PathLink: String): Unit = js.native
  def Save(): Unit = js.native
}

object WshShortcut {
  @scala.inline
  def apply(
    Arguments: String,
    Description: String,
    FullName: String,
    Hotkey: String,
    IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut,
    IconLocation: String,
    Load: String => Unit,
    RelativePath: String,
    Save: () => Unit,
    TargetPath: String,
    WindowStyle: ShortcutWindowStyle,
    WorkingDirectory: String
  ): WshShortcut = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Hotkey = Hotkey.asInstanceOf[js.Any], IconLocation = IconLocation.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), RelativePath = RelativePath.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), TargetPath = TargetPath.asInstanceOf[js.Any], WindowStyle = WindowStyle.asInstanceOf[js.Any], WorkingDirectory = WorkingDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("IWshRuntimeLibrary.WshShortcut_typekey")(IWshRuntimeLibraryDotWshShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WshShortcut]
  }
  @scala.inline
  implicit class WshShortcutOps[Self <: WshShortcut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHotkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hotkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIWshRuntimeLibraryDotWshShortcut_typekey(value: WshShortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IWshRuntimeLibrary.WshShortcut_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowStyle(value: ShortcutWindowStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkingDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingDirectory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

