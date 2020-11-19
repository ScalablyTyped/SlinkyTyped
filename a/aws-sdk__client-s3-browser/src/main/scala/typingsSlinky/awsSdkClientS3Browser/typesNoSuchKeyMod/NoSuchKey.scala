package typingsSlinky.awsSdkClientS3Browser.typesNoSuchKeyMod

import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoSuchKey extends ServiceException[NoSuchKeyDetails] {
  
  @JSName("name")
  var name_NoSuchKey: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey = js.native
}
object NoSuchKey {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchKeyDetails,
    message: String,
    name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey
  ): NoSuchKey = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchKey]
  }
  
  @scala.inline
  implicit class NoSuchKeyOps[Self <: NoSuchKey] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
