package typingsSlinky.angularCompiler.r3ModuleCompilerMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3FactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadata extends js.Object {
  var deps: js.Array[R3DependencyMetadata] | Null
  var imports: js.Array[Expression]
  var name: String
  var providers: Expression | Null
  var `type`: Expression
}

object R3InjectorMetadata {
  @scala.inline
  def apply(imports: js.Array[Expression], name: String, `type`: Expression): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadata]
  }
  @scala.inline
  implicit class R3InjectorMetadataOps[Self <: R3InjectorMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportsVarargs(value: Expression*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[Expression]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Expression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadata*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadata]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
    @scala.inline
    def setProviders(value: Expression): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersNull: Self = this.set("providers", null)
  }
  
}

