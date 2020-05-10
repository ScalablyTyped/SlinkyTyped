package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3DependencyMetadataFacade extends js.Object {
  var host: Boolean = js.native
  var optional: Boolean = js.native
  var resolved: R3ResolvedDependencyType = js.native
  var self: Boolean = js.native
  var skipSelf: Boolean = js.native
  var token: js.Any = js.native
}

object R3DependencyMetadataFacade {
  @scala.inline
  def apply(
    host: Boolean,
    optional: Boolean,
    resolved: R3ResolvedDependencyType,
    self: Boolean,
    skipSelf: Boolean,
    token: js.Any
  ): R3DependencyMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DependencyMetadataFacade]
  }
  @scala.inline
  implicit class R3DependencyMetadataFacadeOps[Self <: R3DependencyMetadataFacade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: R3ResolvedDependencyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

