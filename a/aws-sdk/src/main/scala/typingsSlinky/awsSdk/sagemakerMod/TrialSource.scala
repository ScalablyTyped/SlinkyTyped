package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: TrialSourceArn = js.native
  
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SourceType] = js.native
}
object TrialSource {
  
  @scala.inline
  def apply(SourceArn: TrialSourceArn): TrialSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialSource]
  }
  
  @scala.inline
  implicit class TrialSourceMutableBuilder[Self <: TrialSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceArn(value: TrialSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
