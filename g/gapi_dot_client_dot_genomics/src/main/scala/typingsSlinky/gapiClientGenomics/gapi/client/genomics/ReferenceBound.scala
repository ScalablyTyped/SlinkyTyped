package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceBound extends js.Object {
  /** The name of the reference associated with this reference bound. */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * An upper bound (inclusive) on the starting coordinate of any
    * variant in the reference sequence.
    */
  var upperBound: js.UndefOr[String] = js.native
}

object ReferenceBound {
  @scala.inline
  def apply(): ReferenceBound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceBound]
  }
  @scala.inline
  implicit class ReferenceBoundOps[Self <: ReferenceBound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(js.undefined)
        ret
    }
  }
  
}

