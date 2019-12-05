package typingsSlinky.googleDashGax.buildSrcFallbackMod.protobuf.util

import typingsSlinky.protobufjs.protobufjsMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "protobuf.util.decorateType")
@js.native
object decorateType extends js.Object {
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  def apply[T /* <: typingsSlinky.protobufjs.protobufjsMod.Message[T] */](ctor: Constructor[T]): typingsSlinky.protobufjs.protobufjsMod.Type = js.native
  def apply[T /* <: typingsSlinky.protobufjs.protobufjsMod.Message[T] */](ctor: Constructor[T], typeName: String): typingsSlinky.protobufjs.protobufjsMod.Type = js.native
}

