package typingsSlinky.pulumiAws.inputMod.s3control

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleConfigurationRuleFilter extends js.Object {
  
  /**
    * Object prefix for rule filtering.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of object tags for rule filtering.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object BucketLifecycleConfigurationRuleFilter {
  
  @scala.inline
  def apply(): BucketLifecycleConfigurationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleConfigurationRuleFilter]
  }
  
  @scala.inline
  implicit class BucketLifecycleConfigurationRuleFilterOps[Self <: BucketLifecycleConfigurationRuleFilter] (val x: Self) extends AnyVal {
    
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
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
