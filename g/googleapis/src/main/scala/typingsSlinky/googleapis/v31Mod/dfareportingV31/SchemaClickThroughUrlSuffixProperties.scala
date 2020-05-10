package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Click Through URL Suffix settings.
  */
@js.native
trait SchemaClickThroughUrlSuffixProperties extends js.Object {
  /**
    * Click-through URL suffix to apply to all ads in this entity&#39;s scope.
    * Must be less than 128 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  /**
    * Whether this entity should override the inherited click-through URL
    * suffix with its own defined value.
    */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.native
}

object SchemaClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(): SchemaClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickThroughUrlSuffixProperties]
  }
  @scala.inline
  implicit class SchemaClickThroughUrlSuffixPropertiesOps[Self <: SchemaClickThroughUrlSuffixProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThroughUrlSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrlSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideInheritedSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideInheritedSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInheritedSuffix")(js.undefined)
        ret
    }
  }
  
}

