package typingsSlinky.electron.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.electron.Electron.BrowserViewConstructorOptions
import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electron.Electron.ClientRequestConstructorOptions
import typingsSlinky.electron.Electron.ContextBridge
import typingsSlinky.electron.Electron.IpcRenderer
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
import typingsSlinky.electron.Electron.WebFrame
import typingsSlinky.electron.Electron.WebviewTag
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  @JSImport("electron", "Renderer.BrowserWindowProxy")
  @js.native
  class BrowserWindowProxy ()
    extends typingsSlinky.electron.Electron.BrowserWindowProxy
  
  @JSImport("electron", "Renderer.contextBridge")
  @js.native
  val contextBridge: ContextBridge = js.native
  
  @JSImport("electron", "Renderer.ipcRenderer")
  @js.native
  val ipcRenderer: IpcRenderer = js.native
  
  object remote extends Shortcut {
    
    @JSImport("electron", "Renderer.remote")
    @js.native
    val ^ : Remote = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.BrowserView")
    @js.native
    // Docs: https://electronjs.org/docs/api/browser-view
    /**
      * BrowserView
      */
    class BrowserView ()
      extends typingsSlinky.electron.Electron.BrowserView {
      def this(options: BrowserViewConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.BrowserWindow")
    @js.native
    /**
      * BrowserWindow
      */
    class BrowserWindow ()
      extends typingsSlinky.electron.Electron.BrowserWindow {
      def this(options: BrowserWindowConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.ClientRequest")
    @js.native
    class ClientRequest protected ()
      extends typingsSlinky.electron.Electron.ClientRequest {
      def this(options: String) = this()
      /**
        * ClientRequest
        */
      def this(options: ClientRequestConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.CommandLine")
    @js.native
    class CommandLine ()
      extends typingsSlinky.electron.Electron.CommandLine
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.Cookies")
    @js.native
    class Cookies ()
      extends typingsSlinky.electron.Electron.Cookies
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.Debugger")
    @js.native
    class Debugger ()
      extends typingsSlinky.electron.Electron.Debugger
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.Dock")
    @js.native
    class Dock ()
      extends typingsSlinky.electron.Electron.Dock
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.DownloadItem")
    @js.native
    class DownloadItem ()
      extends typingsSlinky.electron.Electron.DownloadItem
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.IncomingMessage")
    @js.native
    class IncomingMessage ()
      extends typingsSlinky.electron.Electron.IncomingMessage
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.Menu")
    @js.native
    /**
      * Menu
      */
    class Menu ()
      extends typingsSlinky.electron.Electron.Menu
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.MenuItem")
    @js.native
    class MenuItem protected ()
      extends typingsSlinky.electron.Electron.MenuItem {
      // Docs: https://electronjs.org/docs/api/menu-item
      /**
        * MenuItem
        */
      def this(options: MenuItemConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.MessageChannelMain")
    @js.native
    class MessageChannelMain ()
      extends typingsSlinky.electron.Electron.MessageChannelMain
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.MessagePortMain")
    @js.native
    class MessagePortMain ()
      extends typingsSlinky.electron.Electron.MessagePortMain
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.Notification")
    @js.native
    /**
      * Notification
      */
    class Notification ()
      extends typingsSlinky.electron.Electron.Notification {
      def this(options: NotificationConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.ServiceWorkers")
    @js.native
    class ServiceWorkers ()
      extends typingsSlinky.electron.Electron.ServiceWorkers
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBar")
    @js.native
    class TouchBar protected ()
      extends typingsSlinky.electron.Electron.TouchBar {
      // Docs: https://electronjs.org/docs/api/touch-bar
      /**
        * TouchBar
        */
      def this(options: TouchBarConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarButton")
    @js.native
    class TouchBarButton protected ()
      extends typingsSlinky.electron.Electron.TouchBarButton {
      // Docs: https://electronjs.org/docs/api/touch-bar-button
      /**
        * TouchBarButton
        */
      def this(options: TouchBarButtonConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarColorPicker")
    @js.native
    class TouchBarColorPicker protected ()
      extends typingsSlinky.electron.Electron.TouchBarColorPicker {
      // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
      /**
        * TouchBarColorPicker
        */
      def this(options: TouchBarColorPickerConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarGroup")
    @js.native
    class TouchBarGroup protected () extends EventEmitter {
      // Docs: https://electronjs.org/docs/api/touch-bar-group
      /**
        * TouchBarGroup
        */
      def this(options: TouchBarGroupConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarLabel")
    @js.native
    class TouchBarLabel protected ()
      extends typingsSlinky.electron.Electron.TouchBarLabel {
      // Docs: https://electronjs.org/docs/api/touch-bar-label
      /**
        * TouchBarLabel
        */
      def this(options: TouchBarLabelConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarOtherItemsProxy")
    @js.native
    // Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
    /**
      * TouchBarOtherItemsProxy
      */
    class TouchBarOtherItemsProxy () extends EventEmitter
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarPopover")
    @js.native
    class TouchBarPopover protected ()
      extends typingsSlinky.electron.Electron.TouchBarPopover {
      // Docs: https://electronjs.org/docs/api/touch-bar-popover
      /**
        * TouchBarPopover
        */
      def this(options: TouchBarPopoverConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarScrubber")
    @js.native
    class TouchBarScrubber protected ()
      extends typingsSlinky.electron.Electron.TouchBarScrubber {
      // Docs: https://electronjs.org/docs/api/touch-bar-scrubber
      /**
        * TouchBarScrubber
        */
      def this(options: TouchBarScrubberConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarSegmentedControl")
    @js.native
    class TouchBarSegmentedControl protected ()
      extends typingsSlinky.electron.Electron.TouchBarSegmentedControl {
      // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
      /**
        * TouchBarSegmentedControl
        */
      def this(options: TouchBarSegmentedControlConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarSlider")
    @js.native
    class TouchBarSlider protected ()
      extends typingsSlinky.electron.Electron.TouchBarSlider {
      // Docs: https://electronjs.org/docs/api/touch-bar-slider
      /**
        * TouchBarSlider
        */
      def this(options: TouchBarSliderConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.TouchBarSpacer")
    @js.native
    class TouchBarSpacer protected ()
      extends typingsSlinky.electron.Electron.TouchBarSpacer {
      // Docs: https://electronjs.org/docs/api/touch-bar-spacer
      /**
        * TouchBarSpacer
        */
      def this(options: TouchBarSpacerConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.Tray")
    @js.native
    class Tray protected ()
      extends typingsSlinky.electron.Electron.Tray {
      def this(image: String) = this()
      /**
        * Tray
        */
      def this(image: typingsSlinky.electron.Electron.NativeImage_) = this()
      def this(image: String, guid: String) = this()
      def this(image: typingsSlinky.electron.Electron.NativeImage_, guid: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.WebRequest")
    @js.native
    class WebRequest ()
      extends typingsSlinky.electron.Electron.WebRequest
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.nativeImage")
    @js.native
    class nativeImage ()
      extends typingsSlinky.electron.Electron.NativeImage_
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.session")
    @js.native
    class session ()
      extends typingsSlinky.electron.Electron.Session_
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron", "Renderer.remote.webContents")
    @js.native
    class webContents ()
      extends typingsSlinky.electron.Electron.WebContents_
    
    type _To = Remote
    
    /* This means you don't have to write `^`, but can instead just say `remote.foo` */
    override def _to: Remote = ^
  }
  
  @JSImport("electron", "Renderer.webFrame")
  @js.native
  val webFrame: WebFrame = js.native
  
  @JSImport("electron", "Renderer.webviewTag")
  @js.native
  val webviewTag: WebviewTag = js.native
}
