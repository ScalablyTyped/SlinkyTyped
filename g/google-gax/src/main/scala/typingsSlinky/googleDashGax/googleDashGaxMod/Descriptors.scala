package typingsSlinky.googleDashGax.googleDashGaxMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleDashGax.buildSrcDescriptorMod.LongrunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptors extends js.Object {
  var longrunning: StringDictionary[LongrunningDescriptor]
  var page: StringDictionary[typingsSlinky.googleDashGax.buildSrcDescriptorMod.PageDescriptor]
  var stream: StringDictionary[typingsSlinky.googleDashGax.buildSrcDescriptorMod.StreamDescriptor]
}

object Descriptors {
  @scala.inline
  def apply(
    longrunning: StringDictionary[LongrunningDescriptor],
    page: StringDictionary[typingsSlinky.googleDashGax.buildSrcDescriptorMod.PageDescriptor],
    stream: StringDictionary[typingsSlinky.googleDashGax.buildSrcDescriptorMod.StreamDescriptor]
  ): Descriptors = {
    val __obj = js.Dynamic.literal(longrunning = longrunning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Descriptors]
  }
}

