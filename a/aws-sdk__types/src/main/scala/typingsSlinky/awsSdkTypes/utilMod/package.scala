package typingsSlinky.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type BodyLengthCalculator = js.Function1[/* body */ js.Any, js.UndefOr[scala.Double]]
  type Decoder = js.Function1[/* input */ java.lang.String, scala.scalajs.js.typedarray.Uint8Array]
  type DelayDecider = js.Function2[/* delayBase */ scala.Double, /* attempts */ scala.Double, scala.Double]
  type Encoder = js.Function1[/* input */ scala.scalajs.js.typedarray.Uint8Array, java.lang.String]
  type Provider[T] = js.Function0[js.Promise[T]]
  type RetryDecider = js.Function1[/* error */ typingsSlinky.awsSdkTypes.utilMod.SdkError, scala.Boolean]
  type UrlParser = js.Function1[/* url */ java.lang.String, typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint]
}
