package typingsSlinky.expoFont.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font", "loadAsync")
@js.native
object loadAsync extends js.Object {
  def apply(nameOrMap: String): js.Promise[Unit] = js.native
  def apply(nameOrMap: String, source: FontSource): js.Promise[Unit] = js.native
  def apply(nameOrMap: StringDictionary[FontSource]): js.Promise[Unit] = js.native
  def apply(nameOrMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = js.native
}

