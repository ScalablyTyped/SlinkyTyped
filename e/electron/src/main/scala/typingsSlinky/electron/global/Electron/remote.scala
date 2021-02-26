package typingsSlinky.electron.global.Electron

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.electron.Electron.BrowserViewConstructorOptions
import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electron.Electron.ClientRequestConstructorOptions
import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import typingsSlinky.electron.Electron.NotificationConstructorOptions
import typingsSlinky.electron.Electron.Remote
import typingsSlinky.electron.Electron.TouchBarButtonConstructorOptions
import typingsSlinky.electron.Electron.TouchBarColorPickerConstructorOptions
import typingsSlinky.electron.Electron.TouchBarConstructorOptions
import typingsSlinky.electron.Electron.TouchBarGroupConstructorOptions
import typingsSlinky.electron.Electron.TouchBarLabelConstructorOptions
import typingsSlinky.electron.Electron.TouchBarPopoverConstructorOptions
import typingsSlinky.electron.Electron.TouchBarScrubberConstructorOptions
import typingsSlinky.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typingsSlinky.electron.Electron.TouchBarSliderConstructorOptions
import typingsSlinky.electron.Electron.TouchBarSpacerConstructorOptions
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remote extends Shortcut {
  
  @JSGlobal("Electron.remote")
  @js.native
  val ^ : Remote = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.BrowserView")
  @js.native
  // Docs: https://electronjs.org/docs/api/browser-view
  /**
    * BrowserView
    */
  class BrowserViewCls ()
    extends typingsSlinky.electron.Electron.BrowserView {
    def this(options: BrowserViewConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.BrowserWindow")
  @js.native
  /**
    * BrowserWindow
    */
  class BrowserWindowCls ()
    extends typingsSlinky.electron.Electron.BrowserWindow {
    def this(options: BrowserWindowConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.ClientRequest")
  @js.native
  class ClientRequestCls protected ()
    extends typingsSlinky.electron.Electron.ClientRequest {
    def this(options: String) = this()
    /**
      * ClientRequest
      */
    def this(options: ClientRequestConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.CommandLine")
  @js.native
  class CommandLineCls ()
    extends typingsSlinky.electron.Electron.CommandLine
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Cookies")
  @js.native
  class CookiesCls ()
    extends typingsSlinky.electron.Electron.Cookies
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Debugger")
  @js.native
  class DebuggerCls ()
    extends typingsSlinky.electron.Electron.Debugger
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Dock")
  @js.native
  class DockCls ()
    extends typingsSlinky.electron.Electron.Dock
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.DownloadItem")
  @js.native
  class DownloadItemCls ()
    extends typingsSlinky.electron.Electron.DownloadItem
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.IncomingMessage")
  @js.native
  class IncomingMessageCls ()
    extends typingsSlinky.electron.Electron.IncomingMessage
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Menu")
  @js.native
  /**
    * Menu
    */
  class MenuCls ()
    extends typingsSlinky.electron.Electron.Menu
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.MenuItem")
  @js.native
  class MenuItemCls protected ()
    extends typingsSlinky.electron.Electron.MenuItem {
    // Docs: https://electronjs.org/docs/api/menu-item
    /**
      * MenuItem
      */
    def this(options: MenuItemConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.MessageChannelMain")
  @js.native
  class MessageChannelMainCls ()
    extends typingsSlinky.electron.Electron.MessageChannelMain
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.MessagePortMain")
  @js.native
  class MessagePortMainCls ()
    extends typingsSlinky.electron.Electron.MessagePortMain
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Notification")
  @js.native
  /**
    * Notification
    */
  class NotificationCls ()
    extends typingsSlinky.electron.Electron.Notification {
    def this(options: NotificationConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.ServiceWorkers")
  @js.native
  class ServiceWorkersCls ()
    extends typingsSlinky.electron.Electron.ServiceWorkers
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarButton")
  @js.native
  class TouchBarButtonCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarButton {
    // Docs: https://electronjs.org/docs/api/touch-bar-button
    /**
      * TouchBarButton
      */
    def this(options: TouchBarButtonConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBar")
  @js.native
  class TouchBarCls protected ()
    extends typingsSlinky.electron.Electron.TouchBar {
    // Docs: https://electronjs.org/docs/api/touch-bar
    /**
      * TouchBar
      */
    def this(options: TouchBarConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarColorPicker")
  @js.native
  class TouchBarColorPickerCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarColorPicker {
    // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
    /**
      * TouchBarColorPicker
      */
    def this(options: TouchBarColorPickerConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarGroup")
  @js.native
  class TouchBarGroupCls protected () extends EventEmitter {
    // Docs: https://electronjs.org/docs/api/touch-bar-group
    /**
      * TouchBarGroup
      */
    def this(options: TouchBarGroupConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarLabel")
  @js.native
  class TouchBarLabelCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarLabel {
    // Docs: https://electronjs.org/docs/api/touch-bar-label
    /**
      * TouchBarLabel
      */
    def this(options: TouchBarLabelConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarOtherItemsProxy")
  @js.native
  // Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
  /**
    * TouchBarOtherItemsProxy
    */
  class TouchBarOtherItemsProxyCls () extends EventEmitter
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarPopover")
  @js.native
  class TouchBarPopoverCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarPopover {
    // Docs: https://electronjs.org/docs/api/touch-bar-popover
    /**
      * TouchBarPopover
      */
    def this(options: TouchBarPopoverConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarScrubber")
  @js.native
  class TouchBarScrubberCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarScrubber {
    // Docs: https://electronjs.org/docs/api/touch-bar-scrubber
    /**
      * TouchBarScrubber
      */
    def this(options: TouchBarScrubberConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarSegmentedControl")
  @js.native
  class TouchBarSegmentedControlCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarSegmentedControl {
    // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
    /**
      * TouchBarSegmentedControl
      */
    def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarSlider")
  @js.native
  class TouchBarSliderCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarSlider {
    // Docs: https://electronjs.org/docs/api/touch-bar-slider
    /**
      * TouchBarSlider
      */
    def this(options: TouchBarSliderConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarSpacer")
  @js.native
  class TouchBarSpacerCls protected ()
    extends typingsSlinky.electron.Electron.TouchBarSpacer {
    // Docs: https://electronjs.org/docs/api/touch-bar-spacer
    /**
      * TouchBarSpacer
      */
    def this(options: TouchBarSpacerConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Tray")
  @js.native
  class TrayCls protected ()
    extends typingsSlinky.electron.Electron.Tray {
    def this(image: String) = this()
    /**
      * Tray
      */
    def this(image: typingsSlinky.electron.Electron.NativeImage_) = this()
    def this(image: String, guid: String) = this()
    def this(image: typingsSlinky.electron.Electron.NativeImage_, guid: String) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.WebRequest")
  @js.native
  class WebRequestCls ()
    extends typingsSlinky.electron.Electron.WebRequest
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.nativeImage")
  @js.native
  class nativeImageCls ()
    extends typingsSlinky.electron.Electron.NativeImage_
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.session")
  @js.native
  class sessionCls ()
    extends typingsSlinky.electron.Electron.Session_
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.webContents")
  @js.native
  class webContentsCls ()
    extends typingsSlinky.electron.Electron.WebContents_
  
  type _To = Remote
  
  /* This means you don't have to write `^`, but can instead just say `remote.foo` */
  override def _to: Remote = ^
}
