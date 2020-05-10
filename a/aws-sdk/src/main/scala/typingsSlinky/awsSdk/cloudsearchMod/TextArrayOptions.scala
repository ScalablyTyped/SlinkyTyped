package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArrayOptions extends js.Object {
  /**
    * The name of an analysis scheme for a text-array field.
    */
  var AnalysisScheme: js.UndefOr[Word] = js.native
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.native
  /**
    * Whether highlights can be returned for the field.
    */
  var HighlightEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.native
}

object TextArrayOptions {
  @scala.inline
  def apply(): TextArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextArrayOptions]
  }
  @scala.inline
  implicit class TextArrayOptionsOps[Self <: TextArrayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisScheme(value: Word): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalysisScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: FieldValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighlightEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighlightEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFields(value: FieldNameCommaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFields")(js.undefined)
        ret
    }
  }
  
}

