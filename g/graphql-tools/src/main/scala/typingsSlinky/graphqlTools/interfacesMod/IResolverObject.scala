package typingsSlinky.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolverObject[TSource, TContext, TArgs] extends /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs]) | (IResolverOptions[TSource, TContext, _]) | (IResolverObject[TSource, TContext, _])
    ]

object IResolverObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](): IResolverObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResolverObject[TSource, TContext, TArgs]]
  }
}

