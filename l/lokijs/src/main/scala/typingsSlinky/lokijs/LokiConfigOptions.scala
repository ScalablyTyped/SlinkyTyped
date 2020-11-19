package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.destructured
import typingsSlinky.lokijs.lokijsStrings.fs
import typingsSlinky.lokijs.lokijsStrings.localStorage
import typingsSlinky.lokijs.lokijsStrings.memory
import typingsSlinky.lokijs.lokijsStrings.normal
import typingsSlinky.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LokiConfigOptions extends js.Object {
  
  var adapter: LokiPersistenceAdapter | Null = js.native
  
  var autoload: Boolean = js.native
  
  def autoloadCallback(err: js.Any): Unit = js.native
  
  var autosave: Boolean = js.native
  
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: js.Any): Unit = js.native
  
  var autosaveInterval: String | Double = js.native
  
  var destructureDelimiter: String = js.native
  
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  
  var serializationMethod: normal | pretty | destructured | Null = js.native
  
  var throttledSaves: Boolean = js.native
}
