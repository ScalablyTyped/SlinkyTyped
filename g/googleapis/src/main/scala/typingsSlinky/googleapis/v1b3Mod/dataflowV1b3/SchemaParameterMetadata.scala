package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a specific parameter.
  */
@js.native
trait SchemaParameterMetadata extends js.Object {
  /**
    * Required. The help text to display for the parameter.
    */
  var helpText: js.UndefOr[String] = js.native
  /**
    * Optional. Whether the parameter is optional. Defaults to false.
    */
  var isOptional: js.UndefOr[Boolean] = js.native
  /**
    * Required. The label to display for the parameter.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Required. The name of the parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Regexes that the parameter must match.
    */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaParameterMetadata {
  @scala.inline
  def apply(): SchemaParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterMetadata]
  }
  @scala.inline
  implicit class SchemaParameterMetadataOps[Self <: SchemaParameterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
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
    def withRegexes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexes")(js.undefined)
        ret
    }
  }
  
}

