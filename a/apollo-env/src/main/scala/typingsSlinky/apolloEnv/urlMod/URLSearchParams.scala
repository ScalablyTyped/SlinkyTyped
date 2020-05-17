package typingsSlinky.apolloEnv.urlMod

import typingsSlinky.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends typingsSlinky.node.urlMod.URLSearchParams {
  def this(init: String) = this()
  def this(init: js.Array[js.Tuple2[String, String]]) = this()
  def this(init: Dict[String | js.Array[String]]) = this()
  def this(init: typingsSlinky.node.urlMod.URLSearchParams) = this()
  def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
}

