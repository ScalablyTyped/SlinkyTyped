package typingsSlinky.googleapis.customsearchV1Mod.customsearchV1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonByteSize
import typingsSlinky.googleapis.AnonLabelwithop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResult extends js.Object {
  var cacheId: js.UndefOr[String] = js.native
  var displayLink: js.UndefOr[String] = js.native
  var fileFormat: js.UndefOr[String] = js.native
  var formattedUrl: js.UndefOr[String] = js.native
  var htmlFormattedUrl: js.UndefOr[String] = js.native
  var htmlSnippet: js.UndefOr[String] = js.native
  var htmlTitle: js.UndefOr[String] = js.native
  var image: js.UndefOr[AnonByteSize] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[js.Array[AnonLabelwithop]] = js.native
  var link: js.UndefOr[String] = js.native
  var mime: js.UndefOr[String] = js.native
  var pagemap: js.UndefOr[StringDictionary[js.Array[StringDictionary[_]]]] = js.native
  var snippet: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaResult {
  @scala.inline
  def apply(): SchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResult]
  }
  @scala.inline
  implicit class SchemaResultOps[Self <: SchemaResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLink")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFormattedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFormattedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFormattedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFormattedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlSnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: AnonByteSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[AnonLabelwithop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(js.undefined)
        ret
    }
    @scala.inline
    def withPagemap(value: StringDictionary[js.Array[StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagemap")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
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
  }
  
}

