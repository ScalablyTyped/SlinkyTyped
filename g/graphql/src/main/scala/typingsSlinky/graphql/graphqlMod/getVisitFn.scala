package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageVisitorMod.VisitFn
import typingsSlinky.graphql.languageVisitorMod.Visitor
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getVisitFn")
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

