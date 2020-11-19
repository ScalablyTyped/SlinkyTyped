package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object validationContextMod {
  
  type SDLValidationRule = js.Function1[
    /* context */ typingsSlinky.graphql.validationContextMod.SDLValidationContext, 
    typingsSlinky.graphql.visitorMod.ASTVisitor
  ]
  
  type ValidationRule = js.Function1[
    /* context */ typingsSlinky.graphql.validationContextMod.ValidationContext, 
    typingsSlinky.graphql.visitorMod.ASTVisitor
  ]
}
