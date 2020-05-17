package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsdpops extends js.Object {
  def keep_codecs_by_id(codecs: String, media: String): Double = js.native
  def keep_codecs_by_name(codecs: String, media: String): Double = js.native
  def remove_codecs_by_id(codecs: String, media: String): Double = js.native
  def remove_codecs_by_name(codecs: String, media: String): Double = js.native
  def remove_line_by_prefix(prefix: String, media: String): Double = js.native
  def remove_media(media: String): Double = js.native
  def sdp_content(): Double = js.native
  def sdp_content_flags(flags: Double): Double = js.native
  def sdp_get(avp: String): Double = js.native
  def sdp_get_line_startswith(aname: String, sline: String): Double = js.native
  def sdp_print(llevel: Double): Double = js.native
  def sdp_transport(avp: String): Double = js.native
  def sdp_with_active_media(media: String): Double = js.native
  def sdp_with_ice(): Double = js.native
  def sdp_with_media(media: String): Double = js.native
}

object Typeofsdpops {
  @scala.inline
  def apply(
    keep_codecs_by_id: (String, String) => Double,
    keep_codecs_by_name: (String, String) => Double,
    remove_codecs_by_id: (String, String) => Double,
    remove_codecs_by_name: (String, String) => Double,
    remove_line_by_prefix: (String, String) => Double,
    remove_media: String => Double,
    sdp_content: () => Double,
    sdp_content_flags: Double => Double,
    sdp_get: String => Double,
    sdp_get_line_startswith: (String, String) => Double,
    sdp_print: Double => Double,
    sdp_transport: String => Double,
    sdp_with_active_media: String => Double,
    sdp_with_ice: () => Double,
    sdp_with_media: String => Double
  ): Typeofsdpops = {
    val __obj = js.Dynamic.literal(keep_codecs_by_id = js.Any.fromFunction2(keep_codecs_by_id), keep_codecs_by_name = js.Any.fromFunction2(keep_codecs_by_name), remove_codecs_by_id = js.Any.fromFunction2(remove_codecs_by_id), remove_codecs_by_name = js.Any.fromFunction2(remove_codecs_by_name), remove_line_by_prefix = js.Any.fromFunction2(remove_line_by_prefix), remove_media = js.Any.fromFunction1(remove_media), sdp_content = js.Any.fromFunction0(sdp_content), sdp_content_flags = js.Any.fromFunction1(sdp_content_flags), sdp_get = js.Any.fromFunction1(sdp_get), sdp_get_line_startswith = js.Any.fromFunction2(sdp_get_line_startswith), sdp_print = js.Any.fromFunction1(sdp_print), sdp_transport = js.Any.fromFunction1(sdp_transport), sdp_with_active_media = js.Any.fromFunction1(sdp_with_active_media), sdp_with_ice = js.Any.fromFunction0(sdp_with_ice), sdp_with_media = js.Any.fromFunction1(sdp_with_media))
    __obj.asInstanceOf[Typeofsdpops]
  }
  @scala.inline
  implicit class TypeofsdpopsOps[Self <: Typeofsdpops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeep_codecs_by_id(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_codecs_by_id")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeep_codecs_by_name(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_codecs_by_name")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove_codecs_by_id(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_codecs_by_id")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove_codecs_by_name(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_codecs_by_name")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove_line_by_prefix(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_line_by_prefix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove_media(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_media")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSdp_content(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_content")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSdp_content_flags(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_content_flags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSdp_get(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSdp_get_line_startswith(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_get_line_startswith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSdp_print(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_print")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSdp_transport(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_transport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSdp_with_active_media(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_with_active_media")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSdp_with_ice(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_with_ice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSdp_with_media(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdp_with_media")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

