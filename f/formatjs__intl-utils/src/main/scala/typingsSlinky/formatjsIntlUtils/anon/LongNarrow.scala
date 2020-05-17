package typingsSlinky.formatjsIntlUtils.anon

import typingsSlinky.formatjsIntlUtils.displaynamesTypesMod.CurrencyCode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongNarrow extends js.Object {
  var long: Record[CurrencyCode, String] = js.native
  var narrow: Record[CurrencyCode, String] = js.native
  var short: Record[CurrencyCode, String] = js.native
}

object LongNarrow {
  @scala.inline
  def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): LongNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongNarrow]
  }
  @scala.inline
  implicit class LongNarrowOps[Self <: LongNarrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLong(value: Record[CurrencyCode, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNarrow(value: Record[CurrencyCode, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: Record[CurrencyCode, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

