package typingsSlinky.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleFactory extends js.Object {
  var factoryMap: js.Object = js.native
  var moduleMap: js.Object = js.native
  def define(id: String, factory: js.Object): Unit = js.native
  def require(id: String): js.Any = js.native
}

object ModuleFactory {
  @scala.inline
  def apply(
    define: (String, js.Object) => Unit,
    factoryMap: js.Object,
    moduleMap: js.Object,
    require: String => js.Any
  ): ModuleFactory = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction2(define), factoryMap = factoryMap.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], require = js.Any.fromFunction1(require))
    __obj.asInstanceOf[ModuleFactory]
  }
  @scala.inline
  implicit class ModuleFactoryOps[Self <: ModuleFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefine(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFactoryMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequire(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

