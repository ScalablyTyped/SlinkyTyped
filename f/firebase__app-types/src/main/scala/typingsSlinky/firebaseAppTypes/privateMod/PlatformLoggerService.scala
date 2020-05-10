package typingsSlinky.firebaseAppTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformLoggerService extends js.Object {
  def getPlatformInfoString(): String = js.native
}

object PlatformLoggerService {
  @scala.inline
  def apply(getPlatformInfoString: () => String): PlatformLoggerService = {
    val __obj = js.Dynamic.literal(getPlatformInfoString = js.Any.fromFunction0(getPlatformInfoString))
    __obj.asInstanceOf[PlatformLoggerService]
  }
  @scala.inline
  implicit class PlatformLoggerServiceOps[Self <: PlatformLoggerService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPlatformInfoString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlatformInfoString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

