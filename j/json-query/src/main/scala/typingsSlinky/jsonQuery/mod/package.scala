package typingsSlinky.jsonQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Context = js.Any
  
  type Filter = js.Function2[
    /* input */ typingsSlinky.jsonQuery.mod.Context, 
    /* repeated */ js.Any, 
    typingsSlinky.jsonQuery.mod.Context
  ]
  
  type Locals = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jsonQuery.mod.Filter]
  
  type QueryParam = js.Any
  
  type Selector = java.lang.String
  
  // No way to support [Selector, ...QueryParam[]]?
  // 10 params should be more than enough, hopefully.
  type SelectorWithQueryParams = (js.Tuple2[typingsSlinky.jsonQuery.mod.Selector, typingsSlinky.jsonQuery.mod.QueryParam]) | (js.Tuple3[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple4[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple5[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple6[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple7[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple8[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple9[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple10[
    typingsSlinky.jsonQuery.mod.Selector, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam, 
    typingsSlinky.jsonQuery.mod.QueryParam
  ]) | (js.Tuple11[
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
    typingsSlinky.jsonQuery.mod.QueryParam
  ])
}
