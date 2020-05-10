package typingsSlinky.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileProviderMetadata extends js.Object {
  var deps: js.UndefOr[js.Array[CompileDiDependencyMetadata]] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var token: CompileTokenMetadata = js.native
  var useClass: js.UndefOr[CompileTypeMetadata] = js.native
  var useExisting: js.UndefOr[CompileTokenMetadata] = js.native
  var useFactory: js.UndefOr[CompileFactoryMetadata] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object CompileProviderMetadata {
  @scala.inline
  def apply(token: CompileTokenMetadata): CompileProviderMetadata = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileProviderMetadata]
  }
  @scala.inline
  implicit class CompileProviderMetadataOps[Self <: CompileProviderMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: CompileTokenMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[CompileDiDependencyMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withUseClass(value: CompileTypeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExisting(value: CompileTokenMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExisting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExisting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExisting")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFactory(value: CompileFactoryMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withUseValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useValue")(js.undefined)
        ret
    }
  }
  
}

