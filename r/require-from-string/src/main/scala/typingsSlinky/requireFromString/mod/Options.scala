package typingsSlinky.requireFromString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * List of `paths`, that will be appended to module `paths`.
    * Useful when you want to be able require modules from these paths.
    */
  var appendPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of `paths`, that will be preppended to module `paths`.
    * Useful when you want to be able require modules from these paths.
    */
  var prependPaths: js.UndefOr[js.Array[String]] = js.native
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
    def withAppendPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrependPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependPaths")(js.undefined)
        ret
    }
  }
  
}

