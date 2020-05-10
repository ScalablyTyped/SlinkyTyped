package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandaloneFormatSpec extends js.Object {
  var format: js.Array[String] = js.native
  var isFormat: js.UndefOr[js.RegExp] = js.native
  var standalone: js.Array[String] = js.native
}

object StandaloneFormatSpec {
  @scala.inline
  def apply(format: js.Array[String], standalone: js.Array[String]): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
  @scala.inline
  implicit class StandaloneFormatSpecOps[Self <: StandaloneFormatSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandalone(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFormat(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormat")(js.undefined)
        ret
    }
  }
  
}

