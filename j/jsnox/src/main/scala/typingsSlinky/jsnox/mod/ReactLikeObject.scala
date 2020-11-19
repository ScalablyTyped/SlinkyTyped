package typingsSlinky.jsnox.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * JSnoX requires an object with a createElement method.
  * This will normally be the React object but could be something else
  */
@js.native
trait ReactLikeObject extends js.Object {
  
  def createElement[P](`type`: String, props: P, children: ReactElement): ReactElement = js.native
  def createElement[P](`type`: ReactComponentClass[P], props: P, children: ReactElement): ReactElement = js.native
}
