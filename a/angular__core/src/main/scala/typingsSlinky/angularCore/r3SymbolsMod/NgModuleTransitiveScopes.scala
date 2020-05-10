package typingsSlinky.angularCore.r3SymbolsMod

import typingsSlinky.angularCore.AnonDirectives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the expansion of an `NgModule` into its scopes.
  *
  * A scope is a set of directives and pipes that are visible in a particular context. Each
  * `NgModule` has two scopes. The `compilation` scope is the set of directives and pipes that will
  * be recognized in the templates of components declared by the module. The `exported` scope is the
  * set of directives and pipes exported by a module (that is, module B's exported scope gets added
  * to module A's compilation scope when module A imports B).
  */
@js.native
trait NgModuleTransitiveScopes extends js.Object {
  var compilation: AnonDirectives = js.native
  var exported: AnonDirectives = js.native
  var schemas: js.Array[SchemaMetadata] | Null = js.native
}

object NgModuleTransitiveScopes {
  @scala.inline
  def apply(compilation: AnonDirectives, exported: AnonDirectives): NgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleTransitiveScopes]
  }
  @scala.inline
  implicit class NgModuleTransitiveScopesOps[Self <: NgModuleTransitiveScopes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilation(value: AnonDirectives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExported(value: AnonDirectives): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[SchemaMetadata]): Self = {
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

