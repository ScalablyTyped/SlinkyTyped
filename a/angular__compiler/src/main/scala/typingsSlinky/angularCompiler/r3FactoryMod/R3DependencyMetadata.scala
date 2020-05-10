package typingsSlinky.angularCompiler.r3FactoryMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3DependencyMetadata extends js.Object {
  /**
    * Whether the dependency has an @Host qualifier.
    */
  var host: Boolean = js.native
  /**
    * Whether the dependency has an @Optional qualifier.
    */
  var optional: Boolean = js.native
  /**
    * An enum indicating whether this dependency has special meaning to Angular and needs to be
    * injected specially.
    */
  var resolved: R3ResolvedDependencyType = js.native
  /**
    * Whether the dependency has an @Self qualifier.
    */
  var self: Boolean = js.native
  /**
    * Whether the dependency has an @SkipSelf qualifier.
    */
  var skipSelf: Boolean = js.native
  /**
    * An expression representing the token or value to be injected.
    */
  var token: Expression = js.native
}

object R3DependencyMetadata {
  @scala.inline
  def apply(
    host: Boolean,
    optional: Boolean,
    resolved: R3ResolvedDependencyType,
    self: Boolean,
    skipSelf: Boolean,
    token: Expression
  ): R3DependencyMetadata = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DependencyMetadata]
  }
  @scala.inline
  implicit class R3DependencyMetadataOps[Self <: R3DependencyMetadata] (val x: Self) extends AnyVal {
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
    def withToken(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

