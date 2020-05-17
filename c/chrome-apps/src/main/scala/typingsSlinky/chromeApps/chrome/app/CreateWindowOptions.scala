package typingsSlinky.chromeApps.chrome.app

import typingsSlinky.chromeApps.anon.FULLSCREEN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.MAXIMIZED
import typingsSlinky.chromeApps.chromeAppsStrings.MINIMIZED
import typingsSlinky.chromeApps.chromeAppsStrings.NORMAL
import typingsSlinky.chromeApps.chromeAppsStrings.chrome
import typingsSlinky.chromeApps.chromeAppsStrings.fullscreen_
import typingsSlinky.chromeApps.chromeAppsStrings.maximized_
import typingsSlinky.chromeApps.chromeAppsStrings.minimized_
import typingsSlinky.chromeApps.chromeAppsStrings.none_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.shell
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWindowOptions extends ContentBounds {
  /**
    * @requires(dev) Chrome dev only
    * @requires Permissions: 'app.window.alpha'
    * @description
    * Enable alpha on frame 'none'
    */
  var alphaEnabled: js.UndefOr[Boolean] = js.native
  /**
    * @requires Permissions: 'alwaysOnTopWindows' or 'app.window.alwaysOnTop'
    * @description
    * If true, the window will stay above most other windows.
    * If there are multiple windows of this kind, the currently focused window will be in the foreground.
    * Call setAlwaysOnTop() on the window to change this property after creation.
    * @default false
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Size and position of the content in the window (excluding the titlebar).
    * If an id is also specified and a window with a matching id has been shown before,
    * the remembered bounds of the window will be used instead.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var bounds: js.UndefOr[ContentBounds] = js.native
  /** If true, the window will be focused when created. Defaults to true. */
  var focused: js.UndefOr[Boolean] = js.native
  /**
    * Frame type: none or chrome (defaults to chrome).
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    * @since Use of FrameOptions is new in M36.
    */
  var frame: js.UndefOr[none_ | chrome | FrameOptions | FrameOptionsChrome] = js.native
  /**
    * If true, the window will be created in a hidden state. Call show() on the window to show it once it has been created. Defaults to false.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * URL of the window icon.
    * A window can have its own icon when showInShelf is set to true.
    * The URL should be a global or an app's local URL.
    * @since Chrome 54.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Id to identify the window.
    *
    * This will be used to remember the size and position of the window and restore that geometry when a window with the same id is later opened.
    * If a window with a given id is created while another window with the same id already exists,
    * the currently opened window will be focused instead of creating a new window.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * @requires frame = 'none'
    * @requires Permissions: 'app.window.ime'
    * @description
    * Windows API - ime (No fullscreen window in kiosk mode)
    */
  var ime: js.UndefOr[Boolean] = js.native
  /**
    * Used to specify the initial position, initial size and constraints of the window's content (excluding window decorations).
    * If an id is also specified and a window with a matching id has been shown before, the remembered bounds will be used instead.
    * Note that the padding between the inner and outer bounds is determined by the OS.
    * Therefore setting the same bounds property for both the innerBounds and outerBounds will result in an error.
    * @since This property is new in Chrome 36.
    */
  var innerBounds: js.UndefOr[BoundsSpecification] = js.native
  /**
    * Maximum height of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var maxHeight: js.UndefOr[integer] = js.native
  /**
    * Maximum width of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var maxWidth: js.UndefOr[integer] = js.native
  /**
    * Minimum height of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var minHeight: js.UndefOr[integer] = js.native
  /**
    * Minimum width of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var minWidth: js.UndefOr[integer] = js.native
  /**
    * Used to specify the initial position, initial size and constraints of the window (including window decorations such as the title bar and frame).
    * If an id is also specified and a window with a matching id has been shown before, the remembered bounds will be used instead.
    * Note that the padding between the inner and outer bounds is determined by the OS.
    * Therefore setting the same bounds property for both the innerBounds and outerBounds will result in an error.
    * @since This property is new in Chrome 36.
    */
  var outerBounds: js.UndefOr[BoundsSpecification] = js.native
  /**
    * If true, the window will be resizable by the user. Defaults to true.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * If true, the window will have its own shelf icon.
    * Otherwise the window will be grouped in the shelf with other windows that are associated with the app.
    * If showInShelf is set to true you need to specify an id for the window.
    * @default false
    * @since Chrome 54.
    */
  var showInShelf: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Deprecated since Chrome 34. Multiple windows with the same id is no longer supported.
    * By default if you specify an id for the window,
    * the window will only be created if another window with the same id doesn't already exist.
    * If a window with the same id already exists that window is activated instead.
    * If you do want to create multiple windows with the same id, you can set this property to false.
    */
  var singleton: js.UndefOr[Boolean] = js.native
  /**
    * The initial state of the window, allowing it to be created already fullscreen, maximized, or minimized. Defaults to 'normal'.
    */
  var state: js.UndefOr[
    ToStringLiteral[
      FULLSCREEN, 
      /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
      Exclude[
        /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
        normal_ | fullscreen_ | maximized_ | minimized_
      ]
    ]
  ] = js.native
  /**
    * @deprecated Deprecated since Chrome 69. All app windows use the 'shell' window type.
    * @description Type of window to create
    **/
  var `type`: js.UndefOr[shell] = js.native
  /**
    * If true, and supported by the platform, the window will be visible on all workspaces.
    * @since Chrome 39.
    */
  var visibleOnAllWorkspaces: js.UndefOr[Boolean] = js.native
}

object CreateWindowOptions {
  @scala.inline
  def apply(): CreateWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWindowOptions]
  }
  @scala.inline
  implicit class CreateWindowOptionsOps[Self <: CreateWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: ContentBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: none_ | chrome | FrameOptions | FrameOptionsChrome): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ime")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerBounds(value: BoundsSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterBounds(value: BoundsSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInShelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInShelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInShelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInShelf")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(js.undefined)
        ret
    }
    @scala.inline
    def withState(
      value: ToStringLiteral[
          FULLSCREEN, 
          /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
          Exclude[
            /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
            normal_ | fullscreen_ | maximized_ | minimized_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: shell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleOnAllWorkspaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnAllWorkspaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleOnAllWorkspaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnAllWorkspaces")(js.undefined)
        ret
    }
  }
  
}

