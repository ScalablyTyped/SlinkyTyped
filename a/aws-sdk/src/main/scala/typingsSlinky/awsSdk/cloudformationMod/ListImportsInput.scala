package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImportsInput extends js.Object {
  /**
    * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value. 
    */
  var ExportName: typingsSlinky.awsSdk.cloudformationMod.ExportName = js.native
  /**
    * A string (provided by the ListImports response output) that identifies the next page of stacks that are importing the specified exported output value. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
}

object ListImportsInput {
  @scala.inline
  def apply(ExportName: ExportName): ListImportsInput = {
    val __obj = js.Dynamic.literal(ExportName = ExportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportsInput]
  }
  @scala.inline
  implicit class ListImportsInputOps[Self <: ListImportsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportName(value: ExportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

