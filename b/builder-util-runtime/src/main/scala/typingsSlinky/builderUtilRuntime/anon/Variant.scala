package typingsSlinky.builderUtilRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variant extends js.Object {
  var format: String = js.native
  var variant: String = js.native
  var version: Double = js.native
}

object Variant {
  @scala.inline
  def apply(format: String, variant: String, version: Double): Variant = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variant]
  }
  @scala.inline
  implicit class VariantOps[Self <: Variant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

