package typingsSlinky.jointjs.mod.Vectorizer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  var annotations: js.UndefOr[js.Array[TextAnnotation]] = js.native
  var displayEmpty: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var includeAnnotationIndices: js.UndefOr[Boolean] = js.native
  var lineHeight: js.UndefOr[Double | String] = js.native
  var textPath: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  var textVerticalAnchor: js.UndefOr[TextVerticalAnchor | Double | String] = js.native
  var x: js.UndefOr[Double | String] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Array[TextAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAnnotationIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAnnotationIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAnnotationIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAnnotationIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPath(value: String | StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTextVerticalAnchor(value: TextVerticalAnchor | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textVerticalAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextVerticalAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textVerticalAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
  }
  
}

