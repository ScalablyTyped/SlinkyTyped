package typingsSlinky.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Volume")
@js.native
/**
  * @param {?number=} opt_level
  * @param {?boolean=} opt_muted
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Volume
  */
class Volume ()
  extends typingsSlinky.chrome.chrome.cast.Volume {
  def this(level: Double) = this()
  def this(level: js.UndefOr[scala.Nothing], muted: Boolean) = this()
  def this(level: Double, muted: Boolean) = this()
}
