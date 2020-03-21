package typingsSlinky.angularFeatureFlags.mod.featureflags

import typingsSlinky.angular.mod.IHttpPromise
import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlagsService extends js.Object {
  def set(flagsPromise: IHttpPromise[js.Array[FlagData]] | IPromise[js.Array[FlagData]]): Unit = js.native
}

