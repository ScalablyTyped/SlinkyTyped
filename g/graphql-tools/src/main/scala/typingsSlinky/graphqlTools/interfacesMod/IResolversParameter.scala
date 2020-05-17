package typingsSlinky.graphqlTools.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[
(typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]) | (js.Function1[
  / * mergeInfo * / typingsSlinky.graphqlTools.interfacesMod.MergeInfo, 
  typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
])]
  - typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]
  - js.Function1[
/ * mergeInfo * / typingsSlinky.graphqlTools.interfacesMod.MergeInfo, 
typingsSlinky.graphqlTools.interfacesMod.IResolvers[js.Any, js.Any]]
*/
trait IResolversParameter extends js.Object

object IResolversParameter {
  @scala.inline
  implicit def apply(
    value: js.Array[
      (IResolvers[js.Any, js.Any]) | (js.Function1[/* mergeInfo */ MergeInfo, IResolvers[js.Any, js.Any]])
    ]
  ): IResolversParameter = value.asInstanceOf[IResolversParameter]
  @scala.inline
  implicit def apply(value: js.Function1[/* mergeInfo */ MergeInfo, IResolvers[js.Any, js.Any]]): IResolversParameter = value.asInstanceOf[IResolversParameter]
  @scala.inline
  implicit def apply(value: IResolvers[js.Any, js.Any]): IResolversParameter = value.asInstanceOf[IResolversParameter]
}

