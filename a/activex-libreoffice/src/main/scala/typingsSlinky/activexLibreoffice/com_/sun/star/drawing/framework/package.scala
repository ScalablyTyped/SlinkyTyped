package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object framework {
  
  /**
    * Abstraction of tool bars used by the drawing framework.
    * @see XToolBarController
    * @see XToolBarFactory
    */
  type XToolBar = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.XResource
  
  /**
    * A view in the drawing framework is any object that paints into a pane.
    *
    * Typical examples are the Impress views that show a graphical representation of a document. But the task pane, which is primarily a container of
    * dialogs, is a view as well.
    *
    * Luckily the drawing framework does not need to know much about what a view is. It just needs to identify view objects and a typesafe way to reference
    * them.
    *
    * The URL prefix of views is `private:resource/view`
    */
  type XView = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.XResource
}
