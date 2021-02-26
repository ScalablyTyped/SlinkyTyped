package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptionsDescription extends StObject {
  
  /**
    *  A list of ConfigurationOptionDescription. 
    */
  var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.native
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  
  /**
    * The name of the solution stack these configuration options belong to.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
}
object ConfigurationOptionsDescription {
  
  @scala.inline
  def apply(): ConfigurationOptionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionsDescription]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsDescriptionMutableBuilder[Self <: ConfigurationOptionsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: ConfigurationOptionDescriptionsList): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: ConfigurationOptionDescription*): Self = StObject.set(x, "Options", js.Array(value :_*))
    
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
  }
}
