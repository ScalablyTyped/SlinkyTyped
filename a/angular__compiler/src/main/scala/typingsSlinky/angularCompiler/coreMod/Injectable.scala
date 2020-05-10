package typingsSlinky.angularCompiler.coreMod

import typingsSlinky.angularCompiler.angularCompilerStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Injectable extends js.Object {
  var deps: js.UndefOr[js.Array[Type | js.Array[_]]] = js.native
  var providedIn: js.UndefOr[Type | root | js.Any] = js.native
  var useClass: js.UndefOr[Type | js.Any] = js.native
  var useExisting: js.UndefOr[Type | js.Any] = js.native
  var useFactory: js.UndefOr[Type | js.Any] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object Injectable {
  @scala.inline
  def apply(): Injectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Injectable]
  }
  @scala.inline
  implicit class InjectableOps[Self <: Injectable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeps(value: js.Array[Type | js.Array[_]]): Self = {
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
    def withProvidedIn(value: Type | root | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withUseClass(value: Type | js.Any): Self = {
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
    def withUseExisting(value: Type | js.Any): Self = {
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
    def withUseFactory(value: Type | js.Any): Self = {
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

