package typingsSlinky.leveldown.mod

import typingsSlinky.abstractLeveldown.mod.AbstractIteratorOptions
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDown
  extends AbstractLevelDOWN[BaseType, BaseType]
     with LevelDownConstructor {
  
  def approximateSize(start: BaseType, end: BaseType, cb: js.Function2[/* err */ js.Any, /* size */ Double, Unit]): Unit = js.native
  
  def compactRange(start: BaseType, end: BaseType, cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def destroy(location: String, cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def getProperty(property: String): String = js.native
  
  def iterator(options: LevelDownIteratorOptions with AbstractIteratorOptions[BaseType]): LevelDownIterator = js.native
  
  def repair(location: String, cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
