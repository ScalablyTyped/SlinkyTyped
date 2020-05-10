package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WarningOptions extends ResultOptions {
  /**
    * The index inside a node's string that should be highlighted as
    * source of warning.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * A word inside a node's string that should be highlighted as source
    * of warning.
    */
  var word: js.UndefOr[String] = js.native
}

object WarningOptions {
  @scala.inline
  def apply(): WarningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningOptions]
  }
  @scala.inline
  implicit class WarningOptionsOps[Self <: WarningOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(js.undefined)
        ret
    }
  }
  
}

