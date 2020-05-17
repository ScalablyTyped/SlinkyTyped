package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.anon.SrcString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestBodyDefinition extends PropertyBaseDefinition {
  var file: js.UndefOr[String | SrcString] = js.native
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.native
  var mode: String = js.native
  var raw: js.UndefOr[String] = js.native
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
}

object RequestBodyDefinition {
  @scala.inline
  def apply(mode: String): RequestBodyDefinition = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyDefinition]
  }
  @scala.inline
  implicit class RequestBodyDefinitionOps[Self <: RequestBodyDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: String | SrcString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFormdata(value: js.Array[FormParamDefinition] | PropertyList[FormParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formdata")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlencoded(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlencoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(js.undefined)
        ret
    }
  }
  
}

