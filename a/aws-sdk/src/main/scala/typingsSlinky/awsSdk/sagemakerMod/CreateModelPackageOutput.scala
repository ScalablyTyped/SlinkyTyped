package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelPackageOutput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the new model package.
    */
  var ModelPackageArn: typingsSlinky.awsSdk.sagemakerMod.ModelPackageArn = js.native
}
object CreateModelPackageOutput {
  
  @scala.inline
  def apply(ModelPackageArn: ModelPackageArn): CreateModelPackageOutput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageOutput]
  }
  
  @scala.inline
  implicit class CreateModelPackageOutputOps[Self <: CreateModelPackageOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelPackageArn(value: ModelPackageArn): Self = this.set("ModelPackageArn", value.asInstanceOf[js.Any])
  }
}
