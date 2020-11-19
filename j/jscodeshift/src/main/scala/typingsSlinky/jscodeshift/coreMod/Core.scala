package typingsSlinky.jscodeshift.coreMod

import typingsSlinky.jscodeshift.templateMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Core extends js.Object {
  
  def apply(source: ASTNode | ASTPath[ASTNode]): typingsSlinky.jscodeshift.collectionMod.Collection[_] = js.native
  def apply(source: String): typingsSlinky.jscodeshift.collectionMod.Collection[_] = js.native
  def apply(source: String, options: Options): typingsSlinky.jscodeshift.collectionMod.Collection[_] = js.native
  def apply(source: js.Array[ASTNode | ASTPath[ASTNode]]): typingsSlinky.jscodeshift.collectionMod.Collection[_] = js.native
  
  var filters: Filters = js.native
  
  var mappings: Mappings = js.native
  
  def `match`(path: ASTNode | ASTPath[ASTNode], filter: js.Function1[/* path */ ASTNode, Boolean]): Boolean = js.native
  def `match`(path: ASTNode | ASTPath[ASTNode], filter: ASTNode): Boolean = js.native
  
  def registerMethods(methods: js.Object): Unit = js.native
  def registerMethods(
    methods: js.Object,
    `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
  ): Unit = js.native
  @JSName("registerMethods")
  var registerMethods_Original: js.Function2[
    /* methods */ js.Object, 
    /* type */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
    ], 
    Unit
  ] = js.native
  
  /** template, bound to default parser */
  var template: Template = js.native
  
  var types: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof recast.default.types */ js.Any = js.native
  
  /**
    * Utility function for registering plugins.
    *
    * Plugins are simple functions that are passed the core jscodeshift instance.
    * They should extend jscodeshift by calling `registerMethods`, etc.
    * This method guards against repeated registrations (the plugin callback will only be called once).
    */
  def use(plugin: Plugin): Unit = js.native
  
  /**
    * Returns a version of the core jscodeshift function "bound" to a specific
    * parser.
    */
  def withParser(parser: String): JSCodeshift = js.native
  def withParser(parser: Parser): JSCodeshift = js.native
}
