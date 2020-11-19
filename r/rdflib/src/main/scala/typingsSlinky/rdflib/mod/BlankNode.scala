package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.blankNodeMod.default
import typingsSlinky.rdflib.rdflibStrings._Colon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "BlankNode")
@js.native
/**
  * Initializes this node
  * @param [id] The identifier for the blank node
  */
class BlankNode () extends default {
  def this(id: String) = this()
  def this(id: js.Any) = this()
}
/* static members */
@JSImport("rdflib", "BlankNode")
@js.native
object BlankNode extends js.Object {
  
  var NTAnonymousNodePrefix: _Colon = js.native
  
  var getId: js.Any = js.native
  
  /**
    * The next unique identifier for blank nodes
    */
  var nextId: Double = js.native
}
