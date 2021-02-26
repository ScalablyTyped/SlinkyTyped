package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.SyntheticParameter
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SyntheticParameterCustomizationDefinitionMutableBuilder[Self <: SyntheticParameterCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImports(value: js.Array[Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: Import*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: input | output): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setType(value: SyntheticParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeExpression(value: String): Self = StObject.set(x, "typeExpression", value.asInstanceOf[js.Any])
  }
}
