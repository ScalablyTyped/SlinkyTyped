package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectTorrentOutput extends js.Object {
  
  /**
    * A Bencoded dictionary as defined by the BitTorrent specification
    */
  var Body: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Body] = js.native
  
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
}
object GetObjectTorrentOutput {
  
  @scala.inline
  def apply(): GetObjectTorrentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectTorrentOutput]
  }
  
  @scala.inline
  implicit class GetObjectTorrentOutputOps[Self <: GetObjectTorrentOutput] (val x: Self) extends AnyVal {
    
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
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Body): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
  }
}
