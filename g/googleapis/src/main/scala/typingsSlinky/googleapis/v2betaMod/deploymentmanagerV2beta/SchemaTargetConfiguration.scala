package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetConfiguration extends js.Object {
  /**
    * The configuration to use for this deployment.
    */
  var config: js.UndefOr[SchemaConfigFile] = js.native
  /**
    * Specifies any files to import for this configuration. This can be used to
    * import templates or other files. For example, you might import a text
    * file in order to use the file in a template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.native
}

object SchemaTargetConfiguration {
  @scala.inline
  def apply(): SchemaTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetConfiguration]
  }
  @scala.inline
  implicit class SchemaTargetConfigurationOps[Self <: SchemaTargetConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SchemaConfigFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withImports(value: js.Array[SchemaImportFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.undefined)
        ret
    }
  }
  
}

