package typingsSlinky.needle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("needle", "request")
@js.native
object request extends js.Object {
  
  def apply(method: NeedleHttpVerbs, url: String, data: BodyData): ReadableStream = js.native
  def apply(method: NeedleHttpVerbs, url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def apply(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: js.UndefOr[scala.Nothing],
    callback: NeedleCallback
  ): ReadableStream = js.native
  def apply(method: NeedleHttpVerbs, url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def apply(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: NeedleOptions,
    callback: NeedleCallback
  ): ReadableStream = js.native
}
