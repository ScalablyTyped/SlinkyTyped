package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRuleAndOperator extends StObject {
  
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * An array of tags containing key and value pairs.
    */
  var Tags: js.UndefOr[TagSet] = js.native
}
object ReplicationRuleAndOperator {
  
  @scala.inline
  def apply(): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
  
  @scala.inline
  implicit class ReplicationRuleAndOperatorMutableBuilder[Self <: ReplicationRuleAndOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTags(value: TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
