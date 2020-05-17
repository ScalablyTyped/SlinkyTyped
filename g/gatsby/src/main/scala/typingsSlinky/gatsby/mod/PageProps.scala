package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Component
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageProps[DataType, PageContextType] extends js.Object {
  /** You can't get passed children as this is the root user-land component */
  var children: js.UndefOr[scala.Nothing] = js.native
  /**
    * Data passed into the page via an exported GraphQL query. To set up this type
    * you need to use [generics](https://www.typescriptlang.org/play/#example/generic-functions),
    * see below for an example
    *
    * @example
    *
    * import {PageProps} from "gatsby"
    *
    * type IndexQueryProps = { downloadCount: number }
    * type IndexPageProps = PageProps<IndexPageProps>
    *
    * export default (props: IndexProps) => {
    *   ..
    *
    */
  var data: DataType = js.native
  /** An extended version of window.document which comes from @react/router */
  var location: WindowLocation[LocationState] = js.native
  /** A way to handle programmatically controlling navigation */
  var navigate: NavigateFn = js.native
  /**
    * A context object which is passed in during the creation of the page. Can be extended if you are using
    * `createPage` yourself using generics:
    *
    * @example
    *
    * import {PageProps} from "gatsby"
    *
    * type IndexQueryProps = { downloadCount: number }
    * type LocaleLookUpInfo = { translationStrings: any } & { langKey: string, slug: string }
    * type IndexPageProps = PageProps<IndexPageProps, LocaleLookUpInfo>
    *
    * export default (props: IndexProps) => {
    *   ..
    */
  var pageContext: PageContextType = js.native
  /** Holds information about the build process for this component */
  var pageResources: Component[DataType, PageContextType] = js.native
  /** The path for this current page */
  var path: String = js.native
  /** @deprecated use pageContext instead */
  var pathContext: js.Object = js.native
  /** The URI for the current page */
  var uri: String = js.native
}

object PageProps {
  @scala.inline
  def apply[DataType, PageContextType](
    data: DataType,
    location: WindowLocation[LocationState],
    navigate: NavigateFn,
    pageContext: PageContextType,
    pageResources: Component[DataType, PageContextType],
    path: String,
    pathContext: js.Object,
    uri: String
  ): PageProps[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any], pageResources = pageResources.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathContext = pathContext.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageProps[DataType, PageContextType]]
  }
  @scala.inline
  implicit class PagePropsOps[Self[datatype, pagecontexttype] <: PageProps[datatype, pagecontexttype], DataType, PageContextType] (val x: Self[DataType, PageContextType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType, PageContextType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType, PageContextType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DataType, PageContextType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DataType, PageContextType]) with Other]
    @scala.inline
    def withData(value: DataType): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigate(value: NavigateFn): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageContext(value: PageContextType): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageResources(value: Component[DataType, PageContextType]): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathContext(value: js.Object): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

