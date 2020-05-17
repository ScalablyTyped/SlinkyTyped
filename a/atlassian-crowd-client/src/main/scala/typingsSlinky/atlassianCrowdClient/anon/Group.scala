package typingsSlinky.atlassianCrowdClient.anon

import typingsSlinky.atlassianCrowdClient.groupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def group(restriction: String): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def group(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def user(restriction: String): js.Promise[js.Array[String | typingsSlinky.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean): js.Promise[js.Array[String | typingsSlinky.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | typingsSlinky.atlassianCrowdClient.userMod.^ ]] = js.native
  def user(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typingsSlinky.atlassianCrowdClient.userMod.^ ]] = js.native
}

