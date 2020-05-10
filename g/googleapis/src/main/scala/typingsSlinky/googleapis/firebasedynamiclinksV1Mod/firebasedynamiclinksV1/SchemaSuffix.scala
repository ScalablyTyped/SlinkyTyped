package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Short Dynamic Link suffix.
  */
@js.native
trait SchemaSuffix extends js.Object {
  /**
    * Only applies to Option.CUSTOM.
    */
  var customSuffix: js.UndefOr[String] = js.native
  /**
    * Suffix option.
    */
  var option: js.UndefOr[String] = js.native
}

object SchemaSuffix {
  @scala.inline
  def apply(): SchemaSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuffix]
  }
  @scala.inline
  implicit class SchemaSuffixOps[Self <: SchemaSuffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
  }
  
}

