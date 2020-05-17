package typingsSlinky.requestPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OptionsWithUri = typingsSlinky.request.mod.UriOptions with typingsSlinky.requestPromise.mod.RequestPromiseOptions
  type OptionsWithUrl = typingsSlinky.request.mod.UrlOptions with typingsSlinky.requestPromise.mod.RequestPromiseOptions
  type RequestPromiseAPI[T] = typingsSlinky.request.mod.RequestAPI[
    typingsSlinky.requestPromise.mod.RequestPromise[T], 
    typingsSlinky.requestPromise.mod.RequestPromiseOptions, 
    typingsSlinky.request.mod.RequiredUriUrl
  ]
}
