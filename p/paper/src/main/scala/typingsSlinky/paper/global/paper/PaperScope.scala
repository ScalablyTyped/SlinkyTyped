package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The `PaperScope` class represents the scope associated with a Paper
  *     context. When working with PaperScript, these scopes are automatically
  *     created for us, and through clever scoping the properties and methods of
  *     the active scope seem to become part of the global scope.
  * 
  * When working with normal JavaScript code, `PaperScope` objects need to be
  * manually created and handled.
  * 
  * Paper classes can only be accessed through `PaperScope` objects. Thus in
  * PaperScript they are global, while in JavaScript, they are available on the
  * global {@link paper} object. For JavaScript you can use {@link
  * PaperScope#install(scope) } to install the Paper classes and objects on the
  * global scope. Note that when working with more than one scope, this still
  * works for classes, but not for objects like {@link PaperScope#project}, since
  * they are not updated in the injected scope if scopes are switched.
  * 
  * The global {@link paper} object is simply a reference to the currently active
  * `PaperScope`.
  */
@JSGlobal("paper.PaperScope")
@js.native
/** 
  * Creates a PaperScope object.
  */
class PaperScope ()
  extends typingsSlinky.paper.paper.PaperScope
/* static members */
@JSGlobal("paper.PaperScope")
@js.native
object PaperScope extends js.Object {
  
  /** 
    * Retrieves a PaperScope object with the given scope id.
    */
  def get(id: js.Any): typingsSlinky.paper.paper.PaperScope = js.native
}
