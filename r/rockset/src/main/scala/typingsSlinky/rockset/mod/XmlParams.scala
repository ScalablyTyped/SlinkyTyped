package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlParams extends js.Object {
  // tag to differentiate between attributes and elements
  var attribute_prefix: js.UndefOr[String] = js.native
  // tags with which documents are identified
  var doc_tag: js.UndefOr[String] = js.native
  // encoding in which data source is encoded
  var encoding: js.UndefOr[String] = js.native
  // tag until which xml is ignored
  var root_tag: js.UndefOr[String] = js.native
  // tag used for the value when there are attributes in the element having no child
  var value_tag: js.UndefOr[String] = js.native
}

object XmlParams {
  @scala.inline
  def apply(): XmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlParams]
  }
  @scala.inline
  implicit class XmlParamsOps[Self <: XmlParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
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
    def withRoot_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withValue_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_tag")(js.undefined)
        ret
    }
  }
  
}

