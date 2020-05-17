package typingsSlinky.jestJasmine2

import typingsSlinky.jestJasmine2.anon.AfterAll
import typingsSlinky.jestJasmine2.typesMod.Jasmine
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/jasmineLight", JSImport.Namespace)
@js.native
object jasmineLightMod extends js.Object {
  def create(createOptions: Record[String, _]): Jasmine = js.native
  def interface(jasmine: Jasmine, env: js.Any): AfterAll = js.native
}

