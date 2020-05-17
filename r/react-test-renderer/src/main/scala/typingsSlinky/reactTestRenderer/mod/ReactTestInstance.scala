package typingsSlinky.reactTestRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reactTestRenderer.anon.Deep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTestInstance extends js.Object {
  var children: js.Array[ReactTestInstance | String] = js.native
  var instance: js.Any = js.native
  var parent: Null | ReactTestInstance = js.native
  var props: StringDictionary[js.Any] = js.native
  var `type`: ReactElement = js.native
  def find(predicate: js.Function1[/* node */ this.type, Boolean]): ReactTestInstance = js.native
  def findAll(predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[ReactTestInstance] = js.native
  def findAll(predicate: js.Function1[/* node */ this.type, Boolean], options: Deep): js.Array[ReactTestInstance] = js.native
  def findAllByProps(props: StringDictionary[js.Any]): js.Array[ReactTestInstance] = js.native
  def findAllByProps(props: StringDictionary[js.Any], options: Deep): js.Array[ReactTestInstance] = js.native
  def findAllByType(`type`: ReactElement): js.Array[ReactTestInstance] = js.native
  def findAllByType(`type`: ReactElement, options: Deep): js.Array[ReactTestInstance] = js.native
  def findByProps(props: StringDictionary[js.Any]): ReactTestInstance = js.native
  def findByType(`type`: ReactElement): ReactTestInstance = js.native
}

