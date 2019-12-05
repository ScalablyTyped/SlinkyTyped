package typingsSlinky.angularDashFeatureDashFlags.angularMod.featureflags

import typingsSlinky.angular.angularMod.IHttpPromise
import typingsSlinky.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFlagsService extends js.Object {
  def set(flagsPromise: IHttpPromise[js.Array[FlagData]] | IPromise[js.Array[FlagData]]): Unit = js.native
}

