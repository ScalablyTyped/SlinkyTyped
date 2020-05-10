package typingsSlinky.rollupPluginutils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataToEsmOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[String] = js.native
  var namedExports: js.UndefOr[Boolean] = js.native
  var objectShorthand: js.UndefOr[Boolean] = js.native
  var preferConst: js.UndefOr[Boolean] = js.native
}

object DataToEsmOptions {
  @scala.inline
  def apply(): DataToEsmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataToEsmOptions]
  }
  @scala.inline
  implicit class DataToEsmOptionsOps[Self <: DataToEsmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectShorthand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectShorthand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectShorthand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectShorthand")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferConst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferConst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferConst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferConst")(js.undefined)
        ret
    }
  }
  
}

