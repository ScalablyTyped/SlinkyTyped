package typingsSlinky.firebaseAppTypes.privateMod.firebaseComponentAugmentingMod

import typingsSlinky.firebaseAppTypes.privateMod.PlatformLoggerService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var `platform-logger`: PlatformLoggerService = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(`platform-logger`: PlatformLoggerService): NameServiceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("platform-logger")(`platform-logger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withPlatform-logger`(value: PlatformLoggerService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform-logger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

