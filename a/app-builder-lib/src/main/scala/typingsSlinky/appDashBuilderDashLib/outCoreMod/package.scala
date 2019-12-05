package typingsSlinky.appDashBuilderDashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outCoreMod {
  import typingsSlinky.appDashBuilderDashLib.outPublishSnapStorePublisherMod.SnapStoreOptions
  import typingsSlinky.builderDashUtilDashRuntime.outPublishOptionsMod.AllPublishOptions

  type Publish = AllPublishOptions | SnapStoreOptions | (js.Array[AllPublishOptions | SnapStoreOptions]) | Null
  type TargetConfigType = (js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null
}
