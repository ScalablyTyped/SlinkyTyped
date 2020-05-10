package typingsSlinky.pulumiAws.documentsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.`2008-10-17`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`2012-10-17`
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[Input[String]] = js.native
  var Statement: Input[js.Array[Input[PolicyStatement]]] = js.native
  var Version: Input[`2008-10-17` | `2012-10-17`] = js.native
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: Input[js.Array[Input[PolicyStatement]]], Version: Input[`2008-10-17` | `2012-10-17`]): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
  @scala.inline
  implicit class PolicyDocumentOps[Self <: PolicyDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatement(value: Input[js.Array[Input[PolicyStatement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Input[`2008-10-17` | `2012-10-17`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}

