package typingsSlinky.objectInspect.mod

import typingsSlinky.objectInspect.objectInspectStrings.double
import typingsSlinky.objectInspect.objectInspectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inspection options
  */
@js.native
trait Options extends js.Object {
  /**
    * Maximum depth of the inspection. Default: `5`.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * Must be "single" or "double", if present.
    */
  var quoteStyle: js.UndefOr[single | double] = js.native
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
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteStyle(value: single | double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteStyle")(js.undefined)
        ret
    }
  }
  
}

