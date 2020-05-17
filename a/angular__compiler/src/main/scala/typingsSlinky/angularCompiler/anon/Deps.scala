package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deps extends js.Object {
  var deps: js.UndefOr[js.Array[js.Object] | Null] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var useClass: js.UndefOr[typingsSlinky.angularCompiler.coreMod.Type] = js.native
  var useExisting: js.UndefOr[js.Any] = js.native
  var useFactory: js.UndefOr[js.Function | Null] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object Deps {
  @scala.inline
  def apply(): Deps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deps]
  }
  @scala.inline
  implicit class DepsOps[Self <: Deps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeps(value: js.Array[js.Object]): Self = {
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
    def withDepsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(null)
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
    def withUseClass(value: typingsSlinky.angularCompiler.coreMod.Type): Self = {
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
    def withUseExisting(value: js.Any): Self = {
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
    def withUseFactory(value: js.Function): Self = {
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
    def withUseFactoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFactory")(null)
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

