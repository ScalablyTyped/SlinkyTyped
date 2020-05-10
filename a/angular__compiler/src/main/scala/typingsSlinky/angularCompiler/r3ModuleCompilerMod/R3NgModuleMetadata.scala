package typingsSlinky.angularCompiler.r3ModuleCompilerMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3NgModuleMetadata extends js.Object {
  /**
    * An array of expressions representing the bootstrap components specified by the module.
    */
  var bootstrap: js.Array[R3Reference] = js.native
  /**
    * Whether to generate closure wrappers for bootstrap, declarations, imports, and exports.
    */
  var containsForwardDecls: Boolean = js.native
  /**
    * An array of expressions representing the directives and pipes declared by the module.
    */
  var declarations: js.Array[R3Reference] = js.native
  /**
    * Whether to emit the selector scope values (declarations, imports, exports) inline into the
    * module definition, or to generate additional statements which patch them on. Inline emission
    * does not allow components to be tree-shaken, but is useful for JIT mode.
    */
  var emitInline: Boolean = js.native
  /**
    * An array of expressions representing the exports of the module.
    */
  var exports: js.Array[R3Reference] = js.native
  /** Unique ID or expression representing the unique ID of an NgModule. */
  var id: Expression | Null = js.native
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.Array[R3Reference] = js.native
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    */
  var schemas: js.Array[R3Reference] | Null = js.native
  /**
    * An expression representing the module type being compiled.
    */
  var `type`: Expression = js.native
}

object R3NgModuleMetadata {
  @scala.inline
  def apply(
    bootstrap: js.Array[R3Reference],
    containsForwardDecls: Boolean,
    declarations: js.Array[R3Reference],
    emitInline: Boolean,
    exports: js.Array[R3Reference],
    imports: js.Array[R3Reference],
    `type`: Expression
  ): R3NgModuleMetadata = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], containsForwardDecls = containsForwardDecls.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], emitInline = emitInline.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadata]
  }
  @scala.inline
  implicit class R3NgModuleMetadataOps[Self <: R3NgModuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrap(value: js.Array[R3Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainsForwardDecls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsForwardDecls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarations(value: js.Array[R3Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExports(value: js.Array[R3Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[R3Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[R3Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(null)
        ret
    }
  }
  
}

