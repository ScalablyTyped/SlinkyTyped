package typingsSlinky.googleapis

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.endpointMod.Target
import typingsSlinky.googleapisCommon.schemaMod.Schema
import typingsSlinky.googleapisCommon.schemaMod.SchemaResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<googleapis-common.googleapis-common.Endpoint> */
@js.native
trait ReadonlyEndpoint extends js.Object {
  val _options: GlobalOptions = js.native
  val applyMethodsFromSchema: js.Any = js.native
  val getPathParams: js.Any = js.native
  val google: js.Any = js.native
  val makeMethod: js.Any = js.native
  def applySchema(target: Target, rootSchema: Schema, schema: SchemaResource, context: APIRequestContext): Unit = js.native
}

object ReadonlyEndpoint {
  @scala.inline
  def apply(
    _options: GlobalOptions,
    applyMethodsFromSchema: js.Any,
    applySchema: (Target, Schema, SchemaResource, APIRequestContext) => Unit,
    getPathParams: js.Any,
    google: js.Any,
    makeMethod: js.Any
  ): ReadonlyEndpoint = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], applyMethodsFromSchema = applyMethodsFromSchema.asInstanceOf[js.Any], applySchema = js.Any.fromFunction4(applySchema), getPathParams = getPathParams.asInstanceOf[js.Any], google = google.asInstanceOf[js.Any], makeMethod = makeMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEndpoint]
  }
  @scala.inline
  implicit class ReadonlyEndpointOps[Self <: ReadonlyEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_options(value: GlobalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyMethodsFromSchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMethodsFromSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplySchema(value: (Target, Schema, SchemaResource, APIRequestContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applySchema")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetPathParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPathParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoogle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakeMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeMethod")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

