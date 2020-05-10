package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Container Version Header.
  */
@js.native
trait SchemaContainerVersionHeader extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.native
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of custom templates in the container version.
    */
  var numCustomTemplates: js.UndefOr[String] = js.native
  /**
    * Number of macros in the container version.
    */
  var numMacros: js.UndefOr[String] = js.native
  /**
    * Number of rules in the container version.
    */
  var numRules: js.UndefOr[String] = js.native
  /**
    * Number of tags in the container version.
    */
  var numTags: js.UndefOr[String] = js.native
  /**
    * Number of triggers in the container version.
    */
  var numTriggers: js.UndefOr[String] = js.native
  /**
    * Number of variables in the container version.
    */
  var numVariables: js.UndefOr[String] = js.native
  /**
    * Number of zones in the container version.
    */
  var numZones: js.UndefOr[String] = js.native
  /**
    * GTM Container Versions&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaContainerVersionHeader {
  @scala.inline
  def apply(): SchemaContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersionHeader]
  }
  @scala.inline
  implicit class SchemaContainerVersionHeaderOps[Self <: SchemaContainerVersionHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumCustomTemplates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCustomTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumCustomTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCustomTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withNumMacros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMacros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumMacros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMacros")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRules")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTriggers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withNumVariables(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withNumZones(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numZones")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
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
  }
  
}

