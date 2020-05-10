package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of inheriting and overriding the default click-through event
  * tag. A campaign may override the event tag defined at the advertiser level,
  * and an ad may also override the campaign&#39;s setting further.
  */
@js.native
trait SchemaDefaultClickThroughEventTagProperties extends js.Object {
  /**
    * ID of the click-through event tag to apply to all ads in this
    * entity&#39;s scope.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  /**
    * Whether this entity should override the inherited default click-through
    * event tag with its own defined value.
    */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.native
}

object SchemaDefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(): SchemaDefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultClickThroughEventTagProperties]
  }
  @scala.inline
  implicit class SchemaDefaultClickThroughEventTagPropertiesOps[Self <: SchemaDefaultClickThroughEventTagProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultClickThroughEventTagId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClickThroughEventTagId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagId")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideInheritedEventTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedEventTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideInheritedEventTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedEventTag")(js.undefined)
        ret
    }
  }
  
}

