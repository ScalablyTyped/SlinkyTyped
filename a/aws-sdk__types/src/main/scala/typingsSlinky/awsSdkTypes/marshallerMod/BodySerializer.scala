package typingsSlinky.awsSdkTypes.marshallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodySerializer[SerializedType] extends js.Object {
  /**
    * Converts the provided `input` into the serialized format described in the
    * provided `shape`.
    *
    * @param options Modeled and user-provided operation input to serialize.
    *
    * @throws if a node in the input cannot be converted into the type
    *          specified by the serialization model
    */
  def build(options: BodySerializerBuildOptions): SerializedType = js.native
}

object BodySerializer {
  @scala.inline
  def apply[SerializedType](build: BodySerializerBuildOptions => SerializedType): BodySerializer[SerializedType] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
    __obj.asInstanceOf[BodySerializer[SerializedType]]
  }
  @scala.inline
  implicit class BodySerializerOps[Self[serializedtype] <: BodySerializer[serializedtype], SerializedType] (val x: Self[SerializedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SerializedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SerializedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SerializedType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SerializedType] with Other]
    @scala.inline
    def withBuild(value: BodySerializerBuildOptions => SerializedType): Self[SerializedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

