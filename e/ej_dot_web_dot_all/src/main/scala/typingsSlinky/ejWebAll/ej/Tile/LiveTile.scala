package typingsSlinky.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveTile extends js.Object {
  /** Specifies whether to enable liveTile or not.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies liveTile images in CSS classes.
    * @Default {null}
    */
  var imageClass: js.UndefOr[js.Array[_]] = js.native
  /** Specifies liveTile images in templates.
    * @Default {null}
    */
  var imageTemplateId: js.UndefOr[js.Array[_]] = js.native
  /** Specifies liveTile images in CSS classes.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[js.Array[_]] = js.native
  /** Sets the text to each living tile
    * @Default {Null}
    */
  var text: js.UndefOr[js.Array[_]] = js.native
  /** Specifies liveTile type for Tile. See orientation
    * @Default {flip}
    */
  var `type`: js.UndefOr[liveTileType | String] = js.native
  /** Specifies time interval between two successive liveTile animation
    * @Default {2000}
    */
  var updateInterval: js.UndefOr[Double] = js.native
}

object LiveTile {
  @scala.inline
  def apply(): LiveTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveTile]
  }
  @scala.inline
  implicit class LiveTileOps[Self <: LiveTile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withImageClass(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTemplateId(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: liveTileType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(js.undefined)
        ret
    }
  }
  
}

