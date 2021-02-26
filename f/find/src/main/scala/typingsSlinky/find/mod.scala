package typingsSlinky.find

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find", "dir")
  @js.native
  def dir(pattern: String, root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = js.native
  @JSImport("find", "dir")
  @js.native
  def dir(pattern: js.RegExp, root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = js.native
  @JSImport("find", "dir")
  @js.native
  def dir(root: String, callback: js.Function1[/* directories */ js.Array[String], Unit]): AsyncFindStream = js.native
  
  @JSImport("find", "dirSync")
  @js.native
  def dirSync(pattern: String, root: String): js.Array[String] = js.native
  @JSImport("find", "dirSync")
  @js.native
  def dirSync(pattern: js.RegExp, root: String): js.Array[String] = js.native
  @JSImport("find", "dirSync")
  @js.native
  def dirSync(root: String): js.Array[String] = js.native
  
  @JSImport("find", "eachdir")
  @js.native
  def eachdir(pattern: String, root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = js.native
  @JSImport("find", "eachdir")
  @js.native
  def eachdir(pattern: js.RegExp, root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = js.native
  @JSImport("find", "eachdir")
  @js.native
  def eachdir(root: String, callback: js.Function1[/* directory */ String, Unit]): FindEachStream = js.native
  
  @JSImport("find", "eachfile")
  @js.native
  def eachfile(pattern: String, root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = js.native
  @JSImport("find", "eachfile")
  @js.native
  def eachfile(pattern: js.RegExp, root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = js.native
  @JSImport("find", "eachfile")
  @js.native
  def eachfile(root: String, callback: js.Function1[/* file */ String, Unit]): FindEachStream = js.native
  
  @JSImport("find", "file")
  @js.native
  def file(pattern: String, root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = js.native
  @JSImport("find", "file")
  @js.native
  def file(pattern: js.RegExp, root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = js.native
  @JSImport("find", "file")
  @js.native
  def file(root: String, callback: js.Function1[/* files */ js.Array[String], Unit]): AsyncFindStream = js.native
  
  @JSImport("find", "fileSync")
  @js.native
  def fileSync(pattern: String, root: String): js.Array[String] = js.native
  @JSImport("find", "fileSync")
  @js.native
  def fileSync(pattern: js.RegExp, root: String): js.Array[String] = js.native
  @JSImport("find", "fileSync")
  @js.native
  def fileSync(root: String): js.Array[String] = js.native
  
  @js.native
  trait AsyncFindStream extends StObject {
    
    /**
      * Handling errors in asynchronous interfaces.
      * @param callback The callback that is called upon an error
      */
    def error(callback: js.Function0[Unit]): Unit = js.native
    def error(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait FindEachStream extends StObject {
    
    /**
      * Detect end in find.eachfile and find.eachdir.
      * @param callback The callback called at the end of find.eachfile and find.eachdir
      */
    def end(callback: js.Function0[Unit]): FindEachStream = js.native
    
    /**
      * Handling errors in asynchronous interfaces.
      * @param callback The callback that is called upon an error
      */
    def error(callback: js.Function0[Unit]): FindEachStream = js.native
    def error(callback: js.Function1[/* err */ js.Error, Unit]): FindEachStream = js.native
  }
}
