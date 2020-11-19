package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelIdLang extends js.Object {
  
  var channelId: String = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var media: String | js.Array[String] = js.native
  
  var offsetms: js.UndefOr[Double] = js.native
  
  var playbackId: String = js.native
  
  var skipms: js.UndefOr[Double] = js.native
}
object ChannelIdLang {
  
  @scala.inline
  def apply(channelId: String, media: String | js.Array[String], playbackId: String): ChannelIdLang = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdLang]
  }
  
  @scala.inline
  implicit class ChannelIdLangOps[Self <: ChannelIdLang] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaVarargs(value: String*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: String | js.Array[String]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackId(value: String): Self = this.set("playbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setOffsetms(value: Double): Self = this.set("offsetms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetms: Self = this.set("offsetms", js.undefined)
    
    @scala.inline
    def setSkipms(value: Double): Self = this.set("skipms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipms: Self = this.set("skipms", js.undefined)
  }
}
