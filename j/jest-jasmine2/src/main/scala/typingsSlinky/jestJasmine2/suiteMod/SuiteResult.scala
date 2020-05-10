package typingsSlinky.jestJasmine2.suiteMod

import typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options
import typingsSlinky.jestTestResult.typesMod.FailedAssertion
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteResult extends js.Object {
  var description: String = js.native
  var failedExpectations: js.Array[
    ReturnType[
      js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
    ]
  ] = js.native
  var fullName: String = js.native
  var id: String = js.native
  var status: js.UndefOr[String] = js.native
  var testPath: Path = js.native
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
    testPath: Path
  ): SuiteResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteResult]
  }
  @scala.inline
  implicit class SuiteResultOps[Self <: SuiteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedExpectations(
      value: js.Array[
          ReturnType[
            js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExpectations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

