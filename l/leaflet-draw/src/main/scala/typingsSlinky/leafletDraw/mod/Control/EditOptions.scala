package typingsSlinky.leafletDraw.mod.Control

import typingsSlinky.leaflet.mod.FeatureGroup_
import typingsSlinky.leafletDraw.leafletDrawBooleans.`false`
import typingsSlinky.leafletDraw.mod.DrawOptions.EditHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditOptions extends js.Object {
  /**
    * Edit handler options. Set to false to disable handler.
    *
    * @default null
    */
  var edit: js.UndefOr[EditHandlerOptions | `false`] = js.native
  /**
    * This is the FeatureGroup that stores all editable shapes.
    * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
    *
    * @default null
    */
  var featureGroup: FeatureGroup_[_] = js.native
  /**
    * Delete handler options. Set to false to disable handler.
    *
    * Default value: null
    */
  var remove: js.UndefOr[Null | `false`] = js.native
}

object EditOptions {
  @scala.inline
  def apply(featureGroup: FeatureGroup_[_]): EditOptions = {
    val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
  @scala.inline
  implicit class EditOptionsOps[Self <: EditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureGroup(value: FeatureGroup_[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: EditHandlerOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(null)
        ret
    }
  }
  
}

