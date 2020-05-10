package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification determining how headers are added to requests or responses.
  */
@js.native
trait SchemaHttpHeaderOption extends js.Object {
  /**
    * The name of the header.
    */
  var headerName: js.UndefOr[String] = js.native
  /**
    * The value of the header to add.
    */
  var headerValue: js.UndefOr[String] = js.native
  /**
    * If false, headerValue is appended to any values that already exist for
    * the header. If true, headerValue is set for the header, discarding any
    * values that were set for that header. The default value is false.
    */
  var replace: js.UndefOr[Boolean] = js.native
}

object SchemaHttpHeaderOption {
  @scala.inline
  def apply(): SchemaHttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderOption]
  }
  @scala.inline
  implicit class SchemaHttpHeaderOptionOps[Self <: SchemaHttpHeaderOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
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

