package typingsSlinky.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[/* error */ js.Any, /* t */ typingsSlinky.i18next.mod.TFunction, scala.Unit]
  type CallbackError = js.UndefOr[js.Error | scala.Null]
  /**
    * Uses similar args as the t function and returns true if a key exists.
    */
  type ExistsFunction[TKeys /* <: java.lang.String */, TInterpolationMap /* <: js.Object */] = js.Function2[
    /* key */ TKeys | js.Array[TKeys], 
    /* options */ js.UndefOr[typingsSlinky.i18next.mod.TOptions[TInterpolationMap]], 
    scala.Boolean
  ]
  type FallbackLng = java.lang.String | js.Array[java.lang.String] | typingsSlinky.i18next.mod.FallbackLngObjList
  type FallbackLngObjList = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type FormatFunction = js.Function3[
    /* value */ js.Any, 
    /* format */ js.UndefOr[java.lang.String], 
    /* lng */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MultiReadCallback = js.Function2[
    /* err */ typingsSlinky.i18next.mod.CallbackError, 
    /* data */ typingsSlinky.i18next.mod.Resource, 
    scala.Unit
  ]
  type ReadCallback = js.Function2[
    /* err */ typingsSlinky.i18next.mod.CallbackError, 
    /* data */ typingsSlinky.i18next.mod.ResourceKey, 
    scala.Unit
  ]
  type Resource = org.scalablytyped.runtime.StringDictionary[typingsSlinky.i18next.mod.ResourceLanguage]
  type ResourceKey = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResourceLanguage = org.scalablytyped.runtime.StringDictionary[typingsSlinky.i18next.mod.ResourceKey]
  // indexer that is open to any value
  type StringMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TFunctionKeys = java.lang.String | typingsSlinky.std.TemplateStringsArray
  type TFunctionResult = js.UndefOr[
    java.lang.String | js.Object | (js.Array[java.lang.String | js.Object]) | scala.Null
  ]
  /**
    * Options that allow open ended values for interpolation unless type is provided.
    */
  type TOptions[TInterpolationMap /* <: js.Object */] = typingsSlinky.i18next.mod.TOptionsBase with TInterpolationMap
}
