package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasOverrideFlag extends js.Object {
  var hasOverrideFlag: Boolean = js.native
  var property: String = js.native
  var unit: String = js.native
}

object HasOverrideFlag {
  @scala.inline
  def apply(hasOverrideFlag: Boolean, property: String, unit: String): HasOverrideFlag = {
    val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasOverrideFlag]
  }
  @scala.inline
  implicit class HasOverrideFlagOps[Self <: HasOverrideFlag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasOverrideFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOverrideFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

