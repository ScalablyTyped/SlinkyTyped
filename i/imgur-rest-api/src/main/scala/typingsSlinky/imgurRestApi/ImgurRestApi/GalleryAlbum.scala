package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleryAlbum extends GalleryItem {
  
  var cover: String = js.native
  
  var cover_height: Double = js.native
  
  var cover_width: Double = js.native
  
  var images: js.Array[Image] = js.native
  
  var images_count: Double = js.native
  
  var layout: String = js.native
  
  var privacy: String = js.native
}
object GalleryAlbum {
  
  @scala.inline
  def apply(
    comment_count: Double,
    cover: String,
    cover_height: Double,
    cover_width: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    images: js.Array[Image],
    images_count: Double,
    is_album: Boolean,
    layout: String,
    link: String,
    privacy: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double
  ): GalleryAlbum = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], cover_height = cover_height.asInstanceOf[js.Any], cover_width = cover_width.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], images_count = images_count.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryAlbum]
  }
  
  @scala.inline
  implicit class GalleryAlbumOps[Self <: GalleryAlbum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCover(value: String): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_height(value: Double): Self = this.set("cover_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_width(value: Double): Self = this.set("cover_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_count(value: Double): Self = this.set("images_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy(value: String): Self = this.set("privacy", value.asInstanceOf[js.Any])
  }
}
