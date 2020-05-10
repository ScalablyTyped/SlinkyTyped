package typingsSlinky.jestJasmine2.typesMod

import typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options
import typingsSlinky.jestTestResult.typesMod.FailedAssertion
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunDetails extends js.Object {
  var failedExpectations: js.UndefOr[
    js.Array[
      ReturnType[
        js.Function2[/* options */ Options, /* initError */ js.UndefOr[js.Error], FailedAssertion]
      ]
    ]
  ] = js.native
  var totalSpecsDefined: js.UndefOr[Double] = js.native
}

object RunDetails {
  @scala.inline
  def apply(): RunDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunDetails]
  }
  @scala.inline
  implicit class RunDetailsOps[Self <: RunDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withoutFailedExpectations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExpectations")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSpecsDefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSpecsDefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSpecsDefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSpecsDefined")(js.undefined)
        ret
    }
  }
  
}

