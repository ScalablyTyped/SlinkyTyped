package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A fill that renders an image that's stretched to the dimensions of its container.
  */
@js.native
trait PictureFill extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContentUrl(): String = js.native
  def getSourceUrl(): String = js.native
}

object PictureFill {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getContentUrl: () => String,
    getSourceUrl: () => String
  ): PictureFill = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContentUrl = js.Any.fromFunction0(getContentUrl), getSourceUrl = js.Any.fromFunction0(getSourceUrl))
    __obj.asInstanceOf[PictureFill]
  }
  @scala.inline
  implicit class PictureFillOps[Self <: PictureFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAs(value: String => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBlob(value: () => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceUrl")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

