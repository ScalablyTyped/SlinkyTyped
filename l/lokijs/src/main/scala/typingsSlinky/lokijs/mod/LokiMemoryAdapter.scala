package typingsSlinky.lokijs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lokijs.anon.AsyncResponses
import typingsSlinky.lokijs.anon.Lastsave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lokijs", "LokiMemoryAdapter")
@js.native
class LokiMemoryAdapter ()
  extends typingsSlinky.lokijs.LokiMemoryAdapter {
  /* CompleteClass */
  override var hashStore: StringDictionary[Lastsave] = js.native
  /* CompleteClass */
  override var options: AsyncResponses = js.native
  /**
    * Deletes a database from its in-memory store.
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - function to call when done
    */
  /* CompleteClass */
  @JSName("deleteDatabase")
  override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  /* CompleteClass */
  override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  /**
    * Saves a serialized database to its in-memory store.
    * (Loki persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - adapter callback to return load result to caller
    */
  /* CompleteClass */
  @JSName("saveDatabase")
  override def saveDatabase_MLokiMemoryAdapter(
    dbname: String,
    dbstring: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
}

