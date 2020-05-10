package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slide layout reference. This may reference either:  - A predefined layout -
  * One of the layouts in the presentation.
  */
@js.native
trait SchemaLayoutReference extends js.Object {
  /**
    * Layout ID: the object ID of one of the layouts in the presentation.
    */
  var layoutId: js.UndefOr[String] = js.native
  /**
    * Predefined layout.
    */
  var predefinedLayout: js.UndefOr[String] = js.native
}

object SchemaLayoutReference {
  @scala.inline
  def apply(): SchemaLayoutReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutReference]
  }
  @scala.inline
  implicit class SchemaLayoutReferenceOps[Self <: SchemaLayoutReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutId")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedLayout")(js.undefined)
        ret
    }
  }
  
}

