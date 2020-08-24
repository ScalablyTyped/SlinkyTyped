package typingsSlinky.graphqlToolsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validateDocumentsMod {
  type ValidationRule = js.Function1[
    /* context */ typingsSlinky.graphql.mod.ValidationContext, 
    typingsSlinky.graphql.visitorMod.ASTVisitor
  ]
}
