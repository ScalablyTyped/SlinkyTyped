package typingsSlinky.countriesAndTimezones.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timezone extends js.Object {
  var aliasOf: String | Null = js.native
  var country: String | Null = js.native
  var dstOffset: Double = js.native
  var dstOffsetStr: String = js.native
  var name: String = js.native
  var utcOffset: Double = js.native
  var utcOffsetStr: String = js.native
}

object Timezone {
  @scala.inline
  def apply(dstOffset: Double, dstOffsetStr: String, name: String, utcOffset: Double, utcOffsetStr: String): Timezone = {
    val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
  @scala.inline
  implicit class TimezoneOps[Self <: Timezone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDstOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDstOffsetStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstOffsetStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtcOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtcOffsetStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffsetStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasOf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasOfNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasOf")(null)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(null)
        ret
    }
  }
  
}

