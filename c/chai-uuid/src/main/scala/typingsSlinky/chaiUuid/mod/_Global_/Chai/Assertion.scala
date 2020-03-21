package typingsSlinky.chaiUuid.mod._Global_.Chai

import typingsSlinky.chai.Chai_.LanguageChains
import typingsSlinky.chai.Chai_.NumericComparison
import typingsSlinky.chai.Chai_.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  def guid(): Unit = js.native
  def guid(guid: js.Any): Unit = js.native
  def uuid(): Unit = js.native
  def uuid(uuid: UuidVersion): Unit = js.native
}

