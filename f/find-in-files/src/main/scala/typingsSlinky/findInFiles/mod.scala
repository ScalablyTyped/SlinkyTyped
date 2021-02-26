package typingsSlinky.findInFiles

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.findInFiles.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: String, directory: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: String, directory: String, fileFilter: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: String, directory: String, fileFilter: js.RegExp): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: js.RegExp, directory: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: js.RegExp, directory: String, fileFilter: String): js.Promise[FindResult] = js.native
  @JSImport("find-in-files", "find")
  @js.native
  def find(pattern: js.RegExp, directory: String, fileFilter: js.RegExp): js.Promise[FindResult] = js.native
  
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: String, directory: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: String, directory: String, fileFilter: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: String, directory: String, fileFilter: js.RegExp): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: js.RegExp, directory: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: js.RegExp, directory: String, fileFilter: String): FindResult = js.native
  @JSImport("find-in-files", "findSync")
  @js.native
  def findSync(pattern: js.RegExp, directory: String, fileFilter: js.RegExp): FindResult = js.native
  
  type FindResult = StringDictionary[Count]
}
