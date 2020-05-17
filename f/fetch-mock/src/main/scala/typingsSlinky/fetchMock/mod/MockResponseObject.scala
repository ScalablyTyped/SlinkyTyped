package typingsSlinky.fetchMock.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock response object
  */
@js.native
trait MockResponseObject extends MockResponse {
  /**
    * Set the response body
    */
  var body: js.UndefOr[String | js.Object] = js.native
  /**
    * Set the response headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The URL the response should be from (to imitate followed redirects
    *  - will set redirected: true on the response)
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * Set the response status
    * @default 200
    */
  var status: js.UndefOr[Double] = js.native
  /**
    * If this property is present then a Promise rejected with the value
    * of throws is returned
    */
  var throws: js.UndefOr[js.Error] = js.native
}

object MockResponseObject {
  @scala.inline
  def apply(): MockResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockResponseObject]
  }
  @scala.inline
  implicit class MockResponseObjectOps[Self <: MockResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String | js.Object): Self = {
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
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withThrows(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throws")(js.undefined)
        ret
    }
  }
  
}

