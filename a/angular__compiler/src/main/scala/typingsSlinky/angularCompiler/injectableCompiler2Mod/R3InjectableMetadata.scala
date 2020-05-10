package typingsSlinky.angularCompiler.injectableCompiler2Mod

import typingsSlinky.angularCompiler.angularCompilerStrings.invalid
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3FactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3InjectableMetadata extends js.Object {
  var ctorDeps: js.Array[R3DependencyMetadata] | invalid | Null = js.native
  var name: String = js.native
  var providedIn: Expression = js.native
  var `type`: Expression = js.native
  var typeArgumentCount: Double = js.native
  var useClass: js.UndefOr[Expression] = js.native
  var useExisting: js.UndefOr[Expression] = js.native
  var useFactory: js.UndefOr[Expression] = js.native
  var useValue: js.UndefOr[Expression] = js.native
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.native
}

object R3InjectableMetadata {
  @scala.inline
  def apply(name: String, providedIn: Expression, `type`: Expression, typeArgumentCount: Double): R3InjectableMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadata]
  }
  @scala.inline
  implicit class R3InjectableMetadataOps[Self <: R3InjectableMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvidedIn(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeArgumentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArgumentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtorDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctorDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtorDepsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctorDeps")(null)
        ret
    }
    @scala.inline
    def withUseClass(value: Expression): Self = {
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
    def withUseExisting(value: Expression): Self = {
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
    def withUseFactory(value: Expression): Self = {
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
    def withUseValue(value: Expression): Self = {
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
    @scala.inline
    def withUserDeps(value: js.Array[R3DependencyMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDeps")(js.undefined)
        ret
    }
  }
  
}

