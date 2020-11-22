package typingsSlinky.datastoreLevel.mod

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.interfaceDatastore.mod.Adapter
import typingsSlinky.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A datastore backed by leveldb.
  */
@js.native
trait LevelDatastore[Value] extends Adapter[Value] {
  
  var db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]] = js.native
}
