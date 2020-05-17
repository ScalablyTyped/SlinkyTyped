package typingsSlinky.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessCallback = js.Function1[
    /* context */ typingsSlinky.keystonejsKeystone.mod.AuthenticationContext, 
    scala.Boolean | typingsSlinky.keystonejsKeystone.mod.GraphQLWhereClause
  ]
  /**
    * Lists
    */
  type DefaultValueFunction = js.Function0[js.Any]
  type GraphQLWhereClause = org.scalablytyped.runtime.StringDictionary[js.Any]
  type KeyValues[Keys /* <: java.lang.String */, Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]: Values}
    */ typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.KeyValues with org.scalablytyped.runtime.TopLevel[js.Any]
  type Plugin = js.Any
}
