package typingsSlinky.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibUtilsMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.nextDashServer.Anon_AmpPath
  import typingsSlinky.nextDashServer.Anon_Body
  import typingsSlinky.nextDashServer.Anon_Component
  import typingsSlinky.nextDashServer.Anon_Context
  import typingsSlinky.nextDashServer.Anon_EnhanceApp
  import typingsSlinky.nextDashServer.Anon_Json
  import typingsSlinky.nextDashServer.Anon_RenderPage
  import typingsSlinky.nextDashServer.Anon_Styles
  import typingsSlinky.nextDashServer.distLibRouterRouterMod.NextRouter
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type AppPropsType[R /* <: NextRouter */, P] = AppInitialProps with (Anon_Component[P, R])
  type AppType = NextComponentType[AppContextType[NextRouter], AppInitialProps, AppPropsType[NextRouter, js.Object]]
  type ComponentsEnhancer = Anon_EnhanceApp | (Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]])
  type DocumentContext = NextPageContext with Anon_RenderPage
  type DocumentInitialProps = RenderPageResult with Anon_Styles
  type DocumentProps = DocumentInitialProps with Anon_AmpPath
  type DocumentType = NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]
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
