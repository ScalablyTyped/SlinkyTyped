package typingsSlinky.jest.mod.jest

import typingsSlinky.jest.jestStrings.`return`
import typingsSlinky.jest.jestStrings.`throw`
import typingsSlinky.jest.jestStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jest.mod.jest.MockResultReturn[T]
  - typingsSlinky.jest.mod.jest.MockResultThrow
  - typingsSlinky.jest.mod.jest.MockResultIncomplete
*/
trait MockResult[T] extends StObject
object MockResult {
  
  @scala.inline
  def MockResultIncomplete(`type`: incomplete): typingsSlinky.jest.mod.jest.MockResultIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jest.mod.jest.MockResultIncomplete]
  }
  
  @scala.inline
  def MockResultReturn[T](`type`: `return`, value: T): typingsSlinky.jest.mod.jest.MockResultReturn[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jest.mod.jest.MockResultReturn[T]]
  }
  
  @scala.inline
  def MockResultThrow(`type`: `throw`, value: js.Any): typingsSlinky.jest.mod.jest.MockResultThrow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jest.mod.jest.MockResultThrow]
  }
}
