package typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces

import typingsSlinky.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterMetadata extends js.Object {
  var index: Double = js.native
  var injectRoot: Boolean = js.native
  var parameterName: js.UndefOr[String] = js.native
  var `type`: PARAMETER_TYPE = js.native
}

object ParameterMetadata {
  @scala.inline
  def apply(index: Double, injectRoot: Boolean, `type`: PARAMETER_TYPE): ParameterMetadata = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], injectRoot = injectRoot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMetadata]
  }
  @scala.inline
  implicit class ParameterMetadataOps[Self <: ParameterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjectRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PARAMETER_TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(js.undefined)
        ret
    }
  }
  
}

