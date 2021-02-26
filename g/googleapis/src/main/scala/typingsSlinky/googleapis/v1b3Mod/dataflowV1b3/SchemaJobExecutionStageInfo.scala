package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about how a particular google.dataflow.v1beta3.Step
  * will be executed.
  */
@js.native
trait SchemaJobExecutionStageInfo extends StObject {
  
  /**
    * The steps associated with the execution stage. Note that stages may have
    * several steps, and that a given step might be run by more than one stage.
    */
  var stepName: js.UndefOr[js.Array[String]] = js.native
}
object SchemaJobExecutionStageInfo {
  
  @scala.inline
  def apply(): SchemaJobExecutionStageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobExecutionStageInfo]
  }
  
  @scala.inline
  implicit class SchemaJobExecutionStageInfoMutableBuilder[Self <: SchemaJobExecutionStageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepName(value: js.Array[String]): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNameUndefined: Self = StObject.set(x, "stepName", js.undefined)
    
    @scala.inline
    def setStepNameVarargs(value: String*): Self = StObject.set(x, "stepName", js.Array(value :_*))
  }
}
