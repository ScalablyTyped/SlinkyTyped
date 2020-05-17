package typingsSlinky.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.heremaps.anon.Context
import typingsSlinky.heremaps.anon.Isolines
import typingsSlinky.heremaps.anon.Items
import typingsSlinky.heremaps.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
@js.native
trait ServiceResult
  extends /* key */ StringDictionary[js.Any] {
  var Response: js.UndefOr[Isolines] = js.native
  var response: js.UndefOr[Language] = js.native
  var results: js.UndefOr[Items] = js.native
  var search: js.UndefOr[Context] = js.native
}

object ServiceResult {
  @scala.inline
  def apply(): ServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceResult]
  }
  @scala.inline
  implicit class ServiceResultOps[Self <: ServiceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse(value: Isolines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Items): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}

