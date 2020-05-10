package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.SyntheticParameter
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntheticParameterCustomizationDefinition extends CustomizationDefinition {
  /**
    * The documentation string that should be injected for this property.
    * Should be in standard JSDoc format and expect to be indented by 4 spaces.
    */
  var documentation: String = js.native
  /**
    * Packages that must be imported to use this property.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.native
  /**
    * The I/O shape on which this synthetic parameter should be applied.
    */
  var location: input | output = js.native
  /**
    * The name of the property to be added to the operation's input or output
    * shape. For client-side only parameters, the first character should
    * typically be `$` to avoid any clashes with service parameters.
    */
  var name: String = js.native
  /**
    * Whether this input parameter must be provided by the user.
    */
  var required: js.UndefOr[Boolean] = js.native
  var `type`: SyntheticParameter = js.native
  /**
    * Will be used as the type annotation for this property.
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var typeExpression: String = js.native
}

object SyntheticParameterCustomizationDefinition {
  @scala.inline
  def apply(
    documentation: String,
    location: input | output,
    name: String,
    `type`: SyntheticParameter,
    typeExpression: String
  ): SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticParameterCustomizationDefinition]
  }
  @scala.inline
  implicit class SyntheticParameterCustomizationDefinitionOps[Self <: SyntheticParameterCustomizationDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withType(value: SyntheticParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[Import]): Self = {
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
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

