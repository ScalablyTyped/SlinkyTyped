package typingsSlinky.chromeApps.chrome.app.runtime

import typingsSlinky.chromeApps.anon.ABOUTPAGE
import typingsSlinky.chromeApps.anon.NEWNOTE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.ABOUT_PAGE
import typingsSlinky.chromeApps.chromeAppsStrings.APP_LAUNCHER
import typingsSlinky.chromeApps.chromeAppsStrings.BACKGROUND
import typingsSlinky.chromeApps.chromeAppsStrings.CHROME_INTERNAL
import typingsSlinky.chromeApps.chromeAppsStrings.COMMAND_LINE
import typingsSlinky.chromeApps.chromeAppsStrings.CONTEXT_MENU
import typingsSlinky.chromeApps.chromeAppsStrings.EPHEMERAL_APP
import typingsSlinky.chromeApps.chromeAppsStrings.EXTENSIONS_PAGE
import typingsSlinky.chromeApps.chromeAppsStrings.FILE_HANDLER
import typingsSlinky.chromeApps.chromeAppsStrings.INSTALLED_NOTIFICATION
import typingsSlinky.chromeApps.chromeAppsStrings.KEYBOARD
import typingsSlinky.chromeApps.chromeAppsStrings.KIOSK
import typingsSlinky.chromeApps.chromeAppsStrings.LOAD_AND_LAUNCH
import typingsSlinky.chromeApps.chromeAppsStrings.MANAGEMENT_API
import typingsSlinky.chromeApps.chromeAppsStrings.NEW_NOTE
import typingsSlinky.chromeApps.chromeAppsStrings.NEW_TAB_PAGE
import typingsSlinky.chromeApps.chromeAppsStrings.RELOAD
import typingsSlinky.chromeApps.chromeAppsStrings.RESTART
import typingsSlinky.chromeApps.chromeAppsStrings.SYSTEM_TRAY
import typingsSlinky.chromeApps.chromeAppsStrings.TEST
import typingsSlinky.chromeApps.chromeAppsStrings.UNTRACKED
import typingsSlinky.chromeApps.chromeAppsStrings.URL_HANDLER
import typingsSlinky.chromeApps.chromeAppsStrings.about_page_
import typingsSlinky.chromeApps.chromeAppsStrings.app_launcher_
import typingsSlinky.chromeApps.chromeAppsStrings.background_
import typingsSlinky.chromeApps.chromeAppsStrings.chrome_internal_
import typingsSlinky.chromeApps.chromeAppsStrings.command_line_
import typingsSlinky.chromeApps.chromeAppsStrings.context_menu_
import typingsSlinky.chromeApps.chromeAppsStrings.ephemeral_app_
import typingsSlinky.chromeApps.chromeAppsStrings.extensions_page_
import typingsSlinky.chromeApps.chromeAppsStrings.file_handler_
import typingsSlinky.chromeApps.chromeAppsStrings.installed_notification_
import typingsSlinky.chromeApps.chromeAppsStrings.keyboard_
import typingsSlinky.chromeApps.chromeAppsStrings.kiosk_
import typingsSlinky.chromeApps.chromeAppsStrings.load_and_launch_
import typingsSlinky.chromeApps.chromeAppsStrings.management_api_
import typingsSlinky.chromeApps.chromeAppsStrings.new_note_
import typingsSlinky.chromeApps.chromeAppsStrings.new_tab_page_
import typingsSlinky.chromeApps.chromeAppsStrings.reload_
import typingsSlinky.chromeApps.chromeAppsStrings.restart_
import typingsSlinky.chromeApps.chromeAppsStrings.system_tray_
import typingsSlinky.chromeApps.chromeAppsStrings.test_
import typingsSlinky.chromeApps.chromeAppsStrings.untracked_
import typingsSlinky.chromeApps.chromeAppsStrings.url_handler_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchData extends js.Object {
  
  /**
    * Contains data that specifies the ActionType this app was launched with. This is null if the app was not launched with a specific action intent.
    *  ______________________________________________________________________________
    * | type of 'new_note' | actionType | new_note                                   |
    * |                    |            | The user wants to quickly take a new note. |
    * |____________________|____________|____________________________________________|
    * @since Chrome 54.
    */
  var actionData: js.UndefOr[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]] = js.native
  
  /**
    * The ID of the file or URL handler that the app is being invoked with.
    * Handler IDs are the top-level keys in the file_handlers and/or url_handlers dictionaries in the manifest.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether the app is being launched in a Chrome OS kiosk session.
    */
  var isKioskSession: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the app is being launched in a Chrome OS public session.
    * @since Chrome 47.
    */
  var isPublicSession: js.UndefOr[Boolean] = js.native
  
  /**
    * The file entries for the onLaunched event triggered by a matching file handler in the file_handlers manifest key.
    */
  var items: js.UndefOr[js.Array[LaunchDataItem]] = js.native
  
  /**
    * The referrer URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var referrerUrl: js.UndefOr[String] = js.native
  
  /**
    * Where the app is launched from.
    * @see enum LaunchSource
    */
  var source: js.UndefOr[
    ToStringLiteral[
      ABOUTPAGE, 
      /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
      Exclude[
        /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
        command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
      ]
    ]
  ] = js.native
  
  /**
    * The URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var url: js.UndefOr[String] = js.native
}
object LaunchData {
  
  @scala.inline
  def apply(): LaunchData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchData]
  }
  
  @scala.inline
  implicit class LaunchDataOps[Self <: LaunchData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionData(value: ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]): Self = this.set("actionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionData: Self = this.set("actionData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsKioskSession(value: Boolean): Self = this.set("isKioskSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsKioskSession: Self = this.set("isKioskSession", js.undefined)
    
    @scala.inline
    def setIsPublicSession(value: Boolean): Self = this.set("isPublicSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPublicSession: Self = this.set("isPublicSession", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: LaunchDataItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[LaunchDataItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setReferrerUrl(value: String): Self = this.set("referrerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerUrl: Self = this.set("referrerUrl", js.undefined)
    
    @scala.inline
    def setSource(
      value: ToStringLiteral[
          ABOUTPAGE, 
          /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
          Exclude[
            /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
            command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
          ]
        ]
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
