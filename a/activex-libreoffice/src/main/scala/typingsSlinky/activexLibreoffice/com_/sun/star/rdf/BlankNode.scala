package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a blank node that may occur in a RDF graph.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait BlankNode extends XNode {
  
  /**
    * create a blank RDF node.
    *
    * Be careful! With this constructor you can create a node that aliases another node that already exists in some repository. That may or may not be what
    * you want. If you want to create a new blank node that is guaranteed to be unique, use {@link XRepository.createBlankNode()} instead.
    * @param NodeID the ID for the blank node.
    * @see XRepository.createBlankNode
    * @throws com::sun::star::lang::IllegalArgumentException if the argument does not represent a valid blank node ID
    */
  def create(NodeID: String): Unit = js.native
}
object BlankNode {
  
  @scala.inline
  def apply(StringValue: String, create: String => Unit): BlankNode = {
    val __obj = js.Dynamic.literal(StringValue = StringValue.asInstanceOf[js.Any], create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[BlankNode]
  }
  
  @scala.inline
  implicit class BlankNodeMutableBuilder[Self <: BlankNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
