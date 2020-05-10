package typingsSlinky.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationPropertyDefinitionSharedAttributes extends js.Object {
  /**
    * The documentation string that should be injected over this configuration
    * property. Should be in standard JSDoc format and expect to be indented by
    * 4 spaces.
    */
  var documentation: String = js.native
  /**
    * Packages that must be imported to use this configuration property.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.native
  /**
    * Will be used as the `InputType` type parameter to the generated
    * `ConfigurationPropertyDefinition` for this configuration property.
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var inputType: String = js.native
  /**
    * Whether this property represents internal state about an SDK client that
    * is not meant to be controlled by users of that client.
    *
    * If `true`, the property will not appear in the client's configuration
    * interface but will appear in the client's resolved configuration
    * interface.
    */
  var internal: js.UndefOr[Boolean] = js.native
  /**
    * The type to which this property will be normalized. It should only be
    * specified if different from the property's inputType (in which case it
    * must be a subtype thereof).
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var resolvedType: js.UndefOr[String] = js.native
}

object ConfigurationPropertyDefinitionSharedAttributes {
  @scala.inline
  def apply(documentation: String, inputType: String): ConfigurationPropertyDefinitionSharedAttributes = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinitionSharedAttributes]
  }
  @scala.inline
  implicit class ConfigurationPropertyDefinitionSharedAttributesOps[Self <: ConfigurationPropertyDefinitionSharedAttributes] (val x: Self) extends AnyVal {
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
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
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
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedType")(js.undefined)
        ret
    }
  }
  
}

