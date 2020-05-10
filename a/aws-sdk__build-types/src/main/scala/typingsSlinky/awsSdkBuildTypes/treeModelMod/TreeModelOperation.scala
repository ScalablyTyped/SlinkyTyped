package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkTypes.protocolMod.HttpTrait
import typingsSlinky.awsSdkTypes.protocolMod.Member
import typingsSlinky.awsSdkTypes.protocolMod.ServiceMetadata
import typingsSlinky.awsSdkTypes.protocolMod.SupportedSignatureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.awsSdkTypes.protocolMod.OperationModel because var conflicts: name. Inlined errors, http, input, metadata, output */ @js.native
trait TreeModelOperation
  extends Documented
     with Named {
  var authtype: js.UndefOr[SupportedSignatureVersion] = js.native
  var errors: js.Array[Member | TreeModelOperationMember] = js.native
  var http: HttpTrait = js.native
  var input: Member | TreeModelOperationMember = js.native
  var metadata: ServiceMetadata = js.native
  var output: Member | TreeModelOperationMember = js.native
}

object TreeModelOperation {
  @scala.inline
  def apply(
    documentation: String,
    errors: js.Array[Member | TreeModelOperationMember],
    http: HttpTrait,
    input: Member | TreeModelOperationMember,
    metadata: ServiceMetadata,
    name: String,
    output: Member | TreeModelOperationMember
  ): TreeModelOperation = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelOperation]
  }
  @scala.inline
  implicit class TreeModelOperationOps[Self <: TreeModelOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[Member | TreeModelOperationMember]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: HttpTrait): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Member | TreeModelOperationMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ServiceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: Member | TreeModelOperationMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthtype(value: SupportedSignatureVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authtype")(js.undefined)
        ret
    }
  }
  
}

