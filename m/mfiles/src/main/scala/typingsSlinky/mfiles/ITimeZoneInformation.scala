package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeZoneInformation extends js.Object {
  val StandardName: String = js.native
  def LoadTimeZoneByName(TimeZoneName: String): Unit = js.native
  def LoadWithCurrentTimeZone(): Unit = js.native
}

object ITimeZoneInformation {
  @scala.inline
  def apply(LoadTimeZoneByName: String => Unit, LoadWithCurrentTimeZone: () => Unit, StandardName: String): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(LoadTimeZoneByName = js.Any.fromFunction1(LoadTimeZoneByName), LoadWithCurrentTimeZone = js.Any.fromFunction0(LoadWithCurrentTimeZone), StandardName = StandardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeZoneInformation]
  }
  @scala.inline
  implicit class ITimeZoneInformationOps[Self <: ITimeZoneInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadTimeZoneByName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadTimeZoneByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadWithCurrentTimeZone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadWithCurrentTimeZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStandardName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

