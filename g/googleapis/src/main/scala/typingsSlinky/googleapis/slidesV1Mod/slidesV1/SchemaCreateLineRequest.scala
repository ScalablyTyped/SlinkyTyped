package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a line.
  */
@js.native
trait SchemaCreateLineRequest extends js.Object {
  /**
    * The category of the line to be created.  The exact line type created is
    * determined based on the category and how it&#39;s routed to connect to
    * other page elements.  If you specify both a `category` and a
    * `line_category`, the `category` takes precedence.  If you do not specify
    * a value for `category`, but specify a value for `line_category`, then the
    * specified `line_category` value is used.  If you do not specify either,
    * then STRAIGHT is used.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The element properties for the line.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  /**
    * The category of the line to be created.  &lt;b&gt;Deprecated&lt;/b&gt;:
    * use `category` instead.  The exact line type created is determined based
    * on the category and how it&#39;s routed to connect to other page
    * elements.  If you specify both a `category` and a `line_category`, the
    * `category` takes precedence.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateLineRequest {
  @scala.inline
  def apply(): SchemaCreateLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateLineRequest]
  }
  @scala.inline
  implicit class SchemaCreateLineRequestOps[Self <: SchemaCreateLineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withElementProperties(value: SchemaPageElementProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(js.undefined)
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
  }
  
}

