package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FactorySansProvider extends InjectableProvider {
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useFactory` function.
    */
  var deps: js.UndefOr[js.Array[_]] = js.native
  /**
    * A function to invoke to create a value for this `token`. The function is invoked with
    * resolved values of `token`s in the `deps` field.
    */
  var useFactory: js.Function = js.native
}

object FactorySansProvider {
  @scala.inline
  def apply(useFactory: js.Function): FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorySansProvider]
  }
  @scala.inline
  implicit class FactorySansProviderOps[Self <: FactorySansProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseFactory(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[_]): Self = {
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
  }
  
}

