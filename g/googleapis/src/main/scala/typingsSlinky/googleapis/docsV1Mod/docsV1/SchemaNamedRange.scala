package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of Ranges with the same named range ID.  Named ranges allow
  * developers to associate parts of a document with an arbitrary user-defined
  * label so their contents can be programmatically read or edited at a later
  * time. A document can contain multiple named ranges with the same name, but
  * every named range has a unique ID.  A named range is created with a single
  * Range, and content inserted inside a named range generally expands that
  * range. However, certain document changes can cause the range to be split
  * into multiple ranges.  Named ranges are not private. All applications and
  * collaborators that have access to the document can see its named ranges.
  */
@js.native
trait SchemaNamedRange extends js.Object {
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The ranges that belong to this named range.
    */
  var ranges: js.UndefOr[js.Array[SchemaRange]] = js.native
}

object SchemaNamedRange {
  @scala.inline
  def apply(): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRange]
  }
  @scala.inline
  implicit class SchemaNamedRangeOps[Self <: SchemaNamedRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedRangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[SchemaRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
  }
  
}

