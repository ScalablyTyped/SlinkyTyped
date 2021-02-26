package typingsSlinky.raygun

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def callVariadicCallback[T](callback: typingsSlinky.raygun.typesMod.Callback[T]): scala.Unit = typingsSlinky.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def callVariadicCallback[T](callback: typingsSlinky.raygun.typesMod.Callback[T], error: js.Error): scala.Unit = (typingsSlinky.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def callVariadicCallback[T](callback: typingsSlinky.raygun.typesMod.Callback[T], error: js.Error, result: T): scala.Unit = (typingsSlinky.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def callVariadicCallback[T](callback: typingsSlinky.raygun.typesMod.Callback[T], error: scala.Null, result: T): scala.Unit = (typingsSlinky.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isCallbackWithError[T](cb: typingsSlinky.raygun.typesMod.Callback[T]): /* is raygun.raygun/build/types.CallbackWithError<T> */ scala.Boolean = typingsSlinky.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCallbackWithError")(cb.asInstanceOf[js.Any]).asInstanceOf[/* is raygun.raygun/build/types.CallbackWithError<T> */ scala.Boolean]
}
