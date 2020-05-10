package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the body of a document or a section.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait BodyLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an error if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Returns a null object if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBodyOrNullObject: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the body. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the body. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the parent section of the body. Throws an error if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.native
  /**
    *
    * Gets the parent section of the body. Returns a null object if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSectionOrNullObject: js.UndefOr[SectionLoadOptions] = js.native
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

object BodyLoadOptions {
  @scala.inline
  def apply(): BodyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyLoadOptions]
  }
  @scala.inline
  implicit class BodyLoadOptionsOps[Self <: BodyLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withParentBody(value: BodyLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBody")(js.undefined)
        ret
    }
    @scala.inline
    def withParentBodyOrNullObject(value: BodyLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBodyOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentBodyOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBodyOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withParentContentControl(value: ContentControlLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentContentControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControl")(js.undefined)
        ret
    }
    @scala.inline
    def withParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControlOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentContentControlOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContentControlOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSection(value: SectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSection")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSectionOrNullObject(value: SectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSectionOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSectionOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSectionOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBuiltIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBuiltIn")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

