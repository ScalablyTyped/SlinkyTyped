package typingsSlinky.resourceLoader.resourceLoaderMod.Resource

import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof Resource
  * @typedef {object} IMetadata
  * @property {HTMLImageElement|HTMLAudioElement|HTMLVideoElement} [loadElement=null] - The
  *      element to use for loading, instead of creating one.
  * @property {boolean} [skipSource=false] - Skips adding source(s) to the load element. This
  *      is useful if you want to pass in a `loadElement` that you already added load sources to.
  * @property {string|string[]} [mimeType] - The mime type to use for the source element
  *      of a video/audio elment. If the urls are an array, you can pass this as an array as well
  *      where each index is the mime type to use for the corresponding url index.
  */
@js.native
trait IMetadata extends js.Object {
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.native
  var mimeType: js.UndefOr[String | js.Array[String]] = js.native
  var skipSource: js.UndefOr[Boolean] = js.native
}

object IMetadata {
  @scala.inline
  def apply(): IMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetadata]
  }
  @scala.inline
  implicit class IMetadataOps[Self <: IMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadElementHTMLVideoElement(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadElementHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadElementHTMLAudioElement(value: HTMLAudioElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadElement")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSource")(js.undefined)
        ret
    }
  }
  
}

