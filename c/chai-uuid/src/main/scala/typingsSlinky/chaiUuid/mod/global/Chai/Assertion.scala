package typingsSlinky.chaiUuid.mod.global.Chai

import typingsSlinky.chai.Chai.LanguageChains
import typingsSlinky.chai.Chai.NumericComparison
import typingsSlinky.chai.Chai.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
