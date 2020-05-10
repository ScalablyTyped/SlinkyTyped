package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParameterSuppression
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterSuppressionCustomizationDefinition extends CustomizationDefinition {
  /**
    * The I/O shape from which this parameter should be suppressed.
    */
  var location: input | output = js.native
  /**
    * The name of the property to be suppressed. The property will be removed
    * from the input or output shape interface, but the underlying
    * serialization will not be changed.
    */
  var name: String = js.native
  var `type`: ParameterSuppression = js.native
}

object ParameterSuppressionCustomizationDefinition {
  @scala.inline
  def apply(location: input | output, name: String, `type`: ParameterSuppression): ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterSuppressionCustomizationDefinition]
  }
  @scala.inline
  implicit class ParameterSuppressionCustomizationDefinitionOps[Self <: ParameterSuppressionCustomizationDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: input | output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ParameterSuppression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

