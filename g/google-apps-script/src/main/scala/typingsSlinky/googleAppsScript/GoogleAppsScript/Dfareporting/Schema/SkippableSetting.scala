package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkippableSetting extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var progressOffset: js.UndefOr[VideoOffset] = js.native
  
  var skipOffset: js.UndefOr[VideoOffset] = js.native
  
  var skippable: js.UndefOr[Boolean] = js.native
}
object SkippableSetting {
  
  @scala.inline
  def apply(): SkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkippableSetting]
  }
  
  @scala.inline
  implicit class SkippableSettingOps[Self <: SkippableSetting] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProgressOffset(value: VideoOffset): Self = this.set("progressOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressOffset: Self = this.set("progressOffset", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: VideoOffset): Self = this.set("skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOffset: Self = this.set("skipOffset", js.undefined)
    
    @scala.inline
    def setSkippable(value: Boolean): Self = this.set("skippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippable: Self = this.set("skippable", js.undefined)
  }
}
