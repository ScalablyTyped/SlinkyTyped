package typingsSlinky.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotateStringOptions extends js.Object {
  var includeAnnotationIndices: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
}

object AnnotateStringOptions {
  @scala.inline
  def apply(): AnnotateStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateStringOptions]
  }
  @scala.inline
  implicit class AnnotateStringOptionsOps[Self <: AnnotateStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

