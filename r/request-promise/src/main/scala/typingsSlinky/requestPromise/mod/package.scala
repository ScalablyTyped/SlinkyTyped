package typingsSlinky.requestPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = typingsSlinky.requestPromise.mod.OptionsWithUri | typingsSlinky.requestPromise.mod.OptionsWithUrl
  type OptionsWithUri = typingsSlinky.request.mod.UriOptions with typingsSlinky.requestPromise.mod.RequestPromiseOptions
  type OptionsWithUrl = typingsSlinky.request.mod.UrlOptions with typingsSlinky.requestPromise.mod.RequestPromiseOptions
  type RequestPromiseAPI = typingsSlinky.request.mod.RequestAPI[
    typingsSlinky.requestPromise.mod.RequestPromise[js.Any], 
    typingsSlinky.requestPromise.mod.RequestPromiseOptions, 
    typingsSlinky.request.mod.RequiredUriUrl
  ]
}
