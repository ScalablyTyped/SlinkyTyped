package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvidedIn extends js.Object {
  var providedIn: Type[_] | root | Null = js.native
}

object ProvidedIn {
  @scala.inline
  def apply(): ProvidedIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvidedIn]
  }
  @scala.inline
  implicit class ProvidedInOps[Self <: ProvidedIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvidedIn(value: Type[_] | root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvidedInNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedIn")(null)
        ret
    }
  }
  
}

