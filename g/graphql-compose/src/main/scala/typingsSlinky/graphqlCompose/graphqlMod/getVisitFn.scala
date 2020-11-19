package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.visitorMod.VisitFn
import typingsSlinky.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "getVisitFn")
@js.native
object getVisitFn extends js.Object {
  
  def apply(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
}
