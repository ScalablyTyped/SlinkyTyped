package typingsSlinky.postmanDashCollection.postmanDashCollectionMod

import typingsSlinky.postmanDashCollection.Anon_KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Cookie")
@js.native
class Cookie ()
  extends PropertyBase[CookieDefinition]
     with CookieDefinition {
  def this(options: CookieDefinition) = this()
  /* CompleteClass */
  override var domain: String = js.native
  @JSName("expires")
  var expires_Cookie: js.Date = js.native
  /* CompleteClass */
  override var path: String = js.native
  def update(options: CookieDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Cookie")
@js.native
object Cookie extends js.Object {
  def isCookie(obj: js.Any): Boolean = js.native
  def parse(str: String): CookieDefinition = js.native
  def splitParam(param: String): Anon_KeyValue = js.native
}

