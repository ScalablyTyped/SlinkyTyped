package typingsSlinky.needle.mod.core

import typingsSlinky.needle.needleStrings.json
import typingsSlinky.needle.needleStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseOptions extends js.Object {
  /**
    * Alias for decode_response
    */
  var decode: js.UndefOr[Boolean] = js.native
  /**
    * Whether to decode the text responses to UTF-8,
    * if Content-Type header shows a different charset. Defaults to true.
    */
  var decode_response: js.UndefOr[Boolean] = js.native
  /**
    * Dump response output to file.
    * This occurs after parsing and charset decoding is done.
    */
  var output: js.UndefOr[String] = js.native
  /**
    * Alias for parse_response
    */
  var parse: js.UndefOr[Boolean | json | xml] = js.native
  /**
    * Whether to parse response’s Set-Cookie header.
    * Defaults to true.
    * If parsed, response cookies will be available at resp.cookies.
    */
  var parse_cookies: js.UndefOr[Boolean] = js.native
  /**
    * Whether to parse XML or JSON response bodies automagically.
    * Defaults to true.
    * You can also set this to 'xml' or 'json' in which case Needle
    * will only parse the response if the content type matches.
    */
  var parse_response: js.UndefOr[Boolean | json | xml] = js.native
}

object ResponseOptions {
  @scala.inline
  def apply(): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseOptions]
  }
  @scala.inline
  implicit class ResponseOptionsOps[Self <: ResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.undefined)
        ret
    }
    @scala.inline
    def withDecode_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecode_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode_response")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: Boolean | json | xml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withParse_cookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse_cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse_cookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse_cookies")(js.undefined)
        ret
    }
    @scala.inline
    def withParse_response(value: Boolean | json | xml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse_response")(js.undefined)
        ret
    }
  }
  
}

