package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for the parser. It determines how the server parses the
  * messages.
  */
@js.native
trait SchemaParserConfig extends js.Object {
  /**
    * Determines whether messages with no header are allowed.
    */
  var allowNullHeader: js.UndefOr[Boolean] = js.native
  /**
    * Byte(s) to be used as the segment terminator. If this is unset,
    * &#39;\r&#39; will be used as segment terminator.
    */
  var segmentTerminator: js.UndefOr[String] = js.native
}

object SchemaParserConfig {
  @scala.inline
  def apply(): SchemaParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParserConfig]
  }
  @scala.inline
  implicit class SchemaParserConfigOps[Self <: SchemaParserConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNullHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNullHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentTerminator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentTerminator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentTerminator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentTerminator")(js.undefined)
        ret
    }
  }
  
}

