package typingsSlinky.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsarOptions extends js.Object {
  var ordering: js.UndefOr[String] = js.native
  var unpack: js.UndefOr[String] = js.native
  var unpackDir: js.UndefOr[String] = js.native
}

object AsarOptions {
  @scala.inline
  def apply(): AsarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsarOptions]
  }
  @scala.inline
  implicit class AsarOptionsOps[Self <: AsarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrdering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpack")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpackDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpackDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackDir")(js.undefined)
        ret
    }
  }
  
}

