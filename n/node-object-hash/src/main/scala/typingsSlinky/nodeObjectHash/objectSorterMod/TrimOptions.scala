package typingsSlinky.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advanced trim options
  */
@js.native
trait TrimOptions extends js.Object {
  /**
    * If `true` replaces multiple space with one and trims whitespaces in function body
    */
  var function: js.UndefOr[Boolean] = js.native
  /**
    * If `true` replaces multiple space with one and trims whitespaces in strings
    */
  var string: js.UndefOr[Boolean] = js.native
}

object TrimOptions {
  @scala.inline
  def apply(): TrimOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimOptions]
  }
  @scala.inline
  implicit class TrimOptionsOps[Self <: TrimOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

