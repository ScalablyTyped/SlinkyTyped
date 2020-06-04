package typingsSlinky.angularCompiler.injectableCompiler2Mod

import typingsSlinky.angularCompiler.angularCompilerStrings.invalid
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3FactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadata extends js.Object {
  var ctorDeps: js.Array[R3DependencyMetadata] | invalid | Null
  var name: String
  var providedIn: Expression
  var `type`: Expression
  var typeArgumentCount: Double
  var useClass: js.UndefOr[Expression] = js.undefined
  var useExisting: js.UndefOr[Expression] = js.undefined
  var useFactory: js.UndefOr[Expression] = js.undefined
  var useValue: js.UndefOr[Expression] = js.undefined
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidedIn(value: Expression): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Expression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtorDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = this.set("ctorDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtorDepsNull: Self = this.set("ctorDeps", null)
    @scala.inline
    def setUseClass(value: Expression): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: Expression): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: Expression): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: Expression): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
    @scala.inline
    def setUserDeps(value: js.Array[R3DependencyMetadata]): Self = this.set("userDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDeps: Self = this.set("userDeps", js.undefined)
  }
  
}

