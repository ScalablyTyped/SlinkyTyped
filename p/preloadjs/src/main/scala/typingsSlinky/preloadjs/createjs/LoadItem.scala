package typingsSlinky.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadItem extends js.Object {
  // properties
  var callback: String = js.native
  var crossOrigin: Boolean = js.native
  var data: js.Object = js.native
  var headers: js.Object = js.native
  var id: String = js.native
  var loadTimeout: Double = js.native
  var maintainOrder: Boolean = js.native
  var method: String = js.native
  var mimeType: String = js.native
  var src: String = js.native
  var `type`: String = js.native
  var values: js.Object = js.native
  var withCredentials: Boolean = js.native
  def set(props: js.Object): LoadItem = js.native
}

object LoadItem {
  @scala.inline
  def apply(
    callback: String,
    crossOrigin: Boolean,
    data: js.Object,
    headers: js.Object,
    id: String,
    loadTimeout: Double,
    maintainOrder: Boolean,
    method: String,
    mimeType: String,
    set: js.Object => LoadItem,
    src: String,
    `type`: String,
    values: js.Object,
    withCredentials: Boolean
  ): LoadItem = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], crossOrigin = crossOrigin.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadTimeout = loadTimeout.asInstanceOf[js.Any], maintainOrder = maintainOrder.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadItem]
  }
  @scala.inline
  implicit class LoadItemOps[Self <: LoadItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Object => LoadItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

