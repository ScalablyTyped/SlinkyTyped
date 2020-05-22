package typingsSlinky.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsMod {
  type AppType = typingsSlinky.nextServer.libUtilsMod.NextComponentType[
    typingsSlinky.nextServer.libUtilsMod.AppContextType[typingsSlinky.nextServer.routerMod.NextRouter], 
    typingsSlinky.nextServer.libUtilsMod.AppInitialProps, 
    typingsSlinky.nextServer.libUtilsMod.AppPropsType[typingsSlinky.nextServer.routerMod.NextRouter, js.Object]
  ]
  type ComponentsEnhancer = typingsSlinky.nextServer.anon.EnhanceApp | (typingsSlinky.nextServer.libUtilsMod.Enhancer[
    typingsSlinky.nextServer.libUtilsMod.NextComponentType[typingsSlinky.nextServer.libUtilsMod.NextPageContext, js.Object, js.Object]
  ])
  type DocumentType = typingsSlinky.nextServer.libUtilsMod.NextComponentType[
    typingsSlinky.nextServer.libUtilsMod.DocumentContext, 
    typingsSlinky.nextServer.libUtilsMod.DocumentInitialProps, 
    typingsSlinky.nextServer.libUtilsMod.DocumentProps
  ]
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextComponentType[C /* <: typingsSlinky.nextServer.libUtilsMod.BaseContext */, IP, P] = slinky.core.ReactComponentClass[P] with (typingsSlinky.nextServer.anon.GetInitialProps[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.nextServer.libUtilsMod.ComponentsEnhancer], 
    typingsSlinky.nextServer.libUtilsMod.RenderPageResult | js.Promise[typingsSlinky.nextServer.libUtilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
