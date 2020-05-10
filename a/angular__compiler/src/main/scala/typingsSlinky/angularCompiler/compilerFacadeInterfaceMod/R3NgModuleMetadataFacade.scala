package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import typingsSlinky.angularCompiler.AnonNameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3NgModuleMetadataFacade extends js.Object {
  var bootstrap: js.Array[js.Function] = js.native
  var declarations: js.Array[js.Function] = js.native
  var emitInline: Boolean = js.native
  var exports: js.Array[js.Function] = js.native
  var id: String | Null = js.native
  var imports: js.Array[js.Function] = js.native
  var schemas: js.Array[AnonNameString] | Null = js.native
  var `type`: js.Any = js.native
}

object R3NgModuleMetadataFacade {
  @scala.inline
  def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    emitInline: Boolean,
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], emitInline = emitInline.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
  @scala.inline
  implicit class R3NgModuleMetadataFacadeOps[Self <: R3NgModuleMetadataFacade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrap(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclarations(value: js.Array[js.Function]): Self = {
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
    def withExports(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withSchemas(value: js.Array[AnonNameString]): Self = {
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

