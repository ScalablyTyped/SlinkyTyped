package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectableMetadataFacade extends js.Object {
  var ctorDeps: js.Array[R3DependencyMetadataFacade] | Null
  var name: String
  var providedIn: js.Any
  var `type`: js.Any
  var typeArgumentCount: Double
  var useClass: js.UndefOr[js.Any] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Any] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadataFacade]] = js.undefined
}

object R3InjectableMetadataFacade {
  @scala.inline
  def apply(name: String, providedIn: js.Any, `type`: js.Any, typeArgumentCount: Double): R3InjectableMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadataFacade]
  }
  @scala.inline
  implicit class R3InjectableMetadataFacadeOps[Self <: R3InjectableMetadataFacade] (val x: Self) extends AnyVal {
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
    def setProvidedIn(value: js.Any): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtorDeps(value: js.Array[R3DependencyMetadataFacade]): Self = this.set("ctorDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtorDepsNull: Self = this.set("ctorDeps", null)
    @scala.inline
    def setUseClass(value: js.Any): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: js.Any): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: js.Any): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: js.Any): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
    @scala.inline
    def setUserDeps(value: js.Array[R3DependencyMetadataFacade]): Self = this.set("userDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDeps: Self = this.set("userDeps", js.undefined)
  }
  
}

