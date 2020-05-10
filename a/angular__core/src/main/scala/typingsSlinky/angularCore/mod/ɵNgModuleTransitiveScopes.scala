package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.AnonDirectives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵNgModuleTransitiveScopes extends js.Object {
  var compilation: AnonDirectives = js.native
  var exported: AnonDirectives = js.native
  var schemas: js.Array[SchemaMetadata] | Null = js.native
}

object ɵNgModuleTransitiveScopes {
  @scala.inline
  def apply(compilation: AnonDirectives, exported: AnonDirectives): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
  @scala.inline
  implicit class ɵNgModuleTransitiveScopesOps[Self <: ɵNgModuleTransitiveScopes] (val x: Self) extends AnyVal {
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

