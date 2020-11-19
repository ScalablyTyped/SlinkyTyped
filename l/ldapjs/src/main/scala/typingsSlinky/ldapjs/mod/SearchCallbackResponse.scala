package typingsSlinky.ldapjs.mod

import typingsSlinky.ldapjs.ldapjsStrings.end
import typingsSlinky.ldapjs.ldapjsStrings.error
import typingsSlinky.ldapjs.ldapjsStrings.page
import typingsSlinky.ldapjs.ldapjsStrings.searchEntry_
import typingsSlinky.ldapjs.ldapjsStrings.searchReference
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchCallbackResponse extends EventEmitter {
  
  @JSName("on")
  def on_end(event: end, listener: js.Function1[/* res */ LDAPResult | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_page(
    event: page,
    listener: js.Function2[/* res */ LDAPResult, /* cb */ js.Function1[/* repeated */ js.Any, Unit], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_searchEntry(event: searchEntry_, listener: js.Function1[/* entry */ SearchEntry, Unit]): this.type = js.native
  @JSName("on")
  def on_searchReference(event: searchReference, listener: js.Function1[/* referral */ SearchReference, Unit]): this.type = js.native
}
