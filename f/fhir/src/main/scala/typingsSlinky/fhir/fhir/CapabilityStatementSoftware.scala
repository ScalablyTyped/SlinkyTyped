package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Software that is covered by this capability statement
  */
@js.native
trait CapabilityStatementSoftware extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'releaseDate'.
    */
  var _releaseDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * A name the software is known by
    */
  var name: String = js.native
  /**
    * Date this version released
    */
  var releaseDate: js.UndefOr[dateTime] = js.native
  /**
    * Version covered by this statement
    */
  var version: js.UndefOr[String] = js.native
}

object CapabilityStatementSoftware {
  @scala.inline
  def apply(name: String): CapabilityStatementSoftware = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementSoftware]
  }
  @scala.inline
  implicit class CapabilityStatementSoftwareOps[Self <: CapabilityStatementSoftware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def with_releaseDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_releaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_releaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_version(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

