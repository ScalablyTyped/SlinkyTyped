package typingsSlinky.activexLibreoffice.com_.sun.star.configuration

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides write access to a dynamic homogeneous set of values or nested trees within a hierarchy.
  *
  * Allows adding and removing elements. Helps creates new elements to be added.
  *
  * This service extends {@link SetAccess} to support modifying the container.
  *
  * Any child and descendant objects support modifying access as well, unless they represent a read-only tree element (as indicated by {@link
  * com.sun.star.beans.PropertyAttribute.READONLY} ).
  */
@js.native
trait SetUpdate
  extends SetAccess
     with SimpleSetUpdate {
  
  /**
    * @param aPropertyName specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState] = js.native
}
