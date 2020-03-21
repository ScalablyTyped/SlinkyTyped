package typingsSlinky.chromeApps.chrome.app.runtime

import typingsSlinky.chromeApps.AnonABOUTPAGE
import typingsSlinky.chromeApps.AnonNEWNOTE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.about_page
import typingsSlinky.chromeApps.chromeAppsStrings.app_launcher
import typingsSlinky.chromeApps.chromeAppsStrings.background
import typingsSlinky.chromeApps.chromeAppsStrings.chrome_internal
import typingsSlinky.chromeApps.chromeAppsStrings.command_line
import typingsSlinky.chromeApps.chromeAppsStrings.context_menu
import typingsSlinky.chromeApps.chromeAppsStrings.ephemeral_app
import typingsSlinky.chromeApps.chromeAppsStrings.extensions_page
import typingsSlinky.chromeApps.chromeAppsStrings.file_handler
import typingsSlinky.chromeApps.chromeAppsStrings.installed_notification
import typingsSlinky.chromeApps.chromeAppsStrings.keyboard
import typingsSlinky.chromeApps.chromeAppsStrings.kiosk
import typingsSlinky.chromeApps.chromeAppsStrings.load_and_launch
import typingsSlinky.chromeApps.chromeAppsStrings.management_api
import typingsSlinky.chromeApps.chromeAppsStrings.new_note
import typingsSlinky.chromeApps.chromeAppsStrings.new_tab_page
import typingsSlinky.chromeApps.chromeAppsStrings.reload
import typingsSlinky.chromeApps.chromeAppsStrings.restart
import typingsSlinky.chromeApps.chromeAppsStrings.system_tray
import typingsSlinky.chromeApps.chromeAppsStrings.test
import typingsSlinky.chromeApps.chromeAppsStrings.untracked
import typingsSlinky.chromeApps.chromeAppsStrings.url_handler
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchData extends js.Object {
  /**
    * Contains data that specifies the ActionType this app was launched with. This is null if the app was not launched with a specific action intent.
    *  ______________________________________________________________________________
    * | type of 'new_note' | actionType | new_note                                   |
    * |                    |            | The user wants to quickly take a new note. |
    * |____________________|____________|____________________________________________|
    * @since Chrome 54.
    */
  var actionData: js.UndefOr[ToStringLiteral[AnonNEWNOTE, String, Exclude[String, new_note]]] = js.undefined
  /**
    * The ID of the file or URL handler that the app is being invoked with.
    * Handler IDs are the top-level keys in the file_handlers and/or url_handlers dictionaries in the manifest.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Whether the app is being launched in a Chrome OS kiosk session.
    */
  var isKioskSession: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the app is being launched in a Chrome OS public session.
    * @since Chrome 47.
    */
  var isPublicSession: js.UndefOr[Boolean] = js.undefined
  /**
    * The file entries for the onLaunched event triggered by a matching file handler in the file_handlers manifest key.
    */
  var items: js.UndefOr[js.Array[LaunchDataItem]] = js.undefined
  /**
    * The referrer URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var referrerUrl: js.UndefOr[String] = js.undefined
  /**
    * Where the app is launched from.
    * @see enum LaunchSource
    */
  var source: js.UndefOr[
    ToStringLiteral[
      AnonABOUTPAGE, 
      String, 
      Exclude[
        String, 
        command_line | background | url_handler | system_tray | context_menu | chrome_internal | installed_notification | kiosk | restart | reload | new_tab_page | test | extensions_page | file_handler | management_api | about_page | load_and_launch | untracked | app_launcher | keyboard | ephemeral_app
      ]
    ]
  ] = js.undefined
  /**
    * The URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var url: js.UndefOr[String] = js.undefined
}

object LaunchData {
  @scala.inline
  def apply(
    actionData: ToStringLiteral[AnonNEWNOTE, String, Exclude[String, new_note]] = null,
    id: String = null,
    isKioskSession: js.UndefOr[Boolean] = js.undefined,
    isPublicSession: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[LaunchDataItem] = null,
    referrerUrl: String = null,
    source: ToStringLiteral[
      AnonABOUTPAGE, 
      String, 
      Exclude[
        String, 
        command_line | background | url_handler | system_tray | context_menu | chrome_internal | installed_notification | kiosk | restart | reload | new_tab_page | test | extensions_page | file_handler | management_api | about_page | load_and_launch | untracked | app_launcher | keyboard | ephemeral_app
      ]
    ] = null,
    url: String = null
  ): LaunchData = {
    val __obj = js.Dynamic.literal()
    if (actionData != null) __obj.updateDynamic("actionData")(actionData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isKioskSession)) __obj.updateDynamic("isKioskSession")(isKioskSession.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublicSession)) __obj.updateDynamic("isPublicSession")(isPublicSession.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (referrerUrl != null) __obj.updateDynamic("referrerUrl")(referrerUrl.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchData]
  }
}

