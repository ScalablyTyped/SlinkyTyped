package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for new container versions.
  */
@js.native
trait SchemaCreateContainerVersionRequestVersionOptions extends js.Object {
  /**
    * The name of the container version to be created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notes of the container version to be created.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The creation of this version may be for quick preview and shouldn&#39;t
    * be saved.
    */
  var quickPreview: js.UndefOr[Boolean] = js.native
}

object SchemaCreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(): SchemaCreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionRequestVersionOptions]
  }
  @scala.inline
  implicit class SchemaCreateContainerVersionRequestVersionOptionsOps[Self <: SchemaCreateContainerVersionRequestVersionOptions] (val x: Self) extends AnyVal {
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
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickPreview")(js.undefined)
        ret
    }
  }
  
}

