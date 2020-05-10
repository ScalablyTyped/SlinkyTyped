package typingsSlinky.javascriptObfuscator.istringarrayindexdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStringArrayIndexData extends js.Object {
  var fromCache: Boolean = js.native
  var index: String = js.native
}

object IStringArrayIndexData {
  @scala.inline
  def apply(fromCache: Boolean, index: String): IStringArrayIndexData = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringArrayIndexData]
  }
  @scala.inline
  implicit class IStringArrayIndexDataOps[Self <: IStringArrayIndexData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

