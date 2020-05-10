package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkBuildTypes.apiModelMod.Operation
import typingsSlinky.awsSdkBuildTypes.apiModelMod.StructureMember
import typingsSlinky.awsSdkTypes.protocolMod.HttpTrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedOperation extends Operation {
  @JSName("errors")
  var errors_NormalizedOperation: js.Array[StructureMember] = js.native
  @JSName("input")
  var input_NormalizedOperation: StructureMember = js.native
  @JSName("output")
  var output_NormalizedOperation: StructureMember = js.native
}

object NormalizedOperation {
  @scala.inline
  def apply(
    errors: js.Array[StructureMember],
    http: HttpTrait,
    input: StructureMember,
    name: String,
    output: StructureMember
  ): NormalizedOperation = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOperation]
  }
  @scala.inline
  implicit class NormalizedOperationOps[Self <: NormalizedOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[StructureMember]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: StructureMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: StructureMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

