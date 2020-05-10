package typingsSlinky.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileDiDependencyMetadata extends js.Object {
  var isAttribute: js.UndefOr[Boolean] = js.native
  var isHost: js.UndefOr[Boolean] = js.native
  var isOptional: js.UndefOr[Boolean] = js.native
  var isSelf: js.UndefOr[Boolean] = js.native
  var isSkipSelf: js.UndefOr[Boolean] = js.native
  var isValue: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[CompileTokenMetadata] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object CompileDiDependencyMetadata {
  @scala.inline
  def apply(): CompileDiDependencyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileDiDependencyMetadata]
  }
  @scala.inline
  implicit class CompileDiDependencyMetadataOps[Self <: CompileDiDependencyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHost")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSkipSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkipSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSkipSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkipSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValue")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: CompileTokenMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

