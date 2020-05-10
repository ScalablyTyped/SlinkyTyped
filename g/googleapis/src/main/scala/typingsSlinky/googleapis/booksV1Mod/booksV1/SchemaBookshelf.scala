package typingsSlinky.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBookshelf extends js.Object {
  /**
    * Whether this bookshelf is PUBLIC or PRIVATE.
    */
  var access: js.UndefOr[String] = js.native
  /**
    * Created time for this bookshelf (formatted UTC timestamp with millisecond
    * resolution).
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Description of this bookshelf.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Id of this bookshelf, only unique by user.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Resource type for bookshelf metadata.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Title of this bookshelf.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Last modified time of this bookshelf (formatted UTC timestamp with
    * millisecond resolution).
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Number of volumes in this bookshelf.
    */
  var volumeCount: js.UndefOr[Double] = js.native
  /**
    * Last time a volume was added or removed from this bookshelf (formatted
    * UTC timestamp with millisecond resolution).
    */
  var volumesLastUpdated: js.UndefOr[String] = js.native
}

object SchemaBookshelf {
  @scala.inline
  def apply(): SchemaBookshelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBookshelf]
  }
  @scala.inline
  implicit class SchemaBookshelfOps[Self <: SchemaBookshelf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumesLastUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesLastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesLastUpdated")(js.undefined)
        ret
    }
  }
  
}

