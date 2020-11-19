package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XWarningsSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.XGroupsSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.XTablesSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.XUsersSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.XViewsSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the {@link com.sun.star.sdbc.Connection} of SDBC by providing the data definitions of a connected database. */
@js.native
trait Connection
  extends XConnection
     with XComponent
     with XWarningsSupplier
     with XChild
     with XCommandPreparation
     with XTablesSupplier
     with XViewsSupplier
     with XUsersSupplier
     with XGroupsSupplier
     with XQueriesSupplier
     with XSQLQueryComposerFactory
     with XMultiServiceFactory
