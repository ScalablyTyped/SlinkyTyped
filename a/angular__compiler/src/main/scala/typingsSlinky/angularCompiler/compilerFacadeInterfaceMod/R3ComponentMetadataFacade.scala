package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.Selector
import typingsSlinky.angularCompiler.anon.UsesOnChanges
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3ComponentMetadataFacade extends R3DirectiveMetadataFacade {
  var animations: js.UndefOr[js.Array[_]] = js.native
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  var directives: js.Array[Selector] = js.native
  var encapsulation: ViewEncapsulation = js.native
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.native
  var pipes: Map[String, _] = js.native
  var preserveWhitespaces: Boolean = js.native
  var styles: js.Array[String] = js.native
  var template: String = js.native
  var viewProviders: js.Array[Provider] | Null = js.native
}

object R3ComponentMetadataFacade {
  @scala.inline
  def apply(
    directives: js.Array[Selector],
    encapsulation: ViewEncapsulation,
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    pipes: Map[String, _],
    preserveWhitespaces: Boolean,
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    styles: js.Array[String],
    template: String,
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3ComponentMetadataFacade = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadataFacade]
  }
  @scala.inline
  implicit class R3ComponentMetadataFacadeOps[Self <: R3ComponentMetadataFacade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: js.Array[Selector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncapsulation(value: ViewEncapsulation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encapsulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipes(value: Map[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeDetection(value: ChangeDetectionStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withViewProviders(value: js.Array[Provider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewProvidersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewProviders")(null)
        ret
    }
  }
  
}

