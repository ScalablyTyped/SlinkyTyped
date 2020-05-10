package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of raw indices to remove from a local list.
  */
@js.native
trait SchemaRawIndices extends js.Object {
  /**
    * The indices to remove from a lexicographically-sorted local list.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaRawIndices {
  @scala.inline
  def apply(): SchemaRawIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRawIndices]
  }
  @scala.inline
  implicit class SchemaRawIndicesOps[Self <: SchemaRawIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
  }
  
}

