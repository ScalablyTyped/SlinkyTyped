package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetadataFilter label name value pairs that are expected to match
  * corresponding labels presented as metadata to the loadbalancer.
  */
@js.native
trait SchemaMetadataFilterLabelMatch extends js.Object {
  /**
    * Name of metadata label. The name can have a maximum length of 1024
    * characters and must be at least 1 character long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the label must match the specified value. value can have a
    * maximum length of 1024 characters.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaMetadataFilterLabelMatch {
  @scala.inline
  def apply(): SchemaMetadataFilterLabelMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataFilterLabelMatch]
  }
  @scala.inline
  implicit class SchemaMetadataFilterLabelMatchOps[Self <: SchemaMetadataFilterLabelMatch] (val x: Self) extends AnyVal {
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

