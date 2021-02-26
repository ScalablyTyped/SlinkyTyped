package typingsSlinky.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Receiver")
@js.native
class Receiver protected ()
  extends typingsSlinky.chrome.chrome.cast.Receiver {
  /**
    * @param {string} label
    * @param {string} friendlyName
    * @param {Array<chrome.cast.Capability>=} opt_capabilities
    * @param {chrome.cast.Volume=} opt_volume
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Receiver
    */
  def this(label: String, friendlyName: String) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.Array[typingsSlinky.chrome.chrome.cast.Capability]
  ) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.UndefOr[scala.Nothing],
    volume: typingsSlinky.chrome.chrome.cast.Volume
  ) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.Array[typingsSlinky.chrome.chrome.cast.Capability],
    volume: typingsSlinky.chrome.chrome.cast.Volume
  ) = this()
}
