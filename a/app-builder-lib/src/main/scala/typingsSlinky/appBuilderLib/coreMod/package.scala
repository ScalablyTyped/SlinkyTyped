package typingsSlinky.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type Publish = typingsSlinky.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typingsSlinky.appBuilderLib.snapStorePublisherMod.SnapStoreOptions | (js.Array[
    typingsSlinky.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typingsSlinky.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
  ]) | scala.Null
  type TargetConfigType = (js.Array[java.lang.String | typingsSlinky.appBuilderLib.coreMod.TargetConfiguration]) | java.lang.String | typingsSlinky.appBuilderLib.coreMod.TargetConfiguration | scala.Null
}
