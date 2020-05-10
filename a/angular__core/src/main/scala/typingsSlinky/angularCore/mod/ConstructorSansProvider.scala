package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorSansProvider extends InjectableProvider {
  /**
    * A list of `token`s to be resolved by the injector.
    */
  var deps: js.UndefOr[js.Array[_]] = js.native
}

object ConstructorSansProvider {
  @scala.inline
  def apply(): ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorSansProvider]
  }
  @scala.inline
  implicit class ConstructorSansProviderOps[Self <: ConstructorSansProvider] (val x: Self) extends AnyVal {
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
    def withoutDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(js.undefined)
        ret
    }
  }
  
}

