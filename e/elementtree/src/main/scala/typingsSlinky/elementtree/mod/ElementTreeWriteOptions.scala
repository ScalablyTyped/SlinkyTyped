package typingsSlinky.elementtree.mod

import typingsSlinky.elementtree.elementtreeStrings.text
import typingsSlinky.elementtree.elementtreeStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementTreeWriteOptions extends js.Object {
  var default_namespace: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
   // default is 'utf-8'
  var indent: js.UndefOr[Double] = js.native
  var method: js.UndefOr[xml | text] = js.native
   // default is 'xml'
  var xml_declaration: js.UndefOr[Boolean] = js.native
}

object ElementTreeWriteOptions {
  @scala.inline
  def apply(): ElementTreeWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementTreeWriteOptions]
  }
  @scala.inline
  implicit class ElementTreeWriteOptionsOps[Self <: ElementTreeWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_namespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_namespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_namespace")(js.undefined)
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
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: xml | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withXml_declaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml_declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXml_declaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml_declaration")(js.undefined)
        ret
    }
  }
  
}

