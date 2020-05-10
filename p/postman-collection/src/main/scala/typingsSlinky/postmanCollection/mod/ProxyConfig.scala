package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.AnonPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.ProxyConfigDefinition because var conflicts: description, disabled, id, name. Inlined `match`, host, port, tunnel */ @JSImport("postman-collection", "ProxyConfig")
@js.native
class ProxyConfig () extends Property[ProxyConfigDefinition] {
  def this(options: ProxyConfigDefinition) = this()
  var host: js.UndefOr[String] = js.native
  var `match`: js.UndefOr[AnonPattern | String | UrlMatchPattern] = js.native
  var port: js.UndefOr[Double] = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
  def getProtocols(): js.Array[String] = js.native
  def getProxyUrl(): String = js.native
  def test(): Boolean = js.native
  def test(urlStr: String): Boolean = js.native
  def update(options: ProxyConfigDefinition): Unit = js.native
  def updateProtocols(protocols: js.Array[String]): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "ProxyConfig")
@js.native
object ProxyConfig extends js.Object {
  def isProxyConfig(obj: js.Any): Boolean = js.native
}

