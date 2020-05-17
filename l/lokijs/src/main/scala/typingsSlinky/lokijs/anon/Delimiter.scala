package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.DeserializeOptions
import typingsSlinky.lokijs.lokijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends DeserializeOptions {
  var delimited: js.UndefOr[`true`] = js.native
  var delimiter: String = js.native
  var partition: js.UndefOr[Double] = js.native
  var partitioned: js.UndefOr[Boolean] = js.native
}

object Delimiter {
  @scala.inline
  def apply(delimiter: String): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimited(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimited")(js.undefined)
        ret
    }
    @scala.inline
    def withPartition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitioned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitioned")(js.undefined)
        ret
    }
  }
  
}

