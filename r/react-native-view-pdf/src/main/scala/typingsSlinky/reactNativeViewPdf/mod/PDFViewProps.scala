package typingsSlinky.reactNativeViewPdf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewProps
  extends /* key */ StringDictionary[js.Any] {
  var fadeInDuration: js.UndefOr[Double] = js.native
  var fileFrom: js.UndefOr[bundle | documentsDirectory] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.native
  var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
  var resource: String = js.native
  var resourceType: js.UndefOr[url | base64 | file] = js.native
  var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.native
  var urlProps: js.UndefOr[URLProps] = js.native
}

object PDFViewProps {
  @scala.inline
  def apply(resource: String): PDFViewProps = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewProps]
  }
  @scala.inline
  implicit class PDFViewPropsOps[Self <: PDFViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFadeInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeInDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeInDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeInDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFrom(value: bundle | documentsDirectory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChanged(value: (/* page */ Double, /* pageCount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPageChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrolled(value: /* offset */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrolled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrolled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrolled")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: url | base64 | file): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEncoding(value: `utf-8` | `utf-16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlProps(value: URLProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlProps")(js.undefined)
        ret
    }
  }
  
}

