package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTML5+接口，统一浏览器自定义扩展，提供增强的功能、性能扩展规范，使得开发者可开发出跨平台的app，并接近原生的功能和性能。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
  */
@js.native
trait Plus extends StObject {
  
  /**
    * Accelerometer模块管理设备加速度传感器，用于获取设备加速度信息，包括x（屏幕水平方向）、y（垂直屏幕水平方向）、z（垂直屏幕平面方向）三个方向的加速度信息。通过plus.accelerometer获取设备加速度传感器管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var accelerometer: PlusAccelerometer = js.native
  
  /**
    * Native.js for Android封装一条通过JS语法直接调用Native Java接口通道，通过plus.android可调用几乎所有的系统API。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  var android: PlusAndroid = js.native
  
  /**
    * Audio模块用于提供音频的录制和播放功能，可调用系统的麦克风设备进行录音操作，也可调用系统的扬声器设备播放音频文件。通过plus.audio获取音频管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  var audio: PlusAudio = js.native
  
  /**
    * Barcode模块管理条码扫描，支持常见的条码（一维码及二维码）的扫描识别功能。可调用设备的摄像头对条码图片扫描进行数据输入，解码后返回码数据及码类型。通过plus.barcode可获取条码码管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var barcode: PlusBarcode = js.native
  
  /**
    * Bluetooth模块用于管理蓝牙设备，搜索附近蓝牙设备、连接实现数据通信等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var bluetooth: PlusBluetooth = js.native
  
  /**
    * Camera模块管理设备的摄像头，可用于拍照、摄像操作，通过plus.camera获取摄像头管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/camera.html](http://www.html5plus.org/doc/zh_cn/camera.html)
    */
  var camera: PlusCamera = js.native
  
  /**
    * Contacts模块管理系统通讯录，用于可对系统通讯录进行增、删、改、查等操作。通过plus.contacts获取系统通讯录管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var contacts: PlusContacts = js.native
  
  /**
    * Device模块管理设备信息，用于获取手机设备的相关信息，如IMEI、IMSI、型号、厂商等。通过plus.device获取设备信息管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var device: PlusDevice = js.native
  
  /**
    * Display模块管理应用可使用的显示区域信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var display: PlusDisplay = js.native
  
  /**
    * Downloader模块管理网络文件下载任务，用于从服务器下载各种文件，并支持跨域访问操作。通过plus.downloader获取下载管理对象。Downloader下载使用HTTP的GET/POST方式请求下载文件，符合标准HTTP/HTTPS传输协议。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var downloader: PlusDownloader = js.native
  
  /**
    * Fingerprint模块管理指纹识别。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var fingerprint: PlusFingerprint = js.native
  
  /**
    * Gallery模块管理系统相册，支持从相册中选择图片或视频文件、保存图片或视频文件到相册等功能。通过plus.gallery获取相册管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var gallery: PlusGallery = js.native
  
  /**
    * Geolocation模块管理设备位置信息，用于获取地理位置信息，如经度、纬度等。通过plus.geolocation可获取设备位置管理对象。虽然W3C已经提供标准API获取位置信息，但在某些平台存在差异或未实现，为了保持各平台的统一性，定义此规范接口获取位置信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var geolocation: PlusGeolocation = js.native
  
  /**
    * iBeacon模块用于搜索附件的iBeacon设备（*请使用HBuilderX并更新到最新版本*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var ibeacon: PlusIbeacon = js.native
  
  /**
    * IO模块管理本地文件系统，用于对文件系统的目录浏览、文件的读取、文件的写入等操作。通过plus.io可获取文件系统管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var io: PlusIo = js.native
  
  /**
    * Native.js for iOS封装一条通过JS语法直接调用Native Objective-C接口通道，通过plus.ios可调用几乎所有的系统API。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  var ios: PlusIos = js.native
  
  /**
    * Key管理设备按键事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var key: PlusKey = js.native
  
  /**
    * Maps模块管理地图控件，用于在web页面中显示地图控件，提供各种接口操作地图控件，如添加标点、路线等。通过plus.maps可获取地图管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var maps: PlusMaps = js.native
  
  /**
    * Messaging模块管理设备通讯功能，可用于短信、彩信、邮件发送等。通过plus.messaging可获取设备通讯管理对象。另外也可以直接通过html中的href直接快速发送短信、拨打电话、发送邮件等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var messaging: PlusMessaging = js.native
  
  /**
    * nativeObj管理系统原生对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var nativeObj: PlusNativeObj = js.native
  
  /**
    * nativeUI管理系统原生界面，可用于弹出系统原生提示对话框窗口、时间日期选择对话框、等待对话框等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var nativeUI: PlusNativeUI = js.native
  
  /**
    * navigator用于管理浏览器运行环境信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var navigator: PlusNavigator = js.native
  
  /**
    * XMLHttpRequest模块管理网络请求，与标准HTML中的XMLHttpRequest用途一致，差别在于前者可以进行跨域访问。通过plus.net可获取网络请求管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var net: PlusNet = js.native
  
  /**
    * networkinfo模块用于获取网络信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var networkinfo: PlusNetworkinfo = js.native
  
  /**
    * OAuth模块管理客户端的用户登录授权验证功能，允许应用访问第三方平台的资源。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var oauth: PlusOauth = js.native
  
  /**
    * Orientation模块管理设备的方向信息，包括alpha、beta、gamma三个方向信息，通过plus.orientation可获取设备方向管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var orientation: PlusOrientation = js.native
  
  /**
    * OS模块管理操作系统信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var os: PlusOs = js.native
  
  /**
    * Payment模块管理支付功能，用于提供网页安全支付能力，支持通过Web接口进行支付操作。通过plus.payment可获取支付管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var payment: PlusPayment = js.native
  
  /**
    * Proximity模块管理设备距离传感器，可获取当前设备的接近距离信息，通过plus.proximity可获取设备距离传感管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/proximity.html](http://www.html5plus.org/doc/zh_cn/proximity.html)
    */
  var proximity: PlusProximity = js.native
  
  /**
    * Push模块管理推送消息功能，可以实现在线、离线的消息推送，通过plus.push可获取推送消息管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var push: PlusPush = js.native
  
  /**
    * Runtime模块管理运行环境，可用于获取当前运行环境信息、与其它程序进行通讯等。通过plus.runtime可获取运行环境管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var runtime: PlusRuntime = js.native
  
  /**
    * Screen模块管理设备屏幕信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var screen: PlusScreen = js.native
  
  /**
    * Share模块管理客户端的社交分享功能，提供调用终端社交软件的分享能力。通过plus.share可获取社交分享管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var share: PlusShare = js.native
  
  /**
    * Speech模块管理语音输入功能，提供语音识别功能，可支持用户通过麦克风设备进行语音输入内容。通过plus.speech可获取语音输入管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/speech.html](http://www.html5plus.org/doc/zh_cn/speech.html)
    */
  var speech: PlusSpeech = js.native
  
  /**
    * Statistic模块管理统计功能，用于提供应用内统计的能力，支持统计和分析用户属性和用户行为数据。通过plus.statistic可获取统计管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/statistic.html](http://www.html5plus.org/doc/zh_cn/statistic.html)
    */
  var statistic: PlusStatistic = js.native
  
  /**
    * Storage模块管理应用本地数据存储区，用于应用数据的保存和读取。应用本地数据与localStorage、sessionStorage的区别在于数据有效域不同，前者可在应用内跨域操作，数据存储期是持久化的，并且没有容量限制。通过plus.storage可获取应用本地数据管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  var storage: PlusStorage = js.native
  
  /**
    * Stream模块操作流应用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var stream: PlusStream = js.native
  
  /**
    * Uploader模块管理网络上传任务，用于从本地上传各种文件到服务器，并支持跨域访问操作。通过plus.uploader可获取上传管理对象。Uploader上传使用HTTP的POST方式提交数据，数据格式符合Multipart/form-data规范，即rfc1867（Form-based File Upload in HTML）协议。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var uploader: PlusUploader = js.native
  
  /**
    * Video模块管理多媒体视频相关能力，可用创建视频播放控件，直播推流控件等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var video: PlusVideo = js.native
  
  /**
    * Webview模块管理应用窗口界面，实现多窗口的逻辑控制管理操作。通过plus.webview可获取应用界面管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var webview: PlusWebview = js.native
  
  /**
    * Zip模块管理文件压缩和解压，通过plus.zip可获取压缩管理对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var zip: PlusZip = js.native
}
object Plus {
  
  @scala.inline
  def apply(
    accelerometer: PlusAccelerometer,
    android: PlusAndroid,
    audio: PlusAudio,
    barcode: PlusBarcode,
    bluetooth: PlusBluetooth,
    camera: PlusCamera,
    contacts: PlusContacts,
    device: PlusDevice,
    display: PlusDisplay,
    downloader: PlusDownloader,
    fingerprint: PlusFingerprint,
    gallery: PlusGallery,
    geolocation: PlusGeolocation,
    ibeacon: PlusIbeacon,
    io: PlusIo,
    ios: PlusIos,
    key: PlusKey,
    maps: PlusMaps,
    messaging: PlusMessaging,
    nativeObj: PlusNativeObj,
    nativeUI: PlusNativeUI,
    navigator: PlusNavigator,
    net: PlusNet,
    networkinfo: PlusNetworkinfo,
    oauth: PlusOauth,
    orientation: PlusOrientation,
    os: PlusOs,
    payment: PlusPayment,
    proximity: PlusProximity,
    push: PlusPush,
    runtime: PlusRuntime,
    screen: PlusScreen,
    share: PlusShare,
    speech: PlusSpeech,
    statistic: PlusStatistic,
    storage: PlusStorage,
    stream: PlusStream,
    uploader: PlusUploader,
    video: PlusVideo,
    webview: PlusWebview,
    zip: PlusZip
  ): Plus = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], barcode = barcode.asInstanceOf[js.Any], bluetooth = bluetooth.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], downloader = downloader.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], gallery = gallery.asInstanceOf[js.Any], geolocation = geolocation.asInstanceOf[js.Any], ibeacon = ibeacon.asInstanceOf[js.Any], io = io.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], messaging = messaging.asInstanceOf[js.Any], nativeObj = nativeObj.asInstanceOf[js.Any], nativeUI = nativeUI.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], networkinfo = networkinfo.asInstanceOf[js.Any], oauth = oauth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plus]
  }
  
  @scala.inline
  implicit class PlusMutableBuilder[Self <: Plus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerometer(value: PlusAccelerometer): Self = StObject.set(x, "accelerometer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid(value: PlusAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio(value: PlusAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarcode(value: PlusBarcode): Self = StObject.set(x, "barcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetooth(value: PlusBluetooth): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: PlusCamera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContacts(value: PlusContacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: PlusDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: PlusDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloader(value: PlusDownloader): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: PlusFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGallery(value: PlusGallery): Self = StObject.set(x, "gallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeolocation(value: PlusGeolocation): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIbeacon(value: PlusIbeacon): Self = StObject.set(x, "ibeacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIo(value: PlusIo): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: PlusIos): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: PlusKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaps(value: PlusMaps): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessaging(value: PlusMessaging): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeObj(value: PlusNativeObj): Self = StObject.set(x, "nativeObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeUI(value: PlusNativeUI): Self = StObject.set(x, "nativeUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigator(value: PlusNavigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNet(value: PlusNet): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkinfo(value: PlusNetworkinfo): Self = StObject.set(x, "networkinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth(value: PlusOauth): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: PlusOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: PlusOs): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment(value: PlusPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximity(value: PlusProximity): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: PlusPush): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: PlusRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: PlusScreen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: PlusShare): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeech(value: PlusSpeech): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistic(value: PlusStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: PlusStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: PlusStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader(value: PlusUploader): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: PlusVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebview(value: PlusWebview): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZip(value: PlusZip): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
  }
}
