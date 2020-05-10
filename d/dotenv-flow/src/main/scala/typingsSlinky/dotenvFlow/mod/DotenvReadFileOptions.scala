package typingsSlinky.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvReadFileOptions extends js.Object {
  /**
    * Encoding for reading the `.env*` files.
    */
  var encoding: js.UndefOr[String] = js.native
}

object DotenvReadFileOptions {
  @scala.inline
  def apply(): DotenvReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvReadFileOptions]
  }
  @scala.inline
  implicit class DotenvReadFileOptionsOps[Self <: DotenvReadFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
  }
  
}

