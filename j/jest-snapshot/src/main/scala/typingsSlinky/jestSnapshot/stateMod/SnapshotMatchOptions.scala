package typingsSlinky.jestSnapshot.stateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotMatchOptions extends js.Object {
  
  var error: js.UndefOr[js.Error] = js.native
  
  var inlineSnapshot: js.UndefOr[String] = js.native
  
  var isInline: Boolean = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var received: js.Any = js.native
  
  var testName: String = js.native
}
object SnapshotMatchOptions {
  
  @scala.inline
  def apply(isInline: Boolean, received: js.Any, testName: String): SnapshotMatchOptions = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMatchOptions]
  }
  
  @scala.inline
  implicit class SnapshotMatchOptionsOps[Self <: SnapshotMatchOptions] (val x: Self) extends AnyVal {
    
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
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: js.Any): Self = this.set("received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestName(value: String): Self = this.set("testName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInlineSnapshot(value: String): Self = this.set("inlineSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSnapshot: Self = this.set("inlineSnapshot", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
