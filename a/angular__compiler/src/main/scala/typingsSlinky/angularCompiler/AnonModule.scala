package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModule extends js.Object {
  var module: CompileIdentifierMetadata = js.native
  var provider: CompileProviderMetadata = js.native
}

object AnonModule {
  @scala.inline
  def apply(module: CompileIdentifierMetadata, provider: CompileProviderMetadata): AnonModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModule]
  }
  @scala.inline
  implicit class AnonModuleOps[Self <: AnonModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModule(value: CompileIdentifierMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: CompileProviderMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

