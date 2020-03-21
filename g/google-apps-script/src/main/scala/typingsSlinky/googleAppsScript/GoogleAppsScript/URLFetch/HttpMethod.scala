package typingsSlinky.googleAppsScript.GoogleAppsScript.URLFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleAppsScript.googleAppsScriptStrings.get
  - typingsSlinky.googleAppsScript.googleAppsScriptStrings.delete
  - typingsSlinky.googleAppsScript.googleAppsScriptStrings.patch
  - typingsSlinky.googleAppsScript.googleAppsScriptStrings.post
  - typingsSlinky.googleAppsScript.googleAppsScriptStrings.put
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsSlinky.googleAppsScript.googleAppsScriptStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsSlinky.googleAppsScript.googleAppsScriptStrings.get = this.cast("get")
  @scala.inline
  def patch: typingsSlinky.googleAppsScript.googleAppsScriptStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsSlinky.googleAppsScript.googleAppsScriptStrings.post = this.cast("post")
  @scala.inline
  def put: typingsSlinky.googleAppsScript.googleAppsScriptStrings.put = this.cast("put")
}

