package typingsSlinky.requestPromiseNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FullResponse = typingsSlinky.request.mod.Response
  
  type Options = typingsSlinky.requestPromiseNative.mod.OptionsWithUri | typingsSlinky.requestPromiseNative.mod.OptionsWithUrl
  
  type OptionsWithUri = typingsSlinky.request.mod.UriOptions with typingsSlinky.requestPromiseNative.mod.RequestPromiseOptions
  
  type OptionsWithUrl = typingsSlinky.request.mod.UrlOptions with typingsSlinky.requestPromiseNative.mod.RequestPromiseOptions
  
  type RequestPromiseAPI = typingsSlinky.request.mod.RequestAPI[
    typingsSlinky.requestPromiseNative.mod.RequestPromise[js.Any], 
    typingsSlinky.requestPromiseNative.mod.RequestPromiseOptions, 
    typingsSlinky.request.mod.RequiredUriUrl
  ]
}
