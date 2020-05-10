package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaRequest extends js.Object {
  /**
    * The name for the schema.
    */
  var name: Name = js.native
  /**
    * A schema in Avro JSON format.
    */
  var schema: AvroSchema = js.native
}

object CreateSchemaRequest {
  @scala.inline
  def apply(name: Name, schema: AvroSchema): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
  @scala.inline
  implicit class CreateSchemaRequestOps[Self <: CreateSchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: AvroSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

