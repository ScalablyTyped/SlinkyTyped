package typingsSlinky.htmlparser2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  /***
    * If set to true, entities within the document will be decoded. Defaults to false.
    */
  var decodeEntities: js.UndefOr[Boolean] = js.native
  /***
    * If set to true, all attribute names will be lowercased. This has noticeable impact on speed, so it defaults to false.
    */
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.native
  /***
    * If set to true, all tags will be lowercased. If xmlMode is disabled, this defaults to true.
    */
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  /***
    * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
    * NOTE: If xmlMode is set to true then CDATA sections will always be recognized as text.
    */
  var recognizeCDATA: js.UndefOr[Boolean] = js.native
  /***
    * If set to true, self-closing tags will trigger the onclosetag event even if xmlMode is not set to true.
    * NOTE: If xmlMode is set to true then self-closing tags will always be recognized.
    */
  var recognizeSelfClosing: js.UndefOr[Boolean] = js.native
  /***
    * Indicates whether special tags (<script> and <style>) should get special treatment
    * and if "empty" tags (eg. <br>) can have children.  If false, the content of special tags
    * will be text only. For feeds and other XML content (documents that don't consist of HTML),
    * set this to true. Default: false.
    */
  var xmlMode: js.UndefOr[Boolean] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodeEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCaseAttributeNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCaseAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCaseTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCaseTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizeCDATA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeCDATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizeCDATA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeCDATA")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizeSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeSelfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizeSelfClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeSelfClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlMode")(js.undefined)
        ret
    }
  }
  
}

