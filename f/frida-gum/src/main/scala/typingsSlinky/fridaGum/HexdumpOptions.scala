package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexdumpOptions extends js.Object {
  /**
    * Whether ANSI colors should be used. Defaults to false.
    */
  var ansi: js.UndefOr[Boolean] = js.native
  /**
    * Whether a header should be included. Defaults to true.
    */
  var header: js.UndefOr[Boolean] = js.native
  /**
    * Limits how many bytes to dump.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Specifies byte offset of where to start dumping. Defaults to 0.
    */
  var offset: js.UndefOr[Double] = js.native
}

object HexdumpOptions {
  @scala.inline
  def apply(): HexdumpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexdumpOptions]
  }
  @scala.inline
  implicit class HexdumpOptionsOps[Self <: HexdumpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

