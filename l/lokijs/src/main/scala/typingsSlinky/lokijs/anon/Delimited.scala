package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.DeserializeOptions
import typingsSlinky.lokijs.lokijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimited extends DeserializeOptions {
  var delimited: `false` = js.native
  var delimiter: js.UndefOr[String] = js.native
  var partition: js.UndefOr[Double] = js.native
  var partitioned: js.UndefOr[Boolean] = js.native
}

object Delimited {
  @scala.inline
  def apply(delimited: `false`): Delimited = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimited]
  }
  @scala.inline
  implicit class DelimitedOps[Self <: Delimited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimited(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
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

