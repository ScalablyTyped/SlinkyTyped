package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.UsesOnChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3DirectiveMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  var exportAs: js.Array[String] | Null = js.native
  var host: StringDictionary[String] = js.native
  var inputs: js.Array[String] = js.native
  var lifecycle: UsesOnChanges = js.native
  var name: String = js.native
  var outputs: js.Array[String] = js.native
  var propMetadata: StringDictionary[js.Array[_]] = js.native
  var providers: js.Array[Provider] | Null = js.native
  var queries: js.Array[R3QueryMetadataFacade] = js.native
  var selector: String | Null = js.native
  var `type`: js.Any = js.native
  var typeArgumentCount: Double = js.native
  var typeSourceSpan: ParseSourceSpan = js.native
  var usesInheritance: Boolean = js.native
  var viewQueries: js.Array[R3QueryMetadataFacade] = js.native
}

object R3DirectiveMetadataFacade {
  @scala.inline
  def apply(
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3DirectiveMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadataFacade]
  }
  @scala.inline
  implicit class R3DirectiveMetadataFacadeOps[Self <: R3DirectiveMetadataFacade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycle(value: UsesOnChanges): Self = {
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
    def withOutputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropMetadata(value: StringDictionary[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[R3QueryMetadataFacade]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
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
    def withViewQueries(value: js.Array[R3QueryMetadataFacade]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[R3DependencyMetadataFacade]): Self = {
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
    def withProviders(value: js.Array[Provider]): Self = {
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

