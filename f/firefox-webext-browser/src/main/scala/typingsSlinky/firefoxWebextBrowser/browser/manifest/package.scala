package typingsSlinky.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object manifest {
  type ExtensionFileUrl = java.lang.String
  type ExtensionID = java.lang.String
  type ExtensionURL = java.lang.String
  type HttpURL = java.lang.String
  type ImageData = js.Any
  type ImageDataOrExtensionURL = java.lang.String
  type KeyName = java.lang.String
  /** Same as MatchPattern above, but excludes<all_urls></all_urls> */
  type MatchPatternRestricted = java.lang.String
  /**
    * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged
    * add-ons, but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
    */
  type MatchPatternUnestricted = java.lang.String
  type OptionalPermission = typingsSlinky.firefoxWebextBrowser.browser.manifest._OptionalPermission
  /** @deprecated Event pages are not currently supported. This will run as a persistent background page. */
  type PersistentBackgroundProperty = scala.Boolean
  /** @deprecated An unexpected property was found in the WebExtension manifest. */
  type UnrecognizedProperty = js.Any
  type _MatchPattern = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.Lessthansignall_urlsGreaterthansign
}
