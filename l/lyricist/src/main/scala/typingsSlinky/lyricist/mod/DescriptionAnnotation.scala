package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.anon.Apipath
import typingsSlinky.lyricist.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionAnnotation extends js.Object {
  var _type: String = js.native
  var annotatable: Apipath = js.native
  var annotations: js.Array[Annotation] = js.native
  var annotator_id: Double = js.native
  var annotator_login: String = js.native
  var api_path: String = js.native
  var classification: String = js.native
  var fragment: String = js.native
  var id: Double = js.native
  var is_description: Boolean = js.native
  var path: String = js.native
  var range: Content = js.native
  var song_id: Double = js.native
  var url: String = js.native
  var verified_annotator_ids: js.Array[_] = js.native
}

object DescriptionAnnotation {
  @scala.inline
  def apply(
    _type: String,
    annotatable: Apipath,
    annotations: js.Array[Annotation],
    annotator_id: Double,
    annotator_login: String,
    api_path: String,
    classification: String,
    fragment: String,
    id: Double,
    is_description: Boolean,
    path: String,
    range: Content,
    song_id: Double,
    url: String,
    verified_annotator_ids: js.Array[_]
  ): DescriptionAnnotation = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], annotatable = annotatable.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], annotator_id = annotator_id.asInstanceOf[js.Any], annotator_login = annotator_login.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], classification = classification.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_description = is_description.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], song_id = song_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotator_ids = verified_annotator_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionAnnotation]
  }
  @scala.inline
  implicit class DescriptionAnnotationOps[Self <: DescriptionAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotatable(value: Apipath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotator_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotator_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotator_login(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotator_login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_description(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_annotator_ids(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_annotator_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

