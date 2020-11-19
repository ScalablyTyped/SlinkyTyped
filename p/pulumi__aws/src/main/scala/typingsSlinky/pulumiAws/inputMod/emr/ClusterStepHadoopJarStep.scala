package typingsSlinky.pulumiAws.inputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterStepHadoopJarStep extends js.Object {
  
  /**
    * List of command line arguments passed to the JAR file's main function when executed.
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Path to a JAR file run during the step.
    */
  var jar: Input[String] = js.native
  
  /**
    * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var mainClass: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var properties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ClusterStepHadoopJarStep {
  
  @scala.inline
  def apply(jar: Input[String]): ClusterStepHadoopJarStep = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStepHadoopJarStep]
  }
  
  @scala.inline
  implicit class ClusterStepHadoopJarStepOps[Self <: ClusterStepHadoopJarStep] (val x: Self) extends AnyVal {
    
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
    def setJar(value: Input[String]): Self = this.set("jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: Input[String]*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: Input[js.Array[Input[String]]]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setMainClass(value: Input[String]): Self = this.set("mainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClass: Self = this.set("mainClass", js.undefined)
    
    @scala.inline
    def setProperties(value: Input[StringDictionary[Input[String]]]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
