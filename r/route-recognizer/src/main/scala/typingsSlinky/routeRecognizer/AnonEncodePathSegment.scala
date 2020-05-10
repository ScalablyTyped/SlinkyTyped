package typingsSlinky.routeRecognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncodePathSegment extends js.Object {
  def encodePathSegment(str: String): String = js.native
  def normalizePath(path: String): String = js.native
  def normalizeSegment(segment: String): String = js.native
}

object AnonEncodePathSegment {
  @scala.inline
  def apply(
    encodePathSegment: String => String,
    normalizePath: String => String,
    normalizeSegment: String => String
  ): AnonEncodePathSegment = {
    val __obj = js.Dynamic.literal(encodePathSegment = js.Any.fromFunction1(encodePathSegment), normalizePath = js.Any.fromFunction1(normalizePath), normalizeSegment = js.Any.fromFunction1(normalizeSegment))
    __obj.asInstanceOf[AnonEncodePathSegment]
  }
  @scala.inline
  implicit class AnonEncodePathSegmentOps[Self <: AnonEncodePathSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodePathSegment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodePathSegment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNormalizePath(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizePath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNormalizeSegment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeSegment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

