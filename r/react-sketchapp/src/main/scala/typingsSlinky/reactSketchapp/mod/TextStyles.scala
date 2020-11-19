package typingsSlinky.reactSketchapp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactSketchapp.anon.ClearExistingStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp", "TextStyles")
@js.native
object TextStyles extends js.Object {
  
  /**
    * Reset the registered styles.
    */
  def clear(): Unit = js.native
  
  /**
    * The primary interface to TextStyles. Call this before rendering.
    */
  def create(options: ClearExistingStyles, styles: StringDictionary[TextStyle]): js.Any = js.native
  
  /**
    * Find a stored style by name.
    */
  def get(name: String): js.UndefOr[TextStyle] = js.native
  
  /**
    * Find a stored native Sketch style object for a given JavaScript style object. You probably
    * don't need to use this.
    */
  def resolve(style: TextStyle): js.Any = js.native
  
  /**
    * Find all of the registered styles. You probably don't need to use this.
    */
  var styles: StringDictionary[js.UndefOr[TextStyle]] = js.native
}
