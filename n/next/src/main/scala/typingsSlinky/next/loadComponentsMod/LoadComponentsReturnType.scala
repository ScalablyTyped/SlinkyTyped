package typingsSlinky.next.loadComponentsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.next.anon.Params
import typingsSlinky.next.anon.Paths
import typingsSlinky.next.anon.Preview
import typingsSlinky.next.anon.Props
import typingsSlinky.next.anon.PropsP
import typingsSlinky.next.getPageFilesMod.BuildManifest
import typingsSlinky.next.mod.GetServerSideProps
import typingsSlinky.next.mod.GetStaticPaths
import typingsSlinky.next.mod.GetStaticProps
import typingsSlinky.next.mod.PageConfig
import typingsSlinky.next.utilsMod.AppType
import typingsSlinky.next.utilsMod.DocumentType
import typingsSlinky.next.utilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadComponentsReturnType extends js.Object {
  var App: AppType = js.native
  var Component: ReactComponentClass[js.Object] = js.native
  var Document: DocumentType = js.native
  var DocumentMiddleware: js.UndefOr[js.Function1[/* ctx */ NextPageContext, Unit]] = js.native
  var buildManifest: BuildManifest = js.native
  var getServerSideProps: js.UndefOr[GetServerSideProps[StringDictionary[_]]] = js.native
  var getStaticPaths: js.UndefOr[GetStaticPaths] = js.native
  var getStaticProps: js.UndefOr[GetStaticProps[StringDictionary[_]]] = js.native
  var pageConfig: js.UndefOr[PageConfig] = js.native
  var reactLoadableManifest: ReactLoadableManifest = js.native
}

object LoadComponentsReturnType {
  @scala.inline
  def apply(
    App: AppType,
    Component: ReactComponentClass[js.Object],
    Document: DocumentType,
    buildManifest: BuildManifest,
    reactLoadableManifest: ReactLoadableManifest
  ): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
  @scala.inline
  implicit class LoadComponentsReturnTypeOps[Self <: LoadComponentsReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: AppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("App")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: DocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildManifest(value: BuildManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactLoadableManifest(value: ReactLoadableManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactLoadableManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentMiddleware(value: /* ctx */ NextPageContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMiddleware")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocumentMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withGetServerSideProps(value: /* context */ Preview => js.Promise[PropsP[StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getServerSideProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetServerSideProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getServerSideProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStaticPaths(value: () => js.Promise[Paths]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStaticPaths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStaticPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStaticPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStaticProps(value: /* ctx */ Params => js.Promise[Props[StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStaticProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetStaticProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStaticProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPageConfig(value: PageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageConfig")(js.undefined)
        ret
    }
  }
  
}

