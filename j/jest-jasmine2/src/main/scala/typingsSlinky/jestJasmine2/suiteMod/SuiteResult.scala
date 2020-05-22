package typingsSlinky.jestJasmine2.suiteMod

import typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options
import typingsSlinky.jestTestResult.typesMod.FailedAssertion
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteResult extends js.Object {
  var description: String
  var failedExpectations: js.Array[
    ReturnType[
      js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
    ]
  ]
  var fullName: String
  var id: String
  var status: js.UndefOr[String] = js.undefined
  var testPath: Path
}

object SuiteResult {
  @scala.inline
  def apply(
    description: String,
    failedExpectations: js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
      ]
    ],
    fullName: String,
    id: String,
    testPath: Path,
    status: String = null
  ): SuiteResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteResult]
  }
}

