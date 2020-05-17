package typingsSlinky.googleGax.fallbackMod

import typingsSlinky.googleGax.gaxMod.BackoffSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "RetryOptions")
@js.native
class RetryOptions protected ()
  extends typingsSlinky.googleGax.gaxMod.RetryOptions {
  def this(retryCodes: js.Array[Double], backoffSettings: BackoffSettings) = this()
}

