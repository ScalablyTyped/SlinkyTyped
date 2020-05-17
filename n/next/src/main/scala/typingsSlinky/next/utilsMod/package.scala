package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type AppTreeType = slinky.core.ReactComponentClass[typingsSlinky.next.anon.AppInitialPropsnamestring]
  type AppType = typingsSlinky.next.utilsMod.NextComponentType[
    typingsSlinky.next.utilsMod.AppContextType[typingsSlinky.next.routerMod.NextRouter], 
    typingsSlinky.next.utilsMod.AppInitialProps, 
    typingsSlinky.next.utilsMod.AppPropsType[typingsSlinky.next.routerMod.NextRouter, js.Object]
  ]
  type DocumentType = (typingsSlinky.next.utilsMod.NextComponentType[
    typingsSlinky.next.utilsMod.DocumentContext, 
    typingsSlinky.next.utilsMod.DocumentInitialProps, 
    typingsSlinky.next.utilsMod.DocumentProps
  ]) with typingsSlinky.next.anon.RenderDocument
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextApiHandler[T] = js.Function2[
    /* req */ typingsSlinky.next.utilsMod.NextApiRequest, 
    /* res */ typingsSlinky.next.utilsMod.NextApiResponse[T], 
    scala.Unit
  ]
  type NextComponentType[C /* <: typingsSlinky.next.utilsMod.BaseContext */, IP, P] = slinky.core.ReactComponentClass[P] with (typingsSlinky.next.anon.GetInitialProps[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.next.utilsMod.ComponentsEnhancer], 
    typingsSlinky.next.utilsMod.RenderPageResult | js.Promise[typingsSlinky.next.utilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
