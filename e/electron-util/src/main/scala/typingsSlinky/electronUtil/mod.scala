package typingsSlinky.electronUtil

import typingsSlinky.electron.Electron.Accelerator
import typingsSlinky.electron.Electron.KeyboardEvent
import typingsSlinky.electron.Electron.Menu
import typingsSlinky.electron.Electron.MenuItem
import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import typingsSlinky.electron.Electron.NativeImage_
import typingsSlinky.electron.Electron.Rectangle
import typingsSlinky.electron.Electron.Remote
import typingsSlinky.electron.Electron.Size
import typingsSlinky.electron.mod.BrowserWindow
import typingsSlinky.electron.mod.Session_
import typingsSlinky.electronUtil.electronUtilStrings.Advanced
import typingsSlinky.electronUtil.electronUtilStrings.Captioning
import typingsSlinky.electronUtil.electronUtilStrings.Dictation
import typingsSlinky.electronUtil.electronUtilStrings.FDE
import typingsSlinky.electronUtil.electronUtilStrings.Firewall
import typingsSlinky.electronUtil.electronUtilStrings.General
import typingsSlinky.electronUtil.electronUtilStrings.Hearing
import typingsSlinky.electronUtil.electronUtilStrings.Internet
import typingsSlinky.electronUtil.electronUtilStrings.Keyboard
import typingsSlinky.electronUtil.electronUtilStrings.Media_Descriptions
import typingsSlinky.electronUtil.electronUtilStrings.Mouse
import typingsSlinky.electronUtil.electronUtilStrings.Privacy
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Accessibility
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Advertising
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_AllFiles
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Assistive
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Automation
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Calendars
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Camera
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Contacts
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_DesktopFolder
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Diagnostics
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_DocumentsFolder
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_DownloadsFolder
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_LocationServices
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Microphone
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Photos
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_Reminders
import typingsSlinky.electronUtil.electronUtilStrings.Privacy_ScreenCapture
import typingsSlinky.electronUtil.electronUtilStrings.Seeing_Display
import typingsSlinky.electronUtil.electronUtilStrings.Seeing_VoiceOver
import typingsSlinky.electronUtil.electronUtilStrings.Seeing_Zoom
import typingsSlinky.electronUtil.electronUtilStrings.Services_ARDService
import typingsSlinky.electronUtil.electronUtilStrings.Services_BluetoothSharing
import typingsSlinky.electronUtil.electronUtilStrings.Services_PersonalFileSharing
import typingsSlinky.electronUtil.electronUtilStrings.Services_PrinterSharing
import typingsSlinky.electronUtil.electronUtilStrings.Services_RemoteAppleEvent
import typingsSlinky.electronUtil.electronUtilStrings.Services_RemoteLogin
import typingsSlinky.electronUtil.electronUtilStrings.Services_ScreenSharing
import typingsSlinky.electronUtil.electronUtilStrings.SpeakableItems
import typingsSlinky.electronUtil.electronUtilStrings.Switch
import typingsSlinky.electronUtil.electronUtilStrings.TTS
import typingsSlinky.electronUtil.electronUtilStrings.about
import typingsSlinky.electronUtil.electronUtilStrings.appMenu
import typingsSlinky.electronUtil.electronUtilStrings.checkbox
import typingsSlinky.electronUtil.electronUtilStrings.clearRecentDocuments
import typingsSlinky.electronUtil.electronUtilStrings.close
import typingsSlinky.electronUtil.electronUtilStrings.copy
import typingsSlinky.electronUtil.electronUtilStrings.cut
import typingsSlinky.electronUtil.electronUtilStrings.delete
import typingsSlinky.electronUtil.electronUtilStrings.editMenu
import typingsSlinky.electronUtil.electronUtilStrings.fileMenu
import typingsSlinky.electronUtil.electronUtilStrings.forceReload
import typingsSlinky.electronUtil.electronUtilStrings.front
import typingsSlinky.electronUtil.electronUtilStrings.help
import typingsSlinky.electronUtil.electronUtilStrings.hide
import typingsSlinky.electronUtil.electronUtilStrings.hideOthers
import typingsSlinky.electronUtil.electronUtilStrings.linux
import typingsSlinky.electronUtil.electronUtilStrings.macos
import typingsSlinky.electronUtil.electronUtilStrings.mergeAllWindows
import typingsSlinky.electronUtil.electronUtilStrings.minimize
import typingsSlinky.electronUtil.electronUtilStrings.moveTabToNewWindow
import typingsSlinky.electronUtil.electronUtilStrings.normal
import typingsSlinky.electronUtil.electronUtilStrings.paste
import typingsSlinky.electronUtil.electronUtilStrings.pasteAndMatchStyle
import typingsSlinky.electronUtil.electronUtilStrings.quit
import typingsSlinky.electronUtil.electronUtilStrings.radio
import typingsSlinky.electronUtil.electronUtilStrings.recentDocuments
import typingsSlinky.electronUtil.electronUtilStrings.redo
import typingsSlinky.electronUtil.electronUtilStrings.reload
import typingsSlinky.electronUtil.electronUtilStrings.resetZoom
import typingsSlinky.electronUtil.electronUtilStrings.security
import typingsSlinky.electronUtil.electronUtilStrings.selectAll
import typingsSlinky.electronUtil.electronUtilStrings.selectNextTab
import typingsSlinky.electronUtil.electronUtilStrings.selectPreviousTab
import typingsSlinky.electronUtil.electronUtilStrings.separator
import typingsSlinky.electronUtil.electronUtilStrings.services
import typingsSlinky.electronUtil.electronUtilStrings.sharing
import typingsSlinky.electronUtil.electronUtilStrings.speech
import typingsSlinky.electronUtil.electronUtilStrings.startSpeaking
import typingsSlinky.electronUtil.electronUtilStrings.stopSpeaking
import typingsSlinky.electronUtil.electronUtilStrings.submenu
import typingsSlinky.electronUtil.electronUtilStrings.toggleDevTools
import typingsSlinky.electronUtil.electronUtilStrings.toggleTabBar
import typingsSlinky.electronUtil.electronUtilStrings.togglefullscreen
import typingsSlinky.electronUtil.electronUtilStrings.undo
import typingsSlinky.electronUtil.electronUtilStrings.unhide
import typingsSlinky.electronUtil.electronUtilStrings.universalaccess
import typingsSlinky.electronUtil.electronUtilStrings.viewMenu
import typingsSlinky.electronUtil.electronUtilStrings.window
import typingsSlinky.electronUtil.electronUtilStrings.windowMenu
import typingsSlinky.electronUtil.electronUtilStrings.windows
import typingsSlinky.electronUtil.electronUtilStrings.zoom
import typingsSlinky.electronUtil.electronUtilStrings.zoomIn
import typingsSlinky.electronUtil.electronUtilStrings.zoomOut
import typingsSlinky.newGithubIssueUrl.mod.Options
import typingsSlinky.typeFest.requireAtLeastOneMod.RequireAtLeastOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-util", "aboutMenuItem")
  @js.native
  def aboutMenuItem(): MenuItemConstructorOptions = js.native
  @JSImport("electron-util", "aboutMenuItem")
  @js.native
  def aboutMenuItem(options: AboutMenuItemOptions): MenuItemConstructorOptions = js.native
  
  @JSImport("electron-util", "activeWindow")
  @js.native
  def activeWindow(): BrowserWindow = js.native
  
  @JSImport("electron-util", "api")
  @js.native
  val api: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllElectron */ js.Any) | Remote = js.native
  
  @JSImport("electron-util", "appLaunchTimestamp")
  @js.native
  val appLaunchTimestamp: Double = js.native
  
  @JSImport("electron-util", "appMenu")
  @js.native
  def appMenu(): MenuItemConstructorOptions = js.native
  @JSImport("electron-util", "appMenu")
  @js.native
  def appMenu(menuItems: js.Array[MenuItemConstructorOptions]): MenuItemConstructorOptions = js.native
  
  @JSImport("electron-util", "centerWindow")
  @js.native
  def centerWindow(): Unit = js.native
  @JSImport("electron-util", "centerWindow")
  @js.native
  def centerWindow(options: CenterWindowOptions): Unit = js.native
  
  @JSImport("electron-util", "chromeVersion")
  @js.native
  val chromeVersion: String = js.native
  
  @JSImport("electron-util", "darkMode")
  @js.native
  val darkMode: DarkMode_ = js.native
  
  @JSImport("electron-util", "debugInfo")
  @js.native
  def debugInfo(): String = js.native
  
  @JSImport("electron-util", "disableZoom")
  @js.native
  def disableZoom(): Unit = js.native
  @JSImport("electron-util", "disableZoom")
  @js.native
  def disableZoom(window: BrowserWindow): Unit = js.native
  
  @JSImport("electron-util", "electronVersion")
  @js.native
  val electronVersion: String = js.native
  
  @JSImport("electron-util", "enforceMacOSAppLocation")
  @js.native
  def enforceMacOSAppLocation(): Unit = js.native
  
  @JSImport("electron-util", "fixPathForAsarUnpack")
  @js.native
  def fixPathForAsarUnpack(path: String): String = js.native
  
  @JSImport("electron-util", "getWindowBoundsCentered")
  @js.native
  def getWindowBoundsCentered(): Rectangle = js.native
  @JSImport("electron-util", "getWindowBoundsCentered")
  @js.native
  def getWindowBoundsCentered(options: GetWindowBoundsCenteredOptions): Rectangle = js.native
  
  object is {
    
    /**
    	Running in development, not in production.
    	*/
    @JSImport("electron-util", "is.development")
    @js.native
    val development: Boolean = js.native
    
    /**
    	Running on Linux.
    	*/
    @JSImport("electron-util", "is.linux")
    @js.native
    val linux: Boolean = js.native
    
    /**
    	The app is an Mac App Store build.
    	*/
    @JSImport("electron-util", "is.macAppStore")
    @js.native
    val macAppStore: Boolean = js.native
    
    /**
    	Running on macOS.
    	*/
    @JSImport("electron-util", "is.macos")
    @js.native
    val macos: Boolean = js.native
    
    /**
    	Running on the [main process](https://electronjs.org/docs/tutorial/quick-start/#main-process).
    	*/
    @JSImport("electron-util", "is.main")
    @js.native
    val main: Boolean = js.native
    
    /**
    	Running on the [renderer process](https://electronjs.org/docs/tutorial/quick-start/#renderer-process).
    	*/
    @JSImport("electron-util", "is.renderer")
    @js.native
    val renderer: Boolean = js.native
    
    /**
    	The app is using [ASAR](https://electronjs.org/docs/tutorial/application-packaging/).
    	*/
    @JSImport("electron-util", "is.usingAsar")
    @js.native
    val usingAsar: Boolean = js.native
    
    /**
    	Running on Windows.
    	*/
    @JSImport("electron-util", "is.windows")
    @js.native
    val windows: Boolean = js.native
    
    /**
    	The app is a Windows Store AppX build.
    	*/
    @JSImport("electron-util", "is.windowsStore")
    @js.native
    val windowsStore: Boolean = js.native
  }
  
  @JSImport("electron-util", "isFirstAppLaunch")
  @js.native
  def isFirstAppLaunch(): Boolean = js.native
  
  @JSImport("electron-util", "menuBarHeight")
  @js.native
  def menuBarHeight(): Double = js.native
  
  @JSImport("electron-util", "openNewGitHubIssue")
  @js.native
  def openNewGitHubIssue(options: Options): Unit = js.native
  
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences(): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences(
    pane: js.UndefOr[scala.Nothing],
    section: Advanced | Captioning | Dictation | FDE | Firewall | General | Hearing | Internet | Keyboard | Media_Descriptions | Mouse | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing | SpeakableItems | Switch | TTS
  ): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences(
    pane: security,
    section: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
  ): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences(
    pane: sharing,
    section: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
  ): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences(pane: speech, section: Dictation | TTS): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences(
    pane: universalaccess,
    section: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences_security(pane: security): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences_sharing(pane: sharing): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences_speech(pane: speech): js.Promise[Unit] = js.native
  @JSImport("electron-util", "openSystemPreferences")
  @js.native
  def openSystemPreferences_universalaccess(pane: universalaccess): js.Promise[Unit] = js.native
  
  @JSImport("electron-util", "openUrlMenuItem")
  @js.native
  def openUrlMenuItem(): MenuItemConstructorOptions = js.native
  @JSImport("electron-util", "openUrlMenuItem")
  @js.native
  def openUrlMenuItem(options: OpenUrlMenuItemOptions): MenuItemConstructorOptions = js.native
  
  @JSImport("electron-util", "platform")
  @js.native
  def platform[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = js.native
  
  @JSImport("electron-util", "runJS")
  @js.native
  def runJS(code: String): js.Promise[_] = js.native
  @JSImport("electron-util", "runJS")
  @js.native
  def runJS(code: String, window: BrowserWindow): js.Promise[_] = js.native
  
  @JSImport("electron-util", "setContentSecurityPolicy")
  @js.native
  def setContentSecurityPolicy(policy: String): Unit = js.native
  @JSImport("electron-util", "setContentSecurityPolicy")
  @js.native
  def setContentSecurityPolicy(policy: String, options: SetContentSecurityPolicyOptions): Unit = js.native
  
  @JSImport("electron-util", "showAboutWindow")
  @js.native
  def showAboutWindow(options: ShowAboutWindowOptions): Unit = js.native
  
  type AboutMenuItemOptions = ShowAboutWindowOptions
  
  @js.native
  trait CenterWindowOptions extends StObject {
    
    /**
    	Animate the change.
    	@default false
    	*/
    val animated: js.UndefOr[Boolean] = js.native
    
    /**
    	Set a new window size.
    	Default: Size of `window`
    	@example
    	```
    	{width: 600, height: 400}
    	```
    	*/
    val size: js.UndefOr[Size] = js.native
    
    /**
    	The window to center.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.native
  }
  object CenterWindowOptions {
    
    @scala.inline
    def apply(): CenterWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenterWindowOptions]
    }
    
    @scala.inline
    implicit class CenterWindowOptionsMutableBuilder[Self <: CenterWindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type Choices[Macos, Windows, Linux, Default] = RequireAtLeastOne[_Choices[Macos, Windows, Linux, Default], macos | windows | linux]
  
  @js.native
  trait DarkMode_ extends StObject {
    
    /**
    	Whether the macOS dark mode is enabled.
    	On Windows and Linux, it's `false`.
    	*/
    val isEnabled: Boolean = js.native
    
    /**
    	The `callback` function is called when the macOS dark mode is toggled.
    	@returns A function, that when called, unsubscribes the listener. Calling it on Window and Linux works, but it just returns a no-op function.
    	*/
    def onChange(callback: js.Function0[Unit]): js.Function0[Unit] = js.native
  }
  object DarkMode_ {
    
    @scala.inline
    def apply(isEnabled: Boolean, onChange: js.Function0[Unit] => js.Function0[Unit]): DarkMode_ = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DarkMode_]
    }
    
    @scala.inline
    implicit class DarkMode_MutableBuilder[Self <: DarkMode_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GetWindowBoundsCenteredOptions extends StObject {
    
    /**
    	Set a new window size.
    	Default: Size of `window`
    	@example
    	```
    	{width: 600, height: 400}
    	```
    	*/
    val size: js.UndefOr[Size] = js.native
    
    /**
    	The window to get the bounds of.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.native
  }
  object GetWindowBoundsCenteredOptions {
    
    @scala.inline
    def apply(): GetWindowBoundsCenteredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
    }
    
    @scala.inline
    implicit class GetWindowBoundsCenteredOptionsMutableBuilder[Self <: GetWindowBoundsCenteredOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  /* Inlined parent std.Readonly<electron.electron.MenuItemConstructorOptions> */
  @js.native
  trait OpenUrlMenuItemOptions extends StObject {
    
    val accelerator: js.UndefOr[Accelerator] = js.native
    
    val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.native
    
    val after: js.UndefOr[js.Array[String]] = js.native
    
    val afterGroupContaining: js.UndefOr[js.Array[String]] = js.native
    
    val before: js.UndefOr[js.Array[String]] = js.native
    
    val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.native
    
    val checked: js.UndefOr[Boolean] = js.native
    
    val click: js.UndefOr[
        js.Function3[
          /* menuItem */ MenuItem, 
          /* browserWindow */ js.UndefOr[typingsSlinky.electron.Electron.BrowserWindow], 
          /* event */ KeyboardEvent, 
          Unit
        ]
      ] = js.native
    
    val enabled: js.UndefOr[Boolean] = js.native
    
    val icon: js.UndefOr[NativeImage_ | String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val label: js.UndefOr[String] = js.native
    
    val registerAccelerator: js.UndefOr[Boolean] = js.native
    
    val role: js.UndefOr[
        undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ] = js.native
    
    val sublabel: js.UndefOr[String] = js.native
    
    val submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.native
    
    val toolTip: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[
        normal | separator | typingsSlinky.electronUtil.electronUtilStrings.submenu | checkbox | radio
      ] = js.native
    
    /**
    	URL to be opened when the menu item is clicked.
    	*/
    val url: String = js.native
    
    val visible: js.UndefOr[Boolean] = js.native
  }
  object OpenUrlMenuItemOptions {
    
    @scala.inline
    def apply(url: String): OpenUrlMenuItemOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenUrlMenuItemOptions]
    }
    
    @scala.inline
    implicit class OpenUrlMenuItemOptionsMutableBuilder[Self <: OpenUrlMenuItemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      @scala.inline
      def setAcceleratorWorksWhenHidden(value: Boolean): Self = StObject.set(x, "acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorWorksWhenHiddenUndefined: Self = StObject.set(x, "acceleratorWorksWhenHidden", js.undefined)
      
      @scala.inline
      def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
      
      @scala.inline
      def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value :_*))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
      
      @scala.inline
      def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value :_*))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClick(
        value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[typingsSlinky.electron.Electron.BrowserWindow], /* event */ KeyboardEvent) => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterAcceleratorUndefined: Self = StObject.set(x, "registerAccelerator", js.undefined)
      
      @scala.inline
      def setRole(
        value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
      
      @scala.inline
      def setSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      @scala.inline
      def setSubmenuVarargs(value: MenuItemConstructorOptions*): Self = StObject.set(x, "submenu", js.Array(value :_*))
      
      @scala.inline
      def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
      
      @scala.inline
      def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait OptionalRectangle extends StObject {
    
    /**
    	The height of the rectangle (must be an integer).
    	*/
    val height: js.UndefOr[Double] = js.native
    
    /**
    	The width of the rectangle (must be an integer).
    	*/
    val width: js.UndefOr[Double] = js.native
    
    /**
    	The x coordinate of the origin of the rectangle (must be an integer).
    	*/
    val x: js.UndefOr[Double] = js.native
    
    /**
    	The y coordinate of the origin of the rectangle (must be an integer).
    	*/
    val y: js.UndefOr[Double] = js.native
  }
  object OptionalRectangle {
    
    @scala.inline
    def apply(): OptionalRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalRectangle]
    }
    
    @scala.inline
    implicit class OptionalRectangleMutableBuilder[Self <: OptionalRectangle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SetContentSecurityPolicyOptions extends StObject {
    
    /**
    	The session to apply the policy to.
    	Default: [`electron.session.defaultSession`](https://electronjs.org/docs/api/session#sessiondefaultsession)
    	*/
    val session: js.UndefOr[Session_] = js.native
  }
  object SetContentSecurityPolicyOptions {
    
    @scala.inline
    def apply(): SetContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetContentSecurityPolicyOptions]
    }
    
    @scala.inline
    implicit class SetContentSecurityPolicyOptionsMutableBuilder[Self <: SetContentSecurityPolicyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  @js.native
  trait ShowAboutWindowOptions extends StObject {
    
    /**
    	The copyright text.
    	*/
    val copyright: js.UndefOr[String] = js.native
    
    /**
    	An absolute path to the app icon.
    	Only used on Linux and Windows.
    	*/
    val icon: js.UndefOr[String] = js.native
    
    /**
    	Some additional text if needed.
    	Only used on Windows.
    	*/
    val text: js.UndefOr[String] = js.native
    
    /**
    	Customizable for localization. Used in the menu item label and window title (Windows-only).
    	The app name is automatically appended at runtime.
    	Only used on Linux and Windows.
    	@default 'About'
    	*/
    val title: js.UndefOr[String] = js.native
    
    /**
    	The URL to the app's website.
    	Only used on Linux.
    	*/
    val website: js.UndefOr[String] = js.native
  }
  object ShowAboutWindowOptions {
    
    @scala.inline
    def apply(): ShowAboutWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowAboutWindowOptions]
    }
    
    @scala.inline
    implicit class ShowAboutWindowOptionsMutableBuilder[Self <: ShowAboutWindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  @js.native
  trait SystemPreferencesPanes extends StObject {
    
    var security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture = js.native
    
    var sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing = js.native
    
    var speech: Dictation | TTS = js.native
    
    var universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch = js.native
  }
  object SystemPreferencesPanes {
    
    @scala.inline
    def apply(
      security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture,
      sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing,
      speech: Dictation | TTS,
      universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
    ): SystemPreferencesPanes = {
      val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any], sharing = sharing.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], universalaccess = universalaccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemPreferencesPanes]
    }
    
    @scala.inline
    implicit class SystemPreferencesPanesMutableBuilder[Self <: SystemPreferencesPanes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurity(
        value: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharing(
        value: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
      ): Self = StObject.set(x, "sharing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeech(value: Dictation | TTS): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniversalaccess(
        value: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
      ): Self = StObject.set(x, "universalaccess", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _Choices[Macos, Windows, Linux, Default] extends StObject {
    
    val default: js.UndefOr[Default | js.Function0[Default]] = js.native
    
    val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.native
    
    val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.native
    
    val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.native
  }
  object _Choices {
    
    @scala.inline
    def apply[Macos, Windows, Linux, Default](): _Choices[Macos, Windows, Linux, Default] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
    }
    
    @scala.inline
    implicit class _ChoicesMutableBuilder[Self <: _Choices[_, _, _, _], Macos, Windows, Linux, Default] (val x: Self with (_Choices[Macos, Windows, Linux, Default])) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Default | js.Function0[Default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFunction0(value: () => Default): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setLinux(value: Linux | js.Function0[Linux]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinuxFunction0(value: () => Linux): Self = StObject.set(x, "linux", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      @scala.inline
      def setMacos(value: Macos | js.Function0[Macos]): Self = StObject.set(x, "macos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacosFunction0(value: () => Macos): Self = StObject.set(x, "macos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMacosUndefined: Self = StObject.set(x, "macos", js.undefined)
      
      @scala.inline
      def setWindows(value: Windows | js.Function0[Windows]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsFunction0(value: () => Windows): Self = StObject.set(x, "windows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
