package typingsSlinky.awsSdkTypes.unmarshallerMod

import typingsSlinky.awsSdkTypes.protocolMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyParser[SerializedType] extends js.Object {
  /**
    * Convert the provided input into the shape described in the supplied
    * serialization model.
    *
    * @param shape A serialization model describing the expected shape of the
    *              value supplied as `input`.
    * @param input The value to parse
    */
  def parse[OutputType](shape: Member, input: SerializedType): OutputType = js.native
}

object BodyParser {
  @scala.inline
  def apply[SerializedType](parse: (Member, SerializedType) => js.Any): BodyParser[SerializedType] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[BodyParser[SerializedType]]
  }
  @scala.inline
  implicit class BodyParserOps[Self[serializedtype] <: BodyParser[serializedtype], SerializedType] (val x: Self[SerializedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SerializedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SerializedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SerializedType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SerializedType] with Other]
    @scala.inline
    def withParse(value: (Member, SerializedType) => js.Any): Self[SerializedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

