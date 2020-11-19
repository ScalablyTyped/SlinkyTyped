package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonMenuShareQZone extends BaseParams {
  
  // 用户取消分享后执行的回调函数
  def cancel(): Unit = js.native
  
   // 分享标题
  var desc: String = js.native
  
   // 分享链接
  var imgUrl: String = js.native
  
   // 分享描述
  var link: String = js.native
  
   // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareQZone(): Unit = js.native
  
  var title: String = js.native
}
object IonMenuShareQZone {
  
  @scala.inline
  def apply(cancel: () => Unit, desc: String, imgUrl: String, link: String, success: () => Unit, title: String): IonMenuShareQZone = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], success = js.Any.fromFunction0(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareQZone]
  }
  
  @scala.inline
  implicit class IonMenuShareQZoneOps[Self <: IonMenuShareQZone] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUrl(value: String): Self = this.set("imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
