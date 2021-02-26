package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a container of user actions.
  *
  * No assumption is made about any graphical representation: You could have a menu or a toolbox working with the same container describing their entries.
  *
  * Possible elements of the {@link ActionTriggerContainer} are {@link ActionTrigger} - represents a simply clickable menu entry{@link
  * ActionTriggerSeparator} - represents a separator between two entries ;  This entry type is of interest for components rendering a an {@link
  * ActionTriggerContainer}{@link ActionTriggerContainer} - represents a sub container
  */
@js.native
trait ActionTriggerContainer
  extends XIndexContainer
     with XMultiServiceFactory
     with XEnumerationAccess
     with XContainer
