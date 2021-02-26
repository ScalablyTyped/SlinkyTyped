package typingsSlinky.next

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.next.getPageFilesMod.BuildManifest
import typingsSlinky.next.libUtilsMod.AppType
import typingsSlinky.next.libUtilsMod.DocumentType
import typingsSlinky.next.mod.GetServerSideProps
import typingsSlinky.next.mod.GetServerSidePropsContext
import typingsSlinky.next.mod.GetServerSidePropsResult
import typingsSlinky.next.mod.GetStaticPaths
import typingsSlinky.next.mod.GetStaticPathsContext
import typingsSlinky.next.mod.GetStaticPathsResult
import typingsSlinky.next.mod.GetStaticProps
import typingsSlinky.next.mod.GetStaticPropsContext
import typingsSlinky.next.mod.GetStaticPropsResult
import typingsSlinky.next.mod.PageConfig
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadComponentsMod {
  
  @JSImport("next/dist/next-server/server/load-components", "interopDefault")
  @js.native
  def interopDefault(mod: js.Any): js.Any = js.native
  
  @JSImport("next/dist/next-server/server/load-components", "loadComponents")
  @js.native
  def loadComponents(distDir: String, pathname: String, serverless: Boolean): js.Promise[LoadComponentsReturnType] = js.native
  
  @js.native
  trait LoadComponentsReturnType extends StObject {
    
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
    implicit class LoadComponentsReturnTypeMutableBuilder[Self <: LoadComponentsReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: AppType): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocument(value: DocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetServerSideProps(
        value: /* context */ GetServerSidePropsContext[ParsedUrlQuery] => js.Promise[GetServerSidePropsResult[StringDictionary[_]]]
      ): Self = StObject.set(x, "getServerSideProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetServerSidePropsUndefined: Self = StObject.set(x, "getServerSideProps", js.undefined)
      
      @scala.inline
      def setGetStaticPaths(value: /* context */ GetStaticPathsContext => js.Promise[GetStaticPathsResult[ParsedUrlQuery]]): Self = StObject.set(x, "getStaticPaths", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStaticPathsUndefined: Self = StObject.set(x, "getStaticPaths", js.undefined)
      
      @scala.inline
      def setGetStaticProps(
        value: /* context */ GetStaticPropsContext[ParsedUrlQuery] => js.Promise[GetStaticPropsResult[StringDictionary[_]]]
      ): Self = StObject.set(x, "getStaticProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStaticPropsUndefined: Self = StObject.set(x, "getStaticProps", js.undefined)
      
      @scala.inline
      def setPageConfig(value: PageConfig): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageConfigUndefined: Self = StObject.set(x, "pageConfig", js.undefined)
      
      @scala.inline
      def setReactLoadableManifest(value: ReactLoadableManifest): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManifestItem extends StObject {
    
    var file: String = js.native
    
    var id: Double | String = js.native
    
    var name: String = js.native
  }
  object ManifestItem {
    
    @scala.inline
    def apply(file: String, id: Double | String, name: String): ManifestItem = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestItem]
    }
    
    @scala.inline
    implicit class ManifestItemMutableBuilder[Self <: ManifestItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactLoadableManifest = StringDictionary[js.Array[ManifestItem]]
}
