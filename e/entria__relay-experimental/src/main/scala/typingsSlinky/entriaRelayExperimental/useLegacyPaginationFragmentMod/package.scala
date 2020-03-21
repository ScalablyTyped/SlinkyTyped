package typingsSlinky.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useLegacyPaginationFragmentMod {
  type NonNullableFragmentReturn[TReturn] = typingsSlinky.std.ReturnType[
    typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableReturn[TReturn]
  ]
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  type NullableFragmentReturn[TReturn] = typingsSlinky.std.ReturnType[
    typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableReturn[TReturn]
  ]
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | scala.Null], TFragmentData | scala.Null]
}
