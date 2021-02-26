package typingsSlinky.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionInfo extends StObject {
  
  /**
    *  The version of a Lambda function that production traffic points to. 
    */
  var currentVersion: js.UndefOr[Version] = js.native
  
  /**
    *  The alias of a Lambda function. For more information, see AWS Lambda Function Aliases in the AWS Lambda Developer Guide.
    */
  var functionAlias: js.UndefOr[LambdaFunctionAlias] = js.native
  
  /**
    *  The name of a Lambda function. 
    */
  var functionName: js.UndefOr[LambdaFunctionName] = js.native
  
  /**
    *  The version of a Lambda function that production traffic points to after the Lambda function is deployed. 
    */
  var targetVersion: js.UndefOr[Version] = js.native
  
  /**
    *  The percentage of production traffic that the target version of a Lambda function receives. 
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.native
}
object LambdaFunctionInfo {
  
  @scala.inline
  def apply(): LambdaFunctionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionInfo]
  }
  
  @scala.inline
  implicit class LambdaFunctionInfoMutableBuilder[Self <: LambdaFunctionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Version): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    @scala.inline
    def setFunctionAlias(value: LambdaFunctionAlias): Self = StObject.set(x, "functionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionAliasUndefined: Self = StObject.set(x, "functionAlias", js.undefined)
    
    @scala.inline
    def setFunctionName(value: LambdaFunctionName): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: Version): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    
    @scala.inline
    def setTargetVersionWeight(value: TrafficWeight): Self = StObject.set(x, "targetVersionWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionWeightUndefined: Self = StObject.set(x, "targetVersionWeight", js.undefined)
  }
}
