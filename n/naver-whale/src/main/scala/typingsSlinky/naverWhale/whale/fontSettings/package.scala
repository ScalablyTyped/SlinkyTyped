package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettings {
  type DefaultFixedFontSizeChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* details */ typingsSlinky.chrome.chrome.fontSettings.FontSizeDetails, scala.Unit]
  ]
  type DefaultFontSizeChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* details */ typingsSlinky.chrome.chrome.fontSettings.FontSizeDetails, scala.Unit]
  ]
  type FontChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* details */ typingsSlinky.chrome.chrome.fontSettings.FullFontDetails, scala.Unit]
  ]
  type MinimumFontSizeChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* details */ typingsSlinky.chrome.chrome.fontSettings.FontSizeDetails, scala.Unit]
  ]
}
