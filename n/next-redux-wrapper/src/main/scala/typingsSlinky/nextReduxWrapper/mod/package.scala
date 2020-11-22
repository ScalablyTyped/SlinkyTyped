package typingsSlinky.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.next.libUtilsMod.NextPageContext
    - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext * / js.Any
    - typingsSlinky.nextReduxWrapper.mod.GetStaticPropsContext
    - typingsSlinky.nextReduxWrapper.mod.GetServerSidePropsContext
  */
  type Context = typingsSlinky.nextReduxWrapper.mod._Context | typingsSlinky.next.libUtilsMod.NextPageContext | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext */ js.Any)
  
  type MakeStore[S, A /* <: typingsSlinky.redux.mod.Action[_] */] = js.Function1[
    /* context */ typingsSlinky.nextReduxWrapper.mod.Context, 
    typingsSlinky.redux.mod.Store[S, A]
  ]
}
