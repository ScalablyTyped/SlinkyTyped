package typingsSlinky.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmdurl extends js.Object {
  val decode: Typeofdecode = js.native
  val encode: Typeofencode = js.native
  val format: Typeofformat = js.native
  val parse: Typeofparse = js.native
}

object Typeofmdurl {
  @scala.inline
  def apply(decode: Typeofdecode, encode: Typeofencode, format: Typeofformat, parse: Typeofparse): Typeofmdurl = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmdurl]
  }
  @scala.inline
  implicit class TypeofmdurlOps[Self <: Typeofmdurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: Typeofdecode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncode(value: Typeofencode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: Typeofformat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: Typeofparse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

