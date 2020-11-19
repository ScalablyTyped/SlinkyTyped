package typingsSlinky.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Callback[T] = typingsSlinky.raygun.typesMod.CallbackNoError[T] | typingsSlinky.raygun.typesMod.CallbackWithError[T]
  
  type CallbackNoError[T] = js.Function1[/* t */ T | scala.Null, scala.Unit]
  
  type CallbackWithError[T] = js.Function2[/* e */ js.Error | scala.Null, /* t */ T | scala.Null, scala.Unit]
  
  type CustomData = js.Any
  
  type Hook[T] = js.Function5[
    /* message */ typingsSlinky.raygun.typesMod.Message, 
    /* exception */ js.Error | java.lang.String, 
    /* customData */ typingsSlinky.raygun.typesMod.CustomData, 
    /* request */ js.UndefOr[typingsSlinky.raygun.typesMod.RequestParams], 
    /* tags */ js.UndefOr[js.Array[typingsSlinky.raygun.typesMod.Tag]], 
    T
  ]
  
  type RequestParams = (typingsSlinky.raygun.anon.Host | typingsSlinky.raygun.anon.Hostname) with typingsSlinky.raygun.typesMod.CommonRequestParams
  
  type Tag = java.lang.String
}
