package typingsSlinky.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Support extends js.Object {
  var air: Boolean = js.native
  var argumentsClass: Boolean = js.native
  var browser: Boolean = js.native
  var charByIndex: Boolean = js.native
  var charByOwnIndex: Boolean = js.native
  var decompilation: Boolean = js.native
  var descriptors: Boolean = js.native
  var getAllKeys: Boolean = js.native
  var iteratesOwnFirst: Boolean = js.native
  @JSName("java")
  var java_ : Boolean = js.native
  var nodeClass: Boolean = js.native
  var timeout: Boolean = js.native
}

object Support {
  @scala.inline
  def apply(
    air: Boolean,
    argumentsClass: Boolean,
    browser: Boolean,
    charByIndex: Boolean,
    charByOwnIndex: Boolean,
    decompilation: Boolean,
    descriptors: Boolean,
    getAllKeys: Boolean,
    iteratesOwnFirst: Boolean,
    java_ : Boolean,
    nodeClass: Boolean,
    timeout: Boolean
  ): Support = {
    val __obj = js.Dynamic.literal(air = air.asInstanceOf[js.Any], argumentsClass = argumentsClass.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], charByIndex = charByIndex.asInstanceOf[js.Any], charByOwnIndex = charByOwnIndex.asInstanceOf[js.Any], decompilation = decompilation.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getAllKeys = getAllKeys.asInstanceOf[js.Any], iteratesOwnFirst = iteratesOwnFirst.asInstanceOf[js.Any], nodeClass = nodeClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  @scala.inline
  implicit class SupportOps[Self <: Support] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("air")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgumentsClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharByIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charByIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharByOwnIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charByOwnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecompilation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompilation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAllKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIteratesOwnFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteratesOwnFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJava_(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("java")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

