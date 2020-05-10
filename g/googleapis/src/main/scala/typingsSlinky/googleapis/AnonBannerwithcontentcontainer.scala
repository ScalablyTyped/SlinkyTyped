package typingsSlinky.googleapis

import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaVolume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBannerwithcontentcontainer extends js.Object {
  var banner_with_content_container: js.UndefOr[AnonFillColorArgb] = js.native
  var subTitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var totalVolumes: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[String] = js.native
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
}

object AnonBannerwithcontentcontainer {
  @scala.inline
  def apply(): AnonBannerwithcontentcontainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBannerwithcontentcontainer]
  }
  @scala.inline
  implicit class AnonBannerwithcontentcontainerOps[Self <: AnonBannerwithcontentcontainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanner_with_content_container(value: AnonFillColorArgb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner_with_content_container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanner_with_content_container: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner_with_content_container")(js.undefined)
        ret
    }
    @scala.inline
    def withSubTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalVolumes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalVolumes")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[SchemaVolume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

