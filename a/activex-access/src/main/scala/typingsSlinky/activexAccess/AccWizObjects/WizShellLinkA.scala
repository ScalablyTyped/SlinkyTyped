package typingsSlinky.activexAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WizShellLinkA Class */
@js.native
trait WizShellLinkA extends js.Object {
  @JSName("AccWizObjects.WizShellLinkA_typekey")
  var AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA = js.native
  /** GetArguments */
  def GetArguments(pszArgs: String, cchMaxPath: Double): Unit = js.native
  /** GetDescription */
  def GetDescription(pszName: String, cchMaxName: Double): Unit = js.native
  /** GetHotkey */
  def GetHotkey(pwHotkey: Double): Unit = js.native
  /** GetIDList */
  def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit = js.native
  /** GetIconLocation */
  def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit = js.native
  /** GetPath */
  def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit = js.native
  /** GetShowCmd */
  def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit = js.native
  /** GetWorkingDirectory */
  def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit = js.native
  /** Resolve */
  def Resolve(hWnd: Double, fflags: Double): Unit = js.native
  /** SetArguments */
  def SetArguments(pszArgs: String): Unit = js.native
  /** SetDescription */
  def SetDescription(pszName: String): Unit = js.native
  /** SetHotkey */
  def SetHotkey(wHotkey: Double): Unit = js.native
  /** SetIDList */
  def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit = js.native
  /** SetIconLocation */
  def SetIconLocation(pszIconPath: String, iIcon: Double): Unit = js.native
  /** SetPath */
  def SetPath(pszFile: String): Unit = js.native
  /** SetRelativePath */
  def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit = js.native
  /** SetShowCmd */
  def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit = js.native
  /** SetWorkingDirectory */
  def SetWorkingDirectory(pszDir: String): Unit = js.native
}

object WizShellLinkA {
  @scala.inline
  def apply(
    AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA,
    GetArguments: (String, Double) => Unit,
    GetDescription: (String, Double) => Unit,
    GetHotkey: Double => Unit,
    GetIDList: WIZ_CSIDL_FLAGS => Unit,
    GetIconLocation: (String, Double, Double) => Unit,
    GetPath: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit,
    GetShowCmd: WIZ_SW_FLAGS => Unit,
    GetWorkingDirectory: (String, Double) => Unit,
    Resolve: (Double, Double) => Unit,
    SetArguments: String => Unit,
    SetDescription: String => Unit,
    SetHotkey: Double => Unit,
    SetIDList: WIZ_CSIDL_FLAGS => Unit,
    SetIconLocation: (String, Double) => Unit,
    SetPath: String => Unit,
    SetRelativePath: (String, Double) => Unit,
    SetShowCmd: WIZ_SW_FLAGS => Unit,
    SetWorkingDirectory: String => Unit
  ): WizShellLinkA = {
    val __obj = js.Dynamic.literal(GetArguments = js.Any.fromFunction2(GetArguments), GetDescription = js.Any.fromFunction2(GetDescription), GetHotkey = js.Any.fromFunction1(GetHotkey), GetIDList = js.Any.fromFunction1(GetIDList), GetIconLocation = js.Any.fromFunction3(GetIconLocation), GetPath = js.Any.fromFunction4(GetPath), GetShowCmd = js.Any.fromFunction1(GetShowCmd), GetWorkingDirectory = js.Any.fromFunction2(GetWorkingDirectory), Resolve = js.Any.fromFunction2(Resolve), SetArguments = js.Any.fromFunction1(SetArguments), SetDescription = js.Any.fromFunction1(SetDescription), SetHotkey = js.Any.fromFunction1(SetHotkey), SetIDList = js.Any.fromFunction1(SetIDList), SetIconLocation = js.Any.fromFunction2(SetIconLocation), SetPath = js.Any.fromFunction1(SetPath), SetRelativePath = js.Any.fromFunction2(SetRelativePath), SetShowCmd = js.Any.fromFunction1(SetShowCmd), SetWorkingDirectory = js.Any.fromFunction1(SetWorkingDirectory))
    __obj.updateDynamic("AccWizObjects.WizShellLinkA_typekey")(AccWizObjectsDotWizShellLinkA_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizShellLinkA]
  }
  @scala.inline
  implicit class WizShellLinkAOps[Self <: WizShellLinkA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccWizObjectsDotWizShellLinkA_typekey(value: WizShellLinkA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccWizObjects.WizShellLinkA_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArguments(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetArguments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDescription")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetHotkey(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHotkey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIDList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIconLocation(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIconLocation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPath(value: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPath")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetShowCmd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkingDirectory(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorkingDirectory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolve(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolve")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetArguments(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetArguments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHotkey(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetHotkey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIDList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIconLocation(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIconLocation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPath(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRelativePath(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetRelativePath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetShowCmd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWorkingDirectory(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWorkingDirectory")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

