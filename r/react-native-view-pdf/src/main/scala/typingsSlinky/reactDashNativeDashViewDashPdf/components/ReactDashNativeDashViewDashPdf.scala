package typingsSlinky.reactDashNativeDashViewDashPdf.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfMod.PDFViewProps
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfMod.URLProps
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfMod.default
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.`utf-16`
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.`utf-8`
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.base64
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.bundle
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.documentsDirectory
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.file
import typingsSlinky.reactDashNativeDashViewDashPdf.reactDashNativeDashViewDashPdfStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashViewDashPdf
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-view-pdf", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onError */
  def apply(
    resource: String,
    fadeInDuration: Int | Double = null,
    fileFrom: bundle | documentsDirectory = null,
    onLoad: () => Unit = null,
    onPageChanged: (/* page */ Double, /* pageCount */ Double) => Unit = null,
    onScrolled: /* offset */ Double => Unit = null,
    resourceType: url | base64 | file = null,
    textEncoding: `utf-8` | `utf-16` = null,
    urlProps: URLProps = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (fadeInDuration != null) __obj.updateDynamic("fadeInDuration")(fadeInDuration.asInstanceOf[js.Any])
    if (fileFrom != null) __obj.updateDynamic("fileFrom")(fileFrom.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction2(onPageChanged))
    if (onScrolled != null) __obj.updateDynamic("onScrolled")(js.Any.fromFunction1(onScrolled))
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (urlProps != null) __obj.updateDynamic("urlProps")(urlProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PDFViewProps
}

