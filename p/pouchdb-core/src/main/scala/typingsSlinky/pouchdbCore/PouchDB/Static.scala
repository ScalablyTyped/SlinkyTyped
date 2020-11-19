package typingsSlinky.pouchdbCore.PouchDB

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.debug.mod.Debugger
import typingsSlinky.debug.mod.IDebug
import typingsSlinky.pouchdbCore.EventEmitter
import typingsSlinky.pouchdbCore.Fetch
import typingsSlinky.pouchdbCore.PouchDB.Configuration.DatabaseConfiguration
import typingsSlinky.pouchdbCore.anon.Instantiable
import typingsSlinky.pouchdbCore.pouchdbCoreStrings.created
import typingsSlinky.pouchdbCore.pouchdbCoreStrings.destroyed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static
  extends EventEmitter
     with Instantiable0[Database[js.Object]]
     with Instantiable1[/* name */ String, Database[js.Object]]
     with Instantiable2[
      js.UndefOr[/* name */ String], 
      /* options */ DatabaseConfiguration, 
      Database[js.Object]
    ] {
  
  def debug(namespace: String): Debugger = js.native
  @JSName("debug")
  var debug_Original: IDebug = js.native
  
  /**
    * The returned object is a constructor function that works the same as PouchDB,
    * except that whenever you invoke it (e.g. with new), the given options will be passed in by default.
    */
  def defaults(options: DatabaseConfiguration): Instantiable = js.native
  
  def fetch(url: String): js.Promise[Response] = js.native
  def fetch(url: String, opts: RequestInit): js.Promise[Response] = js.native
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, opts: RequestInit): js.Promise[Response] = js.native
  @JSName("fetch")
  var fetch_Original: Fetch = js.native
  
  @JSName("on")
  def on_created(event: created, listener: js.Function1[/* dbName */ String, _]): this.type = js.native
  @JSName("on")
  def on_destroyed(event: destroyed, listener: js.Function1[/* dbName */ String, _]): this.type = js.native
  
  def plugin(plugin: Plugin): Static = js.native
  
  var version: String = js.native
}
