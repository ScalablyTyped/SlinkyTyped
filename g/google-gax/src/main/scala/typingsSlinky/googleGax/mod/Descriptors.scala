package typingsSlinky.googleGax.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.descriptorMod.LongrunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptors extends js.Object {
  var batching: js.UndefOr[StringDictionary[typingsSlinky.googleGax.descriptorMod.BundleDescriptor]] = js.native
  var longrunning: StringDictionary[LongrunningDescriptor] = js.native
  var page: StringDictionary[typingsSlinky.googleGax.descriptorMod.PageDescriptor] = js.native
  var stream: StringDictionary[typingsSlinky.googleGax.descriptorMod.StreamDescriptor] = js.native
}

object Descriptors {
  @scala.inline
  def apply(
    longrunning: StringDictionary[LongrunningDescriptor],
    page: StringDictionary[typingsSlinky.googleGax.descriptorMod.PageDescriptor],
    stream: StringDictionary[typingsSlinky.googleGax.descriptorMod.StreamDescriptor]
  ): Descriptors = {
    val __obj = js.Dynamic.literal(longrunning = longrunning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors]
  }
  @scala.inline
  implicit class DescriptorsOps[Self <: Descriptors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongrunning(value: StringDictionary[LongrunningDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longrunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: StringDictionary[typingsSlinky.googleGax.descriptorMod.PageDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: StringDictionary[typingsSlinky.googleGax.descriptorMod.StreamDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatching(value: StringDictionary[typingsSlinky.googleGax.descriptorMod.BundleDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batching")(js.undefined)
        ret
    }
  }
  
}

