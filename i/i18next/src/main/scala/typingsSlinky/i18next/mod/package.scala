package typingsSlinky.i18next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default: typingsSlinky.i18next.mod.i18n = typingsSlinky.i18next.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[typingsSlinky.i18next.mod.i18n]
  
  type Callback = js.Function2[/* error */ js.Any, /* t */ typingsSlinky.i18next.mod.TFunction, scala.Unit]
  
  type CallbackError = js.UndefOr[js.Error | scala.Null]
  
  type ExistsFunction[TKeys /* <: java.lang.String */, TInterpolationMap /* <: js.Object */] = js.Function2[
    /* key */ TKeys | js.Array[TKeys], 
    /* options */ js.UndefOr[typingsSlinky.i18next.mod.TOptions[TInterpolationMap]], 
    scala.Boolean
  ]
  
  type FallbackLng = java.lang.String | js.Array[java.lang.String] | typingsSlinky.i18next.mod.FallbackLngObjList | (js.Function1[
    /* code */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String] | typingsSlinky.i18next.mod.FallbackLngObjList
  ])
  
  type FallbackLngObjList = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type FormatFunction = js.Function4[
    /* value */ js.Any, 
    /* format */ js.UndefOr[java.lang.String], 
    /* lng */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.i18next.anon.InterpolationOptionskeyst], 
    java.lang.String
  ]
  
  type MultiReadCallback = js.Function2[
    /* err */ typingsSlinky.i18next.mod.CallbackError, 
    /* data */ typingsSlinky.i18next.mod.Resource, 
    scala.Unit
  ]
  
  type ReadCallback = js.Function2[
    /* err */ typingsSlinky.i18next.mod.CallbackError, 
    /* data */ typingsSlinky.i18next.mod.ResourceKey | scala.Boolean, 
    scala.Unit
  ]
  
  type Resource = org.scalablytyped.runtime.StringDictionary[typingsSlinky.i18next.mod.ResourceLanguage]
  
  type ResourceKey = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ResourceLanguage = org.scalablytyped.runtime.StringDictionary[typingsSlinky.i18next.mod.ResourceKey]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type TFunctionKeys = java.lang.String | typingsSlinky.std.TemplateStringsArray
  
  type TFunctionResult = js.UndefOr[
    java.lang.String | js.Object | (js.Array[java.lang.String | js.Object]) | scala.Null
  ]
  
  type TOptions[TInterpolationMap /* <: js.Object */] = typingsSlinky.i18next.mod.TOptionsBase with TInterpolationMap
}
