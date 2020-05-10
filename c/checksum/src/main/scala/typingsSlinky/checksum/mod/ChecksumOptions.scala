package typingsSlinky.checksum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object for all functions
  */
@js.native
trait ChecksumOptions extends js.Object {
  /**
    * Algorithm to use, default 'sha1'
    * Can be 'sha1' or 'md5'  (see module 'crypto').
    */
  var algorithm: js.UndefOr[String] = js.native
}

object ChecksumOptions {
  @scala.inline
  def apply(): ChecksumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChecksumOptions]
  }
  @scala.inline
  implicit class ChecksumOptionsOps[Self <: ChecksumOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
  }
  
}

