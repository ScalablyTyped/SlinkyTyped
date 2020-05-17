package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.r3SymbolsMod.SchemaMetadata
import typingsSlinky.angularCore.r3SymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exports[T] extends js.Object {
  /** List of components to bootstrap. */
  var bootstrap: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** Unique ID for the module that is used with `getModuleFactory`. */
  var id: js.UndefOr[String | Null] = js.native
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.native
  /** Token representing the module. Used by DI. */
  var `type`: T = js.native
}

object Exports {
  @scala.inline
  def apply[T](`type`: T): Exports[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports[T]]
  }
  @scala.inline
  implicit class ExportsOps[Self[t] <: Exports[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withoutBootstrap: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(js.undefined)
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
    def withoutDeclarations: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(js.undefined)
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
    def withoutExports: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
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
    def withoutImports: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[SchemaMetadata]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemasNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(null)
        ret
    }
  }
  
}

