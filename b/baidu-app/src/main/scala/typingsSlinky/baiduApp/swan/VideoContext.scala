package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Color
import typingsSlinky.baiduApp.baiduAppNumbers.`0.5`
import typingsSlinky.baiduApp.baiduAppNumbers.`0.8`
import typingsSlinky.baiduApp.baiduAppNumbers.`1.0`
import typingsSlinky.baiduApp.baiduAppNumbers.`1.25`
import typingsSlinky.baiduApp.baiduAppNumbers.`1.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----视频组件控制
@js.native
trait VideoContext extends StObject {
  
  // 进入全屏;
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit = js.native
  
  // 显示状态栏，仅在iOS全屏下有效;
  /**
    * 隐藏状态栏，仅在iOS全屏下有效
    */
  def hideStatusBar(): Unit = js.native
  
  /**
    * 暂停
    */
  def pause(): Unit = js.native
  
  /**
    * 播放
    */
  def play(): Unit = js.native
  
  /**
    *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  @JSName("playbackRate")
  def playbackRate_05(rate: `0.5`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_08(rate: `0.8`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_10(rate: `1.0`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_125(rate: `1.25`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_15(rate: `1.5`): Unit = js.native
  
  /**
    *  进入全屏
    */
  def requestFullScreen(): Unit = js.native
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(position: Double): Unit = js.native
  
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(danmu: Color): Unit = js.native
  
  // 退出全屏;
  /**
    * 显示状态栏，仅在iOS全屏下有效
    */
  def showStatusBar(): Unit = js.native
}
