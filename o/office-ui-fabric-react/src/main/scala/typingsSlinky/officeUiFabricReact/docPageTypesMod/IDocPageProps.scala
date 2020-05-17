package typingsSlinky.officeUiFabricReact.docPageTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.Section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocPageProps extends js.Object {
  /** Accessibility of the component as markdown string */
  var accessibility: js.UndefOr[String] = js.native
  /** If true, the component accepts all native props from elements specified in `nativePropsElement` */
  var allowNativeProps: js.UndefOr[Boolean] = js.native
  /** Override component name to use in the native props message */
  var allowNativePropsForComponentName: js.UndefOr[String] = js.native
  /** Best practice as markdown string */
  var bestPractices: js.UndefOr[String] = js.native
  /** Name of the component being documented */
  var componentName: String = js.native
  /** URL of the checked in component, should be somewhere on github.com */
  var componentUrl: String = js.native
  /** DON'Ts blurb as markdown string */
  var donts: js.UndefOr[String] = js.native
  /** DO's blurb as markdown string */
  var dos: js.UndefOr[String] = js.native
  /** Knobs that applies to all the examples */
  var exampleKnobs: js.UndefOr[ReactElement] = js.native
  /** Array of examples, displayed in the order defined */
  var examples: js.UndefOr[js.Array[IExample]] = js.native
  /** Feedback section includes link to new issue page and displays Github issues */
  var isFeedbackVisible: js.UndefOr[Boolean] = js.native
  /** Passed through header visibility flag from the demo component page component */
  var isHeaderVisible: Boolean = js.native
  /**
    * JSON to populate the api reference tables
    */
  var jsonDocs: js.UndefOr[IPageJson] = js.native
  /**
    * Element(s) whose native props this component accepts (default div).
    * Only relevant if `allowNativeProps` is true.
    */
  var nativePropsElement: js.UndefOr[String | js.Array[String]] = js.native
  /** Pass through other sections for ComponentPage */
  var otherSections: js.UndefOr[js.Array[Section]] = js.native
  /** Overview of the component as markdown string */
  var overview: js.UndefOr[String] = js.native
  /** Properties table(s) as markdown string */
  var propertiesTablesSources: js.UndefOr[js.Array[String]] = js.native
  /**
    * Related link
    * @deprecated No longer shown on ComponentPage
    */
  var related: js.UndefOr[ReactElement] = js.native
  /** Title that goes into the header */
  var title: String = js.native
}

object IDocPageProps {
  @scala.inline
  def apply(componentName: String, componentUrl: String, isHeaderVisible: Boolean, title: String): IDocPageProps = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentUrl = componentUrl.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocPageProps]
  }
  @scala.inline
  implicit class IDocPagePropsOps[Self <: IDocPageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowNativeProps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNativeProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNativeProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNativeProps")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowNativePropsForComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNativePropsForComponentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNativePropsForComponentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNativePropsForComponentName")(js.undefined)
        ret
    }
    @scala.inline
    def withBestPractices(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestPractices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestPractices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestPractices")(js.undefined)
        ret
    }
    @scala.inline
    def withDonts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donts")(js.undefined)
        ret
    }
    @scala.inline
    def withDos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dos")(js.undefined)
        ret
    }
    @scala.inline
    def withExampleKnobs(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleKnobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExampleKnobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleKnobs")(js.undefined)
        ret
    }
    @scala.inline
    def withExamples(value: js.Array[IExample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFeedbackVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFeedbackVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFeedbackVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFeedbackVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonDocs(value: IPageJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withNativePropsElement(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativePropsElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativePropsElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativePropsElement")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherSections(value: js.Array[Section]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherSections")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertiesTablesSources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesTablesSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertiesTablesSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesTablesSources")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(js.undefined)
        ret
    }
  }
  
}

