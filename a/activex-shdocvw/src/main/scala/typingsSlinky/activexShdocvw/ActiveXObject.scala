package typingsSlinky.activexShdocvw

import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.InternetExplorerBeforeNavigate2ArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.InternetExplorerBeforeNavigate2Parameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.InternetExplorerMediumBeforeNavigate2ArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.InternetExplorerMediumBeforeNavigate2Parameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.ShellBrowserWindowBeforeNavigate2ArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.ShellBrowserWindowBeforeNavigate2Parameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.ShellNameSpaceFavoritesSelectionChangeArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.ShellNameSpaceFavoritesSelectionChangeParameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserBeforeNavigate2ArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserBeforeNavigate2Parameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1BeforeNavigateArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1BeforeNavigateParameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1FrameBeforeNavigateArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1FrameBeforeNavigateParameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1FrameNewWindowArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1FrameNewWindowParameter
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1NewWindowArgNames
import typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes.WebBrowserV1NewWindowParameter
import typingsSlinky.activexShdocvw.SHDocVw.InternetExplorer
import typingsSlinky.activexShdocvw.SHDocVw.InternetExplorerMedium
import typingsSlinky.activexShdocvw.SHDocVw.ShellBrowserWindow
import typingsSlinky.activexShdocvw.SHDocVw.ShellNameSpace
import typingsSlinky.activexShdocvw.SHDocVw.ShellWindows
import typingsSlinky.activexShdocvw.SHDocVw.WebBrowser
import typingsSlinky.activexShdocvw.SHDocVw.WebBrowserV1
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ActiveDocument
import typingsSlinky.activexShdocvw.activexShdocvwStrings.BeforeNavigate
import typingsSlinky.activexShdocvw.activexShdocvwStrings.BeforeNavigate2
import typingsSlinky.activexShdocvw.activexShdocvwStrings.BeforeScriptExecute
import typingsSlinky.activexShdocvw.activexShdocvwStrings.CX
import typingsSlinky.activexShdocvw.activexShdocvwStrings.CY
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Cancel
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ClientToHostWindow
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Command
import typingsSlinky.activexShdocvw.activexShdocvwStrings.CommandStateChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.DocumentComplete
import typingsSlinky.activexShdocvw.activexShdocvwStrings.DoubleClick
import typingsSlinky.activexShdocvw.activexShdocvwStrings.DownloadBegin
import typingsSlinky.activexShdocvw.activexShdocvwStrings.DownloadComplete
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Enable
import typingsSlinky.activexShdocvw.activexShdocvwStrings.FavoritesSelectionChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.FileDownload
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Frame
import typingsSlinky.activexShdocvw.activexShdocvwStrings.FrameBeforeNavigate
import typingsSlinky.activexShdocvw.activexShdocvwStrings.FrameNavigateComplete
import typingsSlinky.activexShdocvw.activexShdocvwStrings.FrameNewWindow
import typingsSlinky.activexShdocvw.activexShdocvwStrings.FullScreen
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Height
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Initialized
import typingsSlinky.activexShdocvw.activexShdocvwStrings.IsChildWindow
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Left
import typingsSlinky.activexShdocvw.activexShdocvwStrings.MenuBar
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NavigateComplete
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NavigateComplete2
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NavigateError
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NewProcess
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NewWindow
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NewWindow2
import typingsSlinky.activexShdocvw.activexShdocvwStrings.NewWindow3
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnFullScreen
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnMenuBar
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnQuit
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnStatusBar
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnTheaterMode
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnToolBar
import typingsSlinky.activexShdocvw.activexShdocvwStrings.OnVisible
import typingsSlinky.activexShdocvw.activexShdocvwStrings.PhishingFilterStatus
import typingsSlinky.activexShdocvw.activexShdocvwStrings.PrintTemplateInstantiation
import typingsSlinky.activexShdocvw.activexShdocvwStrings.PrintTemplateTeardown
import typingsSlinky.activexShdocvw.activexShdocvwStrings.PrivacyImpactedStateChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Progress
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ProgressChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ProgressMax
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Property
import typingsSlinky.activexShdocvw.activexShdocvwStrings.PropertyChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Quit
import typingsSlinky.activexShdocvw.activexShdocvwStrings.RedirectURL
import typingsSlinky.activexShdocvw.activexShdocvwStrings.RedirectXDomainBlocked
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Resizable
import typingsSlinky.activexShdocvw.activexShdocvwStrings.SecureLockIcon
import typingsSlinky.activexShdocvw.activexShdocvwStrings.SelectionChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.SetPhishingFilterStatus
import typingsSlinky.activexShdocvw.activexShdocvwStrings.SetSecureLockIcon
import typingsSlinky.activexShdocvw.activexShdocvwStrings.StartURL
import typingsSlinky.activexShdocvw.activexShdocvwStrings.StatusBar
import typingsSlinky.activexShdocvw.activexShdocvwStrings.StatusCode
import typingsSlinky.activexShdocvw.activexShdocvwStrings.StatusTextChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Text
import typingsSlinky.activexShdocvw.activexShdocvwStrings.TheaterMode
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ThirdPartyUrlBlocked
import typingsSlinky.activexShdocvw.activexShdocvwStrings.TitleChange
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ToolBar
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Top
import typingsSlinky.activexShdocvw.activexShdocvwStrings.URL
import typingsSlinky.activexShdocvw.activexShdocvwStrings.UpdatePageStatus
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Visible
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WebWorkerFinsihed
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WebWorkerStarted
import typingsSlinky.activexShdocvw.activexShdocvwStrings.Width
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowActivate
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowClosing
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowMove
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowRegistered
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowResize
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowRevoked
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowSetHeight
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowSetLeft
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowSetResizable
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowSetTop
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowSetWidth
import typingsSlinky.activexShdocvw.activexShdocvwStrings.WindowStateChanged
import typingsSlinky.activexShdocvw.activexShdocvwStrings.bImpacted
import typingsSlinky.activexShdocvw.activexShdocvwStrings.bstrUrl
import typingsSlinky.activexShdocvw.activexShdocvwStrings.bstrUrlContext
import typingsSlinky.activexShdocvw.activexShdocvwStrings.bstrWorkerLabel
import typingsSlinky.activexShdocvw.activexShdocvwStrings.dwCount
import typingsSlinky.activexShdocvw.activexShdocvwStrings.dwFlags
import typingsSlinky.activexShdocvw.activexShdocvwStrings.dwUniqueID
import typingsSlinky.activexShdocvw.activexShdocvwStrings.dwValidFlagsMask
import typingsSlinky.activexShdocvw.activexShdocvwStrings.dwWindowStateFlags
import typingsSlinky.activexShdocvw.activexShdocvwStrings.fDone
import typingsSlinky.activexShdocvw.activexShdocvwStrings.lCauseFlag
import typingsSlinky.activexShdocvw.activexShdocvwStrings.lCookie
import typingsSlinky.activexShdocvw.activexShdocvwStrings.nPage
import typingsSlinky.activexShdocvw.activexShdocvwStrings.pDisp
import typingsSlinky.activexShdocvw.activexShdocvwStrings.pDispWindow
import typingsSlinky.activexShdocvw.activexShdocvwStrings.pWB2
import typingsSlinky.activexShdocvw.activexShdocvwStrings.ppDisp
import typingsSlinky.activexShdocvw.activexShdocvwStrings.szProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: InternetExplorerMedium,
    event: BeforeScriptExecute,
    argNames: js.Array[pDispWindow],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPDispWindow, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: ClientToHostWindow,
    argNames: js.Tuple2[CX, CY],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonCX, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: CommandStateChange,
    argNames: js.Tuple2[Command, Enable],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: FileDownload,
    argNames: js.Tuple2[ActiveDocument, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonActiveDocument, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: NavigateComplete2,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, Frame, StatusCode, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: NewProcess,
    argNames: js.Tuple3[lCauseFlag, pWB2, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonLCauseFlag, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: NewWindow2,
    argNames: js.Tuple2[ppDisp, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPpDisp, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: NewWindow3,
    argNames: js.Tuple5[ppDisp, Cancel, dwFlags, bstrUrlContext, bstrUrl],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonBstrUrl, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: OnFullScreen,
    argNames: js.Array[FullScreen],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonFullScreen, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: OnMenuBar,
    argNames: js.Array[MenuBar],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonMenuBar, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: OnStatusBar,
    argNames: js.Array[StatusBar],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonStatusBar, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: OnTheaterMode,
    argNames: js.Array[TheaterMode],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonTheaterMode, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: OnToolBar,
    argNames: js.Array[ToolBar],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonToolBar, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: OnVisible,
    argNames: js.Array[Visible],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonVisible, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: PrintTemplateInstantiation,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: PrintTemplateTeardown,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: PrivacyImpactedStateChange,
    argNames: js.Array[bImpacted],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonBImpacted, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: PropertyChange,
    argNames: js.Array[szProperty],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonSzProperty, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: RedirectXDomainBlocked,
    argNames: js.Tuple5[pDisp, StartURL, RedirectURL, Frame, StatusCode],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonFrame, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: SetPhishingFilterStatus,
    argNames: js.Array[PhishingFilterStatus],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonPhishingFilterStatus, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: SetSecureLockIcon,
    argNames: js.Array[SecureLockIcon],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonSecureLockIcon, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: StatusTextChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: ThirdPartyUrlBlocked,
    argNames: js.Tuple2[URL, dwCount],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonDwCount, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: TitleChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: UpdatePageStatus,
    argNames: js.Tuple3[pDisp, nPage, fDone],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonFDone, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WebWorkerFinsihed,
    argNames: js.Array[dwUniqueID],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonDwUniqueID, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WebWorkerStarted,
    argNames: js.Tuple2[dwUniqueID, bstrWorkerLabel],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonBstrWorkerLabel, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowClosing,
    argNames: js.Tuple2[IsChildWindow, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonIsChildWindow, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowSetHeight,
    argNames: js.Array[Height],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonHeight, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowSetLeft,
    argNames: js.Array[Left],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonLeft, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowSetResizable,
    argNames: js.Array[Resizable],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonResizable, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowSetTop,
    argNames: js.Array[Top],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonTop, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowSetWidth,
    argNames: js.Array[Width],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonWidth, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorerMedium,
    event: WindowStateChanged,
    argNames: js.Tuple2[dwWindowStateFlags, dwValidFlagsMask],
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ AnonDwValidFlagsMask, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: BeforeScriptExecute,
    argNames: js.Array[pDispWindow],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPDispWindow, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: ClientToHostWindow,
    argNames: js.Tuple2[CX, CY],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonCX, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: CommandStateChange,
    argNames: js.Tuple2[Command, Enable],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: FileDownload,
    argNames: js.Tuple2[ActiveDocument, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonActiveDocument, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: NavigateComplete2,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, Frame, StatusCode, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: NewProcess,
    argNames: js.Tuple3[lCauseFlag, pWB2, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonLCauseFlag, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: NewWindow2,
    argNames: js.Tuple2[ppDisp, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPpDisp, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: NewWindow3,
    argNames: js.Tuple5[ppDisp, Cancel, dwFlags, bstrUrlContext, bstrUrl],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonBstrUrl, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: OnFullScreen,
    argNames: js.Array[FullScreen],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonFullScreen, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: OnMenuBar,
    argNames: js.Array[MenuBar],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonMenuBar, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: OnStatusBar,
    argNames: js.Array[StatusBar],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonStatusBar, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: OnTheaterMode,
    argNames: js.Array[TheaterMode],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonTheaterMode, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: OnToolBar,
    argNames: js.Array[ToolBar],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonToolBar, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: OnVisible,
    argNames: js.Array[Visible],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonVisible, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: PrintTemplateInstantiation,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: PrintTemplateTeardown,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: PrivacyImpactedStateChange,
    argNames: js.Array[bImpacted],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonBImpacted, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: PropertyChange,
    argNames: js.Array[szProperty],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonSzProperty, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: RedirectXDomainBlocked,
    argNames: js.Tuple5[pDisp, StartURL, RedirectURL, Frame, StatusCode],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonFrame, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: SetPhishingFilterStatus,
    argNames: js.Array[PhishingFilterStatus],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonPhishingFilterStatus, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: SetSecureLockIcon,
    argNames: js.Array[SecureLockIcon],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonSecureLockIcon, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: StatusTextChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: ThirdPartyUrlBlocked,
    argNames: js.Tuple2[URL, dwCount],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonDwCount, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: TitleChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: UpdatePageStatus,
    argNames: js.Tuple3[pDisp, nPage, fDone],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonFDone, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WebWorkerFinsihed,
    argNames: js.Array[dwUniqueID],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonDwUniqueID, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WebWorkerStarted,
    argNames: js.Tuple2[dwUniqueID, bstrWorkerLabel],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonBstrWorkerLabel, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowClosing,
    argNames: js.Tuple2[IsChildWindow, Cancel],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonIsChildWindow, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowSetHeight,
    argNames: js.Array[Height],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonHeight, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowSetLeft,
    argNames: js.Array[Left],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonLeft, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowSetResizable,
    argNames: js.Array[Resizable],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonResizable, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowSetTop,
    argNames: js.Array[Top],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonTop, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowSetWidth,
    argNames: js.Array[Width],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonWidth, Unit]
  ): Unit = js.native
  def on(
    obj: InternetExplorer,
    event: WindowStateChanged,
    argNames: js.Tuple2[dwWindowStateFlags, dwValidFlagsMask],
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ AnonDwValidFlagsMask, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: BeforeScriptExecute,
    argNames: js.Array[pDispWindow],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPDispWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: ClientToHostWindow,
    argNames: js.Tuple2[CX, CY],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonCX, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: CommandStateChange,
    argNames: js.Tuple2[Command, Enable],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: FileDownload,
    argNames: js.Tuple2[ActiveDocument, Cancel],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonActiveDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: NavigateComplete2,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, Frame, StatusCode, Cancel],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: NewProcess,
    argNames: js.Tuple3[lCauseFlag, pWB2, Cancel],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonLCauseFlag, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: NewWindow2,
    argNames: js.Tuple2[ppDisp, Cancel],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPpDisp, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: NewWindow3,
    argNames: js.Tuple5[ppDisp, Cancel, dwFlags, bstrUrlContext, bstrUrl],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonBstrUrl, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: OnFullScreen,
    argNames: js.Array[FullScreen],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonFullScreen, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: OnMenuBar,
    argNames: js.Array[MenuBar],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonMenuBar, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: OnStatusBar,
    argNames: js.Array[StatusBar],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonStatusBar, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: OnTheaterMode,
    argNames: js.Array[TheaterMode],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonTheaterMode, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: OnToolBar,
    argNames: js.Array[ToolBar],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonToolBar, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: OnVisible,
    argNames: js.Array[Visible],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonVisible, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: PrintTemplateInstantiation,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: PrintTemplateTeardown,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: PrivacyImpactedStateChange,
    argNames: js.Array[bImpacted],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonBImpacted, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: PropertyChange,
    argNames: js.Array[szProperty],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonSzProperty, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: RedirectXDomainBlocked,
    argNames: js.Tuple5[pDisp, StartURL, RedirectURL, Frame, StatusCode],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonFrame, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: SetPhishingFilterStatus,
    argNames: js.Array[PhishingFilterStatus],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonPhishingFilterStatus, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: SetSecureLockIcon,
    argNames: js.Array[SecureLockIcon],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonSecureLockIcon, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: StatusTextChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: ThirdPartyUrlBlocked,
    argNames: js.Tuple2[URL, dwCount],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonDwCount, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: TitleChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: UpdatePageStatus,
    argNames: js.Tuple3[pDisp, nPage, fDone],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonFDone, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WebWorkerFinsihed,
    argNames: js.Array[dwUniqueID],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonDwUniqueID, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WebWorkerStarted,
    argNames: js.Tuple2[dwUniqueID, bstrWorkerLabel],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonBstrWorkerLabel, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowClosing,
    argNames: js.Tuple2[IsChildWindow, Cancel],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonIsChildWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowSetHeight,
    argNames: js.Array[Height],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonHeight, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowSetLeft,
    argNames: js.Array[Left],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonLeft, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowSetResizable,
    argNames: js.Array[Resizable],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonResizable, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowSetTop,
    argNames: js.Array[Top],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonTop, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowSetWidth,
    argNames: js.Array[Width],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonWidth, Unit]
  ): Unit = js.native
  def on(
    obj: ShellBrowserWindow,
    event: WindowStateChanged,
    argNames: js.Tuple2[dwWindowStateFlags, dwValidFlagsMask],
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ AnonDwValidFlagsMask, Unit]
  ): Unit = js.native
  def on(
    obj: ShellWindows,
    event: WindowRegistered,
    argNames: js.Array[lCookie],
    handler: js.ThisFunction1[/* this */ ShellWindows, /* parameter */ AnonLCookie, Unit]
  ): Unit = js.native
  def on(
    obj: ShellWindows,
    event: WindowRevoked,
    argNames: js.Array[lCookie],
    handler: js.ThisFunction1[/* this */ ShellWindows, /* parameter */ AnonLCookie, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: CommandStateChange,
    argNames: js.Tuple2[Command, Enable],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: FrameNavigateComplete,
    argNames: js.Array[URL],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonURL, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: NavigateComplete,
    argNames: js.Array[URL],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonURL, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: PropertyChange,
    argNames: js.Array[Property],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonProperty, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: Quit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: StatusTextChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserV1,
    event: TitleChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: BeforeScriptExecute,
    argNames: js.Array[pDispWindow],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPDispWindow, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: ClientToHostWindow,
    argNames: js.Tuple2[CX, CY],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonCX, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: CommandStateChange,
    argNames: js.Tuple2[Command, Enable],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: FileDownload,
    argNames: js.Tuple2[ActiveDocument, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonActiveDocument, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: NavigateComplete2,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, Frame, StatusCode, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: NewProcess,
    argNames: js.Tuple3[lCauseFlag, pWB2, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonLCauseFlag, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: NewWindow2,
    argNames: js.Tuple2[ppDisp, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPpDisp, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: NewWindow3,
    argNames: js.Tuple5[ppDisp, Cancel, dwFlags, bstrUrlContext, bstrUrl],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonBstrUrl, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: OnFullScreen,
    argNames: js.Array[FullScreen],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonFullScreen, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: OnMenuBar,
    argNames: js.Array[MenuBar],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonMenuBar, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: OnStatusBar,
    argNames: js.Array[StatusBar],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonStatusBar, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: OnTheaterMode,
    argNames: js.Array[TheaterMode],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonTheaterMode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: OnToolBar,
    argNames: js.Array[ToolBar],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonToolBar, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: OnVisible,
    argNames: js.Array[Visible],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonVisible, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: PrintTemplateInstantiation,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: PrintTemplateTeardown,
    argNames: js.Array[pDisp],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPDispAny, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: PrivacyImpactedStateChange,
    argNames: js.Array[bImpacted],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonBImpacted, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: PropertyChange,
    argNames: js.Array[szProperty],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonSzProperty, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: RedirectXDomainBlocked,
    argNames: js.Tuple5[pDisp, StartURL, RedirectURL, Frame, StatusCode],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonFrame, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: SetPhishingFilterStatus,
    argNames: js.Array[PhishingFilterStatus],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonPhishingFilterStatus, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: SetSecureLockIcon,
    argNames: js.Array[SecureLockIcon],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonSecureLockIcon, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: StatusTextChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: ThirdPartyUrlBlocked,
    argNames: js.Tuple2[URL, dwCount],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonDwCount, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: TitleChange,
    argNames: js.Array[Text],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonText, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: UpdatePageStatus,
    argNames: js.Tuple3[pDisp, nPage, fDone],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonFDone, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WebWorkerFinsihed,
    argNames: js.Array[dwUniqueID],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonDwUniqueID, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WebWorkerStarted,
    argNames: js.Tuple2[dwUniqueID, bstrWorkerLabel],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonBstrWorkerLabel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowClosing,
    argNames: js.Tuple2[IsChildWindow, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonIsChildWindow, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowSetHeight,
    argNames: js.Array[Height],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonHeight, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowSetLeft,
    argNames: js.Array[Left],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonLeft, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowSetResizable,
    argNames: js.Array[Resizable],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonResizable, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowSetTop,
    argNames: js.Array[Top],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonTop, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowSetWidth,
    argNames: js.Array[Width],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonWidth, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowser,
    event: WindowStateChanged,
    argNames: js.Tuple2[dwWindowStateFlags, dwValidFlagsMask],
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ AnonDwValidFlagsMask, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate(
    obj: WebBrowserV1,
    event: BeforeNavigate,
    argNames: WebBrowserV1BeforeNavigateArgNames,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ WebBrowserV1BeforeNavigateParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: InternetExplorerMedium,
    event: BeforeNavigate2,
    argNames: InternetExplorerMediumBeforeNavigate2ArgNames,
    handler: js.ThisFunction1[
      /* this */ InternetExplorerMedium, 
      /* parameter */ InternetExplorerMediumBeforeNavigate2Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: InternetExplorer,
    event: BeforeNavigate2,
    argNames: InternetExplorerBeforeNavigate2ArgNames,
    handler: js.ThisFunction1[
      /* this */ InternetExplorer, 
      /* parameter */ InternetExplorerBeforeNavigate2Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: ShellBrowserWindow,
    event: BeforeNavigate2,
    argNames: ShellBrowserWindowBeforeNavigate2ArgNames,
    handler: js.ThisFunction1[
      /* this */ ShellBrowserWindow, 
      /* parameter */ ShellBrowserWindowBeforeNavigate2Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: WebBrowser,
    event: BeforeNavigate2,
    argNames: WebBrowserBeforeNavigate2ArgNames,
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ WebBrowserBeforeNavigate2Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: ShellNameSpace,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ ShellNameSpace, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: InternetExplorerMedium,
    event: DownloadBegin,
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: InternetExplorer,
    event: DownloadBegin,
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: ShellBrowserWindow,
    event: DownloadBegin,
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: WebBrowserV1,
    event: DownloadBegin,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadBegin(
    obj: WebBrowser,
    event: DownloadBegin,
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: InternetExplorerMedium,
    event: DownloadComplete,
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: InternetExplorer,
    event: DownloadComplete,
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: ShellBrowserWindow,
    event: DownloadComplete,
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: WebBrowserV1,
    event: DownloadComplete,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DownloadComplete(
    obj: WebBrowser,
    event: DownloadComplete,
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FavoritesSelectionChange(
    obj: ShellNameSpace,
    event: FavoritesSelectionChange,
    argNames: ShellNameSpaceFavoritesSelectionChangeArgNames,
    handler: js.ThisFunction1[
      /* this */ ShellNameSpace, 
      /* parameter */ ShellNameSpaceFavoritesSelectionChangeParameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_FrameBeforeNavigate(
    obj: WebBrowserV1,
    event: FrameBeforeNavigate,
    argNames: WebBrowserV1FrameBeforeNavigateArgNames,
    handler: js.ThisFunction1[
      /* this */ WebBrowserV1, 
      /* parameter */ WebBrowserV1FrameBeforeNavigateParameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_FrameNewWindow(
    obj: WebBrowserV1,
    event: FrameNewWindow,
    argNames: WebBrowserV1FrameNewWindowArgNames,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ WebBrowserV1FrameNewWindowParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Initialized(
    obj: ShellNameSpace,
    event: Initialized,
    handler: js.ThisFunction1[/* this */ ShellNameSpace, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_NewWindow(
    obj: WebBrowserV1,
    event: NewWindow,
    argNames: WebBrowserV1NewWindowArgNames,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ WebBrowserV1NewWindowParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: InternetExplorerMedium,
    event: OnQuit,
    handler: js.ThisFunction1[/* this */ InternetExplorerMedium, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: InternetExplorer,
    event: OnQuit,
    handler: js.ThisFunction1[/* this */ InternetExplorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: ShellBrowserWindow,
    event: OnQuit,
    handler: js.ThisFunction1[/* this */ ShellBrowserWindow, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnQuit(
    obj: WebBrowser,
    event: OnQuit,
    handler: js.ThisFunction1[/* this */ WebBrowser, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChange(
    obj: ShellNameSpace,
    event: SelectionChange,
    handler: js.ThisFunction1[/* this */ ShellNameSpace, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WindowActivate(
    obj: WebBrowserV1,
    event: WindowActivate,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WindowMove(
    obj: WebBrowserV1,
    event: WindowMove,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WindowResize(
    obj: WebBrowserV1,
    event: WindowResize,
    handler: js.ThisFunction1[/* this */ WebBrowserV1, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

