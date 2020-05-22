package typingsSlinky.jestJasmine2.typesMod

import typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options
import typingsSlinky.jestTestResult.typesMod.FailedAssertion
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunDetails extends js.Object {
  var failedExpectations: js.UndefOr[
    js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
      ]
    ]
  ] = js.undefined
  var totalSpecsDefined: js.UndefOr[Double] = js.undefined
}

object RunDetails {
  @scala.inline
  def apply(
    failedExpectations: js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
      ]
    ] = null,
    totalSpecsDefined: js.UndefOr[Double] = js.undefined
  ): RunDetails = {
    val __obj = js.Dynamic.literal()
    if (failedExpectations != null) __obj.updateDynamic("failedExpectations")(failedExpectations.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSpecsDefined)) __obj.updateDynamic("totalSpecsDefined")(totalSpecsDefined.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunDetails]
  }
}

