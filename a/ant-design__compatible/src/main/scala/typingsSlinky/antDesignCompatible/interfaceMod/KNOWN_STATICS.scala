package typingsSlinky.antDesignCompatible.interfaceMod

import typingsSlinky.antDesignCompatible.antDesignCompatibleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KNOWN_STATICS extends js.Object {
  var arguments: `true` = js.native
  var arity: `true` = js.native
  var callee: `true` = js.native
  var caller: `true` = js.native
  var length: `true` = js.native
  var name: `true` = js.native
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
    def withArguments(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArity(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallee(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaller(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

