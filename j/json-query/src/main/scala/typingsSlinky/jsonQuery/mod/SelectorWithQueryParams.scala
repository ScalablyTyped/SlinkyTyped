package typingsSlinky.jsonQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No way to support [Selector, ...QueryParam[]]?
// 10 params should be more than enough, hopefully.
/* Rewritten from type alias, can be one of: 
  - js.Tuple2[typingsSlinky.jsonQuery.mod.Selector, typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple3[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple4[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple5[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple6[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple7[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple8[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple9[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple10[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
  - js.Tuple11[
typingsSlinky.jsonQuery.mod.Selector, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam, 
typingsSlinky.jsonQuery.mod.QueryParam]
*/
trait SelectorWithQueryParams extends js.Object

object SelectorWithQueryParams {
  @scala.inline
  implicit def apply(
    value: js.Tuple10[
      Selector, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam
    ]
  ): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(
    value: js.Tuple11[
      Selector, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam
    ]
  ): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(value: js.Tuple2[Selector, QueryParam]): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(value: js.Tuple3[Selector, QueryParam, QueryParam]): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(value: js.Tuple4[Selector, QueryParam, QueryParam, QueryParam]): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(value: js.Tuple5[Selector, QueryParam, QueryParam, QueryParam, QueryParam]): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(value: js.Tuple6[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(value: js.Tuple7[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(
    value: js.Tuple8[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]
  ): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
  @scala.inline
  implicit def apply(
    value: js.Tuple9[
      Selector, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam, 
      QueryParam
    ]
  ): SelectorWithQueryParams = value.asInstanceOf[SelectorWithQueryParams]
}

