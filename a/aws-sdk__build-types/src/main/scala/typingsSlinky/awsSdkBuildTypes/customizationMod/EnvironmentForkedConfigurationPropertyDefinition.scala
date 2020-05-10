package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.forked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentForkedConfigurationPropertyDefinition
  extends ConfigurationPropertyDefinitionSharedAttributes
     with ConfigurationPropertyDefinition {
  /**
    * The generation configuration to apply when creating an SDK for a browser
    * runtime environment.
    */
  var browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation = js.native
  /**
    * The generation configuration to apply when creating an SDK for a Node.JS
    * runtime environment.
    */
  var node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation = js.native
  var `type`: forked = js.native
  /**
    * The generation configuration to apply when creating an SDK for an
    * isomorphic runtime environment.
    */
  var universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation = js.native
}

object EnvironmentForkedConfigurationPropertyDefinition {
  @scala.inline
  def apply(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    `type`: forked,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
  ): EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentForkedConfigurationPropertyDefinition]
  }
  @scala.inline
  implicit class EnvironmentForkedConfigurationPropertyDefinitionOps[Self <: EnvironmentForkedConfigurationPropertyDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: forked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniversal(value: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

