package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵNgModuleDef[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  /** Unique ID for the module with which it should be registered.  */
  var id: String | Null = js.native
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.Array[SchemaMetadata] | Null = js.native
  /**
    * Cached value of computed `transitiveCompileScopes` for this module.
    *
    * This should never be read directly, but accessed via `transitiveScopesFor`.
    */
  var transitiveCompileScopes: ɵNgModuleTransitiveScopes | Null = js.native
  /** Token representing the module. Used by DI. */
  var `type`: T = js.native
}

object ɵNgModuleDef {
  @scala.inline
  def apply[T](
    bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    `type`: T
  ): ɵNgModuleDef[T] = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleDef[T]]
  }
  @scala.inline
  implicit class ɵNgModuleDefOps[Self[t] <: ɵNgModuleDef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBootstrapFunction0(value: () => js.Array[Type[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBootstrap(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarationsFunction0(value: () => js.Array[Type[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeclarations(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportsFunction0(value: () => js.Array[Type[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportsFunction0(value: () => js.Array[Type[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[SchemaMetadata]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemasNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(null)
        ret
    }
    @scala.inline
    def withTransitiveCompileScopes(value: ɵNgModuleTransitiveScopes): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveCompileScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitiveCompileScopesNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveCompileScopes")(null)
        ret
    }
  }
  
}

