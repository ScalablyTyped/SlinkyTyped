package typingsSlinky.angularCompiler.jitCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleWithComponentFactories extends js.Object {
  var componentFactories: js.Array[js.Object] = js.native
  var ngModuleFactory: js.Object = js.native
}

object ModuleWithComponentFactories {
  @scala.inline
  def apply(componentFactories: js.Array[js.Object], ngModuleFactory: js.Object): ModuleWithComponentFactories = {
    val __obj = js.Dynamic.literal(componentFactories = componentFactories.asInstanceOf[js.Any], ngModuleFactory = ngModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithComponentFactories]
  }
  @scala.inline
  implicit class ModuleWithComponentFactoriesOps[Self <: ModuleWithComponentFactories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentFactories(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentFactories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModuleFactory(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

