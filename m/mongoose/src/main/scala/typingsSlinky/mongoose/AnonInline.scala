package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInline extends js.Object {
  /** the results are returned in an array */
  var `inline`: js.UndefOr[Double] = js.native
  /**
    * {merge: 'collectionName'} add the results to collectionName: if
    * dups exist the new docs overwrite the old
    */
  var merge: js.UndefOr[String] = js.native
  /**
    * {reduce: 'collectionName'} add the results to collectionName: if
    * dups are detected, uses the reducer / finalize functions
    */
  var reduce: js.UndefOr[String] = js.native
  /**
    * {replace: 'collectionName'} add the results to collectionName: the
    * results replace the collection
    */
  var replace: js.UndefOr[String] = js.native
}

object AnonInline {
  @scala.inline
  def apply(): AnonInline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInline]
  }
  @scala.inline
  implicit class AnonInlineOps[Self <: AnonInline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.undefined)
        ret
    }
    @scala.inline
    def withReduce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
  }
  
}

