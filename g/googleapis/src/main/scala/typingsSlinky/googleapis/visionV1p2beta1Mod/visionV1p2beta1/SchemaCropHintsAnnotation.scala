package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaCropHintsAnnotation extends js.Object {
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaCropHint]] = js.native
}

object SchemaCropHintsAnnotation {
  @scala.inline
  def apply(): SchemaCropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropHintsAnnotation]
  }
  @scala.inline
  implicit class SchemaCropHintsAnnotationOps[Self <: SchemaCropHintsAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropHints(value: js.Array[SchemaCropHint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHints")(js.undefined)
        ret
    }
  }
  
}

