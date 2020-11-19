package typingsSlinky.algoliasearchHelper.mod

import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.error
import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.result
import typingsSlinky.algoliasearchHelper.algoliasearchHelperStrings.search
import typingsSlinky.algoliasearchHelper.anon.Error
import typingsSlinky.algoliasearchHelper.anon.Results
import typingsSlinky.algoliasearchHelper.anon.ResultsState
import typingsSlinky.events.mod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DerivedHelper extends EventEmitter {
  
  def detach(): Unit = js.native
  
  def getModifiedState(): SearchParameters = js.native
  
  var lastResults: SearchResults[_] | Null = js.native
  
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* res */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_result(event: result, cb: js.Function1[/* res */ ResultsState, Unit]): this.type = js.native
  @JSName("on")
  def on_search(event: search, cb: js.Function1[/* res */ Results, Unit]): this.type = js.native
}
