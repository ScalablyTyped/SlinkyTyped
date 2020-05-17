package typingsSlinky.angularCompiler.apiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.ExpressionSelector
import typingsSlinky.angularCompiler.anon.Nodes
import typingsSlinky.angularCompiler.anon.UsesOnChanges
import typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy
import typingsSlinky.angularCompiler.coreMod.ViewEncapsulation
import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3ComponentMetadata extends R3DirectiveMetadata {
  /**
    * A collection of animation triggers that will be used in the component template.
    */
  var animations: Expression | Null = js.native
  /**
    * Strategy used for detecting changes in the component.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  /**
    * A list of directive selectors and an expression referencing the directive type which are in the
    * scope of the compilation.
    */
  var directives: js.Array[ExpressionSelector] = js.native
  /**
    * An encapsulation policy for the template and CSS styles. One of:
    * - `ViewEncapsulation.Native`: Use shadow roots. This works only if natively available on the
    *   platform (note that this is marked the as the "deprecated shadow DOM" as of Angular v6.1.
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use the latest ShadowDOM API to natively encapsulate styles
    * into a shadow root.
    */
  var encapsulation: ViewEncapsulation = js.native
  /**
    * Whether translation variable name should contain external message id
    * (used by Closure Compiler's output of `goog.getMsg` for transition period).
    */
  var i18nUseExternalIds: Boolean = js.native
  /**
    * Overrides the default interpolation start and end delimiters ({{ and }}).
    */
  var interpolation: InterpolationConfig = js.native
  /**
    * A map of pipe names to an expression referencing the pipe type which are in the scope of the
    * compilation.
    */
  var pipes: Map[String, Expression] = js.native
  /**
    * Path to the .ts file in which this template's generated code will be included, relative to
    * the compilation root. This will be used to generate identifiers that need to be globally
    * unique in certain contexts (such as g3).
    */
  var relativeContextFilePath: String = js.native
  /**
    * A collection of styling data that will be applied and scoped to the component.
    */
  var styles: js.Array[String] = js.native
  /**
    * Information about the component's template.
    */
  var template: Nodes = js.native
  /**
    * The list of view providers defined in the component.
    */
  var viewProviders: Expression | Null = js.native
  /**
    * Whether to wrap the 'directives' and/or `pipes` array, if one is generated, in a closure.
    *
    * This is done when the directives or pipes contain forward references.
    */
  var wrapDirectivesAndPipesInClosure: Boolean = js.native
}

object R3ComponentMetadata {
  @scala.inline
  def apply(
    directives: js.Array[ExpressionSelector],
    encapsulation: ViewEncapsulation,
    host: R3HostMetadata,
    i18nUseExternalIds: Boolean,
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    interpolation: InterpolationConfig,
    lifecycle: UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    pipes: Map[String, Expression],
    queries: js.Array[R3QueryMetadata],
    relativeContextFilePath: String,
    styles: js.Array[String],
    template: Nodes,
    `type`: Expression,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata],
    wrapDirectivesAndPipesInClosure: Boolean
  ): R3ComponentMetadata = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], i18nUseExternalIds = i18nUseExternalIds.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], relativeContextFilePath = relativeContextFilePath.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], wrapDirectivesAndPipesInClosure = wrapDirectivesAndPipesInClosure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentMetadata]
  }
  @scala.inline
  implicit class R3ComponentMetadataOps[Self <: R3ComponentMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: js.Array[ExpressionSelector]): Self = {
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
    def withI18nUseExternalIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nUseExternalIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolation(value: InterpolationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipes(value: Map[String, Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeContextFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeContextFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: Nodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapDirectivesAndPipesInClosure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapDirectivesAndPipesInClosure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimations(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(null)
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
    def withViewProviders(value: Expression): Self = {
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

