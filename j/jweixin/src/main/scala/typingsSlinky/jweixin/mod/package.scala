package typingsSlinky.jweixin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[scala.Unit]
  
  /**
    * 批量添加卡券接口
    */
  @scala.inline
  def addCard(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addCard")().asInstanceOf[scala.Unit]
  
  /**
    * 判断当前客户端版本是否支持指定JS接口
    * 备注：checkJsApi接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用checkJsApi来检测。
    */
  @scala.inline
  def checkJsApi(params: typingsSlinky.jweixin.mod.IcheckJsApi): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("checkJsApi")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 拉取适用卡券列表并获取用户选择信息
    */
  @scala.inline
  def chooseCard(params: typingsSlinky.jweixin.mod.IchooseCard): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chooseCard")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 从本地相册选择图片或使用相机拍照。
    */
  @scala.inline
  def chooseImage(params: typingsSlinky.jweixin.mod.IchooseImage): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 发起一个微信支付请求
    */
  @scala.inline
  def chooseWXPay(params: typingsSlinky.jweixin.mod.IchooseWXPay): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chooseWXPay")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 关闭当前网页窗口接口
    */
  @scala.inline
  def closeWindow(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def config(conf: typingsSlinky.jweixin.anon.AppId): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("config")(conf.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 核销后再次赠送卡券接口
    */
  @scala.inline
  def consumeAndShareCard(params: typingsSlinky.jweixin.mod.IconsumeAndShareCard): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("consumeAndShareCard")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 下载图片接口
    */
  @scala.inline
  def downloadImage(params: typingsSlinky.jweixin.mod.IdownloadImage): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 下载语音接口
    */
  @scala.inline
  def downloadVoice(params: typingsSlinky.jweixin.mod.IupdownloadVoice): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def error(fn: js.Function1[/* err */ typingsSlinky.jweixin.anon.ErrMsg, scala.Unit]): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取本地图片接口
    */
  @scala.inline
  def getLocalImgData(params: typingsSlinky.jweixin.mod.IgetLocalImgData): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalImgData")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取地理位置接口
    */
  @scala.inline
  def getLocation(params: typingsSlinky.jweixin.mod.IgetLocation): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取网络状态接口
    */
  @scala.inline
  def getNetworkType(params: typingsSlinky.jweixin.mod.IgetNetworkType): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 隐藏所有非基础按钮接口
    * “基本类”按钮详见附录3
    */
  @scala.inline
  def hideAllNonBaseMenuItem(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hideAllNonBaseMenuItem")().asInstanceOf[scala.Unit]
  
  /**
    * 批量隐藏功能按钮接口
    */
  @scala.inline
  def hideMenuItems(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hideMenuItems")().asInstanceOf[scala.Unit]
  
  /*=============================摇一摇周边================================*/
  /*=============================界面操作================================*/
  /**
    * 隐藏右上角菜单接口
    */
  @scala.inline
  def hideOptionMenu(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hideOptionMenu")().asInstanceOf[scala.Unit]
  
  // 所有JS接口列表
  type jsApiList = js.Array[typingsSlinky.jweixin.mod.ApiMethod]
  
  // 一些特殊公众号
  type menuList = js.Array[
    typingsSlinky.jweixin.mod.menuBase | typingsSlinky.jweixin.mod.menuProtected | typingsSlinky.jweixin.mod.menuShare
  ]
  
  /**
    * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareAppMessage(params: typingsSlinky.jweixin.mod.IonMenuShareAppMessage): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareAppMessage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取“分享到QQ”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareQQ(params: typingsSlinky.jweixin.mod.IonMenuShareQQ): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQQ")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareQZone(params: typingsSlinky.jweixin.mod.IonMenuShareQZone): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQZone")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /*=============================基础接口================================*/
  /**
    * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareTimeline(params: typingsSlinky.jweixin.mod.IonMenuShareTimeline): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareTimeline")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareWeibo(params: typingsSlinky.jweixin.mod.IonMenuShareWeibo): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareWeibo")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 监听周边ibeacon设备接口
    */
  @scala.inline
  def onSearchBeacons(params: typingsSlinky.jweixin.mod.IonSearchBeacons): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 监听语音播放完毕接口
    */
  @scala.inline
  def onVoicePlayEnd(params: typingsSlinky.jweixin.mod.IonVoicePlayEnd): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onVoicePlayEnd")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 监听录音自动停止接口
    */
  @scala.inline
  def onVoiceRecordEnd(params: typingsSlinky.jweixin.mod.IonVoiceRecordEnd): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onVoiceRecordEnd")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 查看微信卡包中的卡券接口
    */
  @scala.inline
  def openCard(params: typingsSlinky.jweixin.mod.IopenCard): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openCard")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 使用微信内置地图查看位置接口
    */
  @scala.inline
  def openLocation(params: typingsSlinky.jweixin.mod.IopenLocation): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 跳转微信商品页接口
    */
  @scala.inline
  def openProductSpecificView(params: typingsSlinky.jweixin.mod.IopenProductSpecificView): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openProductSpecificView")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 暂停播放接口
    */
  @scala.inline
  def pauseVoice(params: typingsSlinky.jweixin.mod.IplaypausestopVoice): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 播放语音接口
    */
  @scala.inline
  def playVoice(params: typingsSlinky.jweixin.mod.IplaypausestopVoice): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 预览图片接口
    */
  @scala.inline
  def previewImage(params: typingsSlinky.jweixin.mod.IpreviewImage): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ready(fn: js.Function0[scala.Unit]): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 调起微信扫一扫接口
    */
  @scala.inline
  def scanQRCode(params: typingsSlinky.jweixin.mod.IscanQRCode): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 显示所有功能按钮接口
    */
  @scala.inline
  def showAllNonBaseMenuItem(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showAllNonBaseMenuItem")().asInstanceOf[scala.Unit]
  
  /**
    * 批量显示功能按钮接口
    */
  @scala.inline
  def showMenuItems(params: typingsSlinky.jweixin.mod.IshowMenuItems): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showMenuItems")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 显示右上角菜单接口
    */
  @scala.inline
  def showOptionMenu(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showOptionMenu")().asInstanceOf[scala.Unit]
  
  /*=============================图像接口================================*/
  /*=============================音频接口================================*/
  /**
    * 开始录音接口
    */
  @scala.inline
  def startRecord(): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")().asInstanceOf[scala.Unit]
  
  /**
    * 开启查找周边ibeacon设备接口
    * 备注：如需接入摇一摇周边功能，请参考：申请开通摇一摇周边
    */
  @scala.inline
  def startSearchBeacons(params: typingsSlinky.jweixin.mod.IstartSearchBeacons): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 停止录音接口
    */
  @scala.inline
  def stopRecord(params: typingsSlinky.jweixin.mod.IstopRecord): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 关闭查找周边ibeacon设备接口
    */
  @scala.inline
  def stopSearchBeacons(params: typingsSlinky.jweixin.mod.IstopSearchBeacons): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 停止播放接口
    */
  @scala.inline
  def stopVoice(params: typingsSlinky.jweixin.mod.IplaypausestopVoice): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 识别音频并返回识别结果接口
    */
  @scala.inline
  def translateVoice(params: typingsSlinky.jweixin.mod.ItranslateVoice): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("translateVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 上传图片接口
    */
  @scala.inline
  def uploadImage(params: typingsSlinky.jweixin.mod.IuploadImage): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 上传语音接口
    * 备注：上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器
    * ，此处获得的 serverId 即 media_id，参考文档
    * ../12 / 58bfcfabbd501c7cd77c19bd9cfa8354.html
    * 目前多媒体文件下载接口的频率限制为10000次/ 天，
    * 如需要调高频率，请邮件weixin - open@qq.com,
    * 邮件主题为【申请多媒体接口调用量】，请对你的项目进行简单描述，
    * 附上产品体验链接，并对用户量和使用量进行说明。
    */
  @scala.inline
  def uploadVoice(params: typingsSlinky.jweixin.mod.IupdownloadVoice): scala.Unit = typingsSlinky.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
