package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSlideRequest extends js.Object {
  /**
    * The optional zero-based index indicating where to insert the slides.
    *
    * If you don't specify an index, the new slide is created at the end.
    */
  var insertionIndex: js.UndefOr[Double] = js.native
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * An optional list of object ID mappings from the placeholder(s) on the layout to the placeholder(s)
    * that will be created on the new slide from that specified layout. Can only
    * be used when `slide_layout_reference` is specified.
    */
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.native
  /**
    * Layout reference of the slide to be inserted, based on the &#42;current
    * master&#42;, which is one of the following:
    *
    * - The master of the previous slide index.
    * - The master of the first slide, if the insertion_index is zero.
    * - The first master in the presentation, if there are no slides.
    *
    * If the LayoutReference is not found in the current master, a 400 bad
    * request error is returned.
    *
    * If you don't specify a layout reference, then the new slide will use the
    * predefined layout `BLANK`.
    */
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.native
}

object CreateSlideRequest {
  @scala.inline
  def apply(): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlideRequest]
  }
  @scala.inline
  implicit class CreateSlideRequestOps[Self <: CreateSlideRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderIdMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderIdMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderIdMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideLayoutReference(value: LayoutReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideLayoutReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideLayoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideLayoutReference")(js.undefined)
        ret
    }
  }
  
}

