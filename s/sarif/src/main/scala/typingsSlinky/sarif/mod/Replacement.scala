package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replacement extends js.Object {
  /**
    * The region of the artifact to delete.
    */
  var deletedRegion: Region = js.native
  /**
    * The content to insert at the location specified by the 'deletedRegion' property.
    */
  var insertedContent: js.UndefOr[ArtifactContent] = js.native
  /**
    * Key/value pairs that provide additional information about the replacement.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object Replacement {
  @scala.inline
  def apply(deletedRegion: Region): Replacement = {
    val __obj = js.Dynamic.literal(deletedRegion = deletedRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  @scala.inline
  implicit class ReplacementOps[Self <: Replacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertedContent(value: ArtifactContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

