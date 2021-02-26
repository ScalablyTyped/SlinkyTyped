package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.LokiPersistenceAdapter
import typingsSlinky.lokijs.lokijsStrings.BROWSER
import typingsSlinky.lokijs.lokijsStrings.CORDOVA
import typingsSlinky.lokijs.lokijsStrings.NA
import typingsSlinky.lokijs.lokijsStrings.NATIVESCRIPT
import typingsSlinky.lokijs.lokijsStrings.NODEJS
import typingsSlinky.lokijs.lokijsStrings.destructured
import typingsSlinky.lokijs.lokijsStrings.fs
import typingsSlinky.lokijs.lokijsStrings.localStorage
import typingsSlinky.lokijs.lokijsStrings.memory
import typingsSlinky.lokijs.lokijsStrings.normal
import typingsSlinky.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.LokiConstructorOptions> & lokijs.LokiConfigOptions & std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialLokiConstructorOptAdapter extends StObject {
  
  var adapter: LokiPersistenceAdapter | Null = js.native
  
  var autoload: Boolean = js.native
  
  def autoloadCallback(err: js.Any): Unit = js.native
  
  var autosave: Boolean = js.native
  
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: js.Any): Unit = js.native
  
  var autosaveInterval: String | Double = js.native
  
  var destructureDelimiter: String = js.native
  
  var env: js.UndefOr[NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA] = js.native
  
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  
  var recursiveWait: js.UndefOr[Boolean] = js.native
  
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  
  var serializationMethod: normal | pretty | destructured | Null = js.native
  
  var started: js.UndefOr[Double] = js.native
  
  var throttledSaves: Boolean = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
