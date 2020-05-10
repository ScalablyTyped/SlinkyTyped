package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for an object.
  */
@js.native
trait SchemaObjectOptions extends js.Object {
  /**
    * Options that determine how the object is displayed in the Cloud Search
    * results page.
    */
  var displayOptions: js.UndefOr[SchemaObjectDisplayOptions] = js.native
  /**
    * The freshness options for an object.
    */
  var freshnessOptions: js.UndefOr[SchemaFreshnessOptions] = js.native
}

object SchemaObjectOptions {
  @scala.inline
  def apply(): SchemaObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectOptions]
  }
  @scala.inline
  implicit class SchemaObjectOptionsOps[Self <: SchemaObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayOptions(value: SchemaObjectDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFreshnessOptions(value: SchemaFreshnessOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshnessOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreshnessOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshnessOptions")(js.undefined)
        ret
    }
  }
  
}

