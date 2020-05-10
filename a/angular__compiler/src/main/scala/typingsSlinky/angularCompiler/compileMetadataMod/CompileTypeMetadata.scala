package typingsSlinky.angularCompiler.compileMetadataMod

import typingsSlinky.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileTypeMetadata extends CompileIdentifierMetadata {
  var diDeps: js.Array[CompileDiDependencyMetadata] = js.native
  var lifecycleHooks: js.Array[LifecycleHooks] = js.native
}

object CompileTypeMetadata {
  @scala.inline
  def apply(
    diDeps: js.Array[CompileDiDependencyMetadata],
    lifecycleHooks: js.Array[LifecycleHooks],
    reference: js.Any
  ): CompileTypeMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps.asInstanceOf[js.Any], lifecycleHooks = lifecycleHooks.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeMetadata]
  }
  @scala.inline
  implicit class CompileTypeMetadataOps[Self <: CompileTypeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiDeps(value: js.Array[CompileDiDependencyMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecycleHooks(value: js.Array[LifecycleHooks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleHooks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

