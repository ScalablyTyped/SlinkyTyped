package typingsSlinky.dayjs.utcMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dayjs extends js.Object {
  def isUTC(): Boolean = js.native
  def local(): Dayjs = js.native
  def utc(): Dayjs = js.native
  def utcOffset(offset: Double): Dayjs = js.native
}

object Dayjs {
  @scala.inline
  def apply(isUTC: () => Boolean, local: () => Dayjs, utc: () => Dayjs, utcOffset: Double => Dayjs): Dayjs = {
    val __obj = js.Dynamic.literal(isUTC = js.Any.fromFunction0(isUTC), local = js.Any.fromFunction0(local), utc = js.Any.fromFunction0(utc), utcOffset = js.Any.fromFunction1(utcOffset))
    __obj.asInstanceOf[Dayjs]
  }
  @scala.inline
  implicit class DayjsOps[Self <: Dayjs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsUTC(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUTC")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocal(value: () => Dayjs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUtc(value: () => Dayjs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUtcOffset(value: Double => Dayjs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

