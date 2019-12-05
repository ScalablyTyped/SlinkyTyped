package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNextDashServerLibUtilsMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.next.Anon_AmpPath
  import typingsSlinky.next.Anon_Body
  import typingsSlinky.next.Anon_Component
  import typingsSlinky.next.Anon_Context
  import typingsSlinky.next.Anon_Document
  import typingsSlinky.next.Anon_EnhanceApp
  import typingsSlinky.next.Anon_Json
  import typingsSlinky.next.Anon_RenderPage
  import typingsSlinky.next.Anon_Styles
  import typingsSlinky.next.distNextDashServerLibRouterRouterMod.NextRouter
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type AppPropsType[R /* <: NextRouter */, P] = AppInitialProps with (Anon_Component[P, R])
  type AppTreeType = ReactComponentClass[AppInitialProps with StringDictionary[js.Any]]
  type AppType = NextComponentType[AppContextType[NextRouter], AppInitialProps, AppPropsType[NextRouter, js.Object]]
  type ComponentsEnhancer = Anon_EnhanceApp | (Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]])
  type DocumentContext = NextPageContext with Anon_RenderPage
  type DocumentInitialProps = RenderPageResult with Anon_Styles
  type DocumentProps = DocumentInitialProps with Anon_AmpPath
  type DocumentType = (NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]) with Anon_Document
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextApiRequest = IncomingMessage with Anon_Body
  type NextApiResponse[T] = ServerResponse with Anon_Json[T]
  type NextComponentType[C /* <: BaseContext */, IP, P] = ReactComponentClass[P] with (Anon_Context[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[ComponentsEnhancer], 
    RenderPageResult | js.Promise[RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, Unit]
}
