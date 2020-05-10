package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParserDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserDecoratorCustomizationDefinition extends CustomizationDefinition {
  /**
    * Any configuration necessary for this middleware to be resolved.
    */
  var configuration: js.UndefOr[ConfigurationDefinition] = js.native
  /**
    * An expression that resolves to the decorator with which to wrap the
    * parser.
    */
  var expression: String = js.native
  /**
    * Packages that must be imported to use this parser decorator.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.native
  /**
    * The relative priority of this decorator relative to other decorators.
    * Used during client generation to order decorator application.
    */
  var priority: Double = js.native
  var `type`: ParserDecorator = js.native
}

object ParserDecoratorCustomizationDefinition {
  @scala.inline
  def apply(expression: String, priority: Double, `type`: ParserDecorator): ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserDecoratorCustomizationDefinition]
  }
  @scala.inline
  implicit class ParserDecoratorCustomizationDefinitionOps[Self <: ParserDecoratorCustomizationDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ParserDecorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: ConfigurationDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
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
  }
  
}

