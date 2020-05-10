package typingsSlinky.allKeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Include `Object.prototype` properties like `isPrototypeOf`.
  		@default true
  		*/
  val includeObjectPrototype: js.UndefOr[Boolean] = js.native
  /**
  		Include [`Symbol`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) keys.
  		@default true
  		*/
  val includeSymbols: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeObjectPrototype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeObjectPrototype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeObjectPrototype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeObjectPrototype")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSymbols")(js.undefined)
        ret
    }
  }
  
}

