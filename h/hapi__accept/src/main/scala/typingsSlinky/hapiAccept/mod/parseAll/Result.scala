package typingsSlinky.hapiAccept.mod.parseAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var charsets: js.Array[String] = js.native
  var encodings: js.Array[String] = js.native
  var languages: js.Array[String] = js.native
  var mediaTypes: js.Array[String] = js.native
}

object Result {
  @scala.inline
  def apply(
    charsets: js.Array[String],
    encodings: js.Array[String],
    languages: js.Array[String],
    mediaTypes: js.Array[String]
  ): Result = {
    val __obj = js.Dynamic.literal(charsets = charsets.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], mediaTypes = mediaTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharsets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

