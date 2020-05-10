package typingsSlinky.angularCompiler.apiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.AnonUsesOnChanges
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3DirectiveMetadata extends js.Object {
  /**
    * Dependencies of the directive's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | Null = js.native
  /**
    * Reference name under which to export the directive's type in a template,
    * if any.
    */
  var exportAs: js.Array[String] | Null = js.native
  /**
    * Mappings indicating how the directive interacts with its host element (host bindings,
    * listeners, etc).
    */
  var host: R3HostMetadata = js.native
  /**
    * A mapping of input field names to the property names.
    */
  var inputs: StringDictionary[String | (js.Tuple2[String, String])] = js.native
  /**
    * Information about usage of specific lifecycle events which require special treatment in the
    * code generator.
    */
  var lifecycle: AnonUsesOnChanges = js.native
  /**
    * Name of the directive type.
    */
  var name: String = js.native
  /**
    * A mapping of output field names to the property names.
    */
  var outputs: StringDictionary[String] = js.native
  /**
    * The list of providers defined in the directive.
    */
  var providers: Expression | Null = js.native
  /**
    * Information about the content queries made by the directive.
    */
  var queries: js.Array[R3QueryMetadata] = js.native
  /**
    * Unparsed selector of the directive, or `null` if there was no selector.
    */
  var selector: String | Null = js.native
  /**
    * An expression representing a reference to the directive itself.
    */
  var `type`: Expression = js.native
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double = js.native
  /**
    * A source span for the directive type.
    */
  var typeSourceSpan: ParseSourceSpan = js.native
  /**
    * Whether or not the component or directive inherits from another class
    */
  var usesInheritance: Boolean = js.native
  /**
    * Information about the view queries made by the directive.
    */
  var viewQueries: js.Array[R3QueryMetadata] = js.native
}

object R3DirectiveMetadata {
  @scala.inline
  def apply(
    host: R3HostMetadata,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    lifecycle: AnonUsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    queries: js.Array[R3QueryMetadata],
    `type`: Expression,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata]
  ): R3DirectiveMetadata = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadata]
  }
  @scala.inline
  implicit class R3DirectiveMetadataOps[Self <: R3DirectiveMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: R3HostMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycle(value: AnonUsesOnChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[R3QueryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeArgumentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArgumentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeSourceSpan(value: ParseSourceSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeSourceSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsesInheritance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesInheritance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewQueries(value: js.Array[R3QueryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[R3DependencyMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(null)
        ret
    }
    @scala.inline
    def withExportAs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportAsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(null)
        ret
    }
    @scala.inline
    def withProviders(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvidersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(null)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(null)
        ret
    }
  }
  
}

