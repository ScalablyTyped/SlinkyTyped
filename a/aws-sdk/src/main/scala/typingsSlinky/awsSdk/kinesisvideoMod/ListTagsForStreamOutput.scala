package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForStreamOutput extends js.Object {
  
  /**
    * If you specify this parameter and the result of a ListTags call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.NextToken] = js.native
  
  /**
    * A map of tag keys and values associated with the specified stream.
    */
  var Tags: js.UndefOr[ResourceTags] = js.native
}
object ListTagsForStreamOutput {
  
  @scala.inline
  def apply(): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  
  @scala.inline
  implicit class ListTagsForStreamOutputOps[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: ResourceTags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
