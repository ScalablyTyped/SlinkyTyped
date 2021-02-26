package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerSchemaChangePolicy extends StObject {
  
  /**
    * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
    */
  var deleteBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
    */
  var updateBehavior: js.UndefOr[Input[String]] = js.native
}
object CrawlerSchemaChangePolicy {
  
  @scala.inline
  def apply(): CrawlerSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerSchemaChangePolicy]
  }
  
  @scala.inline
  implicit class CrawlerSchemaChangePolicyMutableBuilder[Self <: CrawlerSchemaChangePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteBehavior(value: Input[String]): Self = StObject.set(x, "deleteBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBehaviorUndefined: Self = StObject.set(x, "deleteBehavior", js.undefined)
    
    @scala.inline
    def setUpdateBehavior(value: Input[String]): Self = StObject.set(x, "updateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBehaviorUndefined: Self = StObject.set(x, "updateBehavior", js.undefined)
  }
}
