package typingsSlinky.appBuilderLib.coreMod

import typingsSlinky.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
import typingsSlinky.builderUtilRuntime.publishOptionsMod.AllPublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.AllPublishOptions
  - typingsSlinky.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
  - js.Array[
typingsSlinky.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typingsSlinky.appBuilderLib.snapStorePublisherMod.SnapStoreOptions]
  - scala.Null
*/
trait Publish extends js.Object

object Publish {
  @scala.inline
  implicit def apply(value: AllPublishOptions): Publish = value.asInstanceOf[Publish]
  @scala.inline
  implicit def apply(value: js.Array[AllPublishOptions | SnapStoreOptions]): Publish = value.asInstanceOf[Publish]
  @scala.inline
  implicit def apply(value: Null): Publish = value.asInstanceOf[Publish]
  @scala.inline
  implicit def apply(value: SnapStoreOptions): Publish = value.asInstanceOf[Publish]
}

