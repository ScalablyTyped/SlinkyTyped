package typingsSlinky.next.loadComponentsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.next.anon.Fallback
import typingsSlinky.next.getPageFilesMod.BuildManifest
import typingsSlinky.next.mod.GetServerSideProps
import typingsSlinky.next.mod.GetServerSidePropsContext
import typingsSlinky.next.mod.GetServerSidePropsResult
import typingsSlinky.next.mod.GetStaticPaths
import typingsSlinky.next.mod.GetStaticProps
import typingsSlinky.next.mod.GetStaticPropsContext
import typingsSlinky.next.mod.GetStaticPropsResult
import typingsSlinky.next.mod.PageConfig
import typingsSlinky.next.utilsMod.AppType
import typingsSlinky.next.utilsMod.DocumentType
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadComponentsReturnType extends js.Object {
  
  var App: AppType = js.native
  
  var Component: ReactComponentClass[js.Object] = js.native
  
  var Document: DocumentType = js.native
  
  var buildManifest: BuildManifest = js.native
  
  var getServerSideProps: js.UndefOr[GetServerSideProps[StringDictionary[_], ParsedUrlQuery]] = js.native
  
  var getStaticPaths: js.UndefOr[GetStaticPaths[ParsedUrlQuery]] = js.native
  
  var getStaticProps: js.UndefOr[GetStaticProps[StringDictionary[_], ParsedUrlQuery]] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApp(value: AppType): Self = this.set("App", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: DocumentType): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildManifest(value: BuildManifest): Self = this.set("buildManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactLoadableManifest(value: ReactLoadableManifest): Self = this.set("reactLoadableManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetServerSideProps(
      value: /* context */ GetServerSidePropsContext[ParsedUrlQuery] => js.Promise[GetServerSidePropsResult[StringDictionary[_]]]
    ): Self = this.set("getServerSideProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetServerSideProps: Self = this.set("getServerSideProps", js.undefined)
    
    @scala.inline
    def setGetStaticPaths(value: () => js.Promise[Fallback[ParsedUrlQuery]]): Self = this.set("getStaticPaths", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStaticPaths: Self = this.set("getStaticPaths", js.undefined)
    
    @scala.inline
    def setGetStaticProps(
      value: /* context */ GetStaticPropsContext[ParsedUrlQuery] => js.Promise[GetStaticPropsResult[StringDictionary[_]]]
    ): Self = this.set("getStaticProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetStaticProps: Self = this.set("getStaticProps", js.undefined)
    
    @scala.inline
    def setPageConfig(value: PageConfig): Self = this.set("pageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageConfig: Self = this.set("pageConfig", js.undefined)
  }
}
