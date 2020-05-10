package typingsSlinky.diff.mod

import typingsSlinky.diff.diffStrings.Space
import typingsSlinky.diff.diffStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPatchOptions extends js.Object {
  /**
    * Callback used to compare to given lines to determine if they should be considered equal when patching.
    * Should return `false` if the lines should be rejected.
    *
    * @default strict equality
    */
  var compareLine: js.UndefOr[
    js.Function4[
      /* lineNumber */ Double, 
      /* line */ String, 
      /* operation */ `-_` | Space, 
      /* patchContent */ String, 
      Boolean
    ]
  ] = js.native
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[Double] = js.native
}

object ApplyPatchOptions {
  @scala.inline
  def apply(): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPatchOptions]
  }
  @scala.inline
  implicit class ApplyPatchOptionsOps[Self <: ApplyPatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompareLine(
      value: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareLine")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCompareLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareLine")(js.undefined)
        ret
    }
    @scala.inline
    def withFuzzFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuzzFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzFactor")(js.undefined)
        ret
    }
  }
  
}

