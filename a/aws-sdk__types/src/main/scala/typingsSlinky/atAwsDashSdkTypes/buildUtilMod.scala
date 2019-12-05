package typingsSlinky.atAwsDashSdkTypes

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.SdkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/types/build/util", JSImport.Namespace)
@js.native
object buildUtilMod extends js.Object {
  type BodyLengthCalculator = js.Function1[/* body */ js.Any, js.UndefOr[Double]]
  type Decoder = js.Function1[/* input */ String, scala.scalajs.js.typedarray.Uint8Array]
  type DelayDecider = js.Function2[/* delayBase */ Double, /* attempts */ Double, Double]
  type Encoder = js.Function1[/* input */ scala.scalajs.js.typedarray.Uint8Array, String]
  type Provider[T] = js.Function0[js.Promise[T]]
  type RetryDecider = js.Function1[/* error */ SdkError, Boolean]
  type SdkError = js.Error with Anon_ConnectionError
  type UrlParser = js.Function1[/* url */ String, HttpEndpoint]
}

