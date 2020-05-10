package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onenote extends Entity {
  // The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  /**
    * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of
    * long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
    */
  var operations: js.UndefOr[js.Array[OnenoteOperation]] = js.native
  // The pages in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var pages: js.UndefOr[js.Array[OnenotePage]] = js.native
  /**
    * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get
    * the binary content of a specific resource. Read-only. Nullable.
    */
  var resources: js.UndefOr[js.Array[OnenoteResource]] = js.native
  // The section groups in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.native
  // The sections in all OneNote notebooks that are owned by the user or group. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.native
}

object Onenote {
  @scala.inline
  def apply(): Onenote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onenote]
  }
  @scala.inline
  implicit class OnenoteOps[Self <: Onenote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebooks(value: js.Array[Notebook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[OnenoteOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: js.Array[OnenotePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[OnenoteResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionGroups(value: js.Array[SectionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSections(value: js.Array[OnenoteSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(js.undefined)
        ret
    }
  }
  
}

