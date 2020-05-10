package typingsSlinky.jestJasmine2.specMod

import typingsSlinky.jestJasmine2.AnonGetColumnNumber
import typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options
import typingsSlinky.jestTestResult.typesMod.FailedAssertion
import typingsSlinky.jestTestResult.typesMod.Milliseconds
import typingsSlinky.jestTestResult.typesMod.Status
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecResult extends js.Object {
  var __callsite: js.UndefOr[AnonGetColumnNumber] = js.native
  var description: String = js.native
  var duration: js.UndefOr[Milliseconds] = js.native
  var failedExpectations: js.Array[FailedAssertion] = js.native
  var fullName: String = js.native
  var id: String = js.native
  var passedExpectations: js.Array[
    ReturnType[
      js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
    ]
  ] = js.native
  var pendingReason: String = js.native
  var status: Status = js.native
  var testPath: Path = js.native
}

object SpecResult {
  @scala.inline
  def apply(
    description: String,
    failedExpectations: js.Array[FailedAssertion],
    fullName: String,
    id: String,
    passedExpectations: js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
      ]
    ],
    pendingReason: String,
    status: Status,
    testPath: Path
  ): SpecResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], passedExpectations = passedExpectations.asInstanceOf[js.Any], pendingReason = pendingReason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecResult]
  }
  @scala.inline
  implicit class SpecResultOps[Self <: SpecResult] (val x: Self) extends AnyVal {
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
    def withFailedExpectations(value: js.Array[FailedAssertion]): Self = {
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
    def withPassedExpectations(
      value: js.Array[
          ReturnType[
            js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedExpectations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__callsite(value: AnonGetColumnNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__callsite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__callsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__callsite")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Milliseconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

