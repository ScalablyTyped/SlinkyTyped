package typingsSlinky.hoistNonReactStatics.mod

import typingsSlinky.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KNOWN_STATICS extends js.Object {
  var arguments: `true`
  var arity: `true`
  var callee: `true`
  var caller: `true`
  var length: `true`
  var name: `true`
}

object KNOWN_STATICS {
  @scala.inline
  def apply(arguments: `true`, arity: `true`, callee: `true`, caller: `true`, length: `true`, name: `true`): KNOWN_STATICS = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], arity = arity.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KNOWN_STATICS]
  }
  @scala.inline
  implicit class KNOWN_STATICSOps[Self <: KNOWN_STATICS] (val x: Self) extends AnyVal {
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
    def setArguments(value: `true`): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setArity(value: `true`): Self = this.set("arity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallee(value: `true`): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaller(value: `true`): Self = this.set("caller", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: `true`): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: `true`): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

