package typingsSlinky.googleDashGax.buildSrcDescriptorMod

import typingsSlinky.googleDashGax.buildSrcApiCallerMod.APICaller
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  def getApiCaller(settings: CallSettings): APICaller
}

object Descriptor {
  @scala.inline
  def apply(getApiCaller: CallSettings => APICaller): Descriptor = {
    val __obj = js.Dynamic.literal(getApiCaller = js.Any.fromFunction1(getApiCaller))
  
    __obj.asInstanceOf[Descriptor]
  }
}

