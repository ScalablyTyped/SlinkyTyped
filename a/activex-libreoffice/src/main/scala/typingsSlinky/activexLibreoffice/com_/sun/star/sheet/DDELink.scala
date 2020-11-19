package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a DDE link.
  *
  * A DDE link controls the results of a DDE spreadsheet formula.
  */
@js.native
trait DDELink
  extends XNamed
     with XDDELink
     with XRefreshable
     with XDDELinkResults
object DDELink {
  
  @scala.inline
  def apply(
    Application: String,
    Item: String,
    Name: String,
    Results: SafeArray[SafeArray[_]],
    Topic: String,
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    getApplication: () => String,
    getItem: () => String,
    getName: () => String,
    getResults: () => SafeArray[SafeArray[_]],
    getTopic: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    setName: String => Unit,
    setResults: SeqEquiv[SeqEquiv[_]] => Unit
  ): DDELink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), getApplication = js.Any.fromFunction0(getApplication), getItem = js.Any.fromFunction0(getItem), getName = js.Any.fromFunction0(getName), getResults = js.Any.fromFunction0(getResults), getTopic = js.Any.fromFunction0(getTopic), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), setName = js.Any.fromFunction1(setName), setResults = js.Any.fromFunction1(setResults))
    __obj.asInstanceOf[DDELink]
  }
}
