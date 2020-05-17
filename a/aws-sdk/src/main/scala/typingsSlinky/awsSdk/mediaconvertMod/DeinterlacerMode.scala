package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEINTERLACE
  - typingsSlinky.awsSdk.awsSdkStrings.INVERSE_TELECINE
  - typingsSlinky.awsSdk.awsSdkStrings.ADAPTIVE
  - java.lang.String
*/
trait DeinterlacerMode extends js.Object

object DeinterlacerMode {
  @scala.inline
  def DEINTERLACE: typingsSlinky.awsSdk.awsSdkStrings.DEINTERLACE = "DEINTERLACE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEINTERLACE]
  @scala.inline
  def INVERSE_TELECINE: typingsSlinky.awsSdk.awsSdkStrings.INVERSE_TELECINE = "INVERSE_TELECINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INVERSE_TELECINE]
  @scala.inline
  def ADAPTIVE: typingsSlinky.awsSdk.awsSdkStrings.ADAPTIVE = "ADAPTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ADAPTIVE]
  @scala.inline
  implicit def apply(value: String): DeinterlacerMode = value.asInstanceOf[DeinterlacerMode]
}

