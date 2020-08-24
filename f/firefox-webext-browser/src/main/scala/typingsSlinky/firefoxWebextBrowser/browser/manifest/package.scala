package typingsSlinky.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object manifest {
  type ExtensionFileUrl = java.lang.String
  type ExtensionID = java.lang.String
  type ExtensionURL = java.lang.String
  type HttpURL = java.lang.String
  type IconImageData = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.firefoxWebextBrowser.browser.manifest.ImageData] | typingsSlinky.firefoxWebextBrowser.browser.manifest.ImageData
  type IconPath = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionFileUrl] | typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionFileUrl
  type ImageData = js.Any
  type ImageDataOrExtensionURL = java.lang.String
  type KeyName = java.lang.String
  type MatchPattern = typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPatternRestricted | typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPatternUnestricted | typingsSlinky.firefoxWebextBrowser.browser.manifest._MatchPattern
  /** Same as MatchPattern above, but excludes<all_urls></all_urls> */
  type MatchPatternRestricted = java.lang.String
  /**
    * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged
    * add-ons, but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
    */
  type MatchPatternUnestricted = java.lang.String
  type OptionalPermission = typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermissionNoPrompt | typingsSlinky.firefoxWebextBrowser.browser.manifest._OptionalPermission
  type OptionalPermissionNoPrompt = typingsSlinky.firefoxWebextBrowser.browser.manifest._OptionalPermissionNoPrompt
  type OptionalPermissionOrOrigin = typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermission | typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
  type Permission = java.lang.String | typingsSlinky.firefoxWebextBrowser.browser.manifest.PermissionNoPrompt | typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermission | typingsSlinky.firefoxWebextBrowser.browser.manifest._Permission
  /* _manifest types */
  type PermissionNoPrompt = typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermission | typingsSlinky.firefoxWebextBrowser.browser.manifest._PermissionNoPrompt
  type PermissionOrOrigin = typingsSlinky.firefoxWebextBrowser.browser.manifest.Permission | typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
  /** @deprecated Event pages are not currently supported. This will run as a persistent background page. */
  type PersistentBackgroundProperty = scala.Boolean
  type ThemeColor = java.lang.String | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  /** @deprecated An unexpected property was found in the WebExtension manifest. */
  type UnrecognizedProperty = js.Any
  type _MatchPattern = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Lessthansignall_urlsGreaterthansign
  type _Permission = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.nativeMessaging
}
