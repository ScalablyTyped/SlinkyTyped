package typingsSlinky.googleGax.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.descriptorMod.LongrunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptors extends js.Object {
  var batching: js.UndefOr[StringDictionary[typingsSlinky.googleGax.descriptorMod.BundleDescriptor]] = js.undefined
  var longrunning: StringDictionary[LongrunningDescriptor]
  var page: StringDictionary[typingsSlinky.googleGax.descriptorMod.PageDescriptor]
  var stream: StringDictionary[typingsSlinky.googleGax.descriptorMod.StreamDescriptor]
}

object Descriptors {
  @scala.inline
  def apply(
    longrunning: StringDictionary[LongrunningDescriptor],
    page: StringDictionary[typingsSlinky.googleGax.descriptorMod.PageDescriptor],
    stream: StringDictionary[typingsSlinky.googleGax.descriptorMod.StreamDescriptor],
    batching: StringDictionary[typingsSlinky.googleGax.descriptorMod.BundleDescriptor] = null
  ): Descriptors = {
    val __obj = js.Dynamic.literal(longrunning = longrunning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    if (batching != null) __obj.updateDynamic("batching")(batching.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors]
  }
}

