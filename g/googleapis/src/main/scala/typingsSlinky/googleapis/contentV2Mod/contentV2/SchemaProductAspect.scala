package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductAspect extends js.Object {
  /**
    * The name of the aspect.
    */
  var aspectName: js.UndefOr[String] = js.native
  /**
    * The name of the destination. Leave out to apply to all destinations.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Whether the aspect is required, excluded or should be validated.
    */
  var intention: js.UndefOr[String] = js.native
}

object SchemaProductAspect {
  @scala.inline
  def apply(): SchemaProductAspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAspect]
  }
  @scala.inline
  implicit class SchemaProductAspectOps[Self <: SchemaProductAspect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectName")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(js.undefined)
        ret
    }
    @scala.inline
    def withIntention(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intention")(js.undefined)
        ret
    }
  }
  
}

