package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsertionIndex(value: Double): Self = this.set("insertionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertionIndex: Self = this.set("insertionIndex", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setPlaceholderIdMappingsVarargs(value: LayoutPlaceholderIdMapping*): Self = this.set("placeholderIdMappings", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = this.set("placeholderIdMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderIdMappings: Self = this.set("placeholderIdMappings", js.undefined)
    
    @scala.inline
    def setSlideLayoutReference(value: LayoutReference): Self = this.set("slideLayoutReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideLayoutReference: Self = this.set("slideLayoutReference", js.undefined)
  }
}
