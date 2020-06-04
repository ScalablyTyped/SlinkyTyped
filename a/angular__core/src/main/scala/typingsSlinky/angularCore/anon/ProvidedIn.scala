package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvidedIn extends js.Object {
  var providedIn: Type[_] | root | Null
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvidedIn(value: Type[_] | root): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidedInNull: Self = this.set("providedIn", null)
  }
  
}

