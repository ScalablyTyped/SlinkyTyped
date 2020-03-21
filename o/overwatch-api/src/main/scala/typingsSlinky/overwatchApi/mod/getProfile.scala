package typingsSlinky.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", "getProfile")
@js.native
object getProfile extends js.Object {
  def apply(
    platform: PLATFORM,
    region: REGION,
    tag: String,
    callback: js.Function2[/* err */ js.Error, /* data */ Profile, Unit]
  ): Unit = js.native
}

