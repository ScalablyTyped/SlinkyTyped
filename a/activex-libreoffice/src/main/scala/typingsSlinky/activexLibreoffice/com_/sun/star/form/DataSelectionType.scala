package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the type of datasource used for a form.
  *
  * Please do **not** use anymore, this enum is deprecated.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait DataSelectionType extends StObject
object DataSelectionType {
  
  /** The control should be filled with the results of a database query. */
  @scala.inline
  def QUERY: `1` = 1.asInstanceOf[`1`]
  
  /** The control should be filled with the results of a database statement. */
  @scala.inline
  def SQL: `2` = 2.asInstanceOf[`2`]
  
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  @scala.inline
  def SQLPASSTHROUGH: `3` = 3.asInstanceOf[`3`]
  
  /** The control should be filled with the data of a table. */
  @scala.inline
  def TABLE: `0` = 0.asInstanceOf[`0`]
}
