package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text node with attribution
  */
@js.native
trait Annotation extends Element {
  /**
    * Contains extended information for property 'authorString'.
    */
  var _authorString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.native
  /**
    * Individual responsible for the annotation
    */
  var authorReference: js.UndefOr[Reference] = js.native
  /**
    * Individual responsible for the annotation
    */
  var authorString: js.UndefOr[String] = js.native
  /**
    * The annotation  - text content
    */
  var text: String = js.native
  /**
    * When the annotation was made
    */
  var time: js.UndefOr[dateTime] = js.native
}

object Annotation {
  @scala.inline
  def apply(text: String): Annotation = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_authorString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authorString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_authorString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authorString")(js.undefined)
        ret
    }
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def with_time(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_time")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorReference")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorString")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

