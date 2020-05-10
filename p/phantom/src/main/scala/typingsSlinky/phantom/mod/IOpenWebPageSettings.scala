package typingsSlinky.phantom.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phantom.phantomStrings.DELETE
import typingsSlinky.phantom.phantomStrings.GET
import typingsSlinky.phantom.phantomStrings.HEAD
import typingsSlinky.phantom.phantomStrings.POST
import typingsSlinky.phantom.phantomStrings.PUT
import typingsSlinky.phantom.phantomStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpenWebPageSettings extends js.Object {
  var data: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[utf8 | String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var operation: js.UndefOr[GET | POST | HEAD | DELETE | PUT | String] = js.native
}

object IOpenWebPageSettings {
  @scala.inline
  def apply(): IOpenWebPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenWebPageSettings]
  }
  @scala.inline
  implicit class IOpenWebPageSettingsOps[Self <: IOpenWebPageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: utf8 | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: GET | POST | HEAD | DELETE | PUT | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
  }
  
}

