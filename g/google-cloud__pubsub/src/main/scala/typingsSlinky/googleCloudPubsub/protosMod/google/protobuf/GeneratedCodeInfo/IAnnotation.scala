package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.GeneratedCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Annotation. */
@js.native
trait IAnnotation extends js.Object {
  /** Annotation begin */
  var begin: js.UndefOr[Double | Null] = js.native
  /** Annotation end */
  var end: js.UndefOr[Double | Null] = js.native
  /** Annotation path */
  var path: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Annotation sourceFile */
  var sourceFile: js.UndefOr[String | Null] = js.native
}

object IAnnotation {
  @scala.inline
  def apply(): IAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnnotation]
  }
  @scala.inline
  implicit class IAnnotationOps[Self <: IAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(null)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(null)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(null)
        ret
    }
    @scala.inline
    def withSourceFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(null)
        ret
    }
  }
  
}

