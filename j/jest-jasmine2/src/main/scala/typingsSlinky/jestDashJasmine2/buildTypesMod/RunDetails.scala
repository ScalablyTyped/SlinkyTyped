package typingsSlinky.jestDashJasmine2.buildTypesMod

import typingsSlinky.atJestTestDashResult.buildTypesMod.FailedAssertion
import typingsSlinky.jestDashJasmine2.buildExpectationResultFactoryMod.Options
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
    totalSpecsDefined: Int | Double = null
  ): RunDetails = {
    val __obj = js.Dynamic.literal()
    if (failedExpectations != null) __obj.updateDynamic("failedExpectations")(failedExpectations.asInstanceOf[js.Any])
    if (totalSpecsDefined != null) __obj.updateDynamic("totalSpecsDefined")(totalSpecsDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunDetails]
  }
}

