package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticClassSansProvider extends InjectableProvider {
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[_] = js.native
  /**
    * An optional class to instantiate for the `token`. By default, the `provide`
    * class is instantiated.
    */
  var useClass: Type[_] = js.native
}

object StaticClassSansProvider {
  @scala.inline
  def apply(deps: js.Array[_], useClass: Type[_]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassSansProvider]
  }
  @scala.inline
  implicit class StaticClassSansProviderOps[Self <: StaticClassSansProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeps(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseClass(value: Type[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

