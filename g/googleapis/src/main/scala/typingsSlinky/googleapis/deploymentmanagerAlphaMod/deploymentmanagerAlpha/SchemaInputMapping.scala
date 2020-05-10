package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InputMapping creates a &#39;virtual&#39; property that will be injected
  * into the properties before sending the request to the underlying API.
  */
@js.native
trait SchemaInputMapping extends js.Object {
  /**
    * The name of the field that is going to be injected.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * The location where this mapping applies.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Regex to evaluate on method to decide if input applies.
    */
  var methodMatch: js.UndefOr[String] = js.native
  /**
    * A jsonPath expression to select an element.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaInputMapping {
  @scala.inline
  def apply(): SchemaInputMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputMapping]
  }
  @scala.inline
  implicit class SchemaInputMappingOps[Self <: SchemaInputMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMatch")(js.undefined)
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

