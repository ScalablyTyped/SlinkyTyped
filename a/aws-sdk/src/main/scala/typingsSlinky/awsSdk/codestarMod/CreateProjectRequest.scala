package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectRequest extends js.Object {
  
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  
  /**
    * The ID of the project to be created in AWS CodeStar.
    */
  var id: ProjectId = js.native
  
  /**
    * The display name for the project to be created in AWS CodeStar.
    */
  var name: ProjectName = js.native
  
  /**
    * A list of the Code objects submitted with the project request. If this parameter is specified, the request must also include the toolchain parameter.
    */
  var sourceCode: js.UndefOr[SourceCode] = js.native
  
  /**
    * The tags created for the project.
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The name of the toolchain template file submitted with the project request. If this parameter is specified, the request must also include the sourceCode parameter.
    */
  var toolchain: js.UndefOr[Toolchain] = js.native
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId, name: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestOps[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: ProjectId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ProjectName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setDescription(value: ProjectDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSourceCodeVarargs(value: Code*): Self = this.set("sourceCode", js.Array(value :_*))
    
    @scala.inline
    def setSourceCode(value: SourceCode): Self = this.set("sourceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCode: Self = this.set("sourceCode", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setToolchain(value: Toolchain): Self = this.set("toolchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolchain: Self = this.set("toolchain", js.undefined)
  }
}
