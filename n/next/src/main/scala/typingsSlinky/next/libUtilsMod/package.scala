package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libUtilsMod {
  
  type AppTreeType = slinky.core.ReactComponentClass[typingsSlinky.next.anon.AppInitialPropsnamestring]
  
  type AppType = typingsSlinky.next.libUtilsMod.NextComponentType[
    typingsSlinky.next.libUtilsMod.AppContextType[typingsSlinky.next.routerMod.NextRouter], 
    typingsSlinky.next.libUtilsMod.AppInitialProps, 
    typingsSlinky.next.libUtilsMod.AppPropsType[typingsSlinky.next.routerMod.NextRouter, js.Object]
  ]
  
  type ComponentsEnhancer = typingsSlinky.next.anon.EnhanceApp | (typingsSlinky.next.libUtilsMod.Enhancer[
    typingsSlinky.next.libUtilsMod.NextComponentType[typingsSlinky.next.libUtilsMod.NextPageContext, js.Object, js.Object]
  ])
  
  type DocumentType = (typingsSlinky.next.libUtilsMod.NextComponentType[
    typingsSlinky.next.libUtilsMod.DocumentContext, 
    typingsSlinky.next.libUtilsMod.DocumentInitialProps, 
    typingsSlinky.next.libUtilsMod.DocumentProps
  ]) with typingsSlinky.next.anon.RenderDocument
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  type NextApiHandler[T] = js.Function2[
    /* req */ typingsSlinky.next.libUtilsMod.NextApiRequest, 
    /* res */ typingsSlinky.next.libUtilsMod.NextApiResponse[T], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type NextComponentType[C /* <: typingsSlinky.next.libUtilsMod.BaseContext */, IP, P] = slinky.core.ReactComponentClass[P] with (typingsSlinky.next.anon.GetInitialProps[C, IP])
  
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.next.libUtilsMod.ComponentsEnhancer], 
    typingsSlinky.next.libUtilsMod.RenderPageResult | js.Promise[typingsSlinky.next.libUtilsMod.RenderPageResult]
  ]
  
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
