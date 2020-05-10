package typingsSlinky.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTilesWithinFilteringOptions extends js.Object {
  /**
    * If true, only return tiles that have at least one interesting face.
    */
  var hasInterestingFace: js.UndefOr[Boolean] = js.native
  /**
    * If true, only return tiles that collide on at least one side.
    */
  var isColliding: js.UndefOr[Boolean] = js.native
  /**
    * If true, only return tiles that don't have -1 for an index.
    */
  var isNotEmpty: js.UndefOr[Boolean] = js.native
}

object GetTilesWithinFilteringOptions {
  @scala.inline
  def apply(): GetTilesWithinFilteringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTilesWithinFilteringOptions]
  }
  @scala.inline
  implicit class GetTilesWithinFilteringOptionsOps[Self <: GetTilesWithinFilteringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasInterestingFace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInterestingFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasInterestingFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInterestingFace")(js.undefined)
        ret
    }
    @scala.inline
    def withIsColliding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColliding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsColliding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColliding")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNotEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNotEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotEmpty")(js.undefined)
        ret
    }
  }
  
}

