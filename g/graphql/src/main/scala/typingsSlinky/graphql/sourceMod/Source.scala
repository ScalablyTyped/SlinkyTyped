package typingsSlinky.graphql.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/source", "Source")
@js.native
class Source protected () extends js.Object {
  def this(body: String) = this()
  def this(body: String, name: String) = this()
  def this(body: String, name: js.UndefOr[scala.Nothing], locationOffset: Location) = this()
  def this(body: String, name: String, locationOffset: Location) = this()
  
  var body: String = js.native
  
  var locationOffset: Location = js.native
  
  var name: String = js.native
}
