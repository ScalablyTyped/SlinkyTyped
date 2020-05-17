package typingsSlinky.mithril.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mithril.mithril.JsonpOptions & {  url  :string} */
@js.native
trait JsonpOptionsurlstring extends js.Object {
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.native
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[js.Any] = js.native
  /** The name of the querystring parameter name that specifies the callback name. */
  var callbackKey: js.UndefOr[String] = js.native
  /** The name of the function that will be called as the callback. */
  var callbackName: js.UndefOr[String] = js.native
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.native
  var url: String = js.native
}

object JsonpOptionsurlstring {
  @scala.inline
  def apply(url: String): JsonpOptionsurlstring = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpOptionsurlstring]
  }
  @scala.inline
  implicit class JsonpOptionsurlstringOps[Self <: JsonpOptionsurlstring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackName")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Instantiable1[/* o */ js.Any, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

