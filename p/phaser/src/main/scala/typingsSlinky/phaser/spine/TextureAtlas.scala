package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureAtlas extends Disposable {
  var load: js.Any = js.native
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
  def findRegion(name: String): TextureAtlasRegion = js.native
}

object TextureAtlas {
  @scala.inline
  def apply(
    dispose: () => Unit,
    findRegion: String => TextureAtlasRegion,
    load: js.Any,
    pages: js.Array[TextureAtlasPage],
    regions: js.Array[TextureAtlasRegion]
  ): TextureAtlas = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), findRegion = js.Any.fromFunction1(findRegion), load = load.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlas]
  }
  @scala.inline
  implicit class TextureAtlasOps[Self <: TextureAtlas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindRegion(value: String => TextureAtlasRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: js.Array[TextureAtlasPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[TextureAtlasRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

