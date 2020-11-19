package typingsSlinky.pulumiAws.notebookInstanceLifecycleConfigurationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookInstanceLifecycleConfigurationArgs extends js.Object {
  
  /**
    * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
    */
  val onCreate: js.UndefOr[Input[String]] = js.native
  
  /**
    * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
    */
  val onStart: js.UndefOr[Input[String]] = js.native
}
object NotebookInstanceLifecycleConfigurationArgs {
  
  @scala.inline
  def apply(): NotebookInstanceLifecycleConfigurationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigurationArgs]
  }
  
  @scala.inline
  implicit class NotebookInstanceLifecycleConfigurationArgsOps[Self <: NotebookInstanceLifecycleConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnCreate(value: Input[String]): Self = this.set("onCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    
    @scala.inline
    def setOnStart(value: Input[String]): Self = this.set("onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
}
