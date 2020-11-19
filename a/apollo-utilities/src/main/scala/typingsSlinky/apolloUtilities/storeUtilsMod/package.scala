package typingsSlinky.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storeUtilsMod {
  
  type Directives = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  
  type ListValue = js.Array[scala.Null | typingsSlinky.apolloUtilities.storeUtilsMod.IdValue]
  
  type NumberValue = typingsSlinky.graphql.astMod.IntValueNode | typingsSlinky.graphql.astMod.FloatValueNode
  
  type ScalarValue = typingsSlinky.graphql.astMod.StringValueNode | typingsSlinky.graphql.astMod.BooleanValueNode | typingsSlinky.graphql.astMod.EnumValueNode
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsSlinky.apolloUtilities.storeUtilsMod.IdValue
    - typingsSlinky.apolloUtilities.storeUtilsMod.ListValue
    - typingsSlinky.apolloUtilities.storeUtilsMod.JsonValue
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - scala.Unit
    - js.Object
  */
  type StoreValue = js.UndefOr[
    typingsSlinky.apolloUtilities.storeUtilsMod._StoreValue | js.Array[java.lang.String] | scala.Double | java.lang.String | typingsSlinky.apolloUtilities.storeUtilsMod.ListValue | scala.Null | scala.Unit | js.Object
  ]
  
  type VariableValue = js.Function1[/* node */ typingsSlinky.graphql.astMod.VariableNode, js.Any]
}
