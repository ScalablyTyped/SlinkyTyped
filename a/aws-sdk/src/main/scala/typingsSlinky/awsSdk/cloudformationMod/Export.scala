package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Export extends js.Object {
  /**
    * The stack that contains the exported output name and value.
    */
  var ExportingStackId: js.UndefOr[StackId] = js.native
  /**
    * The name of exported output value. Use this name and the Fn::ImportValue function to import the associated value into other stacks. The name is defined in the Export field in the associated stack's Outputs section.
    */
  var Name: js.UndefOr[ExportName] = js.native
  /**
    * The value of the exported output, such as a resource physical ID. This value is defined in the Export field in the associated stack's Outputs section.
    */
  var Value: js.UndefOr[ExportValue] = js.native
}

object Export {
  @scala.inline
  def apply(): Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Export]
  }
  @scala.inline
  implicit class ExportOps[Self <: Export] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportingStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportingStackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportingStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportingStackId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ExportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ExportValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

