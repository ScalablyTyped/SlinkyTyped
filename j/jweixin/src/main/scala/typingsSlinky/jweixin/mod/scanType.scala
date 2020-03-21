package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================界面操作================================*/
/*=============================微信扫一扫================================*/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jweixin.jweixinStrings.qrCode
  - typingsSlinky.jweixin.jweixinStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typingsSlinky.jweixin.jweixinStrings.barCode = this.cast("barCode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qrCode: typingsSlinky.jweixin.jweixinStrings.qrCode = this.cast("qrCode")
}

