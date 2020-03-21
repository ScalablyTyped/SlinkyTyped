package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectType extends js.Object {
  var objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
}

object AnonObjectType {
  @scala.inline
  def apply(objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType): AnonObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObjectType]
  }
}

