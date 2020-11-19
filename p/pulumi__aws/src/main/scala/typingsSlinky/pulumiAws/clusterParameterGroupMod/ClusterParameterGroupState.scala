package typingsSlinky.pulumiAws.clusterParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterParameterGroupState extends js.Object {
  
  /**
    * The ARN of the documentDB cluster parameter group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the documentDB cluster parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The family of the documentDB cluster parameter group.
    */
  val family: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the documentDB parameter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of documentDB parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ClusterParameterGroupParameter]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ClusterParameterGroupState {
  
  @scala.inline
  def apply(): ClusterParameterGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupState]
  }
  
  @scala.inline
  implicit class ClusterParameterGroupStateOps[Self <: ClusterParameterGroupState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFamily(value: Input[String]): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Input[ClusterParameterGroupParameter]*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Input[js.Array[Input[ClusterParameterGroupParameter]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
