package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTextConfig extends js.Object {
  /**
    * Experimental de-identification config to use. For internal use only. If
    * not specified, it is ignored and standard DLP is used.
    */
  var experimentalConfig: js.UndefOr[String] = js.native
  /**
    * The transformations to apply to the detected data.
    */
  var transformations: js.UndefOr[js.Array[SchemaInfoTypeTransformation]] = js.native
}

object SchemaTextConfig {
  @scala.inline
  def apply(): SchemaTextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextConfig]
  }
  @scala.inline
  implicit class SchemaTextConfigOps[Self <: SchemaTextConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentalConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformations(value: js.Array[SchemaInfoTypeTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(js.undefined)
        ret
    }
  }
  
}

