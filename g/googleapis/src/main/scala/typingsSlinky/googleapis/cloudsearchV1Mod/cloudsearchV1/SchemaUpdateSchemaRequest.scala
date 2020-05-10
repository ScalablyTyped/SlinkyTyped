package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUpdateSchemaRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * The new schema for the source.
    */
  var schema: js.UndefOr[SchemaSchema] = js.native
  /**
    * If true, the request will be validated without side effects.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object SchemaUpdateSchemaRequest {
  @scala.inline
  def apply(): SchemaUpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSchemaRequest]
  }
  @scala.inline
  implicit class SchemaUpdateSchemaRequestOps[Self <: SchemaUpdateSchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugOptions(value: SchemaDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: SchemaSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnly")(js.undefined)
        ret
    }
  }
  
}

