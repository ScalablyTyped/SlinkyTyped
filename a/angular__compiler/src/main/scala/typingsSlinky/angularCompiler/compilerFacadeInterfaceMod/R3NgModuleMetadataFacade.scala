package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import typingsSlinky.angularCompiler.anon.NameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleMetadataFacade extends js.Object {
  var bootstrap: js.Array[js.Function]
  var declarations: js.Array[js.Function]
  var emitInline: Boolean
  var exports: js.Array[js.Function]
  var id: String | Null
  var imports: js.Array[js.Function]
  var schemas: js.Array[NameString] | Null
  var `type`: js.Any
}

object R3NgModuleMetadataFacade {
  @scala.inline
  def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    emitInline: Boolean,
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any,
    id: String = null,
    schemas: js.Array[NameString] = null
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], emitInline = emitInline.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
}

